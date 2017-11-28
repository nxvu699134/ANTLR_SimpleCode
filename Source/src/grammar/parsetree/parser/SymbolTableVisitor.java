package grammar.parsetree.parser;

import grammar.antlr4.SimpleCodeBaseVisitor;
import grammar.antlr4.SimpleCodeParser;
import grammar.exception.DuplicateDeclare;
import grammar.exception.ErrorString;
import grammar.exception.NegativeArraySize;
import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.classdecl.IrClassDecl;
import grammar.parsetree.node.expression.IrBaseExpression;
import grammar.parsetree.node.expression.IrBinOpExpression;
import grammar.parsetree.node.expression.IrExpression;
import grammar.parsetree.node.expression.IrLocation;
import grammar.parsetree.node.expression.callexpression.IrCallExpression;
import grammar.parsetree.node.expression.callexpression.IrCallOutExpression;
import grammar.parsetree.node.expression.callexpression.IrMethodCallExpression;
import grammar.parsetree.node.expression.literal.IrBooleanLiteral;
import grammar.parsetree.node.expression.literal.IrCharLiteral;
import grammar.parsetree.node.expression.literal.IrIntLiteral;
import grammar.parsetree.node.expression.literal.IrStringLiteral;
import grammar.parsetree.node.id.IrId;
import grammar.parsetree.node.memberdecl.*;
import grammar.parsetree.node.op.*;
import grammar.parsetree.node.statement.*;
import grammar.parsetree.node.type.IrType;
import grammar.parsetree.node.vardecl.*;
import grammar.parsetree.symtab.SymbolTable;

import java.util.ArrayList;
import java.util.List;


public class SymbolTableVisitor extends SimpleCodeBaseVisitor<IrNode>
{
	private SymbolTable __rootTable = new SymbolTable(null);
	private List<Exception> __errors = new ArrayList<>();



	public SymbolTable getSymbolTable()
	{
		return this.__rootTable;
	}

	@Override
	public IrNode visitRoot(SimpleCodeParser.RootContext ctx)
	{
		return visitProgram(ctx.program());
	}

	@Override
	public IrNode visitProgram(SimpleCodeParser.ProgramContext ctx)
	{
		IrClassDecl classDecl = new IrClassDecl("program");
		for (int i = 0; i < ctx.field_decl().size(); ++i)
		{
			IrMemberDecl fieldDecl = (IrMemberDecl) visitField_decl(ctx.field_decl(i));
			classDecl.push(fieldDecl);
			this.__rootTable.push(fieldDecl.getName(), fieldDecl);
			checkDuplicate(fieldDecl, this.__rootTable);
		}

		for (int i = 0; i < ctx.method_decl().size(); ++i)
		{
			IrMemberDecl methodDecl = (IrMemberDecl) visitMethod_decl(ctx.method_decl(i));
			classDecl.push(methodDecl);
			this.__rootTable.push(methodDecl.getName(), methodDecl);
			checkDuplicate(methodDecl, this.__rootTable);
		}
		return classDecl;
	}

	private void checkDuplicate(IrNode node, SymbolTable symbolTable)
	{
		if (null != symbolTable.localLookUp(node.getName()))
		{
			this.__errors.add(new DuplicateDeclare(
					String.format(ErrorString.DUPLICATE_MSG,
							node.getOffset().getLine(),
							node.getOffset().getIndex(),
							node.getName())));
		}
	}

	@Override
	public IrNode visitField_decl(SimpleCodeParser.Field_declContext ctx)
	{
		IrFieldDecl fieldDecl = new IrFieldDecl();
		IrType type = (IrType)visitType(ctx.type());
		for (int i = 0; i < ctx.field().size(); ++i)
		{
			IrField field = (IrField) visitField(ctx.field(i), type);
			fieldDecl.push(field);
		}
		return fieldDecl;
	}

	public IrNode visitField(SimpleCodeParser.FieldContext ctx, IrType type)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrId id = (IrId)visitId(ctx.id());
		IrIntLiteral int_lit = null;
		if (null != ctx.int_literal())
		{
			int_lit = (IrIntLiteral) visitInt_literal(ctx.int_literal());
			if (0 > int_lit.getValue())
				this.__errors.add(
						new NegativeArraySize(
								String.format(ErrorString.NEGATIVE_ARRAY_SIZE_MSG,
										int_lit.getOffset().getLine(),
										int_lit.getOffset().getIndex())));
		}
		return new IrField(type, id, int_lit, offset);
	}

	@Override
	public IrNode visitMethod_decl(SimpleCodeParser.Method_declContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

		//return type
		IrType type;
		if (null != ctx.K_VOID())
			type = new IrType(IrType.VOID, offset);
		else
			type = (IrType)visitType(ctx.type());

		IrId id = (IrId)visitId(ctx.id());

		IrMethodDecl methodDecl =
				new IrMethodDecl(type, id, (IrBlock)visitBlock(ctx.block(), this.__rootTable, id.getName()), offset);

		// method args
		for (int i = 0; i < ctx.method_arg().size(); ++i)
		{
			IrMethodArg arg = (IrMethodArg) visitMethod_arg(ctx.method_arg(i));
			methodDecl.pushArg(arg);
		}

		return methodDecl;
	}

	@Override
	public IrNode visitMethod_arg(SimpleCodeParser.Method_argContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrMethodArg((IrType)visitType(ctx.type()), (IrId)visitId(ctx.id()), offset);
	}


	IrNode visitBlock(SimpleCodeParser.BlockContext ctx, SymbolTable outer, String owner)
	{
		SymbolTable symbolTable = new SymbolTable(outer);
		IrBlock block= new IrBlock();
		//var declare
		for (int i = 0; i < ctx.var_decl().size(); ++i)
		{
			IrVarDecl varDecl = (IrVarDecl) visitVar_decl(ctx.var_decl(i));
			block.push(varDecl);
			symbolTable.push(varDecl.getName(), varDecl);
			checkDuplicate(varDecl, symbolTable);
		}

		//statement
		for (int i = 0; i < ctx.statement().size(); ++i)
		{
			IrStatement statement = (IrStatement) visitStatement(ctx.statement(i), symbolTable);
			block.push(statement);

		}
		return block;
	}

	@Override
	public IrNode visitVar_decl(SimpleCodeParser.Var_declContext ctx)
	{
		IrVarDecl varDecl = new IrVarDecl();
		IrType type = (IrType)visitType(ctx.type());
		for (int i = 0; i < ctx.id().size(); ++i)
		{
			Offset offset = new Offset(ctx.id(i).getStart().getLine(),
					ctx.id(i).getStart().getCharPositionInLine());
			IrVar var = new IrVar(type, (IrId)visitId(ctx.id(i)), offset);
			varDecl.push(var);
		}
		return varDecl;
	}

	@Override
	public IrNode visitType(SimpleCodeParser.TypeContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		if (null != ctx.K_BOOLEAN())
			return new IrType(IrType.BOOLEAN, offset);
		return new IrType(IrType.INT, offset);
	}

	public IrNode visitStatement(SimpleCodeParser.StatementContext ctx, SymbolTable outer)
	{
		if (null != ctx.assign_statement())
			return visitAssign_statement(ctx.assign_statement(), outer);

		if (null != ctx.method_call())
			return visitMethod_call(ctx.method_call(), outer);

		if (null != ctx.if_statement())
			return visitIf_statement(ctx.if_statement(), outer);

		if (null != ctx.for_statment())
			return visitFor_statment(ctx.for_statment(), outer);

		if (null != ctx.return_statment())
			return visitReturn_statment(ctx.return_statment(), outer);

		if (null != ctx.block())
			return visitBlock(ctx.block(), outer, null);

		return visitChildren(ctx);
	}

	public IrNode visitAssign_statement(SimpleCodeParser.Assign_statementContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrLocation location = (IrLocation)visitLocation(ctx.location(), outer);
		IrAssignOp op = (IrAssignOp)visitAssign_op(ctx.assign_op());
		IrExpression expr = (IrExpression)visitExpr(ctx.expr(), outer);
		return new IrAssignStatement(location, op, expr, offset);
	}


	public IrNode visitIf_statement(SimpleCodeParser.If_statementContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrExpression expr = (IrExpression)visitExpr(ctx.expr(), outer);
		IrBlock trueBlock = (IrBlock)visitBlock(ctx.block(0), outer, null);
		IrBlock elseBlock = null;
		if (1 < ctx.block().size())
			elseBlock = (IrBlock)visitBlock(ctx.block(1), outer, null);
		return new IrIfStatement(expr, trueBlock, elseBlock, offset);
	}


	public IrNode visitFor_statment(SimpleCodeParser.For_statmentContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrId id = (IrId)visitId(ctx.id());
		IrExpression startExpr = (IrExpression)visitExpr(ctx.expr(0), outer);
		IrExpression endExpr = (IrExpression)visitExpr(ctx.expr(1), outer);
		IrBlock block = (IrBlock) visitBlock(ctx.block(), outer, "for");
		return new IrForStatement(id, startExpr, endExpr, block, offset);
	}

	public IrNode visitReturn_statment(SimpleCodeParser.Return_statmentContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrExpression expr = (IrExpression) visitExpr(ctx.expr(), symbolTable);
		if (NodeType.LOCATION == expr.getNodeType() || NodeType.METHOD_CALL == expr.getNodeType())
			symbolTable.push(expr.getName(), expr);
		return new IrReturnStatement(expr, offset);
	}

	@Override
	public IrNode visitBreak_statement(SimpleCodeParser.Break_statementContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrBreakStatement(offset);
	}

	@Override
	public IrNode visitContinue_statement(SimpleCodeParser.Continue_statementContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrContinueStatement(offset);
	}

	@Override
	public IrNode visitAssign_op(SimpleCodeParser.Assign_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrAssignOp(ctx.getChild(0).getText(), offset);
	}

	public IrNode visitMethod_call(SimpleCodeParser.Method_callContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrCallExpression callExpression;
		if (null != ctx.K_CALLOUT())
		{
			IrStringLiteral stringLiteral = (IrStringLiteral) visitString_literal(ctx.string_literal());
			callExpression = new IrCallOutExpression(stringLiteral, offset);
		}
		else
		{
			IrId id = (IrId) visitMethod_name(ctx.method_name());
			callExpression = new IrMethodCallExpression(id, offset);
		}
		for (int i = 0; i < ctx.callout_arg().size(); ++i)
		{
			IrNode arg = visitCallout_arg(ctx.callout_arg(i));
			callExpression.pushArg(arg);
		}
		symbolTable.push(callExpression.getName(), callExpression);
		return callExpression;
	}

	@Override
	public IrNode visitMethod_name(SimpleCodeParser.Method_nameContext ctx)
	{
		return visitId(ctx.id());
	}


	public IrNode visitLocation(SimpleCodeParser.LocationContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrLocation location;
		if (1 < ctx.getChildCount())
		{
			location = new IrLocation(visitId(ctx.id()).getName(), (IrExpression)visitExpr(ctx.expr(), symbolTable), offset);
		}
		else
			location = new IrLocation(visitId(ctx.id()).getName(), null, offset);
		symbolTable.push(location.getName(), location);
		return location;
	}

	public IrNode visitExpr(SimpleCodeParser.ExprContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		if (2 == ctx.expr().size())
		{
			IrExpression left = (IrExpression) visitExpr(ctx.expr(0), symbolTable);
			IrExpression right = (IrExpression) visitExpr(ctx.expr(1), symbolTable);
			IrOp op = (IrOp) visitBin_op(ctx.bin_op());
			return new IrBinOpExpression(left, right, op, offset);
		}
		else if (1 == ctx.expr().size())
		{
			if (null != ctx.LPAREN())
				return new IrBaseExpression((IrExpression) visitExpr(ctx.expr(0), symbolTable), offset);
			return new IrBaseExpression(-1, (IrExpression) visitExpr(ctx.expr(0), symbolTable), offset);
		}

		if (null != ctx.method_call())
			return visitMethod_call(ctx.method_call(), symbolTable);

		if (null != ctx.location())
			return visitLocation(ctx.location(), symbolTable);

		return visitLiteral(ctx.literal());
	}


	@Override
	public IrNode visitCallout_arg(SimpleCodeParser.Callout_argContext ctx)
	{
		return visitChildren(ctx);
	}

	@Override
	public IrNode visitBin_op(SimpleCodeParser.Bin_opContext ctx)
	{
		return visitChildren(ctx);
	}

	@Override
	public IrNode visitArith_op(SimpleCodeParser.Arith_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrArithOp(ctx.getChild(0).getText(), offset);
	}

	@Override
	public IrNode visitRel_op(SimpleCodeParser.Rel_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrRelOp(ctx.getChild(0).getText(), offset);
	}

	@Override
	public IrNode visitEq_op(SimpleCodeParser.Eq_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrEqOp(ctx.getChild(0).getText(), offset);
	}

	@Override
	public IrNode visitCond_op(SimpleCodeParser.Cond_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrCondOp(ctx.getChild(0).getText(), offset);
	}

	@Override
	public IrNode visitLiteral(SimpleCodeParser.LiteralContext ctx)
	{
		return visitChildren(ctx);
	}

	@Override
	public IrNode visitId(SimpleCodeParser.IdContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrId(ctx.ID().getText(), offset);
	}

	@Override
	public IrNode visitInt_literal(SimpleCodeParser.Int_literalContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrIntLiteral(ctx.INT_LITERAL().getText(), offset);
	}

	@Override
	public IrNode visitBool_literal(SimpleCodeParser.Bool_literalContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		if (ctx.BOOL_LITERAL().getText().equals("true"))
			return new IrBooleanLiteral(true, offset);
		return new IrBooleanLiteral(false, offset);
	}
	@Override
	public IrNode visitChar_literal(SimpleCodeParser.Char_literalContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrCharLiteral(ctx.CHAR_LITERAL().getText(), offset);
	}

	@Override
	public IrNode visitString_literal(SimpleCodeParser.String_literalContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrStringLiteral(ctx.STRING_LITERAL().getText(), offset);
	}

}

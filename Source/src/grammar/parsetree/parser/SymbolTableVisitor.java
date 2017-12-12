package grammar.parsetree.parser;

import grammar.antlr4.SimpleCodeBaseVisitor;
import grammar.antlr4.SimpleCodeParser;
import grammar.exception.*;
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

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class SymbolTableVisitor extends SimpleCodeBaseVisitor<IrNode>
{
	private SymbolTable __rootTable;
	private List<Exception> __errors = new ArrayList<>();


	public SymbolTable getSymbolTable()
	{
		return this.__rootTable;
	}
	public List<Exception> getErrors()
	{
		return this.__errors;
	}

	@Override
	public IrNode visitRoot(SimpleCodeParser.RootContext ctx)
	{
		IrNode classDecl = visitProgram(ctx.program());
		// check main method
		List<IrNode> lst = this.__rootTable.localLookUp("main");
		if (null == lst)
			this.__errors.add(new MainNotFound(ErrorString.MAIN_NOT_FOUND));
		else
		{
			for (IrNode method : lst)
			{
				if (method.getName().equals("main"))
				{
					return classDecl;
				}
			}
			this.__errors.add(new MainNotFound(ErrorString.MAIN_NOT_FOUND));
		}
		return classDecl;
	}

	@Override
	public IrNode visitProgram(SimpleCodeParser.ProgramContext ctx)
	{
		IrClassDecl classDecl = new IrClassDecl("program");
		this.__rootTable = new SymbolTable(null, classDecl);
		for (int i = 0; i < ctx.field_decl().size(); ++i)
		{
			IrMemberDecl fieldDecl = (IrMemberDecl) visitField_decl(ctx.field_decl(i));
			classDecl.push(fieldDecl);
		}

		for (int i = 0; i < ctx.method_decl().size(); ++i)
		{
			IrMemberDecl methodDecl = (IrMemberDecl) visitMethod_decl(ctx.method_decl(i));
			classDecl.push(methodDecl);
		}
		return classDecl;
	}

	@Override
	public IrNode visitField_decl(SimpleCodeParser.Field_declContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrFieldDecl fieldDecl = new IrFieldDecl(offset);
		IrType type = (IrType)visitType(ctx.type());
		for (int i = 0; i < ctx.field().size(); ++i)
		{
			IrField field = (IrField) visitField(ctx.field(i), type);
			fieldDecl.push(field);
		}
		return fieldDecl;
	}

	private IrNode visitField(SimpleCodeParser.FieldContext ctx, IrType type)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrId id = (IrId)visitId(ctx.id());

		IrIntLiteral int_lit = null;
		if (null != ctx.int_literal())
		{
			int_lit = (IrIntLiteral) visitInt_literal(ctx.int_literal());
			if (0 >= int_lit.getValue())
				this.__errors.add(
						new BadArraySize(
								String.format(ErrorString.BAD_ARRAY_SIZE_MSG,
										int_lit.getOffset().getLine(),
										int_lit.getOffset().getIndex())));
		}
		IrField field = new IrField(type, id, int_lit, offset);
		checkDuplicate(field, this.__rootTable);
		this.__rootTable.push(field.getName(), field);
		return field;
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

		IrMethodDecl methodDecl =
				new IrMethodDecl(type, (IrId)visitId(ctx.id()), offset);

		checkDuplicate(methodDecl, this.__rootTable);
		this.__rootTable.push(methodDecl.getName(), methodDecl);

		SymbolTable childSymbolTable = new SymbolTable(this.__rootTable, methodDecl);

		// method args
		for (int i = 0; i < ctx.method_arg().size(); ++i)
		{
			IrMethodArg arg = (IrMethodArg) visitMethod_arg(ctx.method_arg(i));
			methodDecl.pushArg(arg);
			childSymbolTable.push(arg.getName(), arg);
		}

		methodDecl.setBlock((IrBlock)visitBlock(ctx.block(), childSymbolTable));

		return methodDecl;
	}

	@Override
	public IrNode visitMethod_arg(SimpleCodeParser.Method_argContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrMethodArg((IrType)visitType(ctx.type()), (IrId)visitId(ctx.id()), offset);
	}


	private IrNode visitBlock(SimpleCodeParser.BlockContext ctx, SymbolTable symbolTable)
	{
		IrBlock block= new IrBlock();
		//var declare
		for (int i = 0; i < ctx.var_decl().size(); ++i)
		{
			IrVarDecl varDecl = (IrVarDecl) visitVar_decl(ctx.var_decl(i), symbolTable);
			block.push(varDecl);
		}

		//statement
		for (int i = 0; i < ctx.statement().size(); ++i)
		{
			IrStatement statement = (IrStatement) visitStatement(ctx.statement(i), symbolTable);
			block.push(statement);
		}
		return block;
	}


	private IrNode visitVar_decl(SimpleCodeParser.Var_declContext ctx, SymbolTable symbolTable)
	{
		IrVarDecl varDecl = new IrVarDecl();
		IrType type = (IrType)visitType(ctx.type());
		for (int i = 0; i < ctx.id().size(); ++i)
		{
			Offset offset = new Offset(ctx.id(i).getStart().getLine(),
					ctx.id(i).getStart().getCharPositionInLine());
			IrVar var = new IrVar(type, (IrId)visitId(ctx.id(i)), offset);
			varDecl.push(var);
			checkDuplicate(var, symbolTable);
			symbolTable.push(var.getName(), var);
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

	private IrNode visitStatement(SimpleCodeParser.StatementContext ctx, SymbolTable symbolTable)
	{
		if (null != ctx.assign_statement())
			return visitAssign_statement(ctx.assign_statement(), symbolTable);

		if (null != ctx.method_call())
			return visitMethod_call(ctx.method_call(), symbolTable);

		if (null != ctx.if_statement())
			return visitIf_statement(ctx.if_statement(), symbolTable);

		if (null != ctx.for_statment())
			return visitFor_statment(ctx.for_statment(), symbolTable);

		if (null != ctx.return_statment())
			return visitReturn_statment(ctx.return_statment(), symbolTable);

		if (null != ctx.break_statement())
			return visitBreak_statement(ctx.break_statement(), symbolTable);

		if (null != ctx.continue_statement())
			return visitContinue_statement(ctx.continue_statement(), symbolTable);

		if (null != ctx.block())
		{
			SymbolTable childSymbolTable = new SymbolTable(symbolTable, null);
			return visitBlock(ctx.block(), childSymbolTable);
		}
		return visitChildren(ctx);
	}

	private IrNode visitAssign_statement(SimpleCodeParser.Assign_statementContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrLocation location = (IrLocation) visitLocation(ctx.location(), outer);
		IrAssignOp op = (IrAssignOp)visitAssign_op(ctx.assign_op());
		IrExpression expr = (IrExpression)visitExpr(ctx.expr(), outer);
		checkOperandsAssignStatement(location, op, expr);
		return new IrAssignStatement(location, op, expr, offset);
	}

	private void checkOperandsAssignStatement(IrLocation location, IrOp op, IrExpression expr)
	{
		if (null == location.getType() || null == expr.getType())
			return;

		if (! location.getType().equals(expr.getType()))
		{
			this.__errors.add(new IncompatibleTypes(
					String.format(ErrorString.INCOMPATIBLE_TYPES,
							expr.getOffset().getLine(), expr.getOffset().getIndex(),
							expr.getType().getName(),
							location.getType().getName())
			));
		}
		if (op.getName().equals("+=") || op.getName().equals("-="))
		{
			if (! location.getType().equals(IrType.INT))
				this.__errors.add(new IncompatibleTypes(
						String.format(ErrorString.INCOMPATIBLE_TYPES,
								location.getOffset().getLine(), location.getOffset().getIndex(),
								location.getType().getName(),
								IrType.INT.getName())
				));
			if (! expr.getType().equals(IrType.INT))
				this.__errors.add(new IncompatibleTypes(
						String.format(ErrorString.INCOMPATIBLE_TYPES,
								expr.getOffset().getLine(), expr.getOffset().getIndex(),
								expr.getType().getName(),
								IrType.INT.getName())
				));
		}
	}

	private IrNode visitIf_statement(SimpleCodeParser.If_statementContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrExpression expr = (IrExpression)visitExpr(ctx.expr(), outer);
		if (! expr.getType().equals(IrType.BOOLEAN))
		{
			this.__errors.add(new IncompatibleTypes(
					String.format(ErrorString.INCOMPATIBLE_TYPES,
							expr.getOffset().getLine(), expr.getOffset().getIndex(),
							expr.getType().getName(),
							IrType.BOOLEAN.getName())
			));
		}
		IrIfStatement ifStm = new IrIfStatement(expr, null, null, offset);
		SymbolTable trueBlockSymbolTable = new SymbolTable(outer, ifStm);
		IrBlock trueBlock = (IrBlock)visitBlock(ctx.block(0), trueBlockSymbolTable);
		IrBlock elseBlock = null;
		if (1 < ctx.block().size())
		{
			SymbolTable falseBlockSymbolTable = new SymbolTable(outer, ifStm);
			elseBlock = (IrBlock) visitBlock(ctx.block(1), falseBlockSymbolTable);
		}
		ifStm.setTrueBlock(trueBlock);
		ifStm.setElseBlock(elseBlock);
		return ifStm;
	}

	private IrNode visitFor_statment(SimpleCodeParser.For_statmentContext ctx, SymbolTable outer)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrId id = (IrId)visitId(ctx.id());
		IrExpression startExpr = (IrExpression)visitExpr(ctx.expr(0), outer);
		if (! startExpr.getType().equals(IrType.INT))
		{
			this.__errors.add(new IncompatibleTypes(
					String.format(ErrorString.INCOMPATIBLE_TYPES,
							startExpr.getOffset().getLine(), startExpr.getOffset().getIndex(),
							startExpr.getType().getName(),
							IrType.INT.getName())
			));
		}
		IrExpression endExpr = (IrExpression)visitExpr(ctx.expr(1), outer);
		if (! endExpr.getType().equals(IrType.INT))
		{
			this.__errors.add(new IncompatibleTypes(
					String.format(ErrorString.INCOMPATIBLE_TYPES,
							endExpr.getOffset().getLine(), endExpr.getOffset().getIndex(),
							endExpr.getType().getName(),
							IrType.INT.getName())
			));
		}
		IrForStatement forStm = new IrForStatement(id, startExpr, endExpr, null, offset);
		SymbolTable childSymbolTable = new SymbolTable(outer, forStm);
		childSymbolTable.push(id.getName(), new IrVar(IrType.INT, id, id.getOffset()));
		IrBlock block = (IrBlock) visitBlock(ctx.block(), childSymbolTable);
		forStm.setBlock(block);
		return forStm;
	}

	private IrNode visitReturn_statment(SimpleCodeParser.Return_statmentContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrExpression expr = (IrExpression) visitExpr(ctx.expr(), symbolTable);
		//check return type
		IrNode owner = symbolTable.getOwner();
		SymbolTable tab = symbolTable;
		while(owner.getNodeType() != NodeType.METHOD_DECL)
		{
			tab = tab.getOuter();
			owner = tab.getOwner();
		}

		if (null == expr)
		{
			if (! ((IrMethodDecl) owner).getType().equals(IrType.VOID)) // return something but method return void
			{
				this.__errors.add(new UnexpectdReturnType(
						String.format(ErrorString.UNEXPECTED_RETURN_TYPE,
								offset.getLine(), offset.getIndex())));
			}
		}
		else
		{
			if (! ((IrMethodDecl) owner).getType().equals(expr.getType()))
			{
				this.__errors.add(new UnexpectdReturnType(
						String.format(ErrorString.UNEXPECTED_RETURN_TYPE,
								offset.getLine(), offset.getIndex())));
			}
		}
		return new IrReturnStatement(expr, offset);
	}

	private IrNode visitBreak_statement(SimpleCodeParser.Break_statementContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		SymbolTable symtab = symbolTable;
		while(null != symtab && NodeType.FOR != symtab.getOwner().getNodeType())
			symtab = symtab.getOuter();
		if (null == symtab)
			this.__errors.add(new BreakOutSideFor(
					String.format(ErrorString.BREAK_OUTSIDE_FOR,
							offset.getLine(), offset.getIndex())
			));
		return new IrBreakStatement(offset);
	}

	private IrNode visitContinue_statement(SimpleCodeParser.Continue_statementContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		SymbolTable symtab = symbolTable;
		while(null != symtab && NodeType.FOR != symtab.getOwner().getNodeType())
			symtab = symtab.getOuter();

		if (null == symtab)
			this.__errors.add(new ContinueOutSideFor(
					String.format(ErrorString.CONTINUE_OUTSIDE_FOR,
							offset.getLine(), offset.getIndex())
			));
		return new IrContinueStatement(offset);
	}

	@Override
	public IrNode visitAssign_op(SimpleCodeParser.Assign_opContext ctx)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		return new IrAssignOp(ctx.getChild(0).getText(), offset);
	}

	private IrNode visitMethod_call(SimpleCodeParser.Method_callContext ctx, SymbolTable symbolTable)
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

		if (NodeType.METHOD_CALL == callExpression.getNodeType())
			checkArgsMethodCall((IrMethodCallExpression) callExpression, symbolTable);

		return callExpression;
	}

	@Override
	public IrNode visitMethod_name(SimpleCodeParser.Method_nameContext ctx)
	{
		return visitId(ctx.id());
	}


	private IrNode visitLocation(SimpleCodeParser.LocationContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		IrLocation location;
		if (1 < ctx.getChildCount())
		{
			location = new IrLocation(visitId(ctx.id()).getName(), (IrExpression)visitExpr(ctx.expr(), symbolTable), offset);
		}
		else
			location = new IrLocation(visitId(ctx.id()).getName(), null, offset);

		IrVar var = (IrVar) symbolTable.globalLookup(location.getName(), NodeType.VAR);
		IrMethodArg methodArg = (IrMethodArg) symbolTable.globalLookup(location.getName(), NodeType.METHOD_ARG);
		IrField field = (IrField) symbolTable.globalLookup(location.getName(), NodeType.FIELD);
		if (null != var)
			location.setType(var.getType());
		else if (null != methodArg)
			location.setType(methodArg.getType());
		else if (null != field)
			location.setType(field.getType());
		checkLocation(location, symbolTable);

		return location;
	}

	private IrNode visitExpr(SimpleCodeParser.ExprContext ctx, SymbolTable symbolTable)
	{
		Offset offset = new Offset(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		if (2 == ctx.expr().size())
		{
			IrExpression left = (IrExpression) visitExpr(ctx.expr(0), symbolTable);
			IrExpression right = (IrExpression) visitExpr(ctx.expr(1), symbolTable);
			IrOp op = (IrOp) visitBin_op(ctx.bin_op());
			checkBinOpExpression(left, right, op);
			IrBinOpExpression binOpExpression = new IrBinOpExpression(left, right, op, offset);
			if (OpType.EQ == op.getOpType()
					|| OpType.REL == op.getOpType()
					|| OpType.COND == op.getOpType())
				binOpExpression.setType(IrType.BOOLEAN);
			else
				binOpExpression.setType(left.getType());
			return binOpExpression;
		}
		else if (1 == ctx.expr().size())
		{
			IrExpression expr  = (IrExpression) visitExpr(ctx.expr(0), symbolTable);
			if (null != ctx.LPAREN())
				return new IrBaseExpression(expr, expr.getType(), offset);
			//check boolean at ! operator
			if (null == ctx.MINUS()) // ! operator
			{
				if(! expr.getType().equals(IrType.BOOLEAN))
					this.__errors.add(new IncompatibleTypes(
							String.format(ErrorString.INCOMPATIBLE_TYPES,
									expr.getOffset().getLine(), expr.getOffset().getIndex(),
									expr.getType().getName(),
									IrType.BOOLEAN.getName())
					));
			}
			return new IrBaseExpression(-1, expr, expr.getType(), offset);
		}

		if (null != ctx.method_call())
		{
			IrExpression expr = (IrExpression)visitMethod_call(ctx.method_call(), symbolTable);
			IrMethodDecl methodDecl = (IrMethodDecl)symbolTable.globalLookup(expr.getName(), NodeType.METHOD_DECL);
			if (null != methodDecl)
				expr.setType(methodDecl.getType());
			return expr;
		}

		if (null != ctx.location())
		{
			return visitLocation(ctx.location(), symbolTable);
		}

		IrExpression literal = (IrExpression) visitLiteral(ctx.literal());
		if (NodeType.INT_LIT == literal.getNodeType())
			literal.setType(IrType.INT);
		else if (NodeType.BOOLEAN_LIT == literal.getNodeType())
			literal.setType(IrType.BOOLEAN);
		return literal;
	}

	private void checkBinOpExpression(IrExpression left, IrExpression right, IrOp op)
	{
		if (null == left.getType() || null == right.getType())
			return;

		if (OpType.ARITH == op.getOpType() || OpType.REL == op.getOpType())
		{
			if (! left.getType().equals(IrType.INT) || ! right.getType().equals(IrType.INT))
			{
				this.__errors.add(new WrongTypeOperandsBinOp(
						String.format(ErrorString.WRONG_TYPE_OPERANDS_BIN_OP,
								op.getOffset().getLine(), op.getOffset().getIndex(),
								op.getName(),
								left.getType().getName(),
								right.getType().getName())
				));
			}
		}
		else if (OpType.EQ == op.getOpType())
		{
			if (! left.getType().equals(right.getType()))
			{
				this.__errors.add(new WrongTypeOperandsBinOp(
						String.format(ErrorString.WRONG_TYPE_OPERANDS_BIN_OP,
								op.getOffset().getLine(), op.getOffset().getIndex(),
								op.getName(),
								left.getType().getName(),
								right.getType().getName())
				));
			}
		}
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

	private void checkLocation(IrLocation location, SymbolTable symbolTable)
	{
		IrVar var = (IrVar) symbolTable.globalLookup(location.getName(), NodeType.VAR);
		IrMethodArg methodArg = (IrMethodArg) symbolTable.globalLookup(location.getName(), NodeType.METHOD_ARG);
		IrField field = (IrField) symbolTable.globalLookup(location.getName(), NodeType.FIELD);
		if (null != var)
		{

		}
		else if (null != methodArg)
		{

		}
		else if (null != field)
		{
			if (null != location.getExpression())
				if (! location.getExpression().getType().equals(IrType.INT))
					this.__errors.add(new ArrayIndexWrongType(
							String.format(ErrorString.ARRAY_INDEX_WRONG_TYPE,
									location.getExpression().getOffset().getLine(),
									location.getExpression().getOffset().getIndex())
					));
		}
		else
			this.__errors.add(new IdentifierNotFound(
					String.format(ErrorString.IDENTIFIER_NOT_FOUND,
							location.getOffset().getLine(),
							location.getOffset().getIndex(),
							location.getName())));
	}

	private void checkArgsMethodCall(IrMethodCallExpression callExpression, SymbolTable symbolTable)
	{
		List<IrNode> lstMethodDefine = this.__rootTable.localLookUp(callExpression.getName());
		if (null == lstMethodDefine)
		{
			this.__errors.add(new IdentifierNotFound(
					String.format(ErrorString.IDENTIFIER_NOT_FOUND,
							callExpression.getOffset().getLine(),
							callExpression.getOffset().getIndex(),
							callExpression.getName())));
		}
		else
		{
			for (int i = 0; i < lstMethodDefine.size(); ++i)
			{
				if (NodeType.METHOD_DECL == lstMethodDefine.get(i).getNodeType())
				{
					IrMethodDecl methodDecl = (IrMethodDecl)lstMethodDefine.get(i);
					if (methodDecl.getArgCount() == callExpression.getArgCount())
					{
						for (int j = 0; j < methodDecl.getArgCount(); ++j)
						{
							if (NodeType.BOOLEAN_LIT == callExpression.getArg(j).getNodeType() ||
									NodeType.INT_LIT == callExpression.getArg(j).getNodeType())
							{
								checkLiteralAndArg(callExpression.getArg(j), methodDecl.getArg(j));
							}

							else
							{
								checkCallArgAndMethodArg(methodDecl.getArg(j), callExpression.getArg(j), symbolTable);
							}
						}

					}
					else // more or less arguments
					{
						this.__errors.add(new ArgumentMismatch(
								String.format(ErrorString.ARGUMENT_MISMATCH,
										callExpression.getOffset().getLine(),
										callExpression.getOffset().getIndex(),
										callExpression.getName(),
										methodDecl.getArgCount())));
					}
					return;
				}
			}
		}
	}

	private void checkCallArgAndMethodArg(IrMethodArg methodArg, IrNode callArg, SymbolTable symbolTable)
	{
		List<IrNode> lstCallArgDefines = symbolTable.globalLookup(callArg.getName());
		if (null == lstCallArgDefines)
		{
			this.__errors.add(new IdentifierNotFound(
					String.format(ErrorString.IDENTIFIER_NOT_FOUND,
							callArg.getOffset().getLine(),
							callArg.getOffset().getIndex(),
							callArg.getName())));
		}
		else
		{
			for (IrNode callArgDefine : lstCallArgDefines)
			{
				if (NodeType.FIELD == callArgDefine.getNodeType()) //location is field
				{
					IrField field = (IrField) callArgDefine;
					if (methodArg.getType() != field.getType())
					{
						this.__errors.add(new ArgumentMismatch(
								String.format(ErrorString.INCORRECT_ARGUMENT_TYPE,
										callArg.getOffset().getLine(),
										callArg.getOffset().getIndex(),
										field.getType().getName(),
										methodArg.getType().getName())));
					}
					break;
				}
				else if (NodeType.METHOD_DECL == callArgDefine.getNodeType()) //location is method
				{
					IrMethodDecl subMethod = (IrMethodDecl) callArgDefine;
					if (methodArg.getType() != subMethod.getType())
					{
						this.__errors.add(new ArgumentMismatch(
								String.format(ErrorString.INCORRECT_ARGUMENT_TYPE,
										callArg.getOffset().getLine(),
										callArg.getOffset().getIndex(),
										subMethod.getType().getName(),
										methodArg.getType().getName())));
					}
					break;
				}
			}
		}
	}

	private void checkLiteralAndArg(IrNode literal, IrMethodArg arg)
	{
		if (NodeType.BOOLEAN_LIT == literal.getNodeType())
		{
			if (! IrType.BOOLEAN.equals(arg.getType()))
			{
				this.__errors.add(new ArgumentMismatch(
						String.format(ErrorString.INCORRECT_ARGUMENT_TYPE,
								literal.getOffset().getLine(),
								literal.getOffset().getIndex(),
								IrType.BOOLEAN.getName(),
								arg.getType().getName())));
			}
		}
		else if (NodeType.INT_LIT == literal.getNodeType())
		{
			if (! IrType.INT.equals(arg.getType()))
			{
				this.__errors.add(new ArgumentMismatch(
						String.format(ErrorString.INCORRECT_ARGUMENT_TYPE,
								literal.getOffset().getLine(),
								literal.getOffset().getIndex(),
								IrType.INT.getName(),
								arg.getType().getName())));
			}
		}
	}

}

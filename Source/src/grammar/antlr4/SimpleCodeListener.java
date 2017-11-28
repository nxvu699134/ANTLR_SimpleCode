// Generated from /run/media/innovation/My_Passport/MY_DATA/Daihoc/YEAR_4/SEMESTER_1/NGUYEN_LY_NN_LT/THUC_HANH/ANTLR_SimpleCode/Source/src/grammar/antlr4/SimpleCode.g4 by ANTLR 4.7
package grammar.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCodeParser}.
 */
public interface SimpleCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SimpleCodeParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SimpleCodeParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(SimpleCodeParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(SimpleCodeParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SimpleCodeParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SimpleCodeParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(SimpleCodeParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(SimpleCodeParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#method_arg}.
	 * @param ctx the parse tree
	 */
	void enterMethod_arg(SimpleCodeParser.Method_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#method_arg}.
	 * @param ctx the parse tree
	 */
	void exitMethod_arg(SimpleCodeParser.Method_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleCodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleCodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(SimpleCodeParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(SimpleCodeParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleCodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleCodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(SimpleCodeParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(SimpleCodeParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SimpleCodeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SimpleCodeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(SimpleCodeParser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(SimpleCodeParser.For_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(SimpleCodeParser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(SimpleCodeParser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(SimpleCodeParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(SimpleCodeParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(SimpleCodeParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(SimpleCodeParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(SimpleCodeParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(SimpleCodeParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(SimpleCodeParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(SimpleCodeParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(SimpleCodeParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(SimpleCodeParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(SimpleCodeParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(SimpleCodeParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleCodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleCodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(SimpleCodeParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(SimpleCodeParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(SimpleCodeParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(SimpleCodeParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(SimpleCodeParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(SimpleCodeParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(SimpleCodeParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(SimpleCodeParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(SimpleCodeParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(SimpleCodeParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(SimpleCodeParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(SimpleCodeParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleCodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleCodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SimpleCodeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SimpleCodeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(SimpleCodeParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(SimpleCodeParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(SimpleCodeParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(SimpleCodeParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(SimpleCodeParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(SimpleCodeParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(SimpleCodeParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(SimpleCodeParser.String_literalContext ctx);
}
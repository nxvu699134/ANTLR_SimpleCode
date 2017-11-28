// Generated from /run/media/innovation/My_Passport/MY_DATA/Daihoc/YEAR_4/SEMESTER_1/NGUYEN_LY_NN_LT/THUC_HANH/ANTLR_SimpleCode/Source/src/grammar/antlr4/SimpleCode.g4 by ANTLR 4.7
package grammar.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SimpleCodeParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleCodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(SimpleCodeParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SimpleCodeParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(SimpleCodeParser.Method_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#method_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_arg(SimpleCodeParser.Method_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleCodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(SimpleCodeParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleCodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleCodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(SimpleCodeParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SimpleCodeParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statment(SimpleCodeParser.For_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statment(SimpleCodeParser.Return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(SimpleCodeParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(SimpleCodeParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(SimpleCodeParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(SimpleCodeParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(SimpleCodeParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(SimpleCodeParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleCodeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(SimpleCodeParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(SimpleCodeParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_op(SimpleCodeParser.Arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(SimpleCodeParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(SimpleCodeParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(SimpleCodeParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimpleCodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SimpleCodeParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(SimpleCodeParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(SimpleCodeParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(SimpleCodeParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCodeParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(SimpleCodeParser.String_literalContext ctx);
}
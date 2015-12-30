// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/parser/Alfa.g4 by ANTLR 4.5
package alfa.parser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlfaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlfaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlfaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlfaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(AlfaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(AlfaParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AlfaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AlfaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AlfaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(AlfaParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#pairmap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairmap(AlfaParser.PairmapContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AlfaParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(AlfaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(AlfaParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AlfaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlfaParser#binOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOper(AlfaParser.BinOperContext ctx);
}
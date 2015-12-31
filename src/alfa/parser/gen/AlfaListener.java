// Generated from /Users/tdk/Dev/Alpha/Alfa/src/alfa/parser/Alfa.g4 by ANTLR 4.5
package alfa.parser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlfaParser}.
 */
public interface AlfaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlfaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlfaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlfaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AlfaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AlfaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(AlfaParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(AlfaParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AlfaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AlfaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AlfaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AlfaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AlfaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AlfaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(AlfaParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(AlfaParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#pairmap}.
	 * @param ctx the parse tree
	 */
	void enterPairmap(AlfaParser.PairmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#pairmap}.
	 * @param ctx the parse tree
	 */
	void exitPairmap(AlfaParser.PairmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AlfaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AlfaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(AlfaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(AlfaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(AlfaParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(AlfaParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AlfaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AlfaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlfaParser#binOper}.
	 * @param ctx the parse tree
	 */
	void enterBinOper(AlfaParser.BinOperContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlfaParser#binOper}.
	 * @param ctx the parse tree
	 */
	void exitBinOper(AlfaParser.BinOperContext ctx);
}
// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/core/runtime/meta/parser/Meta.g4 by ANTLR 4.5
package alfa.core.runtime.meta.parser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaParser}.
 */
public interface MetaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MetaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MetaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MetaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MetaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(MetaParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(MetaParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#formalSpec}.
	 * @param ctx the parse tree
	 */
	void enterFormalSpec(MetaParser.FormalSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#formalSpec}.
	 * @param ctx the parse tree
	 */
	void exitFormalSpec(MetaParser.FormalSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#concreteFormal}.
	 * @param ctx the parse tree
	 */
	void enterConcreteFormal(MetaParser.ConcreteFormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#concreteFormal}.
	 * @param ctx the parse tree
	 */
	void exitConcreteFormal(MetaParser.ConcreteFormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(MetaParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(MetaParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(MetaParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(MetaParser.FunDeclContext ctx);
}
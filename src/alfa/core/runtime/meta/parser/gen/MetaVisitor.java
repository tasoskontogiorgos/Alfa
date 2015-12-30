// Generated from /Users/tdk/Dev/alex/Alpha/src/alfa/core/runtime/meta/parser/Meta.g4 by ANTLR 4.5
package alfa.core.runtime.meta.parser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MetaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MetaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(MetaParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#formalSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalSpec(MetaParser.FormalSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#concreteFormal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcreteFormal(MetaParser.ConcreteFormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(MetaParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaParser#funDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(MetaParser.FunDeclContext ctx);
}
// Generated from /home/ghazal/IdeaProjects/Phase2/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmm(CmmParser.CmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#singleVarWithGetAndSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarWithGetAndSet(CmmParser.SingleVarWithGetAndSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#singleStatementStructBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatementStructBody(CmmParser.SingleStatementStructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#getBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetBody(CmmParser.GetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#setBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBody(CmmParser.SetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionArgsDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsDec(CmmParser.FunctionArgsDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithType(CmmParser.VariableWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(CmmParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CmmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#loopCondBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCondBody(CmmParser.LoopCondBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDecStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecStatement(CmmParser.VarDecStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(CmmParser.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(CmmParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(CmmParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopStatement(CmmParser.WhileLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#doWhileLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoopStatement(CmmParser.DoWhileLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(CmmParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CmmParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(CmmParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CmmParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CmmParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CmmParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpression(CmmParser.PreUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#accessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessExpression(CmmParser.AccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#otherExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpression(CmmParser.OtherExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(CmmParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(CmmParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CmmParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CmmParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(CmmParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(CmmParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptrType(CmmParser.FptrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#typesWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesWithComma(CmmParser.TypesWithCommaContext ctx);
}
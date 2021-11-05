// Generated from /home/ghazal/IdeaProjects/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
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
	 * Visit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CmmParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(CmmParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CmmParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(CmmParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(CmmParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CmmParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#defaultFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultFunctionStatement(CmmParser.DefaultFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(CmmParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#sizeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeStatement(CmmParser.SizeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#appendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendStatement(CmmParser.AppendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(CmmParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWithType(CmmParser.VariableWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CmmParser.TypeContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#functioPointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioPointerType(CmmParser.FunctioPointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#typesWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesWithComma(CmmParser.TypesWithCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#primitiveDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(CmmParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(CmmParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#listValus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValus(CmmParser.ListValusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(CmmParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#singleOrMultiStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOrMultiStatements(CmmParser.SingleOrMultiStatementsContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#necessarySpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNecessarySpace(CmmParser.NecessarySpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#optionalSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalSpace(CmmParser.OptionalSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(CmmParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(CmmParser.EndContext ctx);
}
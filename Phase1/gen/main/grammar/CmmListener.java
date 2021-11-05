// Generated from /home/ghazal/IdeaProjects/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void enterCmm(CmmParser.CmmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void exitCmm(CmmParser.CmmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CmmParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CmmParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CmmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CmmParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CmmParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CmmParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CmmParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CmmParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CmmParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(CmmParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(CmmParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(CmmParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(CmmParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(CmmParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(CmmParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#defaultFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultFunctionStatement(CmmParser.DefaultFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#defaultFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultFunctionStatement(CmmParser.DefaultFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(CmmParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(CmmParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#sizeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSizeStatement(CmmParser.SizeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#sizeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSizeStatement(CmmParser.SizeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#appendStatement}.
	 * @param ctx the parse tree
	 */
	void enterAppendStatement(CmmParser.AppendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#appendStatement}.
	 * @param ctx the parse tree
	 */
	void exitAppendStatement(CmmParser.AppendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(CmmParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(CmmParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#variableWithType}.
	 * @param ctx the parse tree
	 */
	void enterVariableWithType(CmmParser.VariableWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#variableWithType}.
	 * @param ctx the parse tree
	 */
	void exitVariableWithType(CmmParser.VariableWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(CmmParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(CmmParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(CmmParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(CmmParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functioPointerType}.
	 * @param ctx the parse tree
	 */
	void enterFunctioPointerType(CmmParser.FunctioPointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functioPointerType}.
	 * @param ctx the parse tree
	 */
	void exitFunctioPointerType(CmmParser.FunctioPointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#typesWithComma}.
	 * @param ctx the parse tree
	 */
	void enterTypesWithComma(CmmParser.TypesWithCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#typesWithComma}.
	 * @param ctx the parse tree
	 */
	void exitTypesWithComma(CmmParser.TypesWithCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(CmmParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#primitiveDataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(CmmParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(CmmParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(CmmParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#listValus}.
	 * @param ctx the parse tree
	 */
	void enterListValus(CmmParser.ListValusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#listValus}.
	 * @param ctx the parse tree
	 */
	void exitListValus(CmmParser.ListValusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(CmmParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(CmmParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#singleOrMultiStatements}.
	 * @param ctx the parse tree
	 */
	void enterSingleOrMultiStatements(CmmParser.SingleOrMultiStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#singleOrMultiStatements}.
	 * @param ctx the parse tree
	 */
	void exitSingleOrMultiStatements(CmmParser.SingleOrMultiStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CmmParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CmmParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CmmParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CmmParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CmmParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CmmParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CmmParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpression(CmmParser.AccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpression(CmmParser.AccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(CmmParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(CmmParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#necessarySpace}.
	 * @param ctx the parse tree
	 */
	void enterNecessarySpace(CmmParser.NecessarySpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#necessarySpace}.
	 * @param ctx the parse tree
	 */
	void exitNecessarySpace(CmmParser.NecessarySpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#optionalSpace}.
	 * @param ctx the parse tree
	 */
	void enterOptionalSpace(CmmParser.OptionalSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#optionalSpace}.
	 * @param ctx the parse tree
	 */
	void exitOptionalSpace(CmmParser.OptionalSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(CmmParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(CmmParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(CmmParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(CmmParser.EndContext ctx);
}
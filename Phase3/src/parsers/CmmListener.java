// Generated from D:/University/TA_Lessons/Compiler-1400-Fall/PLC-Fall2021-C--/src/main/grammar\Cmm.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#singleVarWithGetAndSet}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarWithGetAndSet(CmmParser.SingleVarWithGetAndSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#singleVarWithGetAndSet}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarWithGetAndSet(CmmParser.SingleVarWithGetAndSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#singleStatementStructBody}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatementStructBody(CmmParser.SingleStatementStructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#singleStatementStructBody}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatementStructBody(CmmParser.SingleStatementStructBodyContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#getBody}.
	 * @param ctx the parse tree
	 */
	void enterGetBody(CmmParser.GetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#getBody}.
	 * @param ctx the parse tree
	 */
	void exitGetBody(CmmParser.GetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#setBody}.
	 * @param ctx the parse tree
	 */
	void enterSetBody(CmmParser.SetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#setBody}.
	 * @param ctx the parse tree
	 */
	void exitSetBody(CmmParser.SetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionArgsDec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsDec(CmmParser.FunctionArgsDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionArgsDec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsDec(CmmParser.FunctionArgsDecContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CmmParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CmmParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#loopCondBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondBody(CmmParser.LoopCondBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#loopCondBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondBody(CmmParser.LoopCondBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDecStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDecStatement(CmmParser.VarDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDecStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDecStatement(CmmParser.VarDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStmt(CmmParser.FunctionCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStmt(CmmParser.FunctionCallStmtContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(CmmParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(CmmParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(CmmParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(CmmParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopStatement(CmmParser.WhileLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopStatement(CmmParser.WhileLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#doWhileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoopStatement(CmmParser.DoWhileLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#doWhileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoopStatement(CmmParser.DoWhileLoopStatementContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(CmmParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(CmmParser.SingleStatementContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreUnaryExpression(CmmParser.PreUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreUnaryExpression(CmmParser.PreUnaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(CmmParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(CmmParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(CmmParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(CmmParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CmmParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CmmParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CmmParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CmmParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void enterFptrType(CmmParser.FptrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void exitFptrType(CmmParser.FptrTypeContext ctx);
}
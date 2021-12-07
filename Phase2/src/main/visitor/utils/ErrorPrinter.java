package main.visitor.utils;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.visitor.Visitor;

import java.util.ArrayList;

public class ErrorPrinter extends Visitor<Integer> {

    private int printErrors(Node node) {
        ArrayList<CompileError> errors = node.flushErrors();
        for(CompileError compileErrorException : errors) {
            System.out.println(compileErrorException.getMessage());
        }
        return errors.size();
    }

    @Override
    public Integer visit(Program program) {
        int numOfErrors = printErrors(program);
        for (StructDeclaration structDeclaration: program.getStructs())
            numOfErrors += structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration: program.getFunctions())
            numOfErrors += functionDeclaration.accept(this);
        numOfErrors += program.getMain().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(FunctionDeclaration functionDec) {
        int numOfErrors = printErrors(functionDec);
        numOfErrors += functionDec.getFunctionName().accept(this);
        for(VariableDeclaration varDeclaration : functionDec.getArgs()) {
            numOfErrors += varDeclaration.accept(this);
        }
        numOfErrors += functionDec.getBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(MainDeclaration mainDec) {
        int numOfErrors = printErrors(mainDec);
        numOfErrors += mainDec.getBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(VariableDeclaration variableDec) {
        int numOfErrors = printErrors(variableDec);
        numOfErrors += variableDec.getVarName().accept(this);
        if (variableDec.getDefaultValue() != null)
            numOfErrors += variableDec.getDefaultValue().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(StructDeclaration structDec) {
        int numOfErrors = printErrors(structDec);
        numOfErrors += structDec.getStructName().accept(this);
        numOfErrors += structDec.getBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(SetGetVarDeclaration setGetVarDec) {
        int numOfErrors = printErrors(setGetVarDec);
        numOfErrors += setGetVarDec.getVarName().accept(this);
        for(VariableDeclaration arg : setGetVarDec.getArgs()) {
            numOfErrors += arg.accept(this);
        }
        numOfErrors += setGetVarDec.getSetterBody().accept(this);
        numOfErrors += setGetVarDec.getGetterBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(AssignmentStmt assignmentStmt) {
        int numOfErrors = printErrors(assignmentStmt);
        numOfErrors += assignmentStmt.getLValue().accept(this);
        numOfErrors += assignmentStmt.getRValue().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(BlockStmt blockStmt) {
        int numOfErrors = printErrors(blockStmt);
        for(Statement statement : blockStmt.getStatements()) {
            numOfErrors += statement.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(ConditionalStmt conditionalStmt) {
        int numOfErrors = printErrors(conditionalStmt);
        numOfErrors += conditionalStmt.getCondition().accept(this);
        numOfErrors += conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            numOfErrors += conditionalStmt.getElseBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(FunctionCallStmt functionCallStmt) {
        int numOfErrors = printErrors(functionCallStmt);
        numOfErrors += functionCallStmt.getFunctionCall().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(DisplayStmt displayStmt) {
        int numOfErrors = printErrors(displayStmt);
        numOfErrors += displayStmt.getArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ReturnStmt returnStmt) {
        int numOfErrors = printErrors(returnStmt);
        numOfErrors += returnStmt.getReturnedExpr().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(LoopStmt loopStmt) {
        int numOfErrors = printErrors(loopStmt);
        numOfErrors += loopStmt.getCondition().accept(this);
        numOfErrors += loopStmt.getBody().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(VarDecStmt varDecStmt) {
        int numOfErrors = printErrors(varDecStmt);
        for(VariableDeclaration var : varDecStmt.getVars()) {
            numOfErrors += var.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(ListAppendStmt listAppendStmt) {
        int numOfErrors = printErrors(listAppendStmt);
        numOfErrors += listAppendStmt.getListAppendExpr().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ListSizeStmt listSizeStmt) {
        int numOfErrors = printErrors(listSizeStmt);
        numOfErrors += listSizeStmt.getListSizeExpr().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(BinaryExpression binaryExpression) {
        int numOfErrors = printErrors(binaryExpression);
        numOfErrors += binaryExpression.getFirstOperand().accept(this);
        numOfErrors += binaryExpression.getSecondOperand().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(UnaryExpression unaryExpression) {
        int numOfErrors = printErrors(unaryExpression);
        numOfErrors += unaryExpression.getOperand().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(FunctionCall funcCall) {
        int numOfErrors = printErrors(funcCall);
        numOfErrors += funcCall.getInstance().accept(this);
        for(Expression arg : funcCall.getArgs()) {
            numOfErrors += arg.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(Identifier identifier) {
        return printErrors(identifier);
    }

    @Override
    public Integer visit(ListAccessByIndex listAccessByIndex) {
        int numOfErrors = printErrors(listAccessByIndex);
        numOfErrors += listAccessByIndex.getInstance().accept(this);
        numOfErrors += listAccessByIndex.getIndex().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(StructAccess structAccess) {
        int numOfErrors = printErrors(structAccess);
        numOfErrors += structAccess.getInstance().accept(this);
        numOfErrors += structAccess.getElement().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ListSize listSize) {
        int numOfErrors = printErrors(listSize);
        numOfErrors += listSize.getArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ListAppend listAppend) {
        int numOfErrors = printErrors(listAppend);
        numOfErrors += listAppend.getListArg().accept(this);
        numOfErrors += listAppend.getElementArg().accept(this);
        return numOfErrors;
    }

    @Override
    public Integer visit(ExprInPar exprInPar) {
        int numOfErrors = printErrors(exprInPar);
        for(Expression expr : exprInPar.getInputs()) {
            numOfErrors += expr.accept(this);
        }
        return numOfErrors;
    }

    @Override
    public Integer visit(IntValue intValue) {
        return printErrors(intValue);
    }

    @Override
    public Integer visit(BoolValue boolValue) {
        return printErrors(boolValue);
    }
}

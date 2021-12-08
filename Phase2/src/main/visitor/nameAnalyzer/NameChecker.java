package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.statement.*;
import main.compileError.nameError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

public class NameChecker extends Visitor<Void> {
    private Graph<String> structHierarchy;

    public NameChecker(Graph<String> structHierarchy) {
        this.structHierarchy = structHierarchy;
    }

    public Void visit(Program program) {
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration: program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        for (String child: structDec.getChildrenStructs()) {
            if (this.structHierarchy.isSecondNodeAncestorOf(structDec.getStructName().getName(),
                    child)) {
                CyclicDependency exception = new CyclicDependency(structDec.getLine(),
                        structDec.getStructName().getName());
                structDec.addError(exception);
                break;
            }
        }
        structDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        if(!functionDec.hasError()) {
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY +
                        functionDec.getFunctionName().getName());
                FunctionStructConflict exception = new FunctionStructConflict(functionDec.getLine(),
                        functionDec.getFunctionName().getName());
                functionDec.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        if(!varDeclaration.hasError()) {
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY +
                        varDeclaration.getVarName().getName());
                VarStructConflict exception = new VarStructConflict(varDeclaration.getLine(),
                        varDeclaration.getVarName().getName());
                varDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
            try {
                SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY +
                        varDeclaration.getVarName().getName());
                VarFunctionConflict exception = new VarFunctionConflict(varDeclaration.getLine(),
                        varDeclaration.getVarName().getName());
                varDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        loopStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDeclaration) {
        if(!setGetVarDeclaration.hasError()) {
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY +
                        setGetVarDeclaration.getVarName().getName());
                VarStructConflict exception = new VarStructConflict(setGetVarDeclaration.getLine(),
                        setGetVarDeclaration.getVarName().getName());
                setGetVarDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
            try {
                SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY +
                        setGetVarDeclaration.getVarName().getName());
                VarFunctionConflict exception = new VarFunctionConflict(setGetVarDeclaration.getLine(),
                        setGetVarDeclaration.getVarName().getName());
                setGetVarDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
            }
            for(VariableDeclaration arg : setGetVarDeclaration.getArgs()) {
                arg.accept(this);
            }
            return null;
        }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        mainDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        for(VariableDeclaration var : varDecStmt.getVars()) {
            var.accept(this);
        }
        return null;
    }
}
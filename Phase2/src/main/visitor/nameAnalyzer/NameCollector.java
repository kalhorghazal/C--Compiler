package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.statement.*;
import main.compileError.nameError.DuplicateFunction;
import main.compileError.nameError.DuplicateStruct;
import main.compileError.nameError.DuplicateVar;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

public class NameCollector extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.root = SymbolTable.top;
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration: program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(functionDec);
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top);
        functionSymbolTableItem.setFunctionSymbolTable(functionSymbolTable);
        try {
            SymbolTable.top.put(functionSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            DuplicateFunction exception = new DuplicateFunction(
                    functionDec.getLine(), functionDec.getFunctionName().getName());
            functionDec.addError(exception);
        }
        SymbolTable.push(functionSymbolTable);
        for(VariableDeclaration varDeclaration : functionDec.getArgs()) {
            varDeclaration.accept(this);
        }
        functionDec.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        StructSymbolTableItem structSymbolTableItem = new StructSymbolTableItem(structDec);
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        structSymbolTableItem.setStructSymbolTable(SymbolTable.top);
        try {
            SymbolTable.root.put(structSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            DuplicateStruct exception = new DuplicateStruct(
                    structDec.getLine(), structDec.getStructName().getName());
            structDec.addError(exception);
        }
        structDec.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        try {
            SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY +
                    varDeclaration.getVarName().getName());
            DuplicateVar exception = new DuplicateVar(
                    varDeclaration.getLine(), varDeclaration.getVarName().getName());
            varDeclaration.addError(exception);
        } catch (ItemNotFoundException ignored) {
            try {
                SymbolTable.top.put(new VariableSymbolTableItem(varDeclaration.getVarName()));
            } catch (ItemAlreadyExistsException e) {}
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        try {
            SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY +
                    setGetVarDec.getVarName().getName());
            DuplicateVar exception = new DuplicateVar(
                    setGetVarDec.getLine(), setGetVarDec.getVarName().getName());
            setGetVarDec.addError(exception);
        } catch (ItemNotFoundException ignored) {
            try {
                SymbolTable.top.put(new VariableSymbolTableItem(setGetVarDec.getVarName()));
            } catch (ItemAlreadyExistsException e) {}
        }
        for(VariableDeclaration arg : setGetVarDec.getArgs()) {
            arg.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        mainDec.getBody().accept(this);
        SymbolTable.pop();
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

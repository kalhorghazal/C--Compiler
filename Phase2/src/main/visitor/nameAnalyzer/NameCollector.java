package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.compileError.nameError.DuplicateFunction;
import main.compileError.nameError.DuplicateStruct;
import main.compileError.nameError.DuplicateVar;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
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
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        try {
            SymbolTable.top.put(new VariableSymbolTableItem(varDeclaration.getVarName()));
        } catch (ItemAlreadyExistsException e) {
            DuplicateVar exception = new DuplicateVar(
                    varDeclaration.getLine(), varDeclaration.getVarName().getName());
            varDeclaration.addError(exception);
        }
        return null;
    }
}

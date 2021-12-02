package main.symbolTable.items;


import main.ast.nodes.declaration.*;
import main.ast.types.Type;
import main.symbolTable.SymbolTable;

import java.util.ArrayList;

public class FunctionSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Function_";
    private main.ast.nodes.declaration.FunctionDeclaration FunctionDeclaration;
    private Type returnType;
    private ArrayList<Type> argTypes = new ArrayList<>();
    private SymbolTable FunctionSymbolTable;

    public FunctionSymbolTableItem(FunctionDeclaration FunctionDeclaration) {
        this.FunctionDeclaration = FunctionDeclaration;
        this.returnType = FunctionDeclaration.getReturnType();
        for(VariableDeclaration varDeclaration : FunctionDeclaration.getArgs()) {
            this.argTypes.add(varDeclaration.getVarType());
        }
        this.name = FunctionDeclaration.getFunctionName().getName();
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return FunctionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration FunctionDeclaration) {
        this.FunctionDeclaration = FunctionDeclaration;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public ArrayList<Type> getArgTypes() {
        return argTypes;
    }

    public void setArgTypes(ArrayList<Type> argTypes) {
        this.argTypes = argTypes;
    }

    public SymbolTable getFunctionSymbolTable() {
        return FunctionSymbolTable;
    }

    public void setFunctionSymbolTable(SymbolTable FunctionSymbolTable) {
        this.FunctionSymbolTable = FunctionSymbolTable;
    }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }

}

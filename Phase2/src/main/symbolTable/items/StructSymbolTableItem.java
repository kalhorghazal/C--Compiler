package main.symbolTable.items;

import main.ast.nodes.declaration.struct.*;
import main.ast.types.*;
import main.symbolTable.*;

import java.util.*;

public class StructSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Struct_";
    private SymbolTable StructSymbolTable;
    private StructDeclaration structDeclaration;

    public StructSymbolTableItem(StructDeclaration structDeclaration) {
        this.structDeclaration = structDeclaration;
        this.name = structDeclaration.getStructName().getName();
    }

    public SymbolTable getStructSymbolTable() { return StructSymbolTable; }
    public void setStructSymbolTable(SymbolTable structSymbolTable) { StructSymbolTable = structSymbolTable; }

    public StructDeclaration getStructDeclaration() { return structDeclaration; }
    public void setStructDeclaration(StructDeclaration structDeclaration) { this.structDeclaration = structDeclaration; }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }
}

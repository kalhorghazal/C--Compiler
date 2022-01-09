package main.ast.nodes;

import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.visitor.IVisitor;

import java.util.ArrayList;

//line -> 1
public class Program extends Node {
    private ArrayList<FunctionDeclaration> functions = new ArrayList<>();
    private ArrayList<StructDeclaration> structs = new ArrayList<>();
    private MainDeclaration main = new MainDeclaration();

    public ArrayList<FunctionDeclaration> getFunctions() {
        return functions;
    }
    public void setFunctions(ArrayList<FunctionDeclaration> functions) {
        this.functions = functions;
    }
    public void addFunction(FunctionDeclaration function) {
        functions.add(function);
    }

    public ArrayList<StructDeclaration> getStructs() {
        return structs;
    }
    public void setStructs(ArrayList<StructDeclaration> structs) {
        this.structs = structs;
    }
    public void addStruct(StructDeclaration struct) {
        structs.add(struct);
    }

    public MainDeclaration getMain() {
        return main;
    }
    public void setMain(MainDeclaration main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "Program";
    }

    @Override
    public <R> R accept(IVisitor<R> visitor) {
        return visitor.visit(this);
    }
}

package main.ast.nodes.statement;

import main.ast.nodes.declaration.*;
import main.visitor.IVisitor;
import java.util.ArrayList;


//line -> line of VariableDeclaration
public class VarDecStmt extends Statement{
    private ArrayList<VariableDeclaration> vars = new ArrayList<>();

    public ArrayList<VariableDeclaration> getVars() { return vars; }
    public void setVars(ArrayList<VariableDeclaration> vars) {
        this.vars = vars;
    }
    public void addVar(VariableDeclaration var) {
        this.vars.add(var);
    }

    @Override
    public String toString() {
        return "VarDecStmt";
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

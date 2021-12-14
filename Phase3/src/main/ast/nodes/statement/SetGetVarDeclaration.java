package main.ast.nodes.statement;

import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.Identifier;
import main.ast.types.Type;
import main.visitor.IVisitor;

import java.util.ArrayList;

//Line -> variable Identifier
public class SetGetVarDeclaration extends Statement {
    private Identifier varName;
    private Type varType;
    private ArrayList<VariableDeclaration> args = new ArrayList<>();
    private Statement setterBody;
    private Statement getterBody;
    private VariableDeclaration curVar;

    public Identifier getVarName() {
        return varName;
    }
    public void setVarName(Identifier varName) {
        this.varName = varName;
    }

    public Type getVarType() {
        return varType;
    }
    public void setVarType(Type varType) {
        this.varType = varType;
    }

    public ArrayList<VariableDeclaration> getArgs() {
        return args;
    }
    public void setArgs(ArrayList<VariableDeclaration> args) {
        this.args = args;
    }
    public void addArg(VariableDeclaration argument) {
        this.args.add(argument);
    }

    public Statement getSetterBody() {
        return setterBody;
    }
    public void setSetterBody(Statement body) {
        this.setterBody = body;
    }

    public Statement getGetterBody() {
        return getterBody;
    }
    public void setGetterBody(Statement body) {
        this.getterBody = body;
    }

    public VariableDeclaration getVarDec() {
        if (curVar == null) {
            curVar = new VariableDeclaration(varName, varType);
            curVar.setLine(this.getLine());
        }
        return curVar;
    }

    @Override
    public String toString() {
        return "SetGetVarDeclaration_" + varName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

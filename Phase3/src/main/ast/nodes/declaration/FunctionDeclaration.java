package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;
import main.ast.types.*;
import main.visitor.IVisitor;

import java.util.*;

//line -> identifier
public class FunctionDeclaration extends Declaration {
    private Identifier functionName;
    private ArrayList<VariableDeclaration> args = new ArrayList<>();
    private Statement body;
    private Type returnType;


    public Identifier getFunctionName() {
        return functionName;
    }
    public void setFunctionName(Identifier functionName) {
        this.functionName = functionName;
    }

    public ArrayList<VariableDeclaration> getArgs() {
        return args;
    }
    public void setArgs(ArrayList<VariableDeclaration> args) {
        this.args = args;
    }
    public void addArg(VariableDeclaration arg) {
        this.args.add(arg);
    }

    public Statement getBody() {
        return body;
    }
    public void setBody(Statement body) {
        this.body = body;
    }

    public Type getReturnType() {
        return returnType;
    }
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration_" + this.functionName.getName();
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

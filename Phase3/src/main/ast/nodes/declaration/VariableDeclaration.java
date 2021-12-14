package main.ast.nodes.declaration;

import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.*;
import main.ast.types.*;
import main.visitor.*;

//line -> IDENTIFIER
public class VariableDeclaration extends Declaration{
    private Identifier varName;
    private Type varType;
    private Expression defaultValue;

    public VariableDeclaration(Identifier varName, Type varType) {
        this.varName = varName;
        this.varType = varType;
    }

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

    public Expression getDefaultValue() {
        return defaultValue;
    }
    public void setDefaultValue(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "VarDeclaration_" + this.varName.getName();
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

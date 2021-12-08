package main.ast.nodes.declaration.struct;

import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.BlockStmt;
import main.ast.nodes.statement.SetGetVarDeclaration;
import main.ast.nodes.statement.Statement;
import main.ast.nodes.statement.VarDecStmt;
import main.ast.types.StructType;
import main.visitor.IVisitor;

import javax.swing.plaf.nimbus.State;
import java.util.*;

//Line -> STRUCT
public class StructDeclaration extends Declaration {
    private Identifier structName;
    private Statement body;

    public Identifier getStructName() {
        return structName;
    }

    public void setStructName(Identifier structName) {
        this.structName = structName;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public ArrayList<String> getChildrenStructs() {
        ArrayList<String> fields = new ArrayList<>();
        if (body instanceof BlockStmt) {
            for (Statement stmt: ((BlockStmt) body).getStatements()){
                if (stmt instanceof VarDecStmt) {
                    for (VariableDeclaration var: ((VarDecStmt) stmt).getVars()) {
                        if (var.getVarType() instanceof StructType)
                            fields.add(((StructType) var.getVarType()).getStructName().getName());
                    }
                } else if (stmt instanceof SetGetVarDeclaration) {
                    VariableDeclaration varDec = new VariableDeclaration(((SetGetVarDeclaration) stmt).getVarName(),
                            ((SetGetVarDeclaration) stmt).getVarType());
                    if (varDec.getVarType() instanceof StructType)
                        fields.add(((StructType) varDec.getVarType()).getStructName().getName());
                }
            }
        } else {
            if (body instanceof VarDecStmt) {
                for (VariableDeclaration var: ((VarDecStmt) body).getVars()) {
                    if (var.getVarType() instanceof StructType)
                        fields.add(((StructType) var.getVarType()).getStructName().getName());
                }
            } else if (body instanceof SetGetVarDeclaration) {
                VariableDeclaration varDec = new VariableDeclaration(((SetGetVarDeclaration) body).getVarName(),
                        ((SetGetVarDeclaration) body).getVarType());
                if (varDec.getVarType() instanceof StructType)
                    fields.add(((StructType) varDec.getVarType()).getStructName().getName());
            }
        }
        return fields;
    }

    @Override
    public String toString() {
        return "StructDeclaration_" + structName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


}

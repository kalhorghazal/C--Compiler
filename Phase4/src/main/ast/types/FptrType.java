package main.ast.types;

import java.util.ArrayList;

public class FptrType extends Type {
    private ArrayList<Type> argsType;
    private Type returnType;

    public FptrType(ArrayList<Type> argsTypes, Type returnType) {
        this.argsType = argsTypes;
        this.returnType = returnType;
    }

    public ArrayList<Type> getArgsType() { return argsType; }
    public void setArgsType(ArrayList<Type> argsTypes) { this.argsType = argsTypes; }
    public void addArgType(Type type) { this.argsType.add(type); }

    public Type getReturnType() {
        return returnType;
    }
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "FptrType";
    }
}
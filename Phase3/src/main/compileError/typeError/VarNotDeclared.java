package main.compileError.typeError;

import main.compileError.CompileError;

public class VarNotDeclared extends CompileError {
    public VarNotDeclared(int line, String varName) {
        super(line, "Variable " + varName + " is not declared");
    }

}

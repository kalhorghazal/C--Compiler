package main.compileError.nameError;

import main.compileError.CompileError;

public class VarFunctionConflict extends CompileError {
    public VarFunctionConflict(int line, String varName) {
        super(line, "Name of variable " + varName + " conflicts with a function's name");
    }
}

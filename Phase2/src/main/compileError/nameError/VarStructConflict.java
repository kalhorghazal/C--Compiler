package main.compileError.nameError;

import main.compileError.CompileError;

public class VarStructConflict extends CompileError {
    public VarStructConflict(int line, String varName) {
        super(line, "Name of variable " + varName + " conflicts with a struct’s name");
    }
}

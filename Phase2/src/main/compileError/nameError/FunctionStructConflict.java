package main.compileError.nameError;

import main.compileError.CompileError;

public class FunctionStructConflict extends CompileError {
    public FunctionStructConflict(int line, String functionName) {
        super(line, "Name of function " + functionName + " conflicts with a struct’s name");
    }
}

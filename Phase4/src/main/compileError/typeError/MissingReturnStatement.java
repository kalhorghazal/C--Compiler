package main.compileError.typeError;

import main.compileError.CompileError;

public class MissingReturnStatement extends CompileError {

    public MissingReturnStatement(int line, String functionName) {
        super(line, "Missing return statement for function " + functionName);
    }

}

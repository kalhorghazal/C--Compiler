package main.compileError.typeError;

import main.compileError.CompileError;

public class LeftSideNotLvalue extends CompileError {

    public LeftSideNotLvalue(int line) {
        super(line, "Left side of the assignment must be a valid lvalue");
    }

}

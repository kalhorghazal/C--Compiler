package main.compileError.typeError;

import main.compileError.CompileError;

public class ReturnValueNotMatchFunctionReturnType extends CompileError {

    public ReturnValueNotMatchFunctionReturnType(int line) {
        super(line, "Return value does not match with function return type");
    }

}

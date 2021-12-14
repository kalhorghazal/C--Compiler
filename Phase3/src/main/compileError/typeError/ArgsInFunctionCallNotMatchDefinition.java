package main.compileError.typeError;

import main.compileError.CompileError;

public class ArgsInFunctionCallNotMatchDefinition extends CompileError {

    public ArgsInFunctionCallNotMatchDefinition(int line) {
        super(line, "Args in function call do not match with definition");
    }

}

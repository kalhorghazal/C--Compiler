package main.compileError.typeError;

import main.compileError.CompileError;

public class NewElementTypeNotMatchListType extends CompileError {

    public NewElementTypeNotMatchListType(int line) {
        super(line, "New element type does not match with list type");
    }

}

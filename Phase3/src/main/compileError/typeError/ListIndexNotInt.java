package main.compileError.typeError;

import main.compileError.CompileError;

public class ListIndexNotInt extends CompileError {

    public ListIndexNotInt(int line) {
        super(line, "List index is not an integer");
    }

}

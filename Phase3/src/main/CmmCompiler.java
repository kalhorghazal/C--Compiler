package main;

import main.visitor.*;
import main.visitor.name.*;
import main.visitor.type.*;
import parsers.*;
import main.ast.nodes.Program;
import org.antlr.v4.runtime.*;
import java.util.*;

public class CmmCompiler {
    public void compile(CharStream textStream) {
        CmmLexer cmmLexer = new CmmLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(cmmLexer);
        CmmParser cmmParser = new CmmParser(tokenStream);
        Program program = cmmParser.cmm().cmmProgram;
        ErrorReporter errorReporter = new ErrorReporter();

        NameAnalyser nameAnalyser = new NameAnalyser();
        program.accept(nameAnalyser);

        int numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0)
            System.exit(1);

        TypeChecker typeChecker = new TypeChecker();
        program.accept(typeChecker);

        numberOfErrors = program.accept(errorReporter);
        if(numberOfErrors > 0)
            System.exit(1);

        System.out.println("Compilation successful");

//        ASTTreePrinter astTreePrinter = new ASTTreePrinter();
//        program.accept(astTreePrinter);

    }
}

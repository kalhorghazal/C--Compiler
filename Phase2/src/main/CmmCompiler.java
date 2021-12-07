package main;

import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.utils.ASTTreePrinter;
import main.visitor.utils.ErrorPrinter;
import parsers.*;
import main.ast.nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CmmCompiler {
    public void compile(CharStream textStream) {
        CmmLexer cmmLexer = new CmmLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(cmmLexer);
        CmmParser cmmParser = new CmmParser(tokenStream);

        Program program = cmmParser.cmm().cmmProgram;

        ErrorPrinter errorPrinter = new ErrorPrinter();
        NameAnalyzer nameAnalyzer = new NameAnalyzer(program);
        ASTTreePrinter astTreePrinter = new ASTTreePrinter();

        nameAnalyzer.analyze();
        int numberOfErrors = program.accept(errorPrinter);
        if(numberOfErrors > 0) {
            System.out.println("\n" + numberOfErrors + " errors detected");
            System.exit(1);
        }
        program.accept(astTreePrinter);
    }
}

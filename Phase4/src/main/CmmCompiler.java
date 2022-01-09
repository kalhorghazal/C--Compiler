package main;

import main.visitor.*;
import main.visitor.codeGenerator.CodeGenerator;
import main.visitor.name.*;
import main.visitor.type.*;
import parsers.*;
import main.ast.nodes.Program;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.*;

public class CmmCompiler {
    public void compile(CharStream textStream) {
        System.out.println("\n--------------------------Compiling--------------------------");
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

        CodeGenerator codeGenerator = new CodeGenerator();
        program.accept(codeGenerator);

        System.out.println("Compilation successful");

        runJasminFiles();
    }

    private void runJasminFiles() {
        try {
            System.out.println("\n-------------------Generating Class Files-------------------");
            File dir = new File("./output");
            Process process = Runtime.getRuntime().exec("java -jar jasmin.jar *.j", null, dir);
            printResults(process.getInputStream());
            printResults(process.getErrorStream());
            System.out.println("\n---------------------------Output---------------------------");
            process = Runtime.getRuntime().exec("java Main", null, dir);
            printResults(process.getInputStream());
            printResults(process.getErrorStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printResults(InputStream stream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        try {
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

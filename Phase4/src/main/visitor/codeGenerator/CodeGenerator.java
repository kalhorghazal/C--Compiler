package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.*;

public class  CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private Declaration currentFunction;
    private int tempVarSlot = 0;
    private int labelCounter = 0;


    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//unreachable
        }
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//unreachable

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        //todo: done:)
        int count = 1;
        if(currentFunction == null)
            return tempVarSlot++;
        if(currentFunction instanceof FunctionDeclaration) {
            for (VariableDeclaration varDeclaration : ((FunctionDeclaration) currentFunction).getArgs()) {
                if (varDeclaration.getVarName().getName().equals(identifier))
                    return count;
                count++;
            }
            if (((FunctionDeclaration) currentFunction).getBody() instanceof BlockStmt) {
                for (Statement statement : ((BlockStmt) ((FunctionDeclaration) currentFunction).getBody()).getStatements()) {
                    if (statement instanceof VarDecStmt) {
                        for (VariableDeclaration varDec : ((VarDecStmt) statement).getVars()) {
                            if (varDec.getVarName().getName().equals(identifier))
                                return count;
                            count++;
                        }
                    } else
                        break;
                }
            } else if (((FunctionDeclaration) currentFunction).getBody() instanceof VarDecStmt) {
                for (VariableDeclaration varDec : ((VarDecStmt) ((FunctionDeclaration) currentFunction).getBody()).getVars()) {
                    if (varDec.getVarName().getName().equals(identifier))
                        return count;
                    count++;
                }
            }
        }
        else if (currentFunction instanceof MainDeclaration) {
            if (((MainDeclaration) currentFunction).getBody() instanceof BlockStmt) {
                for (Statement statement : ((BlockStmt) ((MainDeclaration) currentFunction).getBody()).getStatements()) {
                    if (statement instanceof VarDecStmt) {
                        for (VariableDeclaration varDec : ((VarDecStmt) statement).getVars()) {
                            if (varDec.getVarName().getName().equals(identifier))
                                return count;
                            count++;
                        }
                    } else
                        break;
                }
            } else if (((MainDeclaration) currentFunction).getBody() instanceof VarDecStmt) {
                for (VariableDeclaration varDec : ((VarDecStmt) ((MainDeclaration) currentFunction).getBody()).getVars()) {
                    if (varDec.getVarName().getName().equals(identifier))
                        return count;
                    count++;
                }
            }
        }
        //first empty var
        return count + (tempVarSlot++);
    }

    @Override
    public String visit(Program program) {
        prepareOutputFolder();

        for(StructDeclaration structDeclaration : program.getStructs()){
            structDeclaration.accept(this);
        }

        createFile("Main");

        program.getMain().accept(this);

        for (FunctionDeclaration functionDeclaration: program.getFunctions()){
            functionDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        createFile(structDeclaration.getStructName().getName());
        //todo
        String structName = structDeclaration.getStructName().toString();
        createFile(structName);
        addCommand("");
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        //todo
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        //todo
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        //todo
        return null;
    }

    @Override
    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        //todo: done:)
        String commands = this.visit(new BinaryExpression(assignmentStmt.getLValue(), assignmentStmt.getRValue(), BinaryOperator.assign));
        addCommand(commands);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        //todo: done:)
        for (Statement statement: blockStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        //todo: done:?
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
        conditionalStmt.getThenBody().accept(this);
        //if(!(conditionalStmt.getThenBody().accept(this.typeChecker)).doesReturn)
        addCommand("goto " + exitLabel);
        addCommand(elseLabel + ":");
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(exitLabel + ":");
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        //todo: done:)
        this.expressionTypeChecker.setInFunctionCallStmt(true);
        functionCallStmt.getFunctionCall().accept(this);
        this.expressionTypeChecker.setInFunctionCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);

        addCommand(commandsOfArg);
        if (argType instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        if (argType instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        //todo: done:)
        for (VariableDeclaration varDec : varDecStmt.getVars()) {
            varDec.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        //todo: done:)
        this.expressionTypeChecker.setInFunctionCallStmt(true);
        listAppendStmt.getListAppendExpr().accept(this);
        this.expressionTypeChecker.setInFunctionCallStmt(false);
        return null;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        //todo: done:)
        listSizeStmt.accept(this);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        return null;
    }

    @Override
    public String visit(StructAccess structAccess){
        //todo
        return null;
    }

    @Override
    public String visit(Identifier identifier){
        //todo
        return null;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex){
        //todo
        return null;
    }

    @Override
    public String visit(FunctionCall functionCall){
        //todo
        return null;
    }

    @Override
    public String visit(ListSize listSize){
        //todo
        return null;
    }

    @Override
    public String visit(ListAppend listAppend) {
        //todo
        return null;
    }

    @Override
    public String visit(IntValue intValue) {
        //todo: done:)
        return "ldc " + intValue.getConstant();
    }

    @Override
    public String visit(BoolValue boolValue) {
        //todo: done:)
        int boolIntVal = (boolValue.getConstant()) ? 1 : 0;
        return "ldc " + boolIntVal;
    }

    @Override
    public String visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }

    private String getFreshLabel() {
        return "Label_" + this.labelCounter++;
    }
}

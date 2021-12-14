package main.visitor.name;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.ast.types.StructType;
import main.compileError.nameError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;

import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyser extends Visitor<Void> {

    private int newId = 1;
    private boolean firstVisit = true;
    private boolean isInStruct = false;
    private String curStructName;
    private final Graph<String> structHierarchy = new Graph<>();

    private void createStructSymbolTable(StructDeclaration structDec) {
        SymbolTable newSymbolTable = new SymbolTable();
        StructSymbolTableItem newSymbolTableItem = new StructSymbolTableItem(structDec);
        newSymbolTableItem.setStructSymbolTable(newSymbolTable);
        try {
            SymbolTable.root.put(newSymbolTableItem);

        } catch (ItemAlreadyExistsException e) {
            DuplicateStruct exception = new DuplicateStruct(structDec.getLine(), structDec.getStructName().getName());
            structDec.addError(exception);
            String newName = newId + "@";
            newId += 1;
            structDec.setStructName(new Identifier(newName));
            try {
                StructSymbolTableItem newStructSym = new StructSymbolTableItem(structDec);
                newStructSym.setStructSymbolTable(newSymbolTable);
                SymbolTable.root.put(newStructSym);
            } catch (ItemAlreadyExistsException e1) { //Unreachable
            }
        }
    }

    private void createFunctionSymbolTable(FunctionDeclaration funcDec) {
        FunctionSymbolTableItem newSymbolTableItem = new FunctionSymbolTableItem(funcDec);
        try {
            SymbolTable.root.put(newSymbolTableItem);

        } catch (ItemAlreadyExistsException e) {
            DuplicateFunction exception = new DuplicateFunction(funcDec.getLine(), funcDec.getFunctionName().getName());
            funcDec.addError(exception);
            String newName = newId + "@";
            newId += 1;
            funcDec.setFunctionName(new Identifier(newName));
            try {
                FunctionSymbolTableItem newFuncSym = new FunctionSymbolTableItem(funcDec);
                SymbolTable.root.put(newFuncSym);
            } catch (ItemAlreadyExistsException e1) { //Unreachable
            }
        }
    }

    private boolean hasConflict(String key) {
        try {
            SymbolTable.root.getItem(key);
            return true;
        } catch (ItemNotFoundException exception) {
            return false;
        }
    }

    private void checkCycle(ArrayList<StructDeclaration> structs){
        for(StructDeclaration struct : structs){
            String structName = struct.getStructName().getName();
            if(structHierarchy.isSecondNodeAncestorOf(structName, structName)){
                CyclicDependency exception = new CyclicDependency(struct.getLine(), structName);
                struct.addError(exception);
            }
        }
    }

    @Override
    public Void visit(Program program) {
        SymbolTable root = new SymbolTable();
        SymbolTable.root = root;
        SymbolTable.push(root);
        for (StructDeclaration structDec : program.getStructs()) {
            createStructSymbolTable(structDec);
            try {
                structHierarchy.addNode(structDec.getStructName().getName());
            }
            catch (Exception e){//unreachable
            }
        }

        for (FunctionDeclaration funcDec : program.getFunctions()) {
            if (hasConflict(StructSymbolTableItem.START_KEY + funcDec.getFunctionName().getName())) {
                FunctionStructConflict exception = new FunctionStructConflict(funcDec.getLine(), funcDec.getFunctionName().getName());
                funcDec.addError(exception);
            }
            createFunctionSymbolTable(funcDec);
        }

        for (StructDeclaration structDec : program.getStructs()) {
            try {
                String key = StructSymbolTableItem.START_KEY + structDec.getStructName().getName();
                StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem) SymbolTable.root.getItem(key);
                SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
                isInStruct = true;
                curStructName = structDec.getStructName().getName();
                structDec.accept(this);
                isInStruct = false;
                SymbolTable.pop();
            } catch (ItemNotFoundException e) { //Unreachable
            }
        }

        checkCycle(program.getStructs());

        for (FunctionDeclaration funcDec : program.getFunctions()) {
            SymbolTable.push(new SymbolTable());
            funcDec.accept(this);
            SymbolTable.pop();
        }

        SymbolTable.push(new SymbolTable());
        program.getMain().accept(this);
        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDec) {
        for (VariableDeclaration arg: funcDec.getArgs())
            arg.accept(this);
        funcDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDeclaration) {
        structDeclaration.getBody().accept(this);
        firstVisit = false;
        structDeclaration.getBody().accept(this);
        firstVisit = true;
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        mainDeclaration.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement stmt : blockStmt.getStatements()) {
            if (firstVisit)
                stmt.accept(this);
            if (!firstVisit && stmt instanceof SetGetVarDeclaration)
                stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        SymbolTable ifScope = new SymbolTable(SymbolTable.top);
        SymbolTable.push(ifScope);
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        if (conditionalStmt.getElseBody() != null) {
            SymbolTable elseScope = new SymbolTable(SymbolTable.top);
            SymbolTable.push(elseScope);
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        SymbolTable loopScope = new SymbolTable(SymbolTable.top);
        SymbolTable.push(loopScope);
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration var : varDecStmt.getVars())
            if(firstVisit)
                var.accept(this);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDeclaration) {
        String name = setGetVarDeclaration.getVarName().getName();
        if (firstVisit) {
            setGetVarDeclaration.getVarDec().accept(this);
            SymbolTable newSym = new SymbolTable();
            FunctionDeclaration funcDec = new FunctionDeclaration();

            funcDec.setFunctionName(new Identifier(name));
            funcDec.setReturnType(setGetVarDeclaration.getVarType());
            funcDec.setArgs(setGetVarDeclaration.getArgs());
            FunctionSymbolTableItem newItem = new FunctionSymbolTableItem(funcDec);
            newItem.setFunctionSymbolTable(newSym);
            try {
                SymbolTable.top.put(newItem);
            } catch (ItemAlreadyExistsException e) {
                setGetVarDeclaration.setVarName(new Identifier(name + "@" + newId));
                funcDec.setFunctionName(new Identifier(name + "@" + newId));
                newId += 1;
                FunctionSymbolTableItem fSym = new FunctionSymbolTableItem(funcDec);
                fSym.setFunctionSymbolTable(newSym);
                try{
                    SymbolTable.top.put(fSym);
                }catch (ItemAlreadyExistsException e2) {//unreachable
                }
            }
        }
        else {
            try {
                String key = FunctionSymbolTableItem.START_KEY + name;
                FunctionSymbolTableItem fItem = (FunctionSymbolTableItem) SymbolTable.top.getItem(key);
                SymbolTable sym = fItem.getFunctionSymbolTable();
                sym.pre = SymbolTable.top;
                SymbolTable.push(sym);
                for (VariableDeclaration arg : setGetVarDeclaration.getArgs())
                    arg.accept(this);
                SymbolTable.pop();
            } catch (ItemNotFoundException e) {//unreachable
            }
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDeclaration) {
        String name = variableDeclaration.getVarName().getName();

        if(isInStruct && variableDeclaration.getVarType() instanceof StructType){
            StructType structType = (StructType) variableDeclaration.getVarType();
            try {
                structHierarchy.addNodeAsParentOf(structType.getStructName().getName(), curStructName);
            }
            catch (Exception e){//unreachable
            }
        }

        if (hasConflict(StructSymbolTableItem.START_KEY + name)) {
            VarStructConflict exception = new VarStructConflict(variableDeclaration.getLine(), name);
            variableDeclaration.addError(exception);
        }

        if (hasConflict(FunctionSymbolTableItem.START_KEY + name)) {
            VarFunctionConflict exception = new VarFunctionConflict(variableDeclaration.getLine(), name);
            variableDeclaration.addError(exception);
        }

        VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDeclaration.getVarName());
        try {
            SymbolTable.top.getItem(variableSymbolTableItem.getKey());
            DuplicateVar exception = new DuplicateVar(variableDeclaration.getLine(), name);
            variableDeclaration.addError(exception);
        } catch (ItemNotFoundException exception2) {
            try {
                SymbolTable.top.put(variableSymbolTableItem);
            } catch (ItemAlreadyExistsException exception3) { //unreachable
            }
        }
        return null;
    }
}

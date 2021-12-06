grammar Cmm;

@header{
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
     import java.util.*;
 }

cmm returns[Program cmmProgram]:
    NEWLINE* p = program {$cmmProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {
        $programRet = new Program();
        int line = 1;
        $programRet.setLine(line);
    }
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main
    { $programRet.setMain($m.mainRet); }
    ;

//todo: done:)
main returns[MainDeclaration mainRet]:
    m=MAIN
    {
        $mainRet = new MainDeclaration();
        $mainRet.setLine($m.getLine());
    }
    LPAR RPAR body
    { $mainRet.setBody($body.bodyRet); }
    ;

//todo: done:)
structDeclaration returns[StructDeclaration structDeclarationRet]:
    s=STRUCT i=identifier
    {
        $structDeclarationRet = new StructDeclaration();
        $structDeclarationRet.setStructName($i.idRet);
        $structDeclarationRet.setLine($s.getLine());
    }
    ((b=BEGIN s1=structBody
    {
        $s1.structBodyRet.setLine($b.getLine());
        $structDeclarationRet.setBody($s1.structBodyRet);
    }
    NEWLINE+ END) | (NEWLINE+ s2=singleStatementStructBody
    { $structDeclarationRet.setBody($s2.singleStmtStructBodyRet); }
    SEMICOLON?)) NEWLINE+
    ;

//todo: done:)
singleVarWithGetAndSet returns[SetGetVarDeclaration setGetVarDecRet]:
    t=type i=identifier
    {
        $setGetVarDecRet = new SetGetVarDeclaration();
        $setGetVarDecRet.setVarType($t.typeRet);
        $setGetVarDecRet.setVarName($i.idRet);
        $setGetVarDecRet.setLine($i.line);
    }
    f=functionArgsDec
    { $setGetVarDecRet.setArgs($f.argsRet); }
    b=BEGIN NEWLINE+ s=setBody
    { $setGetVarDecRet.setSetterBody($s.setBodyRet); }
    g=getBody
    { $setGetVarDecRet.setGetterBody($g.getBodyRet); }
    END
    ;

//todo: done:)
singleStatementStructBody returns[Statement singleStmtStructBodyRet]:
    v=varDecStatement
    { $singleStmtStructBodyRet = $v.varDecStmtRet; }
    | s=singleVarWithGetAndSet
    { $singleStmtStructBodyRet = $s.setGetVarDecRet; }
    ;

//todo: done:)
structBody returns[BlockStmt structBodyRet]:
    { $structBodyRet = new BlockStmt(); }
    (NEWLINE+ (s1=singleStatementStructBody
    { $structBodyRet.addStatement($s1.singleStmtStructBodyRet); }
    SEMICOLON)* s2=singleStatementStructBody
    { $structBodyRet.addStatement($s2.singleStmtStructBodyRet); }
    SEMICOLON?)+
    ;

//todo: done:)
getBody returns[Statement getBodyRet]:
    GET b=body
    { $getBodyRet = $b.bodyRet; }
    NEWLINE+
    ;

//todo: done:)
setBody returns[Statement setBodyRet]:
    SET b=body
    { $setBodyRet = $b.bodyRet; }
    NEWLINE+
    ;

//todo: done:)
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    { $functionDeclarationRet = new FunctionDeclaration(); }
    (t=type
    { $functionDeclarationRet.setReturnType($t.typeRet); }
    | VOID
    { $functionDeclarationRet.setReturnType(new VoidType()); }
    ) i=identifier
    {
        $functionDeclarationRet.setFunctionName($i.idRet);
        $functionDeclarationRet.setLine($i.line);
    }
    f=functionArgsDec
    { $functionDeclarationRet.setArgs($f.argsRet); }
    b=body
    { $functionDeclarationRet.setBody($b.bodyRet); }
    NEWLINE+
    ;

//todo: done:)
functionArgsDec returns[ArrayList<VariableDeclaration> argsRet]:
    LPAR
    { $argsRet = new ArrayList<>(); }
    (v1=variableWithType
    { $argsRet.add($v1.varWithTypeRet); }
    (COMMA v2=variableWithType
    { $argsRet.add($v2.varWithTypeRet); }
    )*
    )?
    RPAR
    ;

variableWithType returns[VariableDeclaration varWithTypeRet]:
    t=type id=identifier
    {
        $varWithTypeRet = new VariableDeclaration($id.idRet, $t.typeRet);
        $varWithTypeRet.setLine($id.line);
    }
    ;

//todo: done:)
functionArguments returns[ArrayList<Expression> functionArgsRet]:
    { $functionArgsRet = new ArrayList<>(); }
    (e1=expression
    { $functionArgsRet.add($e1.exprRet); }
    (COMMA e2=expression
    { $functionArgsRet.add($e2.exprRet); }
    )*
    )?
    ;

//todo: done:)
body returns[Statement bodyRet]:
    (b=blockStatement
    { $bodyRet = $b.blockStmtRet; }
    | (NEWLINE+ s=singleStatement
    { $bodyRet = $s.stmtRet; }
    (SEMICOLON)?
    ))
    ;

//todo: done:)
loopCondBody returns[Statement loopCondBodyRet]:
     (b=blockStatement
     { $loopCondBodyRet = $b.blockStmtRet; }
     | (NEWLINE+ s=singleStatement
     { $loopCondBodyRet = $s.stmtRet; }
     ))
     ;

//todo: done:)
blockStatement returns[BlockStmt blockStmtRet]:
    b=BEGIN
    {
        $blockStmtRet = new BlockStmt();
        $blockStmtRet.setLine($b.getLine());
    }
    (NEWLINE+ (s1=singleStatement
    { $blockStmtRet.addStatement($s1.stmtRet); }
    SEMICOLON)* s2=singleStatement
    { $blockStmtRet.addStatement($s2.stmtRet); }
    (SEMICOLON)?)+ NEWLINE+ END
    ;

//todo: done:)
varDecStatement returns[VarDecStmt varDecStmtRet]
    locals[VariableDeclaration tempVar]:
    t=type i1=identifier
    {
        $tempVar = new VariableDeclaration($i1.idRet, $t.typeRet);
        $tempVar.setLine($i1.line);
    }
    (ASSIGN oe1=orExpression
    { $tempVar.setDefaultValue($oe1.orExprRet); }
    )?
    {
        $varDecStmtRet = new VarDecStmt();
        $varDecStmtRet.addVar($tempVar);
        $varDecStmtRet.setLine($tempVar.getLine());
    }
    (COMMA i2=identifier
    {
        $tempVar = new VariableDeclaration($i2.idRet, $t.typeRet);
        $tempVar.setLine($i2.line);
    }
    (ASSIGN oe2=orExpression
    { $tempVar.setDefaultValue($oe2.orExprRet); }
    )?
    { $varDecStmtRet.addVar($tempVar); }
    )*
    ;

//todo: done:)
functionCallStmt returns[FunctionCallStmt functionCallStmtRet]
    locals[Expression tempExpr]:
    oe=otherExpression
    { $tempExpr = $oe.otherExprRet; }
    (
    (l1=LPAR f1=functionArguments
    {
        $tempExpr = new FunctionCall($tempExpr, $f1.functionArgsRet);
        $tempExpr.setLine($l1.getLine());
    }
    RPAR)
    | (DOT i=identifier)
    {
        $tempExpr = new StructAccess($tempExpr, $i.idRet);
        $tempExpr.setLine($i.line);
    }
    )*
    (l2=LPAR f2=functionArguments
    {
        FunctionCall functionCall = new FunctionCall($tempExpr, $f2.functionArgsRet);
        functionCall.setLine($l2.getLine());
        $functionCallStmtRet = new FunctionCallStmt(functionCall);
        $functionCallStmtRet.setLine($l2.getLine());
    }
    RPAR)
    ;

//todo: done:)
returnStatement returns[ReturnStmt returnStmtRet]:
    r=RETURN
    {
        $returnStmtRet = new ReturnStmt();
        $returnStmtRet.setLine($r.getLine());
    }
    (e=expression
    { $returnStmtRet.setReturnedExpr($e.exprRet); }
    )?
    ;

//todo: done:)
ifStatement returns[ConditionalStmt ifStmtRet]:
    i=IF e=expression
    {
        $ifStmtRet = new ConditionalStmt($e.exprRet);
        $ifStmtRet.setLine($i.getLine());
    }
    (lc=loopCondBody
    { $ifStmtRet.setThenBody($lc.loopCondBodyRet); }
    | b=body
    { $ifStmtRet.setThenBody($b.bodyRet); }
    es=elseStatement
    { $ifStmtRet.setElseBody($es.elseStmtRet); }
    );

//todo: done:)
elseStatement returns[Statement elseStmtRet]:
     NEWLINE* ELSE b=loopCondBody
     { $elseStmtRet = $b.loopCondBodyRet; }
     ;

//todo: done:)
loopStatement returns[LoopStmt loopStmtRet]:
    w=whileLoopStatement
    { $loopStmtRet = $w.whileStmtRet; }
    | d=doWhileLoopStatement
    { $loopStmtRet = $d.doWhileStmtRet; }
    ;

//todo: done:)
whileLoopStatement returns[LoopStmt whileStmtRet]:
    w=WHILE
    {
        $whileStmtRet = new LoopStmt();
        $whileStmtRet.setLine($w.getLine());
    }
    e=expression
    { $whileStmtRet.setCondition($e.exprRet); }
    b=loopCondBody
    { $whileStmtRet.setBody($b.loopCondBodyRet); }
    ;

//todo: done:)
doWhileLoopStatement returns[LoopStmt doWhileStmtRet]:
    d=DO
    {
        $doWhileStmtRet = new LoopStmt();
        $doWhileStmtRet.setLine($d.getLine());
    }
    b=body
    { $doWhileStmtRet.setBody($b.bodyRet); }
    NEWLINE* WHILE e=expression
    { $doWhileStmtRet.setCondition($e.exprRet); }
    ;

//todo: done:)
displayStatement returns[DisplayStmt displayStmtRet]:
    d=DISPLAY LPAR
    e=expression
    {
        $displayStmtRet = new DisplayStmt($e.exprRet);
        $displayStmtRet.setLine($d.getLine());
    }
    RPAR
    ;

//todo: done:)
assignmentStatement returns[AssignmentStmt assignmentRet]:
    left=orExpression a=ASSIGN right=expression
    {
        $assignmentRet = new AssignmentStmt($left.orExprRet, $right.exprRet);
        $assignmentRet.setLine($a.getLine());
    }
    ;

//todo: done:)
singleStatement returns[Statement stmtRet]:
    i=ifStatement
    { $stmtRet = $i.ifStmtRet; }
    | d=displayStatement
    { $stmtRet = $d.displayStmtRet; }
    | f=functionCallStmt
    { $stmtRet = $f.functionCallStmtRet; }
    | r=returnStatement
    { $stmtRet = $r.returnStmtRet; }
    | a1=assignmentStatement
    { $stmtRet = $a1.assignmentRet; }
    | v=varDecStatement
    { $stmtRet = $v.varDecStmtRet; }
    | l=loopStatement
    { $stmtRet = $l.loopStmtRet; }
    | a2=append
    {
        $stmtRet = new ListAppendStmt($a2.listAppendRet);
        $stmtRet.setLine($a2.line);
    }
    | s=size
    {
        $stmtRet = new ListSizeStmt($s.listSizeRet);
        $stmtRet.setLine($s.line);
    }
    ;

//todo: done:)
expression returns[Expression exprRet]:
    oe=orExpression
    { $exprRet = $oe.orExprRet; }
    (a=ASSIGN e=expression
    {
        BinaryOperator op = BinaryOperator.assign;
        $exprRet = new BinaryExpression($oe.orExprRet, $e.exprRet, op);
        $exprRet.setLine($a.getLine());
    }
    )?
    ;

//todo: done:)
orExpression returns[Expression orExprRet]:
    ael=andExpression
    { $orExprRet = $ael.andExprRet; }
    (o=OR aer=andExpression
    {
        BinaryOperator op = BinaryOperator.or;
        $orExprRet = new BinaryExpression($orExprRet, $aer.andExprRet, op);
        $orExprRet.setLine($o.getLine());
    }
    )*
    ;

//todo: done:)
andExpression returns[Expression andExprRet]:
    eel=equalityExpression
    { $andExprRet = $eel.eqExprRet; }
    (a=AND ee2=equalityExpression
    {
        BinaryOperator op = BinaryOperator.and;
        $andExprRet = new BinaryExpression($andExprRet, $ee2.eqExprRet, op);
        $andExprRet.setLine($a.getLine());
    }
    )*
    ;

//todo: done:)
equalityExpression returns[Expression eqExprRet]
    locals[BinaryOperator op, int line]:
    rel=relationalExpression
    { $eqExprRet = $rel.relExprRet; }
    (eq=EQUAL
    {
        $op = BinaryOperator.eq;
        $line = $eq.getLine();
    }
    rer=relationalExpression
    {
        $eqExprRet = new BinaryExpression($eqExprRet, $rer.relExprRet, $op);
        $eqExprRet.setLine($line);
    }
    )*
    ;

//todo: done:)
relationalExpression returns[Expression relExprRet]
    locals[BinaryOperator op, int line]:
    ael=additiveExpression
    { $relExprRet = $ael.addExprRet; }
    ((gt=GREATER_THAN
    {
        $op = BinaryOperator.gt;
        $line = $gt.getLine();
    }
    | lt=LESS_THAN
    {
        $op = BinaryOperator.lt;
        $line = $lt.getLine();
    }
    ) aer=additiveExpression
    {
        $relExprRet = new BinaryExpression($relExprRet, $aer.addExprRet, $op);
        $relExprRet.setLine($line);
    }
    )*
    ;

//todo: done:)
additiveExpression returns[Expression addExprRet]
    locals[BinaryOperator op, int line]:
    mel=multiplicativeExpression
    { $addExprRet = $mel.multExprRet; }
    ((add=PLUS
    {
        $op = BinaryOperator.add;
        $line = $add.getLine();
    }
    | sub=MINUS
    {
        $op = BinaryOperator.sub;
        $line = $sub.getLine();
    }
    ) mer=multiplicativeExpression
    {
        $addExprRet = new BinaryExpression($addExprRet, $mer.multExprRet, $op);
        $addExprRet.setLine($line);
    }
    )*
    ;

//todo: done:)
multiplicativeExpression returns[Expression multExprRet]
    locals[BinaryOperator op, int line]:
    pel=preUnaryExpression
    { $multExprRet = $pel.preUnaryExprRet; }
    ((mult=MULT
    {
        $op = BinaryOperator.mult;
        $line = $mult.getLine();
    }
    | div=DIVIDE
    {
        $op = BinaryOperator.div;
        $line = $div.getLine();
    }
    ) per=preUnaryExpression
    {
        $multExprRet = new BinaryExpression($multExprRet, $per.preUnaryExprRet, $op);
        $multExprRet.setLine($line);
    }
    )*
    ;

//todo: done:)
preUnaryExpression returns[Expression preUnaryExprRet]
    locals[UnaryOperator op, int line]:
    (not=NOT
    {
        $op = UnaryOperator.not;
        $line = $not.getLine();
    }
    | minus=MINUS
    {
        $op = UnaryOperator.minus;
        $line = $minus.getLine();
    }
    ) pre=preUnaryExpression
    {
        $preUnaryExprRet = new UnaryExpression($pre.preUnaryExprRet, $op);
        $preUnaryExprRet.setLine($line);
    }
    | ae=accessExpression
    { $preUnaryExprRet = $ae.accessExprRet; }
    ;

//todo: done:)
accessExpression returns[Expression accessExprRet]:
    oe=otherExpression
    { $accessExprRet = $oe.otherExprRet; }
    ((l1=LPAR f=functionArguments RPAR)
    {
        $accessExprRet = new FunctionCall($accessExprRet, $f.functionArgsRet);
        $accessExprRet.setLine($l1.getLine());
    }
    | (DOT i1=identifier)
    {
        $accessExprRet = new StructAccess($accessExprRet, $i1.idRet);
        $accessExprRet.setLine($i1.line);
    }
    )*
    ((l2=LBRACK index=expression RBRACK)
    {
        $accessExprRet = new ListAccessByIndex($accessExprRet, $index.exprRet);
        $accessExprRet.setLine($l2.getLine());
    }
    | (DOT i2=identifier)
    {
        $accessExprRet = new StructAccess($accessExprRet, $i2.idRet);
        $accessExprRet.setLine($i2.line);
    }
    )*
    ;

//todo: done:)
otherExpression returns[Expression otherExprRet]:
    v=value
    { $otherExprRet = $v.valueRet; }
    | id=identifier
    { $otherExprRet = $id.idRet; }
    | l=LPAR (f=functionArguments) RPAR
    {
        $otherExprRet = new ExprInPar($f.functionArgsRet);
        $otherExprRet.setLine($l.getLine());
    }
    | s=size
    {
        $otherExprRet = $s.listSizeRet;
        $otherExprRet.setLine($s.line);
    }
    | a=append
    {
        $otherExprRet = $a.listAppendRet;
        $otherExprRet.setLine($a.line);
    }
    ;

//todo: done:)
size returns[ListSize listSizeRet, int line]:
    s=SIZE LPAR
    e=expression
    {
        $listSizeRet = new ListSize($e.exprRet);
        $listSizeRet.setLine($s.getLine());
        $line = $listSizeRet.getLine();
    }
    RPAR
    ;

//todo: done:)
append returns[ListAppend listAppendRet, int line]:
    a=APPEND LPAR
    e1=expression COMMA e2=expression
    {
        $listAppendRet = new ListAppend($e1.exprRet, $e2.exprRet);
        $listAppendRet.setLine($a.getLine());
        $line = $listAppendRet.getLine();
    }
    RPAR
    ;

//todo: done:)
value returns[Value valueRet]:
    b=boolValue
    {
        $valueRet = new BoolValue($b.boolValueRet);
        $valueRet.setLine($b.line);
    }
    | i=INT_VALUE
    {
        $valueRet = new IntValue($i.int);
        $valueRet.setLine($i.getLine());
    }
    ;

//todo: done:)
boolValue returns[boolean boolValueRet, int line]:
    t=TRUE
    {
        $boolValueRet = true;
        $line = $t.getLine();
    }
    | f=FALSE
    {
        $boolValueRet = false;
        $line = $f.getLine();
    }
    ;

//todo: done:)
identifier returns[Identifier idRet, int line]:
    id=IDENTIFIER
    {
        $idRet = new Identifier($id.text);
        $idRet.setLine($id.getLine());
        $line = $id.getLine();
    }
    ;

structType returns[StructType structTypeRet]:
    STRUCT id=identifier
    { $structTypeRet = new StructType($id.idRet); }
    ;

listType returns[ListType listTypeRet]:
    LIST SHARP t=type
    { $listTypeRet = new ListType($t.typeRet); }
    ;

//todo: done:)
type returns[Type typeRet]:
    INT
    { $typeRet = new IntType(); }
    | BOOL
    { $typeRet = new BoolType(); }
    | l=listType
    { $typeRet = $l.listTypeRet; }
    | s=structType
    { $typeRet = $s.structTypeRet; }
    | f=fptrType
    { $typeRet = $f.fptrTypeRet; }
    ;

//todo: done:)
fptrType returns[FptrType fptrTypeRet]
    locals[ArrayList<Type> argsTypes, Type returnType]:
    FPTR LESS_THAN
    (VOID
    { $argsTypes = new ArrayList<Type>(); }
    | types=typesWithComma
    { $argsTypes = $types.typesWithCommaRet; }
    ) ARROW
    (VOID
    { $returnType = new VoidType(); }
    | t=type
    { $returnType = $t.typeRet; }
    ) GREATER_THAN
    { $fptrTypeRet = new FptrType($argsTypes, $returnType); }
    ;

typesWithComma returns[ArrayList<Type> typesWithCommaRet]:
    { $typesWithCommaRet = new ArrayList<>(); }
    t1=type
    { $typesWithCommaRet.add($t1.typeRet); }
    (COMMA t2=type
    { $typesWithCommaRet.add($t2.typeRet); }
    )*
    ;

MAIN: 'main';
RETURN: 'return';
VOID: 'void';

SIZE: 'size';
DISPLAY: 'display';
APPEND: 'append';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';


EQUAL: '==';
ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';


AND: '&';
OR: '|';
NOT: '~';

TRUE: 'true';
FALSE: 'false';

BEGIN: 'begin';
END: 'end';

INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';
FPTR: 'fptr';
GET: 'get';
SET: 'set';
WHILE: 'while';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;


COMMENT: ('/*' .*? '*/') -> skip;
WS: ([ \t\r]) -> skip;
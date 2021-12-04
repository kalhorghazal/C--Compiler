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
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main {$programRet.setMain($m.mainRet);};

//todo
main returns[MainDeclaration mainRet]:
    MAIN LPAR RPAR body;

//todo
structDeclaration returns[StructDeclaration structDeclarationRet]:
    STRUCT identifier ((BEGIN structBody NEWLINE+ END) | (NEWLINE+ singleStatementStructBody SEMICOLON?)) NEWLINE+;

//todo
singleVarWithGetAndSet :
    type identifier functionArgsDec BEGIN NEWLINE+ setBody getBody END;

//todo
singleStatementStructBody :
    varDecStatement | singleVarWithGetAndSet;

//todo
structBody :
    (NEWLINE+ (singleStatementStructBody SEMICOLON)* singleStatementStructBody SEMICOLON?)+;

//todo
getBody :
    GET body NEWLINE+;

//todo
setBody :
    SET body NEWLINE+;

//todo
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    (type | VOID ) identifier functionArgsDec body NEWLINE+;

//todo
functionArgsDec :
    LPAR (type identifier (COMMA type identifier)*)? RPAR ;

//todo
functionArguments returns[ArrayList<Expression> functionArgsRet]:
    (expression (COMMA expression)*)?;

//todo
body :
     (blockStatement | (NEWLINE+ singleStatement (SEMICOLON)?));

//todo
loopCondBody :
     (blockStatement | (NEWLINE+ singleStatement ));

//todo
blockStatement :
    BEGIN (NEWLINE+ (singleStatement SEMICOLON)* singleStatement (SEMICOLON)?)+ NEWLINE+ END;

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

//todo
functionCallStmt :
     otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))* (LPAR functionArguments RPAR);

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

//todo
ifStatement :
    IF expression (loopCondBody | body elseStatement);

//todo
elseStatement :
     NEWLINE* ELSE loopCondBody;

//todo
loopStatement :
    whileLoopStatement | doWhileLoopStatement;

//todo
whileLoopStatement :
    WHILE expression loopCondBody;

//todo
doWhileLoopStatement :
    DO body NEWLINE* WHILE expression;

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

//todo
singleStatement :
    ifStatement | displayStatement | functionCallStmt | returnStatement | assignmentStatement
    | varDecStatement | loopStatement | append | size;

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
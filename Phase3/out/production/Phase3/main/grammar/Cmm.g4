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
     $programRet.setLine(1);}
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main {$programRet.setMain($m.mainRet);};


main returns[MainDeclaration mainRet]:
    {$mainRet = new MainDeclaration();}
    m = MAIN LPAR RPAR b = body
    {$mainRet.setLine($m.getLine());
     $mainRet.setBody($b.bodyRet);};


structDeclaration returns[StructDeclaration structDeclarationRet]:
    {$structDeclarationRet = new StructDeclaration();}
    s = STRUCT id = identifier{
    $structDeclarationRet.setLine($s.getLine());
    $structDeclarationRet.setStructName($id.identifierRet);
    }
    ((b = BEGIN sb = structBody{
    $sb.structBodyRet.setLine($b.getLine());
    $structDeclarationRet.setBody($sb.structBodyRet);
    }
    NEWLINE+ END)
    |(NEWLINE+ sss = singleStatementStructBody{
    $structDeclarationRet.setBody($sss.stmt);
    }
    SEMICOLON?)) NEWLINE+;


singleVarWithGetAndSet returns[SetGetVarDeclaration singleVarWithGetAndSetRet]:
    {$singleVarWithGetAndSetRet = new SetGetVarDeclaration();}
    t = type id = identifier {
    $singleVarWithGetAndSetRet.setLine($id.identifierRet.getLine());
    $singleVarWithGetAndSetRet.setVarName($id.identifierRet);
    $singleVarWithGetAndSetRet.setVarType($t.typeRet);
    }
    fa = functionArgsDec {
    ArrayList<VariableDeclaration> args = $fa.functionArgsDecRet;
    $singleVarWithGetAndSetRet.setArgs(args);
    }
    BEGIN NEWLINE+ sb = setBody{
    $singleVarWithGetAndSetRet.setSetterBody($sb.setBodyRet);
    }
    gb = getBody{
    $singleVarWithGetAndSetRet.setGetterBody($gb.getBodyRet);
    }
    END;


singleStatementStructBody returns[Statement stmt]:
    v = varDecStatement {$stmt = $v.varDecStatementRet;}
    | s = singleVarWithGetAndSet {$stmt = $s.singleVarWithGetAndSetRet;}
    ;


structBody returns[BlockStmt structBodyRet]:
    {
     $structBodyRet = new BlockStmt();
    }
    (NEWLINE+ (s1 = singleStatementStructBody {
    $structBodyRet.addStatement($s1.stmt);
    }
    SEMICOLON)* s2 = singleStatementStructBody{
    $structBodyRet.addStatement($s2.stmt);
    }
    SEMICOLON?)+;


getBody returns[Statement getBodyRet]:
    GET b = body {$getBodyRet = $b.bodyRet;} NEWLINE+;


setBody returns[Statement setBodyRet]:
    SET b = body {$setBodyRet = $b.bodyRet;} NEWLINE+;


functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    {$functionDeclarationRet = new FunctionDeclaration();}
    (t = type {
    $functionDeclarationRet.setReturnType($t.typeRet);
    }
    | VOID {
    $functionDeclarationRet.setReturnType(new VoidType());
    })
    id = identifier f = functionArgsDec b = body {
    $functionDeclarationRet.setLine($id.identifierRet.getLine());
    $functionDeclarationRet.setFunctionName($id.identifierRet);
    $functionDeclarationRet.setArgs($f.functionArgsDecRet);
    $functionDeclarationRet.setBody($b.bodyRet);
    }
    NEWLINE+;


functionArgsDec returns[ArrayList<VariableDeclaration> functionArgsDecRet]:
    {$functionArgsDecRet = new ArrayList<>();}
    LPAR (t1 = type id1 = identifier{
    VariableDeclaration newVarDec = new VariableDeclaration($id1.identifierRet, $t1.typeRet);
    newVarDec.setLine($id1.identifierRet.getLine());
    $functionArgsDecRet.add(newVarDec);
    }
    (COMMA t2 = type id2 = identifier {
    newVarDec = new VariableDeclaration($id2.identifierRet, $t2.typeRet);
    newVarDec.setLine($id2.identifierRet.getLine());
    $functionArgsDecRet.add(newVarDec); }
    )*)? RPAR ;


functionArguments returns [ArrayList<Expression> funcArgRet]:
    {$funcArgRet = new ArrayList<>();}
    (exp1 = expression
    {$funcArgRet.add($exp1.exprRet);}
     (COMMA exp2 = expression
     {$funcArgRet.add($exp2.exprRet);}
     )*)?;


body returns[Statement bodyRet]:
     (b = blockStatement
     {$bodyRet = $b.blockStatementRet;}
     | (NEWLINE+ s = singleStatement
     {$bodyRet = $s.singleStatementRet;}
     (SEMICOLON)?));


loopCondBody returns [Statement stmtRet]:
     (b = blockStatement
     {$stmtRet = $b.blockStatementRet;}
     | (NEWLINE+ s = singleStatement
      {$stmtRet = $s.singleStatementRet;}
     ));


blockStatement returns[BlockStmt blockStatementRet]:
    {$blockStatementRet = new BlockStmt();}
    b = BEGIN{
    $blockStatementRet.setLine($b.getLine());
    }
    (NEWLINE+ (s1 = singleStatement{
    $blockStatementRet.addStatement($s1.singleStatementRet);
    } SEMICOLON)*
    s2 = singleStatement{
    $blockStatementRet.addStatement($s2.singleStatementRet);
    } (SEMICOLON)?)+ NEWLINE+ END;


varDecStatement returns[VarDecStmt varDecStatementRet]:
    {$varDecStatementRet = new VarDecStmt();}
    t = type id1 = identifier{
    VariableDeclaration newVarDec = new VariableDeclaration($id1.identifierRet, $t.typeRet);
    newVarDec.setLine($id1.identifierRet.getLine());
    $varDecStatementRet.setLine(newVarDec.getLine());
    }
    (ASSIGN exp1 = orExpression {newVarDec.setDefaultValue($exp1.orExprRet);})?
    {$varDecStatementRet.addVar(newVarDec);}
    (COMMA id2 = identifier{
    newVarDec = new VariableDeclaration($id2.identifierRet, $t.typeRet);
    newVarDec.setLine($id2.identifierRet.getLine());
    }
    (ASSIGN exp2 = orExpression{newVarDec.setDefaultValue($exp2.orExprRet);})?
    {$varDecStatementRet.addVar(newVarDec);} )*;


functionCallStmt returns[FunctionCallStmt functionCallStmtRet]
    locals [Expression expr, FunctionCall fcall]:

     oth = otherExpression
     {$expr = $oth.expr;}
     ((l = LPAR f = functionArguments RPAR
     {$expr = new FunctionCall($expr, $f.funcArgRet);
      $expr.setLine($l.getLine());}
     ) | (DOT i = identifier
      {$expr = new StructAccess($expr, $i.identifierRet);
       $expr.setLine($i.line);}
     ))* (ll = LPAR ff = functionArguments RPAR
     {$fcall = new FunctionCall($expr, $ff.funcArgRet);
      $fcall.setLine($ll.getLine());}
     )
     {$functionCallStmtRet = new FunctionCallStmt($fcall);
      $functionCallStmtRet.setLine($fcall.getLine());}
     ;


returnStatement returns[ReturnStmt returnStatementRet]:
    {$returnStatementRet = new ReturnStmt();}
    r = RETURN {$returnStatementRet.setLine($r.getLine());}
    (exp = expression {$returnStatementRet.setReturnedExpr($exp.exprRet);})?;


ifStatement returns[ConditionalStmt ifStatementRet]:
    cond = IF exp = expression
    {$ifStatementRet = new ConditionalStmt($exp.exprRet);
     $ifStatementRet.setLine($cond.getLine());}
    (body1 = loopCondBody
    {$ifStatementRet.setThenBody($body1.stmtRet);}
    | body2 = body
    {$ifStatementRet.setThenBody($body2.bodyRet);}
    elsest = elseStatement
    {$ifStatementRet.setElseBody($elsest.stmt);}
    );


elseStatement returns [Statement stmt]:
     NEWLINE* ELSE bd = loopCondBody
     {$stmt = $bd.stmtRet;}
     ;


loopStatement returns[LoopStmt loopStatementRet]:
    st1= whileLoopStatement
    {$loopStatementRet = $st1.stmt;}
    | st2 = doWhileLoopStatement
    {$loopStatementRet = $st2.stmt;}
    ;


whileLoopStatement returns [LoopStmt stmt]:
    {$stmt = new LoopStmt();}
    w = WHILE exp = expression
    {$stmt.setCondition($exp.exprRet);
     $stmt.setLine($w.getLine());}
    bd = loopCondBody
    {$stmt.setBody($bd.stmtRet);}
    ;


doWhileLoopStatement returns [LoopStmt stmt]:
    {$stmt = new LoopStmt();}
    d = DO bd = body
    {$stmt.setBody($bd.bodyRet);
     $stmt.setLine($d.getLine());}
    NEWLINE* WHILE exp = expression
    {$stmt.setCondition($exp.exprRet);}
    ;


displayStatement returns[DisplayStmt displayStatementRet]:
  dis = DISPLAY LPAR exp = expression
  {$displayStatementRet = new DisplayStmt($exp.exprRet);
   $displayStatementRet.setLine($dis.getLine());}
  RPAR;


assignmentStatement returns[AssignmentStmt assignmentStatementRet]:
    left = orExpression a = ASSIGN right = expression
    {$assignmentStatementRet = new AssignmentStmt($left.orExprRet, $right.exprRet);
     $assignmentStatementRet.setLine($a.getLine());}
    ;


singleStatement returns[Statement singleStatementRet]:
    i = ifStatement {$singleStatementRet = $i.ifStatementRet;}
    | d = displayStatement {$singleStatementRet = $d.displayStatementRet;}
    | f = functionCallStmt {$singleStatementRet = $f.functionCallStmtRet;}
    | r = returnStatement {$singleStatementRet = $r.returnStatementRet;}
    | a = assignmentStatement {$singleStatementRet = $a.assignmentStatementRet;}
    | v = varDecStatement {$singleStatementRet = $v.varDecStatementRet;}
    | l = loopStatement {$singleStatementRet = $l.loopStatementRet;}
    | ap = append
    {ListAppendStmt listAppend = new ListAppendStmt($ap.appendRet);
     listAppend.setLine($ap.line);
     $singleStatementRet = listAppend;}
    | s = size
    {ListSizeStmt listSize = new ListSizeStmt($s.sizeRet);
     listSize.setLine($s.line);
     $singleStatementRet = listSize;}
    ;


expression returns[Expression exprRet]:
    expl = orExpression {$exprRet = $expl.orExprRet;}
    (op = ASSIGN expr = expression {
        BinaryOperator opr = BinaryOperator.assign;
        $exprRet = new BinaryExpression($exprRet, $expr.exprRet, opr);
        $exprRet.setLine($op.getLine());
    })?
    ;


orExpression returns[Expression orExprRet]:
    expl = andExpression {$orExprRet = $expl.andExprRet;}
    (op = OR expr = andExpression{
        BinaryOperator opr = BinaryOperator.or;
        $orExprRet = new BinaryExpression($orExprRet, $expr.andExprRet, opr);
        $orExprRet.setLine($op.getLine());
    })*
    ;


andExpression returns[Expression andExprRet]:
    expl = equalityExpression {$andExprRet = $expl.equalityExprRet;}
    (op = AND expr = equalityExpression{
        BinaryOperator opr = BinaryOperator.and;
        $andExprRet = new BinaryExpression($andExprRet, $expr.equalityExprRet, opr);
        $andExprRet.setLine($op.getLine());
    })*;


equalityExpression returns[Expression equalityExprRet]:
    expl = relationalExpression {$equalityExprRet = $expl.relationalExprRet;}
    (op = EQUAL expr = relationalExpression{
        BinaryOperator opr = BinaryOperator.eq;
        $equalityExprRet = new BinaryExpression($equalityExprRet, $expr.relationalExprRet, opr);
        $equalityExprRet.setLine($op.getLine());
    })*;


relationalExpression returns [Expression relationalExprRet]
    locals [BinaryOperator op, int line]:
    l = additiveExpression
    {$relationalExprRet = $l.expr;}
    ((op1 = GREATER_THAN
    {$op = BinaryOperator.gt;
    $line = $op1.getLine();}
    | op2 = LESS_THAN
    {$op = BinaryOperator.lt;
     $line = $op2.getLine();}
    ) r = additiveExpression
    {$relationalExprRet = new BinaryExpression($relationalExprRet,$r.expr,$op);
     $relationalExprRet.setLine($line);}
    )*;


additiveExpression returns [Expression expr]
    locals [BinaryOperator op, int line]:
    l = multiplicativeExpression
    {$expr = $l.expr;}
    ((op1 = PLUS
    {$op = BinaryOperator.add;
     $line = $op1.getLine();}
    | op2 = MINUS
    {$op = BinaryOperator.sub;
     $line = $op2.getLine();}

    ) r = multiplicativeExpression
    {$expr = new BinaryExpression($expr,$r.expr,$op);
     $expr.setLine($line);}
    )*;


multiplicativeExpression returns [Expression expr]
    locals [BinaryOperator op, int line]:
    l = preUnaryExpression
    {$expr = $l.expr;}
    ((op1 = MULT
    {$op = BinaryOperator.mult;
     $line = $op1.getLine();}
    | op2 = DIVIDE
    {$op = BinaryOperator.div;
     $line = $op2.getLine();}
    ) r = preUnaryExpression
    {$expr = new BinaryExpression($expr,$r.expr,$op);
    $expr.setLine($line);}
    )*;


preUnaryExpression returns [Expression expr]
    locals[UnaryOperator op, int line]:
    ((op1 = NOT
    {$op = UnaryOperator.not;
     $line = $op1.getLine();}
    | op2 = MINUS
    {$op = UnaryOperator.minus;
     $line = $op2.getLine();}
    ) pre = preUnaryExpression
    {$expr = new UnaryExpression($pre.expr, $op);
     $expr.setLine($line);}
    ) | ac = accessExpression
    {$expr = $ac.expr;}
    ;


accessExpression returns [Expression expr]:
    oth = otherExpression
    {$expr = $oth.expr;}
    ((l = LPAR f = functionArguments
    {$expr = new FunctionCall($expr, $f.funcArgRet);
     $expr.setLine($l.getLine());}
    RPAR)
    | (DOT i = identifier
    {$expr = new StructAccess($expr, $i.identifierRet);
     $expr.setLine($i.line);}
    ))*
    ((l = LBRACK ex = expression
    {$expr = new ListAccessByIndex($expr, $ex.exprRet);
     $expr.setLine($l.getLine());}
    RBRACK) | (DOT i=identifier
    {$expr = new StructAccess($expr, $i.identifierRet);
     $expr.setLine($i.line);}
    ))*;


otherExpression returns [Expression expr]:
    v = value
    {$expr = $v.valueRet;}
    | id = identifier
    {$expr = $id.identifierRet;}
    | l = LPAR (f = functionArguments) RPAR
    {ExprInPar ex = new ExprInPar($f.funcArgRet);
     ex.setLine($l.getLine());
     $expr = ex;}
    | s = size
    {$expr = $s.sizeRet;}
    | ap = append
    {$expr = $ap.appendRet;}
    ;


size returns [ListSize sizeRet, int line]:
    s = SIZE LPAR ex = expression
    {$sizeRet = new ListSize($ex.exprRet);
     $sizeRet.setLine($s.getLine());
     $line = $s.getLine();}
    RPAR;


append returns [ListAppend appendRet, int line]:
    ap = APPEND LPAR ex1 = expression COMMA ex2 = expression RPAR
    {$appendRet = new ListAppend($ex1.exprRet, $ex2.exprRet);
     $appendRet.setLine($ap.getLine());
     $line = $ap.getLine();}
    ;


value returns[Value valueRet]:
    b = boolValue {$valueRet = $b.boolValueRet;}
    | iv = INT_VALUE{
    $valueRet = new IntValue($iv.int);
    $valueRet.setLine($iv.getLine());}
    ;


boolValue returns [BoolValue boolValueRet]:
    t = TRUE
    {$boolValueRet = new BoolValue(true);
     $boolValueRet.setLine($t.getLine());}
    | f = FALSE
    {$boolValueRet = new BoolValue(false);
     $boolValueRet.setLine($f.getLine());}
    ;


identifier returns[Identifier identifierRet, int line]:
    id = IDENTIFIER {
    $identifierRet = new Identifier($id.text);
    $identifierRet.setLine($id.getLine());
    $line = $id.getLine();};


type returns[Type typeRet]:
      INT {$typeRet = new IntType();}
    | BOOL {$typeRet = new BoolType();}
    | LIST SHARP t = type {$typeRet = new ListType($t.typeRet);}
    | STRUCT id = identifier {$typeRet = new StructType($id.identifierRet);}
    | f = fptrType {$typeRet = $f.fptrTypeRet;}
    ;


fptrType returns[FptrType fptrTypeRet]:
    { ArrayList<Type> args = new ArrayList<>(); }
    FPTR LESS_THAN (VOID
    | (t1 = type { args.add($t1.typeRet); } (COMMA t2 = type { args.add($t2.typeRet); })* ))

    ARROW (t3 = type {$fptrTypeRet = new FptrType(args, $t3.typeRet);}
    | VOID {$fptrTypeRet = new FptrType(args, new VoidType());}) GREATER_THAN;


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

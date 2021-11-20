grammar Cmm;

@members{
    void print(String str, Boolean... params){
        assert params.length <= 1;
        boolean inline = params.length > 0 ? params[0].booleanValue() : false;
        if (inline) {
            System.out.print(str);
        } else
            System.out.println(str);
    }
}

cmm: program EOF;

program: NL* (struct NL+)* (function NL+)* NL* main NL*;

main: MAIN {print("Main");} LPAR RPAR functionScope;

struct: STRUCT id=IDENTIFIER {print("StructDec : " + $id.text);} structBody;

function: (type | VOID) id=IDENTIFIER {print("FunctionDec : " + $id.text);} LPAR functionArguments RPAR functionScope;

structBody: begin ((varDeclaration | method) interaSpace)* (varDeclaration | method) (SEMICOLLON)? end | NL+ (varDeclaration | method) (SEMICOLLON)?;

method: type id=IDENTIFIER {print("VarDec : " + $id.getText());} LPAR functionArguments RPAR methodBody;

methodBody: begin setter NL+ getter end;

setter: SET {print("Setter");} functionScope;

getter: GET {print("Getter");} functionScope;

varDeclaration: type id=IDENTIFIER {print("VarDec : " + $id.text);} (ASSIGN expression)? (COMMA id=IDENTIFIER {print("VarDec : " + $id.text);} (ASSIGN expression)?)*;

statement: doWhileStatement | whileStatement | ifStatement | varDeclaration | assignmentStatement | defaultFunctionStatement | functionCallStatement | returnStatement;

assignmentStatement: orExpression ASSIGN expression;

defaultFunctionStatement: displayStatement | sizeStatement | appendStatement;

displayStatement: DISPLAY {print("Built-in : display");} LPAR expression RPAR;

sizeStatement: SIZE {print("Size");} LPAR expression RPAR;

appendStatement: APPEND {print("Append");} LPAR expression COMMA expression RPAR;

returnStatement: RETURN {print("Return");} (expression)?;

functionArguments: (variableWithType)(() | (COMMA variableWithType)*) | ();

variableWithType: type id=IDENTIFIER {print("ArgumentDec : " + $id.getText());};

type: primitiveDataType | listType | functioPointerType | structType;

structType: STRUCT IDENTIFIER;

listType: LIST HASH type;

functioPointerType: FPTR LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (() | (COMMA type)*);

primitiveDataType: INT | BOOL;

values: boolValue | INT_VALUE;

boolValue: TRUE | FALSE;

functionCallStatement: {print("FunctionCall");} accessExpression ((DOT IDENTIFIER (LPAR functionCallArguments RPAR)+) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))* ((DOT IDENTIFIER)? (LPAR functionCallArguments RPAR)+);

functionCallArguments: expression (() | (COMMA expression)*) | ();

doWhileStatement: DO {print("Loop : do...while");} functionScope NL* WHILE (LPAR expression RPAR | expression);

whileStatement: WHILE {print("Loop : while");} (LPAR expression RPAR | expression) statementScope;

ifStatement: IF {print("Conditional : if");} (LPAR expression RPAR | expression) (functionScope NL* ELSE {print("Conditional : else");})? statementScope;

statementScope: multiStatements | singleStatement;

functionScope: multiStatements | singleStatement (SEMICOLLON)?;

multiStatements: begin (statement interaSpace)* statement (SEMICOLLON)? end;

singleStatement: NL+ statement;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (op = OR andExpression {print("Operator : " + $op.getText());})*;

andExpression: equalityExpression (op = AND equalityExpression {print("Operator : " + $op.getText());})*;

equalityExpression: relationalExpression (op = EQUAL relationalExpression {print("Operator : " + $op.getText());})*;

relationalExpression: additiveExpression (op = (GREATER_THAN | LESS_THAN) additiveExpression {print("Operator : " + $op.getText());})*;

additiveExpression: multiplicativeExpression (op = (PLUS | MINUS) multiplicativeExpression {print("Operator : " + $op.getText());})*;

multiplicativeExpression: unaryExpression (op = (MULT | DIVIDE) unaryExpression {print("Operator : " + $op.getText());})*;

unaryExpression: op = (NOT | MINUS) unaryExpression {print("Operator : " + $op.getText());} | accessExpression;

accessExpression: otherExpression (((DOT IDENTIFIER)? LPAR functionCallArguments RPAR) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))*;

otherExpression: values | defaultFunctionStatement | IDENTIFIER | LPAR (expression) RPAR | IDENTIFIER LBRACK expression RBRACK;

interaSpace: (SEMICOLLON NL+) | NL+ | SEMICOLLON;

begin: BEGIN NL+;

end: NL+ END;

STRUCT: 'struct';
MAIN: 'main';

INT: 'int';
BOOL: 'bool';

LIST: 'list';
FPTR: 'fptr';
VOID: 'void';

WHILE: 'while';
DO: 'do';

IF: 'if';
ELSE: 'else';

RETURN: 'return';

GET: 'get';
SET: 'set';

BEGIN: 'begin';
END: 'end';

DISPLAY: 'display';
APPEND: 'append';
SIZE: 'size';

TRUE: 'true';
FALSE: 'false';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';
AND: '&';
OR: '|';
NOT: '~';

ASSIGN: '=';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

DOT: '.';
HASH: '#';
COMMA: ',';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
NL: '\r'? '\n';
COMMENT: '/*' (.)*? '*/' -> skip;
WS: [ \t] -> skip;
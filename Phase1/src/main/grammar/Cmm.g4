grammar Cmm;

cmm : program EOF;

program: main;

main: LPAR RPAR;

statement: doWhileStatement | whileStatement | ifStatement | assignmentStatement | defaultFunctionStatement | /*functionCallStatement |*/ returnStatement;

assignmentStatement: orExpression ASSIGN expression;

defaultFunctionStatement: ((DISPLAY | SIZE) LPAR expression RPAR) | appendStatement;

appendStatement: APPEND LPAR COMMA expression RPAR;

returnStatement: RETURN expression;

functionArguments: (variableWithType)(() | (COMMA variableWithType)*) | ();

variableWithType: type IDENTIFIER;

type: primitiveDataType;

primitiveDataType: INT | BOOL;

values: boolValue | INT_VALUE | listValus;

boolValue: TRUE | FALSE;

listValus: LBRACK functionCallArguments RBRACK;

functionCallArguments: expression (() | (COMMA expression)*) | ();

doWhileStatement: DO singleOrMultiStatements WHILE LPAR expression RPAR;

whileStatement: WHILE LPAR expression RPAR singleOrMultiStatements;

ifStatement: IF LPAR expression RPAR singleOrMultiStatements (ELSE singleOrMultiStatements)?;

singleOrMultiStatements: BEGIN statement (NL | SEMICOLLON) (statement)+ END | statement;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression (EQUAL relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: unaryExpression ((MULT | DIVIDE) unaryExpression)*;

unaryExpression: NOT accessExpression | MINUS accessExpression | accessExpression;

accessExpression: otherExpression ((DOT IDENTIFIER LPAR functionCallArguments RPAR) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))*;

otherExpression: values | IDENTIFIER | LPAR (expression) RPAR | IDENTIFIER LBRACK expression RBRACK;

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
COMMA: ',';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
NL: '\r'? '\n';
COMMENT: '/*' (.)*? '*/' -> skip;
WS: [ \t] -> skip;
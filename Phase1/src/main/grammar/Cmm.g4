grammar Cmm;

cmm: program EOF;

program: NL* (struct NL+)* (function NL+)* NL* main NL*;

main: MAIN LPAR RPAR functionScope;

struct: STRUCT IDENTIFIER structBody;

function: (type | VOID) IDENTIFIER LPAR functionArguments RPAR functionScope;

structBody: begin ((varDeclaration | method) interaSpace)* (varDeclaration | method) (SEMICOLLON)? end | NL+ (varDeclaration | method);

method: type IDENTIFIER LPAR functionArguments RPAR methodBody;

methodBody: begin setter NL+ getter end;

setter: SET functionScope;

getter: GET functionScope;

varDeclaration: type IDENTIFIER (ASSIGN expression)? (COMMA IDENTIFIER (ASSIGN expression)?)*;

statement: doWhileStatement | whileStatement | ifStatement | varDeclaration | assignmentStatement | defaultFunctionStatement | functionCallStatement | returnStatement;

assignmentStatement: orExpression ASSIGN expression;

defaultFunctionStatement: displayStatement | sizeStatement | appendStatement;

displayStatement: DISPLAY LPAR expression RPAR;

sizeStatement: SIZE LPAR expression RPAR;

appendStatement: APPEND LPAR expression COMMA expression RPAR;

returnStatement: RETURN (expression)?;

functionArguments: (variableWithType)(() | (COMMA variableWithType)*) | ();

variableWithType: type IDENTIFIER;

type: primitiveDataType | listType | functioPointerType | structType;

structType: STRUCT IDENTIFIER;

listType: LIST HASH type;

functioPointerType: FPTR LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (() | (COMMA type)*);

primitiveDataType: INT | BOOL;

values: boolValue | INT_VALUE;

boolValue: TRUE | FALSE;

functionCallStatement: otherExpression ((DOT IDENTIFIER (LPAR functionCallArguments RPAR)+) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))* ((DOT IDENTIFIER)? (LPAR functionCallArguments RPAR)+);

functionCallArguments: expression (() | (COMMA expression)*) | ();

doWhileStatement: DO statementScope NL+ WHILE LPAR expression RPAR;

whileStatement: WHILE LPAR expression RPAR statementScope;

ifStatement: IF LPAR expression RPAR statementScope (NL+ ELSE statementScope)?;

statementScope: begin multiStatements end (SEMICOLLON)? | singleStatement;

functionScope: begin multiStatements end | singleStatement;

multiStatements: (statement interaSpace)* statement (SEMICOLLON)?;

singleStatement: NL+ statement (SEMICOLLON)?;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression (EQUAL relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: unaryExpression ((MULT | DIVIDE) unaryExpression)*;

unaryExpression: NOT accessExpression | MINUS accessExpression | accessExpression;

accessExpression: otherExpression (((DOT IDENTIFIER)? LPAR functionCallArguments RPAR) | (DOT IDENTIFIER) | (LBRACK expression RBRACK))*;

otherExpression: values | IDENTIFIER | LPAR (expression) RPAR | IDENTIFIER LBRACK expression RBRACK;

interaSpace: (SEMICOLLON + NL+) | NL+ | SEMICOLLON;

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
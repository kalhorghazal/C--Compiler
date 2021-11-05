grammar Cmm;

cmm: program EOF;

program: (struct + NL)* (function NL)* NL* main;

main: MAIN LPAR RPAR singleOrMultiStatements;

struct: STRUCT begin structBody end;

function: (type | VOID) IDENTIFIER LPAR functionArguments RPAR singleOrMultiStatements;

structBody: (varDeclaration | method)*;

method: type IDENTIFIER LPAR functionArguments RPAR methodBody;

methodBody: begin setter getter end;

setter: SET singleOrMultiStatements;

getter: GET singleOrMultiStatements returnStatement;

varDeclaration: type (assignmentStatement | IDENTIFIER);

statement: doWhileStatement | whileStatement | ifStatement | assignmentStatement | defaultFunctionStatement | /*functionCallStatement |*/ returnStatement;

assignmentStatement: orExpression ASSIGN expression;

defaultFunctionStatement: displayStatement | sizeStatement | appendStatement;

displayStatement: DISPLAY LPAR expression RPAR;

sizeStatement: SIZE LPAR expression RPAR;

appendStatement: APPEND LPAR orExpression COMMA expression RPAR;

returnStatement: RETURN expression;

functionArguments: (variableWithType)(() | (COMMA variableWithType)*) | ();

variableWithType: type IDENTIFIER;

type: primitiveDataType | listType | functioPointerType | structType;

structType: STRUCT IDENTIFIER;

listType: LIST HASH type;

functioPointerType: FPTR LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (() | (COMMA type)*);

primitiveDataType: INT | BOOL;

values: boolValue | INT_VALUE | listValus;

boolValue: TRUE | FALSE;

listValus: LBRACK functionCallArguments RBRACK;

//functionCallStatement: ;

functionCallArguments: expression (() | (COMMA expression)*) | ();

doWhileStatement: DO singleOrMultiStatements WHILE LPAR expression RPAR;

whileStatement: WHILE LPAR expression RPAR singleOrMultiStatements;

ifStatement: IF LPAR expression RPAR singleOrMultiStatements (ELSE singleOrMultiStatements)?;

singleOrMultiStatements: begin (statement necessarySpace)* statement (SEMICOLLON)? end | NL+ statement optionalSpace;

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

necessarySpace: (SEMICOLLON + NL+) | NL+ | SEMICOLLON;

optionalSpace: (SEMICOLLON)? NL*;

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
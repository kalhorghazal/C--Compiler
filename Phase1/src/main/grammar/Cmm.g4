grammar Cmm;

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

COMMA: ',';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
NL: '\r'? '\n';
COMMENT: '/*' (.)*? '*/' -> skip;
WS: [ \t] -> skip;
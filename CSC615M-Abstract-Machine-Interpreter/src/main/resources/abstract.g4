grammar abstract;

/**
  *  Parser Rules
  */
start           : data_section EOF | logic_section EOF;
data_section    : DATA NEWLINE (stack | queue | tape);
stack           : ('STACK' WHITESPACE STACK_NAME NEWLINE)+ logic_section;
queue           : ('QUEUE' WHITESPACE QUEUE_NAME NEWLINE)+ logic_section;
tape            : ('TAPE' WHITESPACE QUEUE_NAME NEWLINE)+ logic_section;

logic_section   : LOGIC NEWLINE state_behavior+;
state_behavior  : STATE_NAME WHITESPACE COMMAND WHITESPACE TRANSITION+ NEWLINE;


/**
  *  Lexer Rules
  */
fragment S         : 'S';
fragment Q         : 'Q';
fragment T         : 'T';
fragment NUMBER    : [0-9];
fragment UPPERCASE : [A-Z];
fragment LOWERCASE : [a-z];
fragment RSBRCKT   : ']';
fragment LPRNTHS   : '(';
fragment RPRNTHS   : ')';
fragment COMMA     : ',';
fragment SHARP     : '#';

DATA        : '.DATA';
LOGIC       : '.LOGIC';
NEWLINE     : [\r\n]+;
STATE_NAME  : (UPPERCASE NUMBER | LOWERCASE NUMBER | UPPERCASE | LOWERCASE | NUMBER)+ RSBRCKT;
TRANSITION  : (LPRNTHS (LOWERCASE | UPPERCASE | NUMBER | SHARP) COMMA
              (UPPERCASE NUMBER | LOWERCASE NUMBER | UPPERCASE | LOWERCASE | NUMBER)+ RPRNTHS) COMMA WHITESPACE
              |
              (LPRNTHS (LOWERCASE | UPPERCASE | NUMBER | SHARP) COMMA
              (UPPERCASE NUMBER | LOWERCASE NUMBER | UPPERCASE | LOWERCASE | NUMBER)+ RPRNTHS);
TERMINATE   : 'accept' | 'reject';
COMMAND     : ('SCAN' | 'PRINT' | 'SCAN RIGHT' | 'SCAN LEFT' | 'READ');
WHITESPACE  : (' ' | '\t');

STACK_NAME  : S NUMBER+;
QUEUE_NAME  : Q NUMBER+;
TAPE_NAME   : T NUMBER+;

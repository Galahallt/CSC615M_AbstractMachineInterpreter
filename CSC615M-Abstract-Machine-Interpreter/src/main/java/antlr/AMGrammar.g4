grammar AMGrammar;

/**
  *  Parser Rules
  */
start           : data_section? logic_section EOF;
data_section    : DATA (stack | queue | tape);
stack           : (STACK STACK_NAME)+;
queue           : (QUEUE QUEUE_NAME)+;
tape            : (TAPE TAPE_NAME)+;

logic_section   : LOGIC state_behavior+;
state_behavior  : state RBRACK command transition+;
transition      : LPAREN input (FRWRDSLASH output)? COMMA (next_state RPAREN COMMA | next_state RPAREN);

command         : COMMAND;
state           : STATE_NAME;
input           : INPUT;
output          : OUTPUT;
next_state      : NEXT_STATE;


/**
  *  Lexer Rules
  */

fragment S         : 'S';
fragment Q         : 'Q';
fragment T         : 'T';
fragment NUMBER    : [0-9];
fragment UPPERCASE : [A-Z];
fragment LOWERCASE : [a-z];
fragment SHARP     : '#';

DATA        : '.DATA';
LOGIC       : '.LOGIC';
STACK_NAME  : S NUMBER+;
QUEUE_NAME  : Q NUMBER+;
TAPE_NAME   : T NUMBER+;
STACK       : 'STACK';
QUEUE       : 'QUEUE';
TAPE        : 'TAPE';

COMMAND     : ('SCAN'
            | 'PRINT'
            |'SCAN RIGHT'
            | 'SCAN LEFT'
            | READ
            | WRITE
            | LEFT
            | RIGHT);

INPUT       : {_input.LA(-1) == '('}? (LOWERCASE | UPPERCASE | NUMBER | SHARP) ;

OUTPUT      : {_input.LA(-1) == '/'}? (LOWERCASE | UPPERCASE | NUMBER | SHARP) ;

NEXT_STATE  : {_input.LA(-1) == ','}? (UPPERCASE NUMBER
            | LOWERCASE NUMBER
            | UPPERCASE
            | LOWERCASE)+
            | 'accept'
            | 'reject';

STATE_NAME  : (UPPERCASE NUMBER
            | LOWERCASE NUMBER
            | UPPERCASE
            | LOWERCASE)+;

READ        : 'READ(' (STACK_NAME | QUEUE_NAME) ')';
WRITE       : 'WRITE(' (STACK_NAME | QUEUE_NAME) ')';
LEFT        : 'LEFT(' TAPE_NAME ')';
RIGHT       : 'RIGHT(' TAPE_NAME ')';
NEWLINE     : [\r\n]+ -> skip;
WHITESPACE  : (' ' | '\t')+ -> skip;
COMMA       : ',';
LPAREN      : '(';
RPAREN      : ')';
RBRACK      : ']';
FRWRDSLASH  : '/';
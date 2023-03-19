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
state_behavior  : state COMMAND transition+;
state           : STATE_NAME RBRACK;
transition      : LPAREN INPUT (FRWRDSLASH OUTPUT)? COMMA (STATE_NAME RPAREN COMMA | STATE_NAME RPAREN);

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

STATE_NAME  : {_input.LA(2) == ']' || _input.LA(2) == ')'}? (UPPERCASE NUMBER
            | LOWERCASE NUMBER
            | UPPERCASE
            | LOWERCASE)+
            | 'accept'
            | 'reject';


INPUT       : {_input.LA(-1) == '('}? (LOWERCASE | UPPERCASE | NUMBER | SHARP) ;

OUTPUT      : {_input.LA(-1) == '/'}? (LOWERCASE | UPPERCASE | NUMBER | SHARP) ;

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
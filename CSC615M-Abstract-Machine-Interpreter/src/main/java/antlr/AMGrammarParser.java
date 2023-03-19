// Generated from AMGrammar.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AMGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, LOGIC=2, STACK_NAME=3, QUEUE_NAME=4, TAPE_NAME=5, STACK=6, QUEUE=7, 
		TAPE=8, COMMAND=9, INPUT=10, OUTPUT=11, NEXT_STATE=12, STATE_NAME=13, 
		READ=14, WRITE=15, LEFT=16, RIGHT=17, NEWLINE=18, WHITESPACE=19, COMMA=20, 
		LPAREN=21, RPAREN=22, RBRACK=23, FRWRDSLASH=24;
	public static final int
		RULE_start = 0, RULE_data_section = 1, RULE_stack = 2, RULE_queue = 3, 
		RULE_tape = 4, RULE_logic_section = 5, RULE_state_behavior = 6, RULE_transition = 7, 
		RULE_command = 8, RULE_state = 9, RULE_input = 10, RULE_output = 11, RULE_next_state = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "data_section", "stack", "queue", "tape", "logic_section", "state_behavior", 
			"transition", "command", "state", "input", "output", "next_state"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.DATA'", "'.LOGIC'", null, null, null, "'STACK'", "'QUEUE'", 
			"'TAPE'", null, null, null, null, null, null, null, null, null, null, 
			null, "','", "'('", "')'", "']'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "LOGIC", "STACK_NAME", "QUEUE_NAME", "TAPE_NAME", "STACK", 
			"QUEUE", "TAPE", "COMMAND", "INPUT", "OUTPUT", "NEXT_STATE", "STATE_NAME", 
			"READ", "WRITE", "LEFT", "RIGHT", "NEWLINE", "WHITESPACE", "COMMA", "LPAREN", 
			"RPAREN", "RBRACK", "FRWRDSLASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AMGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AMGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Logic_sectionContext logic_section() {
			return getRuleContext(Logic_sectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AMGrammarParser.EOF, 0); }
		public Data_sectionContext data_section() {
			return getRuleContext(Data_sectionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(26);
				data_section();
				}
			}

			setState(29);
			logic_section();
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_sectionContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(AMGrammarParser.DATA, 0); }
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public QueueContext queue() {
			return getRuleContext(QueueContext.class,0);
		}
		public TapeContext tape() {
			return getRuleContext(TapeContext.class,0);
		}
		public Data_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterData_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitData_section(this);
		}
	}

	public final Data_sectionContext data_section() throws RecognitionException {
		Data_sectionContext _localctx = new Data_sectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DATA);
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				{
				setState(33);
				stack();
				}
				break;
			case QUEUE:
				{
				setState(34);
				queue();
				}
				break;
			case TAPE:
				{
				setState(35);
				tape();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StackContext extends ParserRuleContext {
		public List<TerminalNode> STACK() { return getTokens(AMGrammarParser.STACK); }
		public TerminalNode STACK(int i) {
			return getToken(AMGrammarParser.STACK, i);
		}
		public List<TerminalNode> STACK_NAME() { return getTokens(AMGrammarParser.STACK_NAME); }
		public TerminalNode STACK_NAME(int i) {
			return getToken(AMGrammarParser.STACK_NAME, i);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitStack(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(STACK);
				setState(39);
				match(STACK_NAME);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STACK );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueueContext extends ParserRuleContext {
		public List<TerminalNode> QUEUE() { return getTokens(AMGrammarParser.QUEUE); }
		public TerminalNode QUEUE(int i) {
			return getToken(AMGrammarParser.QUEUE, i);
		}
		public List<TerminalNode> QUEUE_NAME() { return getTokens(AMGrammarParser.QUEUE_NAME); }
		public TerminalNode QUEUE_NAME(int i) {
			return getToken(AMGrammarParser.QUEUE_NAME, i);
		}
		public QueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterQueue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitQueue(this);
		}
	}

	public final QueueContext queue() throws RecognitionException {
		QueueContext _localctx = new QueueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(QUEUE);
				setState(45);
				match(QUEUE_NAME);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUEUE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TapeContext extends ParserRuleContext {
		public List<TerminalNode> TAPE() { return getTokens(AMGrammarParser.TAPE); }
		public TerminalNode TAPE(int i) {
			return getToken(AMGrammarParser.TAPE, i);
		}
		public List<TerminalNode> TAPE_NAME() { return getTokens(AMGrammarParser.TAPE_NAME); }
		public TerminalNode TAPE_NAME(int i) {
			return getToken(AMGrammarParser.TAPE_NAME, i);
		}
		public TapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterTape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitTape(this);
		}
	}

	public final TapeContext tape() throws RecognitionException {
		TapeContext _localctx = new TapeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(TAPE);
				setState(51);
				match(TAPE_NAME);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAPE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_sectionContext extends ParserRuleContext {
		public TerminalNode LOGIC() { return getToken(AMGrammarParser.LOGIC, 0); }
		public List<State_behaviorContext> state_behavior() {
			return getRuleContexts(State_behaviorContext.class);
		}
		public State_behaviorContext state_behavior(int i) {
			return getRuleContext(State_behaviorContext.class,i);
		}
		public Logic_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterLogic_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitLogic_section(this);
		}
	}

	public final Logic_sectionContext logic_section() throws RecognitionException {
		Logic_sectionContext _localctx = new Logic_sectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logic_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LOGIC);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				state_behavior();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STATE_NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class State_behaviorContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AMGrammarParser.RBRACK, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public State_behaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_behavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterState_behavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitState_behavior(this);
		}
	}

	public final State_behaviorContext state_behavior() throws RecognitionException {
		State_behaviorContext _localctx = new State_behaviorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_behavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			state();
			setState(63);
			match(RBRACK);
			setState(64);
			command();
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				transition();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AMGrammarParser.LPAREN, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMGrammarParser.COMMA, i);
		}
		public Next_stateContext next_state() {
			return getRuleContext(Next_stateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMGrammarParser.RPAREN, 0); }
		public TerminalNode FRWRDSLASH() { return getToken(AMGrammarParser.FRWRDSLASH, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LPAREN);
			setState(71);
			input();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FRWRDSLASH) {
				{
				setState(72);
				match(FRWRDSLASH);
				setState(73);
				output();
				}
			}

			setState(76);
			match(COMMA);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(77);
				next_state();
				setState(78);
				match(RPAREN);
				setState(79);
				match(COMMA);
				}
				break;
			case 2:
				{
				setState(81);
				next_state();
				setState(82);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(AMGrammarParser.COMMAND, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE_NAME() { return getToken(AMGrammarParser.STATE_NAME, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(STATE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(AMGrammarParser.INPUT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(INPUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(AMGrammarParser.OUTPUT, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OUTPUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_stateContext extends ParserRuleContext {
		public TerminalNode NEXT_STATE() { return getToken(AMGrammarParser.NEXT_STATE, 0); }
		public Next_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).enterNext_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMGrammarListener ) ((AMGrammarListener)listener).exitNext_state(this);
		}
	}

	public final Next_stateContext next_state() throws RecognitionException {
		Next_stateContext _localctx = new Next_stateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_next_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NEXT_STATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002)\b\u0002\u000b\u0002\f\u0002"+
		"*\u0001\u0003\u0001\u0003\u0004\u0003/\b\u0003\u000b\u0003\f\u00030\u0001"+
		"\u0004\u0001\u0004\u0004\u00045\b\u0004\u000b\u0004\f\u00046\u0001\u0005"+
		"\u0001\u0005\u0004\u0005;\b\u0005\u000b\u0005\f\u0005<\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006C\b\u0006\u000b\u0006\f\u0006"+
		"D\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007K\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0000]\u0000\u001b\u0001\u0000\u0000\u0000\u0002 \u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000"+
		"\u0000\b4\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f>\u0001"+
		"\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000"+
		"\u0000\u0012X\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016"+
		"\\\u0001\u0000\u0000\u0000\u0018^\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0003\n\u0005\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 $\u0005\u0001\u0000\u0000!%\u0003\u0004\u0002\u0000"+
		"\"%\u0003\u0006\u0003\u0000#%\u0003\b\u0004\u0000$!\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0006\u0000\u0000\')\u0005\u0003\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005"+
		"\u0007\u0000\u0000-/\u0005\u0004\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001\u0007\u0001\u0000\u0000\u000023\u0005\b\u0000\u000035\u0005\u0005"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u0000"+
		"8:\u0005\u0002\u0000\u00009;\u0003\f\u0006\u0000:9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0003\u0012\t\u0000?@\u0005\u0017"+
		"\u0000\u0000@B\u0003\u0010\b\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\r\u0001\u0000\u0000\u0000FG\u0005\u0015\u0000\u0000"+
		"GJ\u0003\u0014\n\u0000HI\u0005\u0018\u0000\u0000IK\u0003\u0016\u000b\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LT\u0005\u0014\u0000\u0000MN\u0003\u0018\f\u0000NO\u0005\u0016\u0000"+
		"\u0000OP\u0005\u0014\u0000\u0000PU\u0001\u0000\u0000\u0000QR\u0003\u0018"+
		"\f\u0000RS\u0005\u0016\u0000\u0000SU\u0001\u0000\u0000\u0000TM\u0001\u0000"+
		"\u0000\u0000TQ\u0001\u0000\u0000\u0000U\u000f\u0001\u0000\u0000\u0000"+
		"VW\u0005\t\u0000\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005\r\u0000"+
		"\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005\n\u0000\u0000[\u0015\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u000b\u0000\u0000]\u0017\u0001\u0000\u0000"+
		"\u0000^_\u0005\f\u0000\u0000_\u0019\u0001\u0000\u0000\u0000\t\u001b$*"+
		"06<DJT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		TAPE=8, COMMAND=9, STATE_NAME=10, INPUT=11, OUTPUT=12, READ=13, WRITE=14, 
		LEFT=15, RIGHT=16, NEWLINE=17, WHITESPACE=18, COMMA=19, LPAREN=20, RPAREN=21, 
		RBRACK=22, FRWRDSLASH=23;
	public static final int
		RULE_start = 0, RULE_data_section = 1, RULE_stack = 2, RULE_queue = 3, 
		RULE_tape = 4, RULE_logic_section = 5, RULE_state_behavior = 6, RULE_state = 7, 
		RULE_transition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "data_section", "stack", "queue", "tape", "logic_section", "state_behavior", 
			"state", "transition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.DATA'", "'.LOGIC'", null, null, null, "'STACK'", "'QUEUE'", 
			"'TAPE'", null, null, null, null, null, null, null, null, null, null, 
			"','", "'('", "')'", "']'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "LOGIC", "STACK_NAME", "QUEUE_NAME", "TAPE_NAME", "STACK", 
			"QUEUE", "TAPE", "COMMAND", "STATE_NAME", "INPUT", "OUTPUT", "READ", 
			"WRITE", "LEFT", "RIGHT", "NEWLINE", "WHITESPACE", "COMMA", "LPAREN", 
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(18);
				data_section();
				}
			}

			setState(21);
			logic_section();
			setState(22);
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
			setState(24);
			match(DATA);
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				{
				setState(25);
				stack();
				}
				break;
			case QUEUE:
				{
				setState(26);
				queue();
				}
				break;
			case TAPE:
				{
				setState(27);
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(STACK);
				setState(31);
				match(STACK_NAME);
				}
				}
				setState(34); 
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
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				match(QUEUE);
				setState(37);
				match(QUEUE_NAME);
				}
				}
				setState(40); 
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
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(TAPE);
				setState(43);
				match(TAPE_NAME);
				}
				}
				setState(46); 
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
			setState(48);
			match(LOGIC);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				state_behavior();
				}
				}
				setState(52); 
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
		public TerminalNode COMMAND() { return getToken(AMGrammarParser.COMMAND, 0); }
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
			setState(54);
			state();
			setState(55);
			match(COMMAND);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				transition();
				}
				}
				setState(59); 
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE_NAME() { return getToken(AMGrammarParser.STATE_NAME, 0); }
		public TerminalNode RBRACK() { return getToken(AMGrammarParser.RBRACK, 0); }
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
		enterRule(_localctx, 14, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(STATE_NAME);
			setState(62);
			match(RBRACK);
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
		public TerminalNode INPUT() { return getToken(AMGrammarParser.INPUT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AMGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMGrammarParser.COMMA, i);
		}
		public TerminalNode STATE_NAME() { return getToken(AMGrammarParser.STATE_NAME, 0); }
		public TerminalNode RPAREN() { return getToken(AMGrammarParser.RPAREN, 0); }
		public TerminalNode FRWRDSLASH() { return getToken(AMGrammarParser.FRWRDSLASH, 0); }
		public TerminalNode OUTPUT() { return getToken(AMGrammarParser.OUTPUT, 0); }
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
		enterRule(_localctx, 16, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LPAREN);
			setState(65);
			match(INPUT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FRWRDSLASH) {
				{
				setState(66);
				match(FRWRDSLASH);
				setState(67);
				match(OUTPUT);
				}
			}

			setState(70);
			match(COMMA);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(71);
				match(STATE_NAME);
				setState(72);
				match(RPAREN);
				setState(73);
				match(COMMA);
				}
				break;
			case 2:
				{
				setState(74);
				match(STATE_NAME);
				setState(75);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017O\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002!\b\u0002\u000b\u0002"+
		"\f\u0002\"\u0001\u0003\u0001\u0003\u0004\u0003\'\b\u0003\u000b\u0003\f"+
		"\u0003(\u0001\u0004\u0001\u0004\u0004\u0004-\b\u0004\u000b\u0004\f\u0004"+
		".\u0001\u0005\u0001\u0005\u0004\u00053\b\u0005\u000b\u0005\f\u00054\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006:\b\u0006\u000b\u0006\f\u0006"+
		";\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\bE\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"M\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0000O\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000"+
		"\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000"+
		"\b,\u0001\u0000\u0000\u0000\n0\u0001\u0000\u0000\u0000\f6\u0001\u0000"+
		"\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010@\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0003\n\u0005\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017"+
		"\u0001\u0001\u0000\u0000\u0000\u0018\u001c\u0005\u0001\u0000\u0000\u0019"+
		"\u001d\u0003\u0004\u0002\u0000\u001a\u001d\u0003\u0006\u0003\u0000\u001b"+
		"\u001d\u0003\b\u0004\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0006\u0000\u0000\u001f!\u0005"+
		"\u0003\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0005\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0007\u0000\u0000%\'\u0005\u0004\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005"+
		"\b\u0000\u0000+-\u0005\u0005\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/\t\u0001\u0000\u0000\u000002\u0005\u0002\u0000\u000013\u0003\f\u0006"+
		"\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"67\u0003\u000e\u0007\u000079\u0005\t\u0000\u00008:\u0003\u0010\b\u0000"+
		"98\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\n"+
		"\u0000\u0000>?\u0005\u0016\u0000\u0000?\u000f\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0014\u0000\u0000AD\u0005\u000b\u0000\u0000BC\u0005\u0017\u0000"+
		"\u0000CE\u0005\f\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FL\u0005\u0013\u0000\u0000GH\u0005\n\u0000"+
		"\u0000HI\u0005\u0015\u0000\u0000IM\u0005\u0013\u0000\u0000JK\u0005\n\u0000"+
		"\u0000KM\u0005\u0015\u0000\u0000LG\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000M\u0011\u0001\u0000\u0000\u0000\t\u0013\u001c\"(.4;DL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
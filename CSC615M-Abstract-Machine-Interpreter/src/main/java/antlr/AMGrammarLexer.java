// Generated from AMGrammar.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AMGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, LOGIC=2, STACK_NAME=3, QUEUE_NAME=4, TAPE_NAME=5, STACK=6, QUEUE=7, 
		TAPE=8, COMMAND=9, INPUT=10, OUTPUT=11, NEXT_STATE=12, STATE_NAME=13, 
		READ=14, WRITE=15, LEFT=16, RIGHT=17, NEWLINE=18, WHITESPACE=19, COMMA=20, 
		LPAREN=21, RPAREN=22, RBRACK=23, FRWRDSLASH=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "Q", "T", "NUMBER", "UPPERCASE", "LOWERCASE", "SHARP", "DATA", "LOGIC", 
			"STACK_NAME", "QUEUE_NAME", "TAPE_NAME", "STACK", "QUEUE", "TAPE", "COMMAND", 
			"INPUT", "OUTPUT", "NEXT_STATE", "STATE_NAME", "READ", "WRITE", "LEFT", 
			"RIGHT", "NEWLINE", "WHITESPACE", "COMMA", "LPAREN", "RPAREN", "RBRACK", 
			"FRWRDSLASH"
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


	public AMGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AMGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return INPUT_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return OUTPUT_sempred((RuleContext)_localctx, predIndex);
		case 18:
			return NEXT_STATE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean INPUT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(-1) == '(';
		}
		return true;
	}
	private boolean OUTPUT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LA(-1) == '/';
		}
		return true;
	}
	private boolean NEXT_STATE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LA(-1) == ',';
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u010e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t]\b\t\u000b"+
		"\t\f\t^\u0001\n\u0001\n\u0004\nc\b\n\u000b\n\f\nd\u0001\u000b\u0001\u000b"+
		"\u0004\u000bi\b\u000b\u000b\u000b\f\u000bj\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u009e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00a5\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ac\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00b1\b\u0012\n\u0012\f\u0012\u00b4\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00c2\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00c6\b"+
		"\u0013\n\u0013\f\u0013\u00c9\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d3\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00e0\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0004\u0018\u00f8\b\u0018\u000b\u0018\f\u0018\u00f9\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0004\u0019\u00ff\b\u0019\u000b\u0019\f\u0019\u0100"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0000\u0000\u001f\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000"+
		"\u000b\u0000\r\u0000\u000f\u0001\u0011\u0002\u0013\u0003\u0015\u0004\u0017"+
		"\u0005\u0019\u0006\u001b\u0007\u001d\b\u001f\t!\n#\u000b%\f\'\r)\u000e"+
		"+\u000f-\u0010/\u00111\u00123\u00135\u00147\u00159\u0016;\u0017=\u0018"+
		"\u0001\u0000\u0007\u0001\u000009\u0001\u0000AZ\u0001\u0000az\u0002\u0000"+
		"AZaz\u0003\u000009AZaz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u011e\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?"+
		"\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005C\u0001\u0000"+
		"\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000"+
		"\u000bI\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001"+
		"\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000"+
		"\u0000\u0015`\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019"+
		"l\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001dx\u0001"+
		"\u0000\u0000\u0000\u001f\u009d\u0001\u0000\u0000\u0000!\u009f\u0001\u0000"+
		"\u0000\u0000#\u00a6\u0001\u0000\u0000\u0000%\u00ad\u0001\u0000\u0000\u0000"+
		"\'\u00c3\u0001\u0000\u0000\u0000)\u00ca\u0001\u0000\u0000\u0000+\u00d6"+
		"\u0001\u0000\u0000\u0000-\u00e3\u0001\u0000\u0000\u0000/\u00ec\u0001\u0000"+
		"\u0000\u00001\u00f7\u0001\u0000\u0000\u00003\u00fe\u0001\u0000\u0000\u0000"+
		"5\u0104\u0001\u0000\u0000\u00007\u0106\u0001\u0000\u0000\u00009\u0108"+
		"\u0001\u0000\u0000\u0000;\u010a\u0001\u0000\u0000\u0000=\u010c\u0001\u0000"+
		"\u0000\u0000?@\u0005S\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005"+
		"Q\u0000\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005T\u0000\u0000D\u0006"+
		"\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\b\u0001\u0000\u0000"+
		"\u0000GH\u0007\u0001\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0007\u0002"+
		"\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005#\u0000\u0000L\u000e\u0001"+
		"\u0000\u0000\u0000MN\u0005.\u0000\u0000NO\u0005D\u0000\u0000OP\u0005A"+
		"\u0000\u0000PQ\u0005T\u0000\u0000QR\u0005A\u0000\u0000R\u0010\u0001\u0000"+
		"\u0000\u0000ST\u0005.\u0000\u0000TU\u0005L\u0000\u0000UV\u0005O\u0000"+
		"\u0000VW\u0005G\u0000\u0000WX\u0005I\u0000\u0000XY\u0005C\u0000\u0000"+
		"Y\u0012\u0001\u0000\u0000\u0000Z\\\u0003\u0001\u0000\u0000[]\u0003\u0007"+
		"\u0003\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0014\u0001\u0000\u0000"+
		"\u0000`b\u0003\u0003\u0001\u0000ac\u0003\u0007\u0003\u0000ba\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fh\u0003\u0005\u0002"+
		"\u0000gi\u0003\u0007\u0003\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0018"+
		"\u0001\u0000\u0000\u0000lm\u0005S\u0000\u0000mn\u0005T\u0000\u0000no\u0005"+
		"A\u0000\u0000op\u0005C\u0000\u0000pq\u0005K\u0000\u0000q\u001a\u0001\u0000"+
		"\u0000\u0000rs\u0005Q\u0000\u0000st\u0005U\u0000\u0000tu\u0005E\u0000"+
		"\u0000uv\u0005U\u0000\u0000vw\u0005E\u0000\u0000w\u001c\u0001\u0000\u0000"+
		"\u0000xy\u0005T\u0000\u0000yz\u0005A\u0000\u0000z{\u0005P\u0000\u0000"+
		"{|\u0005E\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005S\u0000\u0000"+
		"~\u007f\u0005C\u0000\u0000\u007f\u0080\u0005A\u0000\u0000\u0080\u009e"+
		"\u0005N\u0000\u0000\u0081\u0082\u0005P\u0000\u0000\u0082\u0083\u0005R"+
		"\u0000\u0000\u0083\u0084\u0005I\u0000\u0000\u0084\u0085\u0005N\u0000\u0000"+
		"\u0085\u009e\u0005T\u0000\u0000\u0086\u0087\u0005S\u0000\u0000\u0087\u0088"+
		"\u0005C\u0000\u0000\u0088\u0089\u0005A\u0000\u0000\u0089\u008a\u0005N"+
		"\u0000\u0000\u008a\u008b\u0005 \u0000\u0000\u008b\u008c\u0005R\u0000\u0000"+
		"\u008c\u008d\u0005I\u0000\u0000\u008d\u008e\u0005G\u0000\u0000\u008e\u008f"+
		"\u0005H\u0000\u0000\u008f\u009e\u0005T\u0000\u0000\u0090\u0091\u0005S"+
		"\u0000\u0000\u0091\u0092\u0005C\u0000\u0000\u0092\u0093\u0005A\u0000\u0000"+
		"\u0093\u0094\u0005N\u0000\u0000\u0094\u0095\u0005 \u0000\u0000\u0095\u0096"+
		"\u0005L\u0000\u0000\u0096\u0097\u0005E\u0000\u0000\u0097\u0098\u0005F"+
		"\u0000\u0000\u0098\u009e\u0005T\u0000\u0000\u0099\u009e\u0003)\u0014\u0000"+
		"\u009a\u009e\u0003+\u0015\u0000\u009b\u009e\u0003-\u0016\u0000\u009c\u009e"+
		"\u0003/\u0017\u0000\u009d}\u0001\u0000\u0000\u0000\u009d\u0081\u0001\u0000"+
		"\u0000\u0000\u009d\u0086\u0001\u0000\u0000\u0000\u009d\u0090\u0001\u0000"+
		"\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e \u0001\u0000\u0000\u0000\u009f\u00a4\u0004\u0010\u0000"+
		"\u0000\u00a0\u00a5\u0003\u000b\u0005\u0000\u00a1\u00a5\u0003\t\u0004\u0000"+
		"\u00a2\u00a5\u0003\u0007\u0003\u0000\u00a3\u00a5\u0003\r\u0006\u0000\u00a4"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\"\u0001\u0000\u0000\u0000\u00a6\u00ab\u0004\u0011\u0001\u0000\u00a7\u00ac"+
		"\u0003\u000b\u0005\u0000\u00a8\u00ac\u0003\t\u0004\u0000\u00a9\u00ac\u0003"+
		"\u0007\u0003\u0000\u00aa\u00ac\u0003\r\u0006\u0000\u00ab\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac$\u0001\u0000\u0000"+
		"\u0000\u00ad\u00c1\u0004\u0012\u0002\u0000\u00ae\u00b2\u0007\u0003\u0000"+
		"\u0000\u00af\u00b1\u0007\u0004\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005a\u0000\u0000"+
		"\u00b6\u00b7\u0005c\u0000\u0000\u00b7\u00b8\u0005c\u0000\u0000\u00b8\u00b9"+
		"\u0005e\u0000\u0000\u00b9\u00ba\u0005p\u0000\u0000\u00ba\u00c2\u0005t"+
		"\u0000\u0000\u00bb\u00bc\u0005r\u0000\u0000\u00bc\u00bd\u0005e\u0000\u0000"+
		"\u00bd\u00be\u0005j\u0000\u0000\u00be\u00bf\u0005e\u0000\u0000\u00bf\u00c0"+
		"\u0005c\u0000\u0000\u00c0\u00c2\u0005t\u0000\u0000\u00c1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c2&\u0001\u0000\u0000\u0000\u00c3\u00c7\u0007\u0003\u0000"+
		"\u0000\u00c4\u00c6\u0007\u0004\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8(\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005R\u0000\u0000\u00cb"+
		"\u00cc\u0005E\u0000\u0000\u00cc\u00cd\u0005A\u0000\u0000\u00cd\u00ce\u0005"+
		"D\u0000\u0000\u00ce\u00cf\u0005(\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0003\u0013\t\u0000\u00d1\u00d3\u0003\u0015\n\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005)\u0000\u0000\u00d5"+
		"*\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005W\u0000\u0000\u00d7\u00d8\u0005"+
		"R\u0000\u0000\u00d8\u00d9\u0005I\u0000\u0000\u00d9\u00da\u0005T\u0000"+
		"\u0000\u00da\u00db\u0005E\u0000\u0000\u00db\u00dc\u0005(\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003\u0013\t\u0000\u00de\u00e0"+
		"\u0003\u0015\n\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		")\u0000\u0000\u00e2,\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005L\u0000"+
		"\u0000\u00e4\u00e5\u0005E\u0000\u0000\u00e5\u00e6\u0005F\u0000\u0000\u00e6"+
		"\u00e7\u0005T\u0000\u0000\u00e7\u00e8\u0005(\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0003\u0017\u000b\u0000\u00ea\u00eb\u0005"+
		")\u0000\u0000\u00eb.\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005R\u0000"+
		"\u0000\u00ed\u00ee\u0005I\u0000\u0000\u00ee\u00ef\u0005G\u0000\u0000\u00ef"+
		"\u00f0\u0005H\u0000\u0000\u00f0\u00f1\u0005T\u0000\u0000\u00f1\u00f2\u0005"+
		"(\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u0017"+
		"\u000b\u0000\u00f4\u00f5\u0005)\u0000\u0000\u00f50\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0007\u0005\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0006\u0018\u0000\u0000\u00fc2\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0007\u0006\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0006\u0019\u0000\u0000\u01034\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005,\u0000\u0000\u01056\u0001\u0000\u0000\u0000\u0106\u0107\u0005("+
		"\u0000\u0000\u01078\u0001\u0000\u0000\u0000\u0108\u0109\u0005)\u0000\u0000"+
		"\u0109:\u0001\u0000\u0000\u0000\u010a\u010b\u0005]\u0000\u0000\u010b<"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005/\u0000\u0000\u010d>\u0001\u0000"+
		"\u0000\u0000\u000e\u0000^dj\u009d\u00a4\u00ab\u00b2\u00c1\u00c7\u00d2"+
		"\u00df\u00f9\u0100\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
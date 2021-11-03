// Generated from /home/ghazal/IdeaProjects/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRUCT=1, MAIN=2, INT=3, BOOL=4, LIST=5, FPTR=6, VOID=7, WHILE=8, DO=9, 
		IF=10, ELSE=11, RETURN=12, GET=13, SET=14, BEGIN=15, END=16, DISPLAY=17, 
		APPEND=18, SIZE=19, TRUE=20, FALSE=21, GREATER_THAN=22, LESS_THAN=23, 
		EQUAL=24, MULT=25, DIVIDE=26, PLUS=27, MINUS=28, AND=29, OR=30, NOT=31, 
		ASSIGN=32, LPAR=33, RPAR=34, LBRACK=35, RBRACK=36, COMMA=37, SEMICOLLON=38, 
		INT_VALUE=39, IDENTIFIER=40, NL=41, COMMENT=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRUCT", "MAIN", "INT", "BOOL", "LIST", "FPTR", "VOID", "WHILE", "DO", 
			"IF", "ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", "APPEND", 
			"SIZE", "TRUE", "FALSE", "GREATER_THAN", "LESS_THAN", "EQUAL", "MULT", 
			"DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "COMMA", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", 
			"NL", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'main'", "'int'", "'bool'", "'list'", "'fptr'", "'void'", 
			"'while'", "'do'", "'if'", "'else'", "'return'", "'get'", "'set'", "'begin'", 
			"'end'", "'display'", "'append'", "'size'", "'true'", "'false'", "'>'", 
			"'<'", "'=='", "'*'", "'/'", "'+'", "'-'", "'&'", "'|'", "'~'", "'='", 
			"'('", "')'", "'['", "']'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRUCT", "MAIN", "INT", "BOOL", "LIST", "FPTR", "VOID", "WHILE", 
			"DO", "IF", "ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", 
			"APPEND", "SIZE", "TRUE", "FALSE", "GREATER_THAN", "LESS_THAN", "EQUAL", 
			"MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "COMMA", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", 
			"NL", "COMMENT", "WS"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3(\7(\u00ed\n(\f(\16(\u00f0\13(\5(\u00f2\n(\3)\3)\7"+
		")\u00f6\n)\f)\16)\u00f9\13)\3*\5*\u00fc\n*\3*\3*\3+\3+\3+\3+\7+\u0104"+
		"\n+\f+\16+\u0107\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3\u0105\2-\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-\3\2\7\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"\13\13\"\"\2\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5`\3\2\2\2\7e\3\2\2\2"+
		"\ti\3\2\2\2\13n\3\2\2\2\rs\3\2\2\2\17x\3\2\2\2\21}\3\2\2\2\23\u0083\3"+
		"\2\2\2\25\u0086\3\2\2\2\27\u0089\3\2\2\2\31\u008e\3\2\2\2\33\u0095\3\2"+
		"\2\2\35\u0099\3\2\2\2\37\u009d\3\2\2\2!\u00a3\3\2\2\2#\u00a7\3\2\2\2%"+
		"\u00af\3\2\2\2\'\u00b6\3\2\2\2)\u00bb\3\2\2\2+\u00c0\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2"+
		"\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d7\3\2\2\2?\u00d9"+
		"\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G\u00e1\3\2\2\2I"+
		"\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00f1\3\2\2\2Q\u00f3\3\2"+
		"\2\2S\u00fb\3\2\2\2U\u00ff\3\2\2\2W\u010d\3\2\2\2YZ\7u\2\2Z[\7v\2\2[\\"+
		"\7t\2\2\\]\7w\2\2]^\7e\2\2^_\7v\2\2_\4\3\2\2\2`a\7o\2\2ab\7c\2\2bc\7k"+
		"\2\2cd\7p\2\2d\6\3\2\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\b\3\2\2\2ij\7d\2"+
		"\2jk\7q\2\2kl\7q\2\2lm\7n\2\2m\n\3\2\2\2no\7n\2\2op\7k\2\2pq\7u\2\2qr"+
		"\7v\2\2r\f\3\2\2\2st\7h\2\2tu\7r\2\2uv\7v\2\2vw\7t\2\2w\16\3\2\2\2xy\7"+
		"x\2\2yz\7q\2\2z{\7k\2\2{|\7f\2\2|\20\3\2\2\2}~\7y\2\2~\177\7j\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\22\3\2\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7q\2\2\u0085\24\3\2\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7h\2\2\u0088\26\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\30\3\2\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7v\2\2\u0091\u0092\7w\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7p\2\2\u0094\32\3\2\2\2\u0095\u0096\7i\2\2\u0096\u0097\7"+
		"g\2\2\u0097\u0098\7v\2\2\u0098\34\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7v\2\2\u009c\36\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		" \3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\"\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7{\2\2"+
		"\u00ae$\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7r\2"+
		"\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5&\3\2"+
		"\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7|\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7w\2\2\u00be\u00bf\7g\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		",\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\60"+
		"\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7?\2\2\u00cc\62\3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\66\3\2\2\2\u00d1"+
		"\u00d2\7-\2\2\u00d28\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4:\3\2\2\2\u00d5\u00d6"+
		"\7(\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8>\3\2\2\2\u00d9\u00da\7"+
		"\u0080\2\2\u00da@\3\2\2\2\u00db\u00dc\7?\2\2\u00dcB\3\2\2\2\u00dd\u00de"+
		"\7*\2\2\u00deD\3\2\2\2\u00df\u00e0\7+\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7"+
		"]\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7."+
		"\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8N\3\2\2\2\u00e9\u00f2\7\62"+
		"\2\2\u00ea\u00ee\t\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2"+
		"P\3\2\2\2\u00f3\u00f7\t\4\2\2\u00f4\u00f6\t\5\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8R\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\7\17\2\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\f\2\2\u00feT\3\2\2\2"+
		"\u00ff\u0100\7\61\2\2\u0100\u0101\7,\2\2\u0101\u0105\3\2\2\2\u0102\u0104"+
		"\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109"+
		"\7,\2\2\u0109\u010a\7\61\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b+\2\2\u010c"+
		"V\3\2\2\2\u010d\u010e\t\6\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b,\2\2\u0110"+
		"X\3\2\2\2\b\2\u00ee\u00f1\u00f7\u00fb\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
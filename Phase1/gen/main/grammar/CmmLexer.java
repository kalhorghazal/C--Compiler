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
		APPEND=18, SIZE=19, TRUE=20, FALSE=21, ARROW=22, GREATER_THAN=23, LESS_THAN=24, 
		EQUAL=25, MULT=26, DIVIDE=27, PLUS=28, MINUS=29, AND=30, OR=31, NOT=32, 
		ASSIGN=33, LPAR=34, RPAR=35, LBRACK=36, RBRACK=37, DOT=38, HASH=39, COMMA=40, 
		SEMICOLLON=41, INT_VALUE=42, IDENTIFIER=43, NL=44, COMMENT=45, WS=46;
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
			"SIZE", "TRUE", "FALSE", "ARROW", "GREATER_THAN", "LESS_THAN", "EQUAL", 
			"MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "DOT", "HASH", "COMMA", "SEMICOLLON", "INT_VALUE", 
			"IDENTIFIER", "NL", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'main'", "'int'", "'bool'", "'list'", "'fptr'", "'void'", 
			"'while'", "'do'", "'if'", "'else'", "'return'", "'get'", "'set'", "'begin'", 
			"'end'", "'display'", "'append'", "'size'", "'true'", "'false'", "'->'", 
			"'>'", "'<'", "'=='", "'*'", "'/'", "'+'", "'-'", "'&'", "'|'", "'~'", 
			"'='", "'('", "')'", "'['", "']'", "'.'", "'#'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRUCT", "MAIN", "INT", "BOOL", "LIST", "FPTR", "VOID", "WHILE", 
			"DO", "IF", "ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", 
			"APPEND", "SIZE", "TRUE", "FALSE", "ARROW", "GREATER_THAN", "LESS_THAN", 
			"EQUAL", "MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "DOT", "HASH", "COMMA", "SEMICOLLON", 
			"INT_VALUE", "IDENTIFIER", "NL", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\7+\u00fa"+
		"\n+\f+\16+\u00fd\13+\5+\u00ff\n+\3,\3,\7,\u0103\n,\f,\16,\u0106\13,\3"+
		"-\5-\u0109\n-\3-\3-\3.\3.\3.\3.\7.\u0111\n.\f.\16.\u0114\13.\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3\u0112\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"\3\2\7\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0122"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5f\3"+
		"\2\2\2\7k\3\2\2\2\to\3\2\2\2\13t\3\2\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0083"+
		"\3\2\2\2\23\u0089\3\2\2\2\25\u008c\3\2\2\2\27\u008f\3\2\2\2\31\u0094\3"+
		"\2\2\2\33\u009b\3\2\2\2\35\u009f\3\2\2\2\37\u00a3\3\2\2\2!\u00a9\3\2\2"+
		"\2#\u00ad\3\2\2\2%\u00b5\3\2\2\2\'\u00bc\3\2\2\2)\u00c1\3\2\2\2+\u00c6"+
		"\3\2\2\2-\u00cc\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2"+
		"\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G"+
		"\u00e8\3\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2"+
		"\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00fe\3\2\2\2W\u0100\3\2\2\2Y\u0108"+
		"\3\2\2\2[\u010c\3\2\2\2]\u011a\3\2\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2bc\7"+
		"w\2\2cd\7e\2\2de\7v\2\2e\4\3\2\2\2fg\7o\2\2gh\7c\2\2hi\7k\2\2ij\7p\2\2"+
		"j\6\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n\b\3\2\2\2op\7d\2\2pq\7q\2\2qr"+
		"\7q\2\2rs\7n\2\2s\n\3\2\2\2tu\7n\2\2uv\7k\2\2vw\7u\2\2wx\7v\2\2x\f\3\2"+
		"\2\2yz\7h\2\2z{\7r\2\2{|\7v\2\2|}\7t\2\2}\16\3\2\2\2~\177\7x\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\20\3\2\2\2\u0083\u0084"+
		"\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087"+
		"\u0088\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7f\2\2\u008a\u008b\7q\2\2\u008b"+
		"\24\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e\26\3\2\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2"+
		"\u0093\30\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7"+
		"v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a\32"+
		"\3\2\2\2\u009b\u009c\7i\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\36\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7i\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\u00b3\7c\2\2\u00b3\u00b4\7{\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7c\2"+
		"\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7f\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7|\2\2\u00bf\u00c0\7g\2\2\u00c0(\3\2\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"*\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\u00ce\7@\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\60\3\2\2\2\u00d1"+
		"\u00d2\7>\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		"\64\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9"+
		"8\3\2\2\2\u00da\u00db\7-\2\2\u00db:\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd<"+
		"\3\2\2\2\u00de\u00df\7(\2\2\u00df>\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1@\3"+
		"\2\2\2\u00e2\u00e3\7\u0080\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"D\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9H"+
		"\3\2\2\2\u00ea\u00eb\7]\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7_\2\2\u00edL\3"+
		"\2\2\2\u00ee\u00ef\7\60\2\2\u00efN\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1P\3"+
		"\2\2\2\u00f2\u00f3\7.\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5T\3\2"+
		"\2\2\u00f6\u00ff\7\62\2\2\u00f7\u00fb\t\2\2\2\u00f8\u00fa\t\3\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe"+
		"\u00f7\3\2\2\2\u00ffV\3\2\2\2\u0100\u0104\t\4\2\2\u0101\u0103\t\5\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105X\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\17\2\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\f"+
		"\2\2\u010bZ\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7,\2\2\u010e\u0112"+
		"\3\2\2\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7\61\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\b.\2\2\u0119\\\3\2\2\2\u011a\u011b\t\6\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\b/\2\2\u011d^\3\2\2\2\b\2\u00fb\u00fe\u0104\u0108\u0112\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from D:/University/TA_Lessons/Compiler-1400-Fall/PLC-Fall2021-C--/src/main/grammar\Cmm.g4 by ANTLR 4.9.2
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u011b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\7,\u00fc"+
		"\n,\f,\16,\u00ff\13,\5,\u0101\n,\3-\3-\7-\u0105\n-\f-\16-\u0108\13-\3"+
		".\3.\3.\3.\7.\u010e\n.\f.\16.\u0111\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\u010f"+
		"\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\7\3\2\63;\3\2\62;\5\2C"+
		"\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\2\u011e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7k\3\2\2\2\tp\3"+
		"\2\2\2\13u\3\2\2\2\r}\3\2\2\2\17\u0084\3\2\2\2\21\u0087\3\2\2\2\23\u008c"+
		"\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3"+
		"\2\2\2\35\u0097\3\2\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2"+
		"%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a4\3\2\2\2+\u00a9\3\2\2\2-\u00af\3"+
		"\2\2\2/\u00b5\3\2\2\2\61\u00b9\3\2\2\2\63\u00bd\3\2\2\2\65\u00c2\3\2\2"+
		"\2\67\u00c7\3\2\2\29\u00ce\3\2\2\2;\u00d3\3\2\2\2=\u00d7\3\2\2\2?\u00db"+
		"\3\2\2\2A\u00e1\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e8\3\2\2\2I"+
		"\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2\2\2Q\u00f2\3\2"+
		"\2\2S\u00f4\3\2\2\2U\u00f6\3\2\2\2W\u0100\3\2\2\2Y\u0102\3\2\2\2[\u0109"+
		"\3\2\2\2]\u0117\3\2\2\2_`\7o\2\2`a\7c\2\2ab\7k\2\2bc\7p\2\2c\4\3\2\2\2"+
		"de\7t\2\2ef\7g\2\2fg\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2j\6\3\2\2\2kl\7"+
		"x\2\2lm\7q\2\2mn\7k\2\2no\7f\2\2o\b\3\2\2\2pq\7u\2\2qr\7k\2\2rs\7|\2\2"+
		"st\7g\2\2t\n\3\2\2\2uv\7f\2\2vw\7k\2\2wx\7u\2\2xy\7r\2\2yz\7n\2\2z{\7"+
		"c\2\2{|\7{\2\2|\f\3\2\2\2}~\7c\2\2~\177\7r\2\2\177\u0080\7r\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7f\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\20\3\2\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008d\7-\2\2\u008d\24\3\2\2\2\u008e\u008f\7/\2\2\u008f\26\3\2\2\2\u0090"+
		"\u0091\7,\2\2\u0091\30\3\2\2\2\u0092\u0093\7\61\2\2\u0093\32\3\2\2\2\u0094"+
		"\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096\34\3\2\2\2\u0097\u0098\7/\2\2\u0098"+
		"\u0099\7@\2\2\u0099\36\3\2\2\2\u009a\u009b\7@\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7>\2\2\u009d\"\3\2\2\2\u009e\u009f\7(\2\2\u009f$\3\2\2\2\u00a0"+
		"\u00a1\7~\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7\u0080\2\2\u00a3(\3\2\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8*\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2"+
		"\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae,\3\2\2\2\u00af\u00b0\7"+
		"d\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7f\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7n\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\66\3\2\2\2\u00c7\u00c8"+
		"\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb"+
		"\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd8\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf"+
		"\u00d0\7r\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2:\3\2\2\2\u00d3"+
		"\u00d4\7i\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7v\2\2\u00d6<\3\2\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7v\2\2\u00da>\3\2\2\2\u00db"+
		"\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7q\2"+
		"\2\u00e3B\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7%\2\2"+
		"\u00e7F\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb"+
		"J\3\2\2\2\u00ec\u00ed\7]\2\2\u00edL\3\2\2\2\u00ee\u00ef\7_\2\2\u00efN"+
		"\3\2\2\2\u00f0\u00f1\7.\2\2\u00f1P\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3"+
		"R\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5T\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7"+
		"V\3\2\2\2\u00f8\u0101\7\62\2\2\u00f9\u00fd\t\2\2\2\u00fa\u00fc\t\3\2\2"+
		"\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0101X\3\2\2\2\u0102\u0106\t\4\2\2\u0103\u0105\t\5\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107Z\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\61\2\2\u010a"+
		"\u010b\7,\2\2\u010b\u010f\3\2\2\2\u010c\u010e\13\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7\61"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b.\2\2\u0116\\\3\2\2\2\u0117\u0118"+
		"\t\6\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b/\2\2\u011a^\3\2\2\2\7\2\u00fd"+
		"\u0100\u0106\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
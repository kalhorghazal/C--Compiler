// Generated from /home/ghazal/IdeaProjects/Phase2/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
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
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_variableWithType = 11, RULE_functionArguments = 12, RULE_body = 13, 
		RULE_loopCondBody = 14, RULE_blockStatement = 15, RULE_varDecStatement = 16, 
		RULE_functionCallStmt = 17, RULE_returnStatement = 18, RULE_ifStatement = 19, 
		RULE_elseStatement = 20, RULE_loopStatement = 21, RULE_whileLoopStatement = 22, 
		RULE_doWhileLoopStatement = 23, RULE_displayStatement = 24, RULE_assignmentStatement = 25, 
		RULE_singleStatement = 26, RULE_expression = 27, RULE_orExpression = 28, 
		RULE_andExpression = 29, RULE_equalityExpression = 30, RULE_relationalExpression = 31, 
		RULE_additiveExpression = 32, RULE_multiplicativeExpression = 33, RULE_preUnaryExpression = 34, 
		RULE_accessExpression = 35, RULE_otherExpression = 36, RULE_size = 37, 
		RULE_append = 38, RULE_value = 39, RULE_boolValue = 40, RULE_identifier = 41, 
		RULE_structType = 42, RULE_listType = 43, RULE_type = 44, RULE_fptrType = 45, 
		RULE_typesWithComma = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "variableWithType", "functionArguments", "body", "loopCondBody", 
			"blockStatement", "varDecStatement", "functionCallStmt", "returnStatement", 
			"ifStatement", "elseStatement", "loopStatement", "whileLoopStatement", 
			"doWhileLoopStatement", "displayStatement", "assignmentStatement", "singleStatement", 
			"expression", "orExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "accessExpression", "otherExpression", "size", 
			"append", "value", "boolValue", "identifier", "structType", "listType", 
			"type", "fptrType", "typesWithComma"
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

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((ProgramContext)_localctx).programRet =  new Program();
			        int line = 1;
			        _localctx.programRet.setLine(line);
			    
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(119);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			((ProgramContext)_localctx).m = main();
			 _localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet); 
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token m;
		public BodyContext body;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((MainContext)_localctx).m = match(MAIN);

			        ((MainContext)_localctx).mainRet =  new MainDeclaration();
			        _localctx.mainRet.setLine(((MainContext)_localctx).m.getLine());
			    
			setState(132);
			match(LPAR);
			setState(133);
			match(RPAR);
			setState(134);
			((MainContext)_localctx).body = body();
			 _localctx.mainRet.setBody(((MainContext)_localctx).body.bodyRet); 
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaration structDeclarationRet;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STRUCT);
			setState(138);
			identifier();
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(139);
				match(BEGIN);
				setState(140);
				structBody();
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(NEWLINE);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(146);
				match(END);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					match(NEWLINE);
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(153);
				singleStatementStructBody();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(154);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(NEWLINE);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
			setState(165);
			identifier();
			setState(166);
			functionArgsDec();
			setState(167);
			match(BEGIN);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(173);
			setBody();
			setState(174);
			getBody();
			setState(175);
			match(END);
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				singleVarWithGetAndSet();
				}
				break;
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

	public static class StructBodyContext extends ParserRuleContext {
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(181);
						match(NEWLINE);
						}
						}
						setState(184); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(186);
							singleStatementStructBody();
							setState(187);
							match(SEMICOLON);
							}
							} 
						}
						setState(193);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(194);
					singleStatementStructBody();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(195);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GetBodyContext extends ParserRuleContext {
		public Statement getBodyRet;
		public BodyContext b;
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(GET);
			setState(203);
			((GetBodyContext)_localctx).b = body();
			 ((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).b.bodyRet; 
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				match(NEWLINE);
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public Statement setBodyRet;
		public BodyContext b;
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(SET);
			setState(211);
			((SetBodyContext)_localctx).b = body();
			 ((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).b.bodyRet; 
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				match(NEWLINE);
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(218);
				type();
				}
				break;
			case VOID:
				{
				setState(219);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			identifier();
			setState(223);
			functionArgsDec();
			setState(224);
			body();
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(NEWLINE);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> argsRet;
		public VariableWithTypeContext v1;
		public VariableWithTypeContext v2;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LPAR);
			 ((FunctionArgsDecContext)_localctx).argsRet =  new ArrayList<>(); 
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(232);
				((FunctionArgsDecContext)_localctx).v1 = variableWithType();
				 _localctx.argsRet.add(((FunctionArgsDecContext)_localctx).v1.varWithTypeRet); 
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					((FunctionArgsDecContext)_localctx).v2 = variableWithType();
					 _localctx.argsRet.add(((FunctionArgsDecContext)_localctx).v2.varWithTypeRet); 
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(245);
			match(RPAR);
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

	public static class VariableWithTypeContext extends ParserRuleContext {
		public VariableDeclaration varWithTypeRet;
		public TypeContext t;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((VariableWithTypeContext)_localctx).t = type();
			setState(248);
			((VariableWithTypeContext)_localctx).id = identifier();

			        ((VariableWithTypeContext)_localctx).varWithTypeRet =  new VariableDeclaration(((VariableWithTypeContext)_localctx).id.idRet, ((VariableWithTypeContext)_localctx).t.typeRet);
			        _localctx.varWithTypeRet.setLine(((VariableWithTypeContext)_localctx).id.line);
			    
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> functionArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionArgumentsContext)_localctx).functionArgsRet =  new ArrayList<>(); 
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(252);
				((FunctionArgumentsContext)_localctx).e1 = expression();
				 _localctx.functionArgsRet.add(((FunctionArgumentsContext)_localctx).e1.exprRet); 
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					((FunctionArgumentsContext)_localctx).e2 = expression();
					 _localctx.functionArgsRet.add(((FunctionArgumentsContext)_localctx).e2.exprRet); 
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class BodyContext extends ParserRuleContext {
		public Statement bodyRet;
		public BlockStatementContext b;
		public SingleStatementContext s;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(265);
				((BodyContext)_localctx).b = blockStatement();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockStmtRet; 
				}
				break;
			case NEWLINE:
				{
				{
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					match(NEWLINE);
					}
					}
					setState(271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(273);
				((BodyContext)_localctx).s = singleStatement();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).s.stmtRet; 
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(275);
					match(SEMICOLON);
					}
				}

				}
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public Statement loopCondBodyRet;
		public BlockStatementContext b;
		public SingleStatementContext s;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(280);
				((LoopCondBodyContext)_localctx).b = blockStatement();
				 ((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).b.blockStmtRet; 
				}
				break;
			case NEWLINE:
				{
				{
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(283);
					match(NEWLINE);
					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(288);
				((LoopCondBodyContext)_localctx).s = singleStatement();
				 ((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).s.stmtRet; 
				}
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStmtRet;
		public Token b;
		public SingleStatementContext s1;
		public SingleStatementContext s2;
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((BlockStatementContext)_localctx).b = match(BEGIN);

			        ((BlockStatementContext)_localctx).blockStmtRet =  new BlockStmt();
			        _localctx.blockStmtRet.setLine(((BlockStatementContext)_localctx).b.getLine());
			    
			setState(314); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(295);
						match(NEWLINE);
						}
						}
						setState(298); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(300);
							((BlockStatementContext)_localctx).s1 = singleStatement();
							 _localctx.blockStmtRet.addStatement(((BlockStatementContext)_localctx).s1.stmtRet); 
							setState(302);
							match(SEMICOLON);
							}
							} 
						}
						setState(308);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(309);
					((BlockStatementContext)_localctx).s2 = singleStatement();
					 _localctx.blockStmtRet.addStatement(((BlockStatementContext)_localctx).s2.stmtRet); 
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(311);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				match(NEWLINE);
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(323);
			match(END);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public VarDecStmt varDecStmtRet;
		public VariableDeclaration tempVar;
		public TypeContext t;
		public IdentifierContext i1;
		public OrExpressionContext oe1;
		public IdentifierContext i2;
		public OrExpressionContext oe2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			((VarDecStatementContext)_localctx).t = type();
			setState(326);
			((VarDecStatementContext)_localctx).i1 = identifier();

			        ((VarDecStatementContext)_localctx).tempVar =  new VariableDeclaration(((VarDecStatementContext)_localctx).i1.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
			        _localctx.tempVar.setLine(((VarDecStatementContext)_localctx).i1.line);
			    
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(328);
				match(ASSIGN);
				setState(329);
				((VarDecStatementContext)_localctx).oe1 = orExpression();
				 _localctx.tempVar.setDefaultValue(((VarDecStatementContext)_localctx).oe1.orExprRet); 
				}
			}


			        ((VarDecStatementContext)_localctx).varDecStmtRet =  new VarDecStmt();
			        _localctx.varDecStmtRet.addVar(_localctx.tempVar);
			        _localctx.varDecStmtRet.setLine(_localctx.tempVar.getLine());
			    
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				((VarDecStatementContext)_localctx).i2 = identifier();

				        ((VarDecStatementContext)_localctx).tempVar =  new VariableDeclaration(((VarDecStatementContext)_localctx).i2.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
				        _localctx.tempVar.setLine(((VarDecStatementContext)_localctx).i2.line);
				    
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(338);
					match(ASSIGN);
					setState(339);
					((VarDecStatementContext)_localctx).oe2 = orExpression();
					 _localctx.tempVar.setDefaultValue(((VarDecStatementContext)_localctx).oe2.orExprRet); 
					}
				}

				 _localctx.varDecStmtRet.addVar(_localctx.tempVar); 
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public FunctionCallStmt functionCallStmtRet;
		public Expression tempExpr;
		public OtherExpressionContext oe;
		public Token l1;
		public FunctionArgumentsContext f1;
		public IdentifierContext i;
		public Token l2;
		public FunctionArgumentsContext f2;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((FunctionCallStmtContext)_localctx).oe = otherExpression();
			 ((FunctionCallStmtContext)_localctx).tempExpr =  ((FunctionCallStmtContext)_localctx).oe.otherExprRet; 
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(363);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(353);
						((FunctionCallStmtContext)_localctx).l1 = match(LPAR);
						setState(354);
						((FunctionCallStmtContext)_localctx).f1 = functionArguments();

						        ((FunctionCallStmtContext)_localctx).tempExpr =  new FunctionCall(_localctx.tempExpr, ((FunctionCallStmtContext)_localctx).f1.functionArgsRet);
						        _localctx.tempExpr.setLine(((FunctionCallStmtContext)_localctx).l1.getLine());
						    
						setState(356);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(358);
						match(DOT);
						setState(359);
						((FunctionCallStmtContext)_localctx).i = identifier();
						}

						        ((FunctionCallStmtContext)_localctx).tempExpr =  new StructAccess(_localctx.tempExpr, ((FunctionCallStmtContext)_localctx).i.idRet);
						        _localctx.tempExpr.setLine(((FunctionCallStmtContext)_localctx).i.line);
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(368);
			((FunctionCallStmtContext)_localctx).l2 = match(LPAR);
			setState(369);
			((FunctionCallStmtContext)_localctx).f2 = functionArguments();

			        FunctionCall functionCall = new FunctionCall(_localctx.tempExpr, ((FunctionCallStmtContext)_localctx).f2.functionArgsRet);
			        functionCall.setLine(((FunctionCallStmtContext)_localctx).l2.getLine());
			        ((FunctionCallStmtContext)_localctx).functionCallStmtRet =  new FunctionCallStmt(functionCall);
			        _localctx.functionCallStmtRet.setLine(((FunctionCallStmtContext)_localctx).l2.getLine());
			    
			setState(371);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((ReturnStatementContext)_localctx).r = match(RETURN);

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt();
			        _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			    
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(375);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.exprRet); 
				}
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStmtRet;
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IF);
			setState(381);
			expression();
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(382);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(383);
				body();
				setState(384);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(388);
				match(NEWLINE);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(ELSE);
			setState(395);
			loopCondBody();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStmt loopStmtRet;
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopStatement);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				doWhileLoopStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(WHILE);
			setState(402);
			expression();
			setState(403);
			loopCondBody();
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(DO);
			setState(406);
			body();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(407);
				match(NEWLINE);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(WHILE);
			setState(414);
			expression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStmt displayStmtRet;
		public Token d;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			((DisplayStatementContext)_localctx).d = match(DISPLAY);
			setState(417);
			match(LPAR);
			setState(418);
			((DisplayStatementContext)_localctx).e = expression();

			        ((DisplayStatementContext)_localctx).displayStmtRet =  new DisplayStmt(((DisplayStatementContext)_localctx).e.exprRet);
			        _localctx.displayStmtRet.setLine(((DisplayStatementContext)_localctx).d.getLine());
			    
			setState(420);
			match(RPAR);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext left;
		public Token a;
		public ExpressionContext right;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			((AssignmentStatementContext)_localctx).left = orExpression();
			setState(423);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(424);
			((AssignmentStatementContext)_localctx).right = expression();

			        ((AssignmentStatementContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).left.orExprRet, ((AssignmentStatementContext)_localctx).right.exprRet);
			        _localctx.assignmentRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
			    
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement stmtRet;
		public IfStatementContext i;
		public DisplayStatementContext d;
		public FunctionCallStmtContext f;
		public ReturnStatementContext r;
		public AssignmentStatementContext a1;
		public VarDecStatementContext v;
		public LoopStatementContext l;
		public AppendContext a2;
		public SizeContext s;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_singleStatement);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				((SingleStatementContext)_localctx).i = ifStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).i.ifStmtRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				((SingleStatementContext)_localctx).d = displayStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).d.displayStmtRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				((SingleStatementContext)_localctx).f = functionCallStmt();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).f.functionCallStmtRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				((SingleStatementContext)_localctx).r = returnStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).r.returnStmtRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				((SingleStatementContext)_localctx).a1 = assignmentStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).a1.assignmentRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				((SingleStatementContext)_localctx).v = varDecStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).v.varDecStmtRet; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				((SingleStatementContext)_localctx).l = loopStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).l.loopStmtRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(448);
				((SingleStatementContext)_localctx).a2 = append();
				 ((SingleStatementContext)_localctx).stmtRet =  new ListAppendStmt(((SingleStatementContext)_localctx).a2.listAppendRet); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				((SingleStatementContext)_localctx).s = size();
				 ((SingleStatementContext)_localctx).stmtRet =  new ListSizeStmt(((SingleStatementContext)_localctx).s.listSizeRet); 
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression exprRet;
		public OrExpressionContext oe;
		public Token a;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((ExpressionContext)_localctx).oe = orExpression();
			 ((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).oe.orExprRet; 
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(458);
				((ExpressionContext)_localctx).a = match(ASSIGN);
				setState(459);
				((ExpressionContext)_localctx).e = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).exprRet =  new BinaryExpression(((ExpressionContext)_localctx).oe.orExprRet, ((ExpressionContext)_localctx).e.exprRet, op);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).a.getLine());
				    
				}
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExprRet;
		public AndExpressionContext ael;
		public Token o;
		public AndExpressionContext aer;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).ael.andExprRet; 
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(466);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(467);
				((OrExpressionContext)_localctx).aer = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).aer.andExprRet, op);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExprRet;
		public EqualityExpressionContext eel;
		public Token a;
		public EqualityExpressionContext ee2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			((AndExpressionContext)_localctx).eel = equalityExpression();
			 ((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).eel.eqExprRet; 
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(477);
				((AndExpressionContext)_localctx).a = match(AND);
				setState(478);
				((AndExpressionContext)_localctx).ee2 = equalityExpression();

				        BinaryOperator op = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).ee2.eqExprRet, op);
				        _localctx.andExprRet.setLine(((AndExpressionContext)_localctx).a.getLine());
				    
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExprRet;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext rel;
		public Token eq;
		public RelationalExpressionContext rer;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			 ((EqualityExpressionContext)_localctx).eqExprRet =  ((EqualityExpressionContext)_localctx).rel.relExprRet; 
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(488);
				((EqualityExpressionContext)_localctx).eq = match(EQUAL);

				        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).eq.getLine();
				    
				setState(490);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				        ((EqualityExpressionContext)_localctx).eqExprRet =  new BinaryExpression(_localctx.eqExprRet, ((EqualityExpressionContext)_localctx).rer.relExprRet, _localctx.op);
				        _localctx.eqExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext ael;
		public Token gt;
		public Token lt;
		public AdditiveExpressionContext aer;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relExprRet =  ((RelationalExpressionContext)_localctx).ael.addExprRet; 
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(500);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).gt.getLine();
					    
					}
					break;
				case LESS_THAN:
					{
					setState(502);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).lt.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(506);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relExprRet =  new BinaryExpression(_localctx.relExprRet, ((RelationalExpressionContext)_localctx).aer.addExprRet, _localctx.op);
				        _localctx.relExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExprRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext mel;
		public Token add;
		public Token sub;
		public MultiplicativeExpressionContext mer;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			((AdditiveExpressionContext)_localctx).mel = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).addExprRet =  ((AdditiveExpressionContext)_localctx).mel.multExprRet; 
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(516);
					((AdditiveExpressionContext)_localctx).add = match(PLUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).add.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(518);
					((AdditiveExpressionContext)_localctx).sub = match(MINUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).sub.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(522);
				((AdditiveExpressionContext)_localctx).mer = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).addExprRet =  new BinaryExpression(_localctx.addExprRet, ((AdditiveExpressionContext)_localctx).mer.multExprRet, _localctx.op);
				        _localctx.addExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multExprRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext pel;
		public Token mult;
		public Token div;
		public PreUnaryExpressionContext per;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((MultiplicativeExpressionContext)_localctx).pel = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multExprRet =  ((MultiplicativeExpressionContext)_localctx).pel.preUnaryExprRet; 
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(536);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(532);
					((MultiplicativeExpressionContext)_localctx).mult = match(MULT);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mult.getLine();
					    
					}
					break;
				case DIVIDE:
					{
					setState(534);
					((MultiplicativeExpressionContext)_localctx).div = match(DIVIDE);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).div.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(538);
				((MultiplicativeExpressionContext)_localctx).per = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multExprRet =  new BinaryExpression(_localctx.multExprRet, ((MultiplicativeExpressionContext)_localctx).per.preUnaryExprRet, _localctx.op);
				        _localctx.multExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExprRet;
		public UnaryOperator op;
		public int line;
		public Token not;
		public Token minus;
		public PreUnaryExpressionContext pre;
		public AccessExpressionContext ae;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_preUnaryExpression);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(546);
					((PreUnaryExpressionContext)_localctx).not = match(NOT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).not.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(548);
					((PreUnaryExpressionContext)_localctx).minus = match(MINUS);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).minus.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUnaryExprRet, _localctx.op);
				        _localctx.preUnaryExprRet.setLine(_localctx.line);
				    
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).ae.accessExprRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExprRet;
		public OtherExpressionContext oe;
		public Token l1;
		public FunctionArgumentsContext f;
		public IdentifierContext i1;
		public Token l2;
		public ExpressionContext index;
		public IdentifierContext i2;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExprRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(573);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(562);
						((AccessExpressionContext)_localctx).l1 = match(LPAR);
						setState(563);
						((AccessExpressionContext)_localctx).f = functionArguments();
						setState(564);
						match(RPAR);
						}

						        ((AccessExpressionContext)_localctx).accessExprRet =  new FunctionCall(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).f.functionArgsRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).l1.getLine());
						    
						}
						break;
					case DOT:
						{
						{
						setState(568);
						match(DOT);
						setState(569);
						((AccessExpressionContext)_localctx).i1 = identifier();
						}

						        ((AccessExpressionContext)_localctx).accessExprRet =  new StructAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).i1.idRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).i1.line);
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(589);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(578);
					((AccessExpressionContext)_localctx).l2 = match(LBRACK);
					setState(579);
					((AccessExpressionContext)_localctx).index = expression();
					setState(580);
					match(RBRACK);
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new ListAccessByIndex(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).index.exprRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).l2.getLine());
					    
					}
					break;
				case DOT:
					{
					{
					setState(584);
					match(DOT);
					setState(585);
					((AccessExpressionContext)_localctx).i2 = identifier();
					}

					        ((AccessExpressionContext)_localctx).accessExprRet =  new StructAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).i2.idRet);
					        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).i2.line);
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public ValueContext v;
		public IdentifierContext id;
		public Token l;
		public FunctionArgumentsContext f;
		public SizeContext s;
		public AppendContext a;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_otherExpression);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				((OtherExpressionContext)_localctx).v = value();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.idRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				((OtherExpressionContext)_localctx).l = match(LPAR);
				{
				setState(601);
				((OtherExpressionContext)_localctx).f = functionArguments();
				}
				setState(602);
				match(RPAR);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new ExprInPar(((OtherExpressionContext)_localctx).f.functionArgsRet);
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).l.getLine());
				    
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				((OtherExpressionContext)_localctx).s = size();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).s.listSizeRet;
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).s.line);
				    
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				((OtherExpressionContext)_localctx).a = append();

				        ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).a.listAppendRet;
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).a.line);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SizeContext extends ParserRuleContext {
		public ListSize listSizeRet;
		public int line;
		public Token s;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			((SizeContext)_localctx).s = match(SIZE);
			setState(614);
			match(LPAR);
			setState(615);
			((SizeContext)_localctx).e = expression();

			        ((SizeContext)_localctx).listSizeRet =  new ListSize(((SizeContext)_localctx).e.exprRet);
			        _localctx.listSizeRet.setLine(((SizeContext)_localctx).s.getLine());
			        ((SizeContext)_localctx).line =  _localctx.listSizeRet.getLine();
			    
			setState(617);
			match(RPAR);
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

	public static class AppendContext extends ParserRuleContext {
		public ListAppend listAppendRet;
		public int line;
		public Token a;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			((AppendContext)_localctx).a = match(APPEND);
			setState(620);
			match(LPAR);
			setState(621);
			((AppendContext)_localctx).e1 = expression();
			setState(622);
			match(COMMA);
			setState(623);
			((AppendContext)_localctx).e2 = expression();

			        ((AppendContext)_localctx).listAppendRet =  new ListAppend(((AppendContext)_localctx).e1.exprRet, ((AppendContext)_localctx).e2.exprRet);
			        _localctx.listAppendRet.setLine(((AppendContext)_localctx).a.getLine());
			        ((AppendContext)_localctx).line =  _localctx.listAppendRet.getLine();
			    
			setState(625);
			match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext b;
		public Token i;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				((ValueContext)_localctx).b = boolValue();

				        ((ValueContext)_localctx).valueRet =  new BoolValue(((ValueContext)_localctx).b.boolValueRet);
				        _localctx.valueRet.setLine(((ValueContext)_localctx).b.line);
				    
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				((ValueContext)_localctx).i = match(INT_VALUE);

				        ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0));
				        _localctx.valueRet.setLine(((ValueContext)_localctx).i.getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolValueContext extends ParserRuleContext {
		public boolean boolValueRet;
		public int line;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolValue);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  true;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).t.getLine();
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  false;
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).f.getLine();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public int line;
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).idRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			        _localctx.idRet.setLine(((IdentifierContext)_localctx).id.getLine());
			        ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).id.getLine();
			    
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

	public static class StructTypeContext extends ParserRuleContext {
		public StructType structTypeRet;
		public IdentifierContext id;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(STRUCT);
			setState(644);
			((StructTypeContext)_localctx).id = identifier();
			 ((StructTypeContext)_localctx).structTypeRet =  new StructType(((StructTypeContext)_localctx).id.idRet); 
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListType listTypeRet;
		public TypeContext t;
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(LIST);
			setState(648);
			match(SHARP);
			setState(649);
			((ListTypeContext)_localctx).t = type();
			 ((ListTypeContext)_localctx).listTypeRet =  new ListType(((ListTypeContext)_localctx).t.typeRet); 
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public ListTypeContext l;
		public StructTypeContext s;
		public FptrTypeContext f;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				((TypeContext)_localctx).l = listType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).l.listTypeRet; 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				((TypeContext)_localctx).s = structType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).s.structTypeRet; 
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				((TypeContext)_localctx).f = fptrType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FptrTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public ArrayList<Type> argsTypes;
		public Type returnType;
		public TypesWithCommaContext types;
		public TypeContext t;
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fptrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(FPTR);
			setState(668);
			match(LESS_THAN);
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(669);
				match(VOID);
				 ((FptrTypeContext)_localctx).argsTypes =  new ArrayList<Type>(); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(671);
				((FptrTypeContext)_localctx).types = typesWithComma();
				 ((FptrTypeContext)_localctx).argsTypes =  ((FptrTypeContext)_localctx).types.typesWithCommaRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(676);
			match(ARROW);
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(677);
				match(VOID);
				 ((FptrTypeContext)_localctx).returnType =  new VoidType(); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(679);
				((FptrTypeContext)_localctx).t = type();
				 ((FptrTypeContext)_localctx).returnType =  ((FptrTypeContext)_localctx).t.typeRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(684);
			match(GREATER_THAN);
			 ((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.argsTypes, _localctx.returnType); 
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext t1;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<>(); 
			setState(688);
			((TypesWithCommaContext)_localctx).t1 = type();
			 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t1.typeRet); 
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				((TypesWithCommaContext)_localctx).t2 = type();
				 _localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).t2.typeRet); 
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16\3x"+
		"\13\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5\u0091\n\5\r\5\16\5\u0092\3\5"+
		"\3\5\3\5\6\5\u0098\n\5\r\5\16\5\u0099\3\5\3\5\5\5\u009e\n\5\5\5\u00a0"+
		"\n\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4\3\6\3\6\3\6\3\6\3\6\6\6\u00ac\n"+
		"\6\r\6\16\6\u00ad\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u00b6\n\7\3\b\6\b\u00b9"+
		"\n\b\r\b\16\b\u00ba\3\b\3\b\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\3\b"+
		"\3\b\5\b\u00c7\n\b\6\b\u00c9\n\b\r\b\16\b\u00ca\3\t\3\t\3\t\3\t\6\t\u00d1"+
		"\n\t\r\t\16\t\u00d2\3\n\3\n\3\n\3\n\6\n\u00d9\n\n\r\n\16\n\u00da\3\13"+
		"\3\13\5\13\u00df\n\13\3\13\3\13\3\13\3\13\6\13\u00e5\n\13\r\13\16\13\u00e6"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f1\n\f\f\f\16\f\u00f4\13\f\5\f"+
		"\u00f6\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0105\n\16\f\16\16\16\u0108\13\16\5\16\u010a\n\16\3\17\3\17\3\17"+
		"\3\17\6\17\u0110\n\17\r\17\16\17\u0111\3\17\3\17\3\17\5\17\u0117\n\17"+
		"\5\17\u0119\n\17\3\20\3\20\3\20\3\20\6\20\u011f\n\20\r\20\16\20\u0120"+
		"\3\20\3\20\3\20\5\20\u0126\n\20\3\21\3\21\3\21\6\21\u012b\n\21\r\21\16"+
		"\21\u012c\3\21\3\21\3\21\3\21\7\21\u0133\n\21\f\21\16\21\u0136\13\21\3"+
		"\21\3\21\3\21\5\21\u013b\n\21\6\21\u013d\n\21\r\21\16\21\u013e\3\21\6"+
		"\21\u0142\n\21\r\21\16\21\u0143\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u014f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0159"+
		"\n\22\3\22\3\22\7\22\u015d\n\22\f\22\16\22\u0160\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u016e\n\23\f\23\16"+
		"\23\u0171\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u017d\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185\n\25\3\26\7\26\u0188"+
		"\n\26\f\26\16\26\u018b\13\26\3\26\3\26\3\26\3\27\3\27\5\27\u0192\n\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u019b\n\31\f\31\16\31\u019e\13"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u01c9\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d1\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01d9\n\36\f\36\16\36\u01dc\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u01e4\n\37\f\37\16\37\u01e7\13\37\3 \3 \3 \3"+
		" \3 \3 \3 \7 \u01f0\n \f \16 \u01f3\13 \3!\3!\3!\3!\3!\3!\5!\u01fb\n!"+
		"\3!\3!\3!\7!\u0200\n!\f!\16!\u0203\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u020b"+
		"\n\"\3\"\3\"\3\"\7\"\u0210\n\"\f\"\16\"\u0213\13\"\3#\3#\3#\3#\3#\3#\5"+
		"#\u021b\n#\3#\3#\3#\7#\u0220\n#\f#\16#\u0223\13#\3$\3$\3$\3$\5$\u0229"+
		"\n$\3$\3$\3$\3$\3$\3$\5$\u0231\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\7%\u0240\n%\f%\16%\u0243\13%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0250"+
		"\n%\f%\16%\u0253\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\5&\u0266\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\5)\u027b\n)\3*\3*\3*\3*\5*\u0281\n*\3+\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u029c\n.\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u02a5\n/\3/\3/\3/\3/\3/\3/\5/\u02ad\n/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u02b9\n\60\f\60\16\60\u02bc\13\60"+
		"\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\2\2\u02de\2c\3\2\2\2\4p\3\2\2\2\6\u0084\3\2"+
		"\2\2\b\u008b\3\2\2\2\n\u00a6\3\2\2\2\f\u00b5\3\2\2\2\16\u00c8\3\2\2\2"+
		"\20\u00cc\3\2\2\2\22\u00d4\3\2\2\2\24\u00de\3\2\2\2\26\u00e8\3\2\2\2\30"+
		"\u00f9\3\2\2\2\32\u00fd\3\2\2\2\34\u0118\3\2\2\2\36\u0125\3\2\2\2 \u0127"+
		"\3\2\2\2\"\u0147\3\2\2\2$\u0161\3\2\2\2&\u0177\3\2\2\2(\u017e\3\2\2\2"+
		"*\u0189\3\2\2\2,\u0191\3\2\2\2.\u0193\3\2\2\2\60\u0197\3\2\2\2\62\u01a2"+
		"\3\2\2\2\64\u01a8\3\2\2\2\66\u01c8\3\2\2\28\u01ca\3\2\2\2:\u01d2\3\2\2"+
		"\2<\u01dd\3\2\2\2>\u01e8\3\2\2\2@\u01f4\3\2\2\2B\u0204\3\2\2\2D\u0214"+
		"\3\2\2\2F\u0230\3\2\2\2H\u0232\3\2\2\2J\u0265\3\2\2\2L\u0267\3\2\2\2N"+
		"\u026d\3\2\2\2P\u027a\3\2\2\2R\u0280\3\2\2\2T\u0282\3\2\2\2V\u0285\3\2"+
		"\2\2X\u0289\3\2\2\2Z\u029b\3\2\2\2\\\u029d\3\2\2\2^\u02b1\3\2\2\2`b\7"+
		",\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5"+
		"\4\3\2gk\b\2\1\2hj\7,\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3"+
		"\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3\2\2\2pv\b\3\1\2qr\5\b\5\2rs\b\3\1\2su"+
		"\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2\2\2xv\3\2\2\2y"+
		"z\5\24\13\2z{\b\3\1\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\6\4\2\u0082\u0083"+
		"\b\3\1\2\u0083\5\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086\b\4\1\2\u0086"+
		"\u0087\7%\2\2\u0087\u0088\7&\2\2\u0088\u0089\5\34\17\2\u0089\u008a\b\4"+
		"\1\2\u008a\7\3\2\2\2\u008b\u008c\7\35\2\2\u008c\u009f\5T+\2\u008d\u008e"+
		"\7\30\2\2\u008e\u0090\5\16\b\2\u008f\u0091\7,\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\7\31\2\2\u0095\u00a0\3\2\2\2\u0096\u0098\7,\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\5\f\7\2\u009c\u009e\7+\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u008d\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\7,\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\t\3\2\2\2\u00a6\u00a7\5Z.\2\u00a7\u00a8\5T+\2\u00a8\u00a9\5"+
		"\26\f\2\u00a9\u00ab\7\30\2\2\u00aa\u00ac\7,\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\31\2\2\u00b2"+
		"\13\3\2\2\2\u00b3\u00b6\5\"\22\2\u00b4\u00b6\5\n\6\2\u00b5\u00b3\3\2\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\r\3\2\2\2\u00b7\u00b9\7,\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00c1\3\2\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7+\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\5\f"+
		"\7\2\u00c5\u00c7\7+\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce"+
		"\5\34\17\2\u00ce\u00d0\b\t\1\2\u00cf\u00d1\7,\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\21"+
		"\3\2\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d8\b\n\1\2"+
		"\u00d7\u00d9\7,\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00df\5Z.\2\u00dd"+
		"\u00df\7\5\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\5T+\2\u00e1\u00e2\5\26\f\2\u00e2\u00e4\5\34\17\2\u00e3"+
		"\u00e5\7,\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\25\3\2\2\2\u00e8\u00e9\7%\2\2\u00e9\u00f5"+
		"\b\f\1\2\u00ea\u00eb\5\30\r\2\u00eb\u00f2\b\f\1\2\u00ec\u00ed\7)\2\2\u00ed"+
		"\u00ee\5\30\r\2\u00ee\u00ef\b\f\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7&\2\2\u00f8\27\3\2\2\2\u00f9\u00fa"+
		"\5Z.\2\u00fa\u00fb\5T+\2\u00fb\u00fc\b\r\1\2\u00fc\31\3\2\2\2\u00fd\u0109"+
		"\b\16\1\2\u00fe\u00ff\58\35\2\u00ff\u0106\b\16\1\2\u0100\u0101\7)\2\2"+
		"\u0101\u0102\58\35\2\u0102\u0103\b\16\1\2\u0103\u0105\3\2\2\2\u0104\u0100"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u00fe\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\33\3\2\2\2\u010b\u010c\5 \21\2\u010c\u010d\b\17\1\2\u010d\u0119"+
		"\3\2\2\2\u010e\u0110\7,\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\66"+
		"\34\2\u0114\u0116\b\17\1\2\u0115\u0117\7+\2\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u010b\3\2\2\2\u0118\u010f\3\2"+
		"\2\2\u0119\35\3\2\2\2\u011a\u011b\5 \21\2\u011b\u011c\b\20\1\2\u011c\u0126"+
		"\3\2\2\2\u011d\u011f\7,\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5\66"+
		"\34\2\u0123\u0124\b\20\1\2\u0124\u0126\3\2\2\2\u0125\u011a\3\2\2\2\u0125"+
		"\u011e\3\2\2\2\u0126\37\3\2\2\2\u0127\u0128\7\30\2\2\u0128\u013c\b\21"+
		"\1\2\u0129\u012b\7,\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0134\3\2\2\2\u012e\u012f\5\66"+
		"\34\2\u012f\u0130\b\21\1\2\u0130\u0131\7+\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5\66\34\2\u0138"+
		"\u013a\b\21\1\2\u0139\u013b\7+\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u012a\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142\7,"+
		"\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\31\2\2\u0146!\3\2\2\2"+
		"\u0147\u0148\5Z.\2\u0148\u0149\5T+\2\u0149\u014e\b\22\1\2\u014a\u014b"+
		"\7#\2\2\u014b\u014c\5:\36\2\u014c\u014d\b\22\1\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014a\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u015e\b\22"+
		"\1\2\u0151\u0152\7)\2\2\u0152\u0153\5T+\2\u0153\u0158\b\22\1\2\u0154\u0155"+
		"\7#\2\2\u0155\u0156\5:\36\2\u0156\u0157\b\22\1\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\22"+
		"\1\2\u015b\u015d\3\2\2\2\u015c\u0151\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f#\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\u0162\5J&\2\u0162\u016f\b\23\1\2\u0163\u0164\7%\2\2\u0164\u0165"+
		"\5\32\16\2\u0165\u0166\b\23\1\2\u0166\u0167\7&\2\2\u0167\u016e\3\2\2\2"+
		"\u0168\u0169\7*\2\2\u0169\u016a\5T+\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\b\23\1\2\u016c\u016e\3\2\2\2\u016d\u0163\3\2\2\2\u016d\u0168\3\2\2\2"+
		"\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7%\2\2\u0173\u0174\5\32\16\2"+
		"\u0174\u0175\b\23\1\2\u0175\u0176\7&\2\2\u0176%\3\2\2\2\u0177\u0178\7"+
		"\4\2\2\u0178\u017c\b\24\1\2\u0179\u017a\58\35\2\u017a\u017b\b\24\1\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\'\3\2\2\2"+
		"\u017e\u017f\7\t\2\2\u017f\u0184\58\35\2\u0180\u0185\5\36\20\2\u0181\u0182"+
		"\5\34\17\2\u0182\u0183\5*\26\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2"+
		"\u0184\u0181\3\2\2\2\u0185)\3\2\2\2\u0186\u0188\7,\2\2\u0187\u0186\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\n\2\2\u018d\u018e\5\36"+
		"\20\2\u018e+\3\2\2\2\u018f\u0192\5.\30\2\u0190\u0192\5\60\31\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0190\3\2\2\2\u0192-\3\2\2\2\u0193\u0194\7!\2\2\u0194\u0195"+
		"\58\35\2\u0195\u0196\5\36\20\2\u0196/\3\2\2\2\u0197\u0198\7\"\2\2\u0198"+
		"\u019c\5\34\17\2\u0199\u019b\7,\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3"+
		"\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a0\7!\2\2\u01a0\u01a1\58\35\2\u01a1\61\3\2\2\2"+
		"\u01a2\u01a3\7\7\2\2\u01a3\u01a4\7%\2\2\u01a4\u01a5\58\35\2\u01a5\u01a6"+
		"\b\32\1\2\u01a6\u01a7\7&\2\2\u01a7\63\3\2\2\2\u01a8\u01a9\5:\36\2\u01a9"+
		"\u01aa\7#\2\2\u01aa\u01ab\58\35\2\u01ab\u01ac\b\33\1\2\u01ac\65\3\2\2"+
		"\2\u01ad\u01ae\5(\25\2\u01ae\u01af\b\34\1\2\u01af\u01c9\3\2\2\2\u01b0"+
		"\u01b1\5\62\32\2\u01b1\u01b2\b\34\1\2\u01b2\u01c9\3\2\2\2\u01b3\u01b4"+
		"\5$\23\2\u01b4\u01b5\b\34\1\2\u01b5\u01c9\3\2\2\2\u01b6\u01b7\5&\24\2"+
		"\u01b7\u01b8\b\34\1\2\u01b8\u01c9\3\2\2\2\u01b9\u01ba\5\64\33\2\u01ba"+
		"\u01bb\b\34\1\2\u01bb\u01c9\3\2\2\2\u01bc\u01bd\5\"\22\2\u01bd\u01be\b"+
		"\34\1\2\u01be\u01c9\3\2\2\2\u01bf\u01c0\5,\27\2\u01c0\u01c1\b\34\1\2\u01c1"+
		"\u01c9\3\2\2\2\u01c2\u01c3\5N(\2\u01c3\u01c4\b\34\1\2\u01c4\u01c9\3\2"+
		"\2\2\u01c5\u01c6\5L\'\2\u01c6\u01c7\b\34\1\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ad\3\2\2\2\u01c8\u01b0\3\2\2\2\u01c8\u01b3\3\2\2\2\u01c8\u01b6\3\2"+
		"\2\2\u01c8\u01b9\3\2\2\2\u01c8\u01bc\3\2\2\2\u01c8\u01bf\3\2\2\2\u01c8"+
		"\u01c2\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\67\3\2\2\2\u01ca\u01cb\5:\36"+
		"\2\u01cb\u01d0\b\35\1\2\u01cc\u01cd\7#\2\2\u01cd\u01ce\58\35\2\u01ce\u01cf"+
		"\b\35\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d19\3\2\2\2\u01d2\u01d3\5<\37\2\u01d3\u01da\b\36\1\2\u01d4\u01d5\7"+
		"\24\2\2\u01d5\u01d6\5<\37\2\u01d6\u01d7\b\36\1\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01d4\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db;\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\5> \2\u01de\u01e5"+
		"\b\37\1\2\u01df\u01e0\7\23\2\2\u01e0\u01e1\5> \2\u01e1\u01e2\b\37\1\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6=\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01e9\5@!\2\u01e9\u01f1\b \1\2\u01ea\u01eb\7\17\2\2\u01eb\u01ec\b \1"+
		"\2\u01ec\u01ed\5@!\2\u01ed\u01ee\b \1\2\u01ee\u01f0\3\2\2\2\u01ef\u01ea"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"?\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\5B\"\2\u01f5\u0201\b!\1\2\u01f6"+
		"\u01f7\7\21\2\2\u01f7\u01fb\b!\1\2\u01f8\u01f9\7\22\2\2\u01f9\u01fb\b"+
		"!\1\2\u01fa\u01f6\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\5B\"\2\u01fd\u01fe\b!\1\2\u01fe\u0200\3\2\2\2\u01ff\u01fa\3\2\2"+
		"\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202A"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\5D#\2\u0205\u0211\b\"\1\2\u0206"+
		"\u0207\7\13\2\2\u0207\u020b\b\"\1\2\u0208\u0209\7\f\2\2\u0209\u020b\b"+
		"\"\1\2\u020a\u0206\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\5D#\2\u020d\u020e\b\"\1\2\u020e\u0210\3\2\2\2\u020f\u020a\3\2\2"+
		"\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212C"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\5F$\2\u0215\u0221\b#\1\2\u0216"+
		"\u0217\7\r\2\2\u0217\u021b\b#\1\2\u0218\u0219\7\16\2\2\u0219\u021b\b#"+
		"\1\2\u021a\u0216\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\5F$\2\u021d\u021e\b#\1\2\u021e\u0220\3\2\2\2\u021f\u021a\3\2\2"+
		"\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222E"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7\25\2\2\u0225\u0229\b$\1\2\u0226"+
		"\u0227\7\f\2\2\u0227\u0229\b$\1\2\u0228\u0224\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5F$\2\u022b\u022c\b$\1\2\u022c\u0231"+
		"\3\2\2\2\u022d\u022e\5H%\2\u022e\u022f\b$\1\2\u022f\u0231\3\2\2\2\u0230"+
		"\u0228\3\2\2\2\u0230\u022d\3\2\2\2\u0231G\3\2\2\2\u0232\u0233\5J&\2\u0233"+
		"\u0241\b%\1\2\u0234\u0235\7%\2\2\u0235\u0236\5\32\16\2\u0236\u0237\7&"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u0239\b%\1\2\u0239\u0240\3\2\2\2\u023a"+
		"\u023b\7*\2\2\u023b\u023c\5T+\2\u023c\u023d\3\2\2\2\u023d\u023e\b%\1\2"+
		"\u023e\u0240\3\2\2\2\u023f\u0234\3\2\2\2\u023f\u023a\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0251\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0245\7\'\2\2\u0245\u0246\58\35\2\u0246\u0247\7("+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u0249\b%\1\2\u0249\u0250\3\2\2\2\u024a"+
		"\u024b\7*\2\2\u024b\u024c\5T+\2\u024c\u024d\3\2\2\2\u024d\u024e\b%\1\2"+
		"\u024e\u0250\3\2\2\2\u024f\u0244\3\2\2\2\u024f\u024a\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252I\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\5P)\2\u0255\u0256\b&\1\2\u0256\u0266\3\2\2"+
		"\2\u0257\u0258\5T+\2\u0258\u0259\b&\1\2\u0259\u0266\3\2\2\2\u025a\u025b"+
		"\7%\2\2\u025b\u025c\5\32\16\2\u025c\u025d\7&\2\2\u025d\u025e\b&\1\2\u025e"+
		"\u0266\3\2\2\2\u025f\u0260\5L\'\2\u0260\u0261\b&\1\2\u0261\u0266\3\2\2"+
		"\2\u0262\u0263\5N(\2\u0263\u0264\b&\1\2\u0264\u0266\3\2\2\2\u0265\u0254"+
		"\3\2\2\2\u0265\u0257\3\2\2\2\u0265\u025a\3\2\2\2\u0265\u025f\3\2\2\2\u0265"+
		"\u0262\3\2\2\2\u0266K\3\2\2\2\u0267\u0268\7\6\2\2\u0268\u0269\7%\2\2\u0269"+
		"\u026a\58\35\2\u026a\u026b\b\'\1\2\u026b\u026c\7&\2\2\u026cM\3\2\2\2\u026d"+
		"\u026e\7\b\2\2\u026e\u026f\7%\2\2\u026f\u0270\58\35\2\u0270\u0271\7)\2"+
		"\2\u0271\u0272\58\35\2\u0272\u0273\b(\1\2\u0273\u0274\7&\2\2\u0274O\3"+
		"\2\2\2\u0275\u0276\5R*\2\u0276\u0277\b)\1\2\u0277\u027b\3\2\2\2\u0278"+
		"\u0279\7-\2\2\u0279\u027b\b)\1\2\u027a\u0275\3\2\2\2\u027a\u0278\3\2\2"+
		"\2\u027bQ\3\2\2\2\u027c\u027d\7\26\2\2\u027d\u0281\b*\1\2\u027e\u027f"+
		"\7\27\2\2\u027f\u0281\b*\1\2\u0280\u027c\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"S\3\2\2\2\u0282\u0283\7.\2\2\u0283\u0284\b+\1\2\u0284U\3\2\2\2\u0285\u0286"+
		"\7\35\2\2\u0286\u0287\5T+\2\u0287\u0288\b,\1\2\u0288W\3\2\2\2\u0289\u028a"+
		"\7\34\2\2\u028a\u028b\7$\2\2\u028b\u028c\5Z.\2\u028c\u028d\b-\1\2\u028d"+
		"Y\3\2\2\2\u028e\u028f\7\32\2\2\u028f\u029c\b.\1\2\u0290\u0291\7\33\2\2"+
		"\u0291\u029c\b.\1\2\u0292\u0293\5X-\2\u0293\u0294\b.\1\2\u0294\u029c\3"+
		"\2\2\2\u0295\u0296\5V,\2\u0296\u0297\b.\1\2\u0297\u029c\3\2\2\2\u0298"+
		"\u0299\5\\/\2\u0299\u029a\b.\1\2\u029a\u029c\3\2\2\2\u029b\u028e\3\2\2"+
		"\2\u029b\u0290\3\2\2\2\u029b\u0292\3\2\2\2\u029b\u0295\3\2\2\2\u029b\u0298"+
		"\3\2\2\2\u029c[\3\2\2\2\u029d\u029e\7\36\2\2\u029e\u02a4\7\22\2\2\u029f"+
		"\u02a0\7\5\2\2\u02a0\u02a5\b/\1\2\u02a1\u02a2\5^\60\2\u02a2\u02a3\b/\1"+
		"\2\u02a3\u02a5\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02ac\7\20\2\2\u02a7\u02a8\7\5\2\2\u02a8\u02ad\b/\1\2\u02a9"+
		"\u02aa\5Z.\2\u02aa\u02ab\b/\1\2\u02ab\u02ad\3\2\2\2\u02ac\u02a7\3\2\2"+
		"\2\u02ac\u02a9\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\21\2\2\u02af"+
		"\u02b0\b/\1\2\u02b0]\3\2\2\2\u02b1\u02b2\b\60\1\2\u02b2\u02b3\5Z.\2\u02b3"+
		"\u02ba\b\60\1\2\u02b4\u02b5\7)\2\2\u02b5\u02b6\5Z.\2\u02b6\u02b7\b\60"+
		"\1\2\u02b7\u02b9\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb_\3\2\2\2\u02bc\u02ba\3\2\2\2"+
		"Eckv~\u0092\u0099\u009d\u009f\u00a4\u00ad\u00b5\u00ba\u00c1\u00c6\u00ca"+
		"\u00d2\u00da\u00de\u00e6\u00f2\u00f5\u0106\u0109\u0111\u0116\u0118\u0120"+
		"\u0125\u012c\u0134\u013a\u013e\u0143\u014e\u0158\u015e\u016d\u016f\u017c"+
		"\u0184\u0189\u0191\u019c\u01c8\u01d0\u01da\u01e5\u01f1\u01fa\u0201\u020a"+
		"\u0211\u021a\u0221\u0228\u0230\u023f\u0241\u024f\u0251\u0265\u027a\u0280"+
		"\u029b\u02a4\u02ac\u02ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
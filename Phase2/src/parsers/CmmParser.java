// Generated from D:/University/TA_Lessons/Compiler-1400-Fall/Phase2/src/main/grammar\Cmm.g4 by ANTLR 4.9.1
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
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_type = 41, RULE_fptrType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "type", "fptrType"
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
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
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			setState(122);
			match(MAIN);
			setState(123);
			match(LPAR);
			setState(124);
			match(RPAR);
			setState(125);
			body();
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
			setState(127);
			match(STRUCT);
			setState(128);
			identifier();
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(129);
				match(BEGIN);
				setState(130);
				structBody();
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(NEWLINE);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(136);
				match(END);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(NEWLINE);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(143);
				singleStatementStructBody();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(144);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(NEWLINE);
				}
				}
				setState(152); 
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
			setState(154);
			type();
			setState(155);
			identifier();
			setState(156);
			functionArgsDec();
			setState(157);
			match(BEGIN);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(NEWLINE);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(163);
			setBody();
			setState(164);
			getBody();
			setState(165);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(171);
						match(NEWLINE);
						}
						}
						setState(174); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(176);
							singleStatementStructBody();
							setState(177);
							match(SEMICOLON);
							}
							} 
						}
						setState(183);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(184);
					singleStatementStructBody();
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(185);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
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
			setState(192);
			match(GET);
			setState(193);
			body();
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(197); 
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
			setState(199);
			match(SET);
			setState(200);
			body();
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(NEWLINE);
				}
				}
				setState(204); 
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(206);
				type();
				}
				break;
			case VOID:
				{
				setState(207);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			identifier();
			setState(211);
			functionArgsDec();
			setState(212);
			body();
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(218);
			match(LPAR);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(219);
				type();
				setState(220);
				identifier();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					type();
					setState(223);
					identifier();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
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
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(234);
				expression();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					expression();
					}
					}
					setState(241);
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
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(244);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					match(NEWLINE);
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(250);
				singleStatement();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(251);
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
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(256);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(257);
					match(NEWLINE);
					}
					}
					setState(260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(262);
				singleStatement();
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
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
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
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(BEGIN);
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(266);
						match(NEWLINE);
						}
						}
						setState(269); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(271);
							singleStatement();
							setState(272);
							match(SEMICOLON);
							}
							} 
						}
						setState(278);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(279);
					singleStatement();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(280);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				match(NEWLINE);
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(292);
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
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
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
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			type();
			setState(295);
			identifier();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(296);
				match(ASSIGN);
				setState(297);
				orExpression();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				identifier();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(302);
					match(ASSIGN);
					setState(303);
					orExpression();
					}
				}

				}
				}
				setState(310);
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
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
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
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
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
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			otherExpression();
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(318);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(312);
						match(LPAR);
						setState(313);
						functionArguments();
						setState(314);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(316);
						match(DOT);
						setState(317);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(323);
			match(LPAR);
			setState(324);
			functionArguments();
			setState(325);
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
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(RETURN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(328);
				expression();
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
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IF);
			setState(332);
			expression();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(333);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(334);
				body();
				setState(335);
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
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(339);
				match(NEWLINE);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(ELSE);
			setState(346);
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
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(WHILE);
			setState(353);
			expression();
			setState(354);
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
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(DO);
			setState(357);
			body();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(358);
				match(NEWLINE);
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(WHILE);
			setState(365);
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
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(DISPLAY);
			setState(368);
			match(LPAR);
			setState(369);
			expression();
			setState(370);
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
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			orExpression();
			setState(373);
			match(ASSIGN);
			setState(374);
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

	public static class SingleStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				functionCallStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				varDecStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(384);
				size();
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
		public Token op;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			orExpression();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(388);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(389);
				expression();
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
		public Token op;
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
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			andExpression();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(393);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(394);
				andExpression();
				}
				}
				setState(399);
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
		public Token op;
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
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			equalityExpression();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(401);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(402);
				equalityExpression();
				}
				}
				setState(407);
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
		public Token op;
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
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			relationalExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(409);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(410);
				relationalExpression();
				}
				}
				setState(415);
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
		public Token op;
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
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			additiveExpression();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(419);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(417);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					}
					break;
				case LESS_THAN:
					{
					setState(418);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421);
				additiveExpression();
				}
				}
				setState(426);
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
		public Token op;
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
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			multiplicativeExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(430);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(428);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(429);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(432);
				multiplicativeExpression();
				}
				}
				setState(437);
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
		public Token op;
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
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			preUnaryExpression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(439);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					}
					break;
				case DIVIDE:
					{
					setState(440);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
				preUnaryExpression();
				}
				}
				setState(448);
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
		public Token op;
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
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(449);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					}
					break;
				case MINUS:
					{
					setState(450);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453);
				preUnaryExpression();
				}
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
				setState(454);
				accessExpression();
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
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
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
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
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
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
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
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			otherExpression();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(458);
						match(LPAR);
						setState(459);
						functionArguments();
						setState(460);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(462);
						match(DOT);
						setState(463);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(469);
					match(LBRACK);
					setState(470);
					expression();
					setState(471);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(473);
					match(DOT);
					setState(474);
					identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(479);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				identifier();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(LPAR);
				{
				setState(483);
				functionArguments();
				}
				setState(484);
				match(RPAR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				size();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				append();
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
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(SIZE);
			setState(491);
			match(LPAR);
			setState(492);
			expression();
			setState(493);
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
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(APPEND);
			setState(496);
			match(LPAR);
			setState(497);
			expression();
			setState(498);
			match(COMMA);
			setState(499);
			expression();
			setState(500);
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
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				boolValue();
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(INT_VALUE);
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
		enterRule(_localctx, 78, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IdentifierContext extends ParserRuleContext {
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
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IDENTIFIER);
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
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 82, RULE_type);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				match(LIST);
				setState(513);
				match(SHARP);
				setState(514);
				type();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(STRUCT);
				setState(516);
				identifier();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				fptrType();
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
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
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
		enterRule(_localctx, 84, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(FPTR);
			setState(521);
			match(LESS_THAN);
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(522);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(523);
				type();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(524);
					match(COMMA);
					setState(525);
					type();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			match(ARROW);
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(534);
				type();
				}
				break;
			case VOID:
				{
				setState(535);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(538);
			match(GREATER_THAN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u021f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5"+
		"\u0087\n\5\r\5\16\5\u0088\3\5\3\5\3\5\6\5\u008e\n\5\r\5\16\5\u008f\3\5"+
		"\3\5\5\5\u0094\n\5\5\5\u0096\n\5\3\5\6\5\u0099\n\5\r\5\16\5\u009a\3\6"+
		"\3\6\3\6\3\6\3\6\6\6\u00a2\n\6\r\6\16\6\u00a3\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\5\7\u00ac\n\7\3\b\6\b\u00af\n\b\r\b\16\b\u00b0\3\b\3\b\3\b\7\b\u00b6"+
		"\n\b\f\b\16\b\u00b9\13\b\3\b\3\b\5\b\u00bd\n\b\6\b\u00bf\n\b\r\b\16\b"+
		"\u00c0\3\t\3\t\3\t\6\t\u00c6\n\t\r\t\16\t\u00c7\3\n\3\n\3\n\6\n\u00cd"+
		"\n\n\r\n\16\n\u00ce\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\3\13\3\13\6\13"+
		"\u00d9\n\13\r\13\16\13\u00da\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e4\n\f"+
		"\f\f\16\f\u00e7\13\f\5\f\u00e9\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u00f0\n\r\f"+
		"\r\16\r\u00f3\13\r\5\r\u00f5\n\r\3\16\3\16\6\16\u00f9\n\16\r\16\16\16"+
		"\u00fa\3\16\3\16\5\16\u00ff\n\16\5\16\u0101\n\16\3\17\3\17\6\17\u0105"+
		"\n\17\r\17\16\17\u0106\3\17\5\17\u010a\n\17\3\20\3\20\6\20\u010e\n\20"+
		"\r\20\16\20\u010f\3\20\3\20\3\20\7\20\u0115\n\20\f\20\16\20\u0118\13\20"+
		"\3\20\3\20\5\20\u011c\n\20\6\20\u011e\n\20\r\20\16\20\u011f\3\20\6\20"+
		"\u0123\n\20\r\20\16\20\u0124\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u012d"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u0133\n\21\7\21\u0135\n\21\f\21\16\21\u0138"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0141\n\22\f\22\16\22\u0144"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u014c\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0154\n\24\3\25\7\25\u0157\n\25\f\25\16\25\u015a\13"+
		"\25\3\25\3\25\3\25\3\26\3\26\5\26\u0161\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u016a\n\30\f\30\16\30\u016d\13\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0184\n\33\3\34\3\34\3\34\5\34\u0189\n\34\3\35\3"+
		"\35\3\35\7\35\u018e\n\35\f\35\16\35\u0191\13\35\3\36\3\36\3\36\7\36\u0196"+
		"\n\36\f\36\16\36\u0199\13\36\3\37\3\37\3\37\7\37\u019e\n\37\f\37\16\37"+
		"\u01a1\13\37\3 \3 \3 \5 \u01a6\n \3 \7 \u01a9\n \f \16 \u01ac\13 \3!\3"+
		"!\3!\5!\u01b1\n!\3!\7!\u01b4\n!\f!\16!\u01b7\13!\3\"\3\"\3\"\5\"\u01bc"+
		"\n\"\3\"\7\"\u01bf\n\"\f\"\16\"\u01c2\13\"\3#\3#\5#\u01c6\n#\3#\3#\5#"+
		"\u01ca\n#\3$\3$\3$\3$\3$\3$\3$\7$\u01d3\n$\f$\16$\u01d6\13$\3$\3$\3$\3"+
		"$\3$\3$\7$\u01de\n$\f$\16$\u01e1\13$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01eb"+
		"\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u01fb\n(\3)\3"+
		")\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0209\n+\3,\3,\3,\3,\3,\3,\7,\u0211"+
		"\n,\f,\16,\u0214\13,\5,\u0216\n,\3,\3,\3,\5,\u021b\n,\3,\3,\3,\2\2-\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTV\2\3\3\2\26\27\2\u0242\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0081\3"+
		"\2\2\2\n\u009c\3\2\2\2\f\u00ab\3\2\2\2\16\u00be\3\2\2\2\20\u00c2\3\2\2"+
		"\2\22\u00c9\3\2\2\2\24\u00d2\3\2\2\2\26\u00dc\3\2\2\2\30\u00f4\3\2\2\2"+
		"\32\u0100\3\2\2\2\34\u0109\3\2\2\2\36\u010b\3\2\2\2 \u0128\3\2\2\2\"\u0139"+
		"\3\2\2\2$\u0149\3\2\2\2&\u014d\3\2\2\2(\u0158\3\2\2\2*\u0160\3\2\2\2,"+
		"\u0162\3\2\2\2.\u0166\3\2\2\2\60\u0171\3\2\2\2\62\u0176\3\2\2\2\64\u0183"+
		"\3\2\2\2\66\u0185\3\2\2\28\u018a\3\2\2\2:\u0192\3\2\2\2<\u019a\3\2\2\2"+
		">\u01a2\3\2\2\2@\u01ad\3\2\2\2B\u01b8\3\2\2\2D\u01c9\3\2\2\2F\u01cb\3"+
		"\2\2\2H\u01ea\3\2\2\2J\u01ec\3\2\2\2L\u01f1\3\2\2\2N\u01fa\3\2\2\2P\u01fc"+
		"\3\2\2\2R\u01fe\3\2\2\2T\u0208\3\2\2\2V\u020a\3\2\2\2XZ\7,\2\2YX\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_c\b\2"+
		"\1\2`b\7,\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2"+
		"\2\2fg\7\2\2\3g\3\3\2\2\2hn\b\3\1\2ij\5\b\5\2jk\b\3\1\2km\3\2\2\2li\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2qr\5\24\13\2r"+
		"s\b\3\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2{\5\3\2\2\2|}\7\3\2\2}~\7%\2\2~\177\7&\2"+
		"\2\177\u0080\5\32\16\2\u0080\7\3\2\2\2\u0081\u0082\7\35\2\2\u0082\u0095"+
		"\5R*\2\u0083\u0084\7\30\2\2\u0084\u0086\5\16\b\2\u0085\u0087\7,\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\31\2\2\u008b\u0096\3\2\2\2\u008c"+
		"\u008e\7,\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\5\f\7\2\u0092"+
		"\u0094\7+\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0083\3\2\2\2\u0095\u008d\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\7,\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\t\3\2\2\2\u009c\u009d\5T+\2\u009d\u009e"+
		"\5R*\2\u009e\u009f\5\26\f\2\u009f\u00a1\7\30\2\2\u00a0\u00a2\7,\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\5\20\t\2\u00a7"+
		"\u00a8\7\31\2\2\u00a8\13\3\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ac\5\n\6"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00af"+
		"\7,\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7+"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\5\f\7\2\u00bb\u00bd\7+\2\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ae\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c3"+
		"\7\37\2\2\u00c3\u00c5\5\32\16\2\u00c4\u00c6\7,\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\21"+
		"\3\2\2\2\u00c9\u00ca\7 \2\2\u00ca\u00cc\5\32\16\2\u00cb\u00cd\7,\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\23\3\2\2\2\u00d0\u00d3\5T+\2\u00d1\u00d3\7\5\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5R*\2\u00d5"+
		"\u00d6\5\26\f\2\u00d6\u00d8\5\32\16\2\u00d7\u00d9\7,\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\25\3\2\2\2\u00dc\u00e8\7%\2\2\u00dd\u00de\5T+\2\u00de\u00e5\5R*\2\u00df"+
		"\u00e0\7)\2\2\u00e0\u00e1\5T+\2\u00e1\u00e2\5R*\2\u00e2\u00e4\3\2\2\2"+
		"\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7&\2\2\u00eb\27\3\2\2\2"+
		"\u00ec\u00f1\5\66\34\2\u00ed\u00ee\7)\2\2\u00ee\u00f0\5\66\34\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\31\3\2\2\2\u00f6\u0101\5\36\20\2\u00f7\u00f9\7,\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5\64\33\2\u00fd\u00ff\7+\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00f6"+
		"\3\2\2\2\u0100\u00f8\3\2\2\2\u0101\33\3\2\2\2\u0102\u010a\5\36\20\2\u0103"+
		"\u0105\7,\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\5\64\33\2\u0109"+
		"\u0102\3\2\2\2\u0109\u0104\3\2\2\2\u010a\35\3\2\2\2\u010b\u011d\7\30\2"+
		"\2\u010c\u010e\7,\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0116\3\2\2\2\u0111\u0112\5\64\33\2"+
		"\u0112\u0113\7+\2\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\5\64\33\2\u011a\u011c\7+\2\2\u011b\u011a\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u010d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u0123\7,\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\31"+
		"\2\2\u0127\37\3\2\2\2\u0128\u0129\5T+\2\u0129\u012c\5R*\2\u012a\u012b"+
		"\7#\2\2\u012b\u012d\58\35\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0136\3\2\2\2\u012e\u012f\7)\2\2\u012f\u0132\5R*\2\u0130\u0131\7#\2\2"+
		"\u0131\u0133\58\35\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u012e\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137!\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0142\5H%\2\u013a"+
		"\u013b\7%\2\2\u013b\u013c\5\30\r\2\u013c\u013d\7&\2\2\u013d\u0141\3\2"+
		"\2\2\u013e\u013f\7*\2\2\u013f\u0141\5R*\2\u0140\u013a\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7%\2\2\u0146\u0147\5\30"+
		"\r\2\u0147\u0148\7&\2\2\u0148#\3\2\2\2\u0149\u014b\7\4\2\2\u014a\u014c"+
		"\5\66\34\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c%\3\2\2\2\u014d"+
		"\u014e\7\t\2\2\u014e\u0153\5\66\34\2\u014f\u0154\5\34\17\2\u0150\u0151"+
		"\5\32\16\2\u0151\u0152\5(\25\2\u0152\u0154\3\2\2\2\u0153\u014f\3\2\2\2"+
		"\u0153\u0150\3\2\2\2\u0154\'\3\2\2\2\u0155\u0157\7,\2\2\u0156\u0155\3"+
		"\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\n\2\2\u015c\u015d\5\34"+
		"\17\2\u015d)\3\2\2\2\u015e\u0161\5,\27\2\u015f\u0161\5.\30\2\u0160\u015e"+
		"\3\2\2\2\u0160\u015f\3\2\2\2\u0161+\3\2\2\2\u0162\u0163\7!\2\2\u0163\u0164"+
		"\5\66\34\2\u0164\u0165\5\34\17\2\u0165-\3\2\2\2\u0166\u0167\7\"\2\2\u0167"+
		"\u016b\5\32\16\2\u0168\u016a\7,\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3"+
		"\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7!\2\2\u016f\u0170\5\66\34\2\u0170/\3\2\2\2"+
		"\u0171\u0172\7\7\2\2\u0172\u0173\7%\2\2\u0173\u0174\5\66\34\2\u0174\u0175"+
		"\7&\2\2\u0175\61\3\2\2\2\u0176\u0177\58\35\2\u0177\u0178\7#\2\2\u0178"+
		"\u0179\5\66\34\2\u0179\63\3\2\2\2\u017a\u0184\5&\24\2\u017b\u0184\5\60"+
		"\31\2\u017c\u0184\5\"\22\2\u017d\u0184\5$\23\2\u017e\u0184\5\62\32\2\u017f"+
		"\u0184\5 \21\2\u0180\u0184\5*\26\2\u0181\u0184\5L\'\2\u0182\u0184\5J&"+
		"\2\u0183\u017a\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u017d"+
		"\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\65\3\2\2\2\u0185\u0188\58\35"+
		"\2\u0186\u0187\7#\2\2\u0187\u0189\5\66\34\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\67\3\2\2\2\u018a\u018f\5:\36\2\u018b\u018c\7\24\2"+
		"\2\u018c\u018e\5:\36\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u01909\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0197\5<\37\2\u0193\u0194\7\23\2\2\u0194\u0196\5<\37\2\u0195\u0193\3"+
		"\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		";\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019f\5> \2\u019b\u019c\7\17\2\2\u019c"+
		"\u019e\5> \2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0=\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01aa"+
		"\5@!\2\u01a3\u01a6\7\21\2\2\u01a4\u01a6\7\22\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\5@!\2\u01a8\u01a5\3\2\2"+
		"\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab?"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b5\5B\"\2\u01ae\u01b1\7\13\2\2\u01af"+
		"\u01b1\7\f\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\5B\"\2\u01b3\u01b0\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6A\3\2\2\2\u01b7\u01b5\3\2\2\2"+
		"\u01b8\u01c0\5D#\2\u01b9\u01bc\7\r\2\2\u01ba\u01bc\7\16\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5D#\2\u01be"+
		"\u01bb\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1C\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\7\25\2\2\u01c4\u01c6"+
		"\7\f\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01ca\5D#\2\u01c8\u01ca\5F$\2\u01c9\u01c5\3\2\2\2\u01c9\u01c8\3\2\2\2"+
		"\u01caE\3\2\2\2\u01cb\u01d4\5H%\2\u01cc\u01cd\7%\2\2\u01cd\u01ce\5\30"+
		"\r\2\u01ce\u01cf\7&\2\2\u01cf\u01d3\3\2\2\2\u01d0\u01d1\7*\2\2\u01d1\u01d3"+
		"\5R*\2\u01d2\u01cc\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01df\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01d9\5\66\34\2\u01d9\u01da\7(\2\2\u01da"+
		"\u01de\3\2\2\2\u01db\u01dc\7*\2\2\u01dc\u01de\5R*\2\u01dd\u01d7\3\2\2"+
		"\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0G\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01eb\5N(\2\u01e3\u01eb"+
		"\5R*\2\u01e4\u01e5\7%\2\2\u01e5\u01e6\5\30\r\2\u01e6\u01e7\7&\2\2\u01e7"+
		"\u01eb\3\2\2\2\u01e8\u01eb\5J&\2\u01e9\u01eb\5L\'\2\u01ea\u01e2\3\2\2"+
		"\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01ebI\3\2\2\2\u01ec\u01ed\7\6\2\2\u01ed\u01ee\7%\2\2\u01ee\u01ef"+
		"\5\66\34\2\u01ef\u01f0\7&\2\2\u01f0K\3\2\2\2\u01f1\u01f2\7\b\2\2\u01f2"+
		"\u01f3\7%\2\2\u01f3\u01f4\5\66\34\2\u01f4\u01f5\7)\2\2\u01f5\u01f6\5\66"+
		"\34\2\u01f6\u01f7\7&\2\2\u01f7M\3\2\2\2\u01f8\u01fb\5P)\2\u01f9\u01fb"+
		"\7-\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbO\3\2\2\2\u01fc\u01fd"+
		"\t\2\2\2\u01fdQ\3\2\2\2\u01fe\u01ff\7.\2\2\u01ffS\3\2\2\2\u0200\u0209"+
		"\7\32\2\2\u0201\u0209\7\33\2\2\u0202\u0203\7\34\2\2\u0203\u0204\7$\2\2"+
		"\u0204\u0209\5T+\2\u0205\u0206\7\35\2\2\u0206\u0209\5R*\2\u0207\u0209"+
		"\5V,\2\u0208\u0200\3\2\2\2\u0208\u0201\3\2\2\2\u0208\u0202\3\2\2\2\u0208"+
		"\u0205\3\2\2\2\u0208\u0207\3\2\2\2\u0209U\3\2\2\2\u020a\u020b\7\36\2\2"+
		"\u020b\u0215\7\22\2\2\u020c\u0216\7\5\2\2\u020d\u0212\5T+\2\u020e\u020f"+
		"\7)\2\2\u020f\u0211\5T+\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u020c\3\2\2\2\u0215\u020d\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u021a\7\20\2\2\u0218\u021b\5T+\2\u0219\u021b\7\5\2\2\u021a\u0218\3\2"+
		"\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7\21\2\2\u021d"+
		"W\3\2\2\2D[cnv\u0088\u008f\u0093\u0095\u009a\u00a3\u00ab\u00b0\u00b7\u00bc"+
		"\u00c0\u00c7\u00ce\u00d2\u00da\u00e5\u00e8\u00f1\u00f4\u00fa\u00fe\u0100"+
		"\u0106\u0109\u010f\u0116\u011b\u011f\u0124\u012c\u0132\u0136\u0140\u0142"+
		"\u014b\u0153\u0158\u0160\u016b\u0183\u0188\u018f\u0197\u019f\u01a5\u01aa"+
		"\u01b0\u01b5\u01bb\u01c0\u01c5\u01c9\u01d2\u01d4\u01dd\u01df\u01ea\u01fa"+
		"\u0208\u0212\u0215\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
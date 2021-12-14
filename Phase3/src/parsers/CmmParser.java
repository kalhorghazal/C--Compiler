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
			     _localctx.programRet.setLine(1);
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
		public Token m;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
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
			((MainContext)_localctx).mainRet =  new MainDeclaration();
			setState(123);
			((MainContext)_localctx).m = match(MAIN);
			setState(124);
			match(LPAR);
			setState(125);
			match(RPAR);
			setState(126);
			((MainContext)_localctx).b = body();
			_localctx.mainRet.setLine(((MainContext)_localctx).m.getLine());
			     _localctx.mainRet.setBody(((MainContext)_localctx).b.bodyRet);
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
		public Token s;
		public IdentifierContext id;
		public Token b;
		public StructBodyContext sb;
		public SingleStatementStructBodyContext sss;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
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
			((StructDeclarationContext)_localctx).structDeclarationRet =  new StructDeclaration();
			setState(130);
			((StructDeclarationContext)_localctx).s = match(STRUCT);
			setState(131);
			((StructDeclarationContext)_localctx).id = identifier();

			    _localctx.structDeclarationRet.setLine(((StructDeclarationContext)_localctx).s.getLine());
			    _localctx.structDeclarationRet.setStructName(((StructDeclarationContext)_localctx).id.identifierRet);
			    
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(133);
				((StructDeclarationContext)_localctx).b = match(BEGIN);
				setState(134);
				((StructDeclarationContext)_localctx).sb = structBody();

				    ((StructDeclarationContext)_localctx).sb.structBodyRet.setLine(((StructDeclarationContext)_localctx).b.getLine());
				    _localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).sb.structBodyRet);
				    
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(NEWLINE);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(141);
				match(END);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(NEWLINE);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(148);
				((StructDeclarationContext)_localctx).sss = singleStatementStructBody();

				    _localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).sss.stmt);
				    
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(150);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(NEWLINE);
				}
				}
				setState(158); 
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
		public SetGetVarDeclaration singleVarWithGetAndSetRet;
		public TypeContext t;
		public IdentifierContext id;
		public FunctionArgsDecContext fa;
		public SetBodyContext sb;
		public GetBodyContext gb;
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
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
			((SingleVarWithGetAndSetContext)_localctx).singleVarWithGetAndSetRet =  new SetGetVarDeclaration();
			setState(161);
			((SingleVarWithGetAndSetContext)_localctx).t = type();
			setState(162);
			((SingleVarWithGetAndSetContext)_localctx).id = identifier();

			    _localctx.singleVarWithGetAndSetRet.setLine(((SingleVarWithGetAndSetContext)_localctx).id.identifierRet.getLine());
			    _localctx.singleVarWithGetAndSetRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).id.identifierRet);
			    _localctx.singleVarWithGetAndSetRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).t.typeRet);
			    
			setState(164);
			((SingleVarWithGetAndSetContext)_localctx).fa = functionArgsDec();

			    ArrayList<VariableDeclaration> args = ((SingleVarWithGetAndSetContext)_localctx).fa.functionArgsDecRet;
			    _localctx.singleVarWithGetAndSetRet.setArgs(args);
			    
			setState(166);
			match(BEGIN);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(NEWLINE);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(172);
			((SingleVarWithGetAndSetContext)_localctx).sb = setBody();

			    _localctx.singleVarWithGetAndSetRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).sb.setBodyRet);
			    
			setState(174);
			((SingleVarWithGetAndSetContext)_localctx).gb = getBody();

			    _localctx.singleVarWithGetAndSetRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).gb.getBodyRet);
			    
			setState(176);
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
		public Statement stmt;
		public VarDecStatementContext v;
		public SingleVarWithGetAndSetContext s;
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((SingleStatementStructBodyContext)_localctx).v = varDecStatement();
				((SingleStatementStructBodyContext)_localctx).stmt =  ((SingleStatementStructBodyContext)_localctx).v.varDecStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((SingleStatementStructBodyContext)_localctx).s = singleVarWithGetAndSet();
				((SingleStatementStructBodyContext)_localctx).stmt =  ((SingleStatementStructBodyContext)_localctx).s.singleVarWithGetAndSetRet;
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
		public BlockStmt structBodyRet;
		public SingleStatementStructBodyContext s1;
		public SingleStatementStructBodyContext s2;
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

			     ((StructBodyContext)_localctx).structBodyRet =  new BlockStmt();
			    
			setState(206); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(187);
						match(NEWLINE);
						}
						}
						setState(190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(192);
							((StructBodyContext)_localctx).s1 = singleStatementStructBody();

							    _localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).s1.stmt);
							    
							setState(194);
							match(SEMICOLON);
							}
							} 
						}
						setState(200);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(201);
					((StructBodyContext)_localctx).s2 = singleStatementStructBody();

					    _localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).s2.stmt);
					    
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(203);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208); 
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
			setState(210);
			match(GET);
			setState(211);
			((GetBodyContext)_localctx).b = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).b.bodyRet;
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
			setState(218);
			match(SET);
			setState(219);
			((SetBodyContext)_localctx).b = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).b.bodyRet;
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(NEWLINE);
				}
				}
				setState(224); 
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
		public TypeContext t;
		public IdentifierContext id;
		public FunctionArgsDecContext f;
		public BodyContext b;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			((FunctionDeclarationContext)_localctx).functionDeclarationRet =  new FunctionDeclaration();
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(227);
				((FunctionDeclarationContext)_localctx).t = type();

				    _localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).t.typeRet);
				    
				}
				break;
			case VOID:
				{
				setState(230);
				match(VOID);

				    _localctx.functionDeclarationRet.setReturnType(new VoidType());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
			((FunctionDeclarationContext)_localctx).id = identifier();
			setState(235);
			((FunctionDeclarationContext)_localctx).f = functionArgsDec();
			setState(236);
			((FunctionDeclarationContext)_localctx).b = body();

			    _localctx.functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).id.identifierRet.getLine());
			    _localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).id.identifierRet);
			    _localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).f.functionArgsDecRet);
			    _localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet);
			    
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				match(NEWLINE);
				}
				}
				setState(241); 
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
		public ArrayList<VariableDeclaration> functionArgsDecRet;
		public TypeContext t1;
		public IdentifierContext id1;
		public TypeContext t2;
		public IdentifierContext id2;
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
			((FunctionArgsDecContext)_localctx).functionArgsDecRet =  new ArrayList<>();
			setState(244);
			match(LPAR);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(245);
				((FunctionArgsDecContext)_localctx).t1 = type();
				setState(246);
				((FunctionArgsDecContext)_localctx).id1 = identifier();

				    VariableDeclaration newVarDec = new VariableDeclaration(((FunctionArgsDecContext)_localctx).id1.identifierRet, ((FunctionArgsDecContext)_localctx).t1.typeRet);
				    newVarDec.setLine(((FunctionArgsDecContext)_localctx).id1.identifierRet.getLine());
				    _localctx.functionArgsDecRet.add(newVarDec);
				    
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(248);
					match(COMMA);
					setState(249);
					((FunctionArgsDecContext)_localctx).t2 = type();
					setState(250);
					((FunctionArgsDecContext)_localctx).id2 = identifier();

					    newVarDec = new VariableDeclaration(((FunctionArgsDecContext)_localctx).id2.identifierRet, ((FunctionArgsDecContext)_localctx).t2.typeRet);
					    newVarDec.setLine(((FunctionArgsDecContext)_localctx).id2.identifierRet.getLine());
					    _localctx.functionArgsDecRet.add(newVarDec); 
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260);
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
		public ArrayList<Expression> funcArgRet;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
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
			((FunctionArgumentsContext)_localctx).funcArgRet =  new ArrayList<>();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(263);
				((FunctionArgumentsContext)_localctx).exp1 = expression();
				_localctx.funcArgRet.add(((FunctionArgumentsContext)_localctx).exp1.exprRet);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					((FunctionArgumentsContext)_localctx).exp2 = expression();
					_localctx.funcArgRet.add(((FunctionArgumentsContext)_localctx).exp2.exprRet);
					}
					}
					setState(273);
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
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(276);
				((BodyContext)_localctx).b = blockStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(279);
					match(NEWLINE);
					}
					}
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(284);
				((BodyContext)_localctx).s = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).s.singleStatementRet;
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(286);
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
		public Statement stmtRet;
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
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(291);
				((LoopCondBodyContext)_localctx).b = blockStatement();
				((LoopCondBodyContext)_localctx).stmtRet =  ((LoopCondBodyContext)_localctx).b.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					match(NEWLINE);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(299);
				((LoopCondBodyContext)_localctx).s = singleStatement();
				((LoopCondBodyContext)_localctx).stmtRet =  ((LoopCondBodyContext)_localctx).s.singleStatementRet;
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
		public BlockStmt blockStatementRet;
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
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockStatementContext)_localctx).blockStatementRet =  new BlockStmt();
			setState(305);
			((BlockStatementContext)_localctx).b = match(BEGIN);

			    _localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).b.getLine());
			    
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(307);
						match(NEWLINE);
						}
						}
						setState(310); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(312);
							((BlockStatementContext)_localctx).s1 = singleStatement();

							    _localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).s1.singleStatementRet);
							    
							setState(314);
							match(SEMICOLON);
							}
							} 
						}
						setState(320);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(321);
					((BlockStatementContext)_localctx).s2 = singleStatement();

					    _localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).s2.singleStatementRet);
					    
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(323);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				match(NEWLINE);
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(335);
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
		public VarDecStmt varDecStatementRet;
		public TypeContext t;
		public IdentifierContext id1;
		public OrExpressionContext exp1;
		public IdentifierContext id2;
		public OrExpressionContext exp2;
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
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VarDecStatementContext)_localctx).varDecStatementRet =  new VarDecStmt();
			setState(338);
			((VarDecStatementContext)_localctx).t = type();
			setState(339);
			((VarDecStatementContext)_localctx).id1 = identifier();

			    VariableDeclaration newVarDec = new VariableDeclaration(((VarDecStatementContext)_localctx).id1.identifierRet, ((VarDecStatementContext)_localctx).t.typeRet);
			    newVarDec.setLine(((VarDecStatementContext)_localctx).id1.identifierRet.getLine());
			    _localctx.varDecStatementRet.setLine(newVarDec.getLine());
			    
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(341);
				match(ASSIGN);
				setState(342);
				((VarDecStatementContext)_localctx).exp1 = orExpression();
				newVarDec.setDefaultValue(((VarDecStatementContext)_localctx).exp1.orExprRet);
				}
			}

			_localctx.varDecStatementRet.addVar(newVarDec);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				((VarDecStatementContext)_localctx).id2 = identifier();

				    newVarDec = new VariableDeclaration(((VarDecStatementContext)_localctx).id2.identifierRet, ((VarDecStatementContext)_localctx).t.typeRet);
				    newVarDec.setLine(((VarDecStatementContext)_localctx).id2.identifierRet.getLine());
				    
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(351);
					match(ASSIGN);
					setState(352);
					((VarDecStatementContext)_localctx).exp2 = orExpression();
					newVarDec.setDefaultValue(((VarDecStatementContext)_localctx).exp2.orExprRet);
					}
				}

				_localctx.varDecStatementRet.addVar(newVarDec);
				}
				}
				setState(363);
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
		public Expression expr;
		public FunctionCall fcall;
		public OtherExpressionContext oth;
		public Token l;
		public FunctionArgumentsContext f;
		public IdentifierContext i;
		public Token ll;
		public FunctionArgumentsContext ff;
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
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((FunctionCallStmtContext)_localctx).oth = otherExpression();
			((FunctionCallStmtContext)_localctx).expr =  ((FunctionCallStmtContext)_localctx).oth.expr;
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(375);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(366);
						((FunctionCallStmtContext)_localctx).l = match(LPAR);
						setState(367);
						((FunctionCallStmtContext)_localctx).f = functionArguments();
						setState(368);
						match(RPAR);
						((FunctionCallStmtContext)_localctx).expr =  new FunctionCall(_localctx.expr, ((FunctionCallStmtContext)_localctx).f.funcArgRet);
						      _localctx.expr.setLine(((FunctionCallStmtContext)_localctx).l.getLine());
						}
						}
						break;
					case DOT:
						{
						{
						setState(371);
						match(DOT);
						setState(372);
						((FunctionCallStmtContext)_localctx).i = identifier();
						((FunctionCallStmtContext)_localctx).expr =  new StructAccess(_localctx.expr, ((FunctionCallStmtContext)_localctx).i.identifierRet);
						       _localctx.expr.setLine(((FunctionCallStmtContext)_localctx).i.line);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(380);
			((FunctionCallStmtContext)_localctx).ll = match(LPAR);
			setState(381);
			((FunctionCallStmtContext)_localctx).ff = functionArguments();
			setState(382);
			match(RPAR);
			((FunctionCallStmtContext)_localctx).fcall =  new FunctionCall(_localctx.expr, ((FunctionCallStmtContext)_localctx).ff.funcArgRet);
			      _localctx.fcall.setLine(((FunctionCallStmtContext)_localctx).ll.getLine());
			}
			((FunctionCallStmtContext)_localctx).functionCallStmtRet =  new FunctionCallStmt(_localctx.fcall);
			      _localctx.functionCallStmtRet.setLine(_localctx.fcall.getLine());
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
		public ReturnStmt returnStatementRet;
		public Token r;
		public ExpressionContext exp;
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
			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			setState(388);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			_localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(390);
				((ReturnStatementContext)_localctx).exp = expression();
				_localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).exp.exprRet);
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
		public ConditionalStmt ifStatementRet;
		public Token cond;
		public ExpressionContext exp;
		public LoopCondBodyContext body1;
		public BodyContext body2;
		public ElseStatementContext elsest;
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
			setState(395);
			((IfStatementContext)_localctx).cond = match(IF);
			setState(396);
			((IfStatementContext)_localctx).exp = expression();
			((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).exp.exprRet);
			     _localctx.ifStatementRet.setLine(((IfStatementContext)_localctx).cond.getLine());
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(398);
				((IfStatementContext)_localctx).body1 = loopCondBody();
				_localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).body1.stmtRet);
				}
				break;
			case 2:
				{
				setState(401);
				((IfStatementContext)_localctx).body2 = body();
				_localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).body2.bodyRet);
				setState(403);
				((IfStatementContext)_localctx).elsest = elseStatement();
				_localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).elsest.stmt);
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
		public Statement stmt;
		public LoopCondBodyContext bd;
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
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(408);
				match(NEWLINE);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(ELSE);
			setState(415);
			((ElseStatementContext)_localctx).bd = loopCondBody();
			((ElseStatementContext)_localctx).stmt =  ((ElseStatementContext)_localctx).bd.stmtRet;
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
		public LoopStmt loopStatementRet;
		public WhileLoopStatementContext st1;
		public DoWhileLoopStatementContext st2;
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
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				((LoopStatementContext)_localctx).st1 = whileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).st1.stmt;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((LoopStatementContext)_localctx).st2 = doWhileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).st2.stmt;
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
		public LoopStmt stmt;
		public Token w;
		public ExpressionContext exp;
		public LoopCondBodyContext bd;
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
			((WhileLoopStatementContext)_localctx).stmt =  new LoopStmt();
			setState(427);
			((WhileLoopStatementContext)_localctx).w = match(WHILE);
			setState(428);
			((WhileLoopStatementContext)_localctx).exp = expression();
			_localctx.stmt.setCondition(((WhileLoopStatementContext)_localctx).exp.exprRet);
			     _localctx.stmt.setLine(((WhileLoopStatementContext)_localctx).w.getLine());
			setState(430);
			((WhileLoopStatementContext)_localctx).bd = loopCondBody();
			_localctx.stmt.setBody(((WhileLoopStatementContext)_localctx).bd.stmtRet);
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
		public LoopStmt stmt;
		public Token d;
		public BodyContext bd;
		public ExpressionContext exp;
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			((DoWhileLoopStatementContext)_localctx).stmt =  new LoopStmt();
			setState(434);
			((DoWhileLoopStatementContext)_localctx).d = match(DO);
			setState(435);
			((DoWhileLoopStatementContext)_localctx).bd = body();
			_localctx.stmt.setBody(((DoWhileLoopStatementContext)_localctx).bd.bodyRet);
			     _localctx.stmt.setLine(((DoWhileLoopStatementContext)_localctx).d.getLine());
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(437);
				match(NEWLINE);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(WHILE);
			setState(444);
			((DoWhileLoopStatementContext)_localctx).exp = expression();
			_localctx.stmt.setCondition(((DoWhileLoopStatementContext)_localctx).exp.exprRet);
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
		public DisplayStmt displayStatementRet;
		public Token dis;
		public ExpressionContext exp;
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
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			((DisplayStatementContext)_localctx).dis = match(DISPLAY);
			setState(448);
			match(LPAR);
			setState(449);
			((DisplayStatementContext)_localctx).exp = expression();
			((DisplayStatementContext)_localctx).displayStatementRet =  new DisplayStmt(((DisplayStatementContext)_localctx).exp.exprRet);
			   _localctx.displayStatementRet.setLine(((DisplayStatementContext)_localctx).dis.getLine());
			setState(451);
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
		public AssignmentStmt assignmentStatementRet;
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
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((AssignmentStatementContext)_localctx).left = orExpression();
			setState(454);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(455);
			((AssignmentStatementContext)_localctx).right = expression();
			((AssignmentStatementContext)_localctx).assignmentStatementRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).left.orExprRet, ((AssignmentStatementContext)_localctx).right.exprRet);
			     _localctx.assignmentStatementRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
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
		public Statement singleStatementRet;
		public IfStatementContext i;
		public DisplayStatementContext d;
		public FunctionCallStmtContext f;
		public ReturnStatementContext r;
		public AssignmentStatementContext a;
		public VarDecStatementContext v;
		public LoopStatementContext l;
		public AppendContext ap;
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
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				((SingleStatementContext)_localctx).i = ifStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).i.ifStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				((SingleStatementContext)_localctx).d = displayStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).d.displayStatementRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				((SingleStatementContext)_localctx).f = functionCallStmt();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).f.functionCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				((SingleStatementContext)_localctx).r = returnStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).r.returnStatementRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				((SingleStatementContext)_localctx).a = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).a.assignmentStatementRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				((SingleStatementContext)_localctx).v = varDecStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).v.varDecStatementRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(476);
				((SingleStatementContext)_localctx).l = loopStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).l.loopStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(479);
				((SingleStatementContext)_localctx).ap = append();
				ListAppendStmt listAppend = new ListAppendStmt(((SingleStatementContext)_localctx).ap.appendRet);
				     listAppend.setLine(((SingleStatementContext)_localctx).ap.line);
				     ((SingleStatementContext)_localctx).singleStatementRet =  listAppend;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(482);
				((SingleStatementContext)_localctx).s = size();
				ListSizeStmt listSize = new ListSizeStmt(((SingleStatementContext)_localctx).s.sizeRet);
				     listSize.setLine(((SingleStatementContext)_localctx).s.line);
				     ((SingleStatementContext)_localctx).singleStatementRet =  listSize;
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
		public OrExpressionContext expl;
		public Token op;
		public ExpressionContext expr;
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			((ExpressionContext)_localctx).expl = orExpression();
			((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).expl.orExprRet;
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(489);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(490);
				((ExpressionContext)_localctx).expr = expression();

				        BinaryOperator opr = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).exprRet =  new BinaryExpression(((ExpressionContext)_localctx).expl.orExprRet, ((ExpressionContext)_localctx).expr.exprRet, opr);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).op.getLine());
				    
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
		public AndExpressionContext expl;
		public Token op;
		public AndExpressionContext expr;
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
			setState(495);
			((OrExpressionContext)_localctx).expl = andExpression();
			((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).expl.andExprRet;
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(497);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(498);
				((OrExpressionContext)_localctx).expr = andExpression();

				        BinaryOperator opr = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(((OrExpressionContext)_localctx).expl.andExprRet, ((OrExpressionContext)_localctx).expr.andExprRet, opr);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).op.getLine());
				    
				}
				}
				setState(505);
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
		public EqualityExpressionContext expl;
		public Token op;
		public EqualityExpressionContext expr;
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
			setState(506);
			((AndExpressionContext)_localctx).expl = equalityExpression();
			((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).expl.equalityExprRet;
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(508);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(509);
				((AndExpressionContext)_localctx).expr = equalityExpression();

				        BinaryOperator opr = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).expr.equalityExprRet, opr);
				        _localctx.andExprRet.setLine(((AndExpressionContext)_localctx).op.getLine());
				    
				}
				}
				setState(516);
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
		public Expression equalityExprRet;
		public RelationalExpressionContext expl;
		public Token op;
		public RelationalExpressionContext expr;
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
			setState(517);
			((EqualityExpressionContext)_localctx).expl = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExprRet =  ((EqualityExpressionContext)_localctx).expl.relationalExprRet;
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(519);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(520);
				((EqualityExpressionContext)_localctx).expr = relationalExpression();

				        BinaryOperator opr = BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).equalityExprRet =  new BinaryExpression(_localctx.equalityExprRet, ((EqualityExpressionContext)_localctx).expr.relationalExprRet, opr);
				        _localctx.equalityExprRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());
				    
				}
				}
				setState(527);
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
		public Expression relationalExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext l;
		public Token op1;
		public Token op2;
		public AdditiveExpressionContext r;
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
			setState(528);
			((RelationalExpressionContext)_localctx).l = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExprRet =  ((RelationalExpressionContext)_localctx).l.expr;
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(534);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(530);
					((RelationalExpressionContext)_localctx).op1 = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					    ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).op1.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(532);
					((RelationalExpressionContext)_localctx).op2 = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					     ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).op2.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(536);
				((RelationalExpressionContext)_localctx).r = additiveExpression();
				((RelationalExpressionContext)_localctx).relationalExprRet =  new BinaryExpression(_localctx.relationalExprRet,((RelationalExpressionContext)_localctx).r.expr,_localctx.op);
				     _localctx.relationalExprRet.setLine(_localctx.line);
				}
				}
				setState(543);
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
		public Expression expr;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext l;
		public Token op1;
		public Token op2;
		public MultiplicativeExpressionContext r;
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
			setState(544);
			((AdditiveExpressionContext)_localctx).l = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).expr =  ((AdditiveExpressionContext)_localctx).l.expr;
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(546);
					((AdditiveExpressionContext)_localctx).op1 = match(PLUS);
					((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					     ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).op1.getLine();
					}
					break;
				case MINUS:
					{
					setState(548);
					((AdditiveExpressionContext)_localctx).op2 = match(MINUS);
					((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					     ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).op2.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552);
				((AdditiveExpressionContext)_localctx).r = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).expr =  new BinaryExpression(_localctx.expr,((AdditiveExpressionContext)_localctx).r.expr,_localctx.op);
				     _localctx.expr.setLine(_localctx.line);
				}
				}
				setState(559);
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
		public Expression expr;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext l;
		public Token op1;
		public Token op2;
		public PreUnaryExpressionContext r;
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
			setState(560);
			((MultiplicativeExpressionContext)_localctx).l = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).expr =  ((MultiplicativeExpressionContext)_localctx).l.expr;
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(566);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(562);
					((MultiplicativeExpressionContext)_localctx).op1 = match(MULT);
					((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					     ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).op1.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(564);
					((MultiplicativeExpressionContext)_localctx).op2 = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					     ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).op2.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(568);
				((MultiplicativeExpressionContext)_localctx).r = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).expr =  new BinaryExpression(_localctx.expr,((MultiplicativeExpressionContext)_localctx).r.expr,_localctx.op);
				    _localctx.expr.setLine(_localctx.line);
				}
				}
				setState(575);
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
		public Expression expr;
		public UnaryOperator op;
		public int line;
		public Token op1;
		public Token op2;
		public PreUnaryExpressionContext pre;
		public AccessExpressionContext ac;
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
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(580);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(576);
					((PreUnaryExpressionContext)_localctx).op1 = match(NOT);
					((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					     ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op1.getLine();
					}
					break;
				case MINUS:
					{
					setState(578);
					((PreUnaryExpressionContext)_localctx).op2 = match(MINUS);
					((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					     ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op2.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(582);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();
				((PreUnaryExpressionContext)_localctx).expr =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.expr, _localctx.op);
				     _localctx.expr.setLine(_localctx.line);
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
				setState(585);
				((PreUnaryExpressionContext)_localctx).ac = accessExpression();
				((PreUnaryExpressionContext)_localctx).expr =  ((PreUnaryExpressionContext)_localctx).ac.expr;
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
		public Expression expr;
		public OtherExpressionContext oth;
		public Token l;
		public FunctionArgumentsContext f;
		public IdentifierContext i;
		public ExpressionContext ex;
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
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			((AccessExpressionContext)_localctx).oth = otherExpression();
			((AccessExpressionContext)_localctx).expr =  ((AccessExpressionContext)_localctx).oth.expr;
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(601);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(592);
						((AccessExpressionContext)_localctx).l = match(LPAR);
						setState(593);
						((AccessExpressionContext)_localctx).f = functionArguments();
						((AccessExpressionContext)_localctx).expr =  new FunctionCall(_localctx.expr, ((AccessExpressionContext)_localctx).f.funcArgRet);
						     _localctx.expr.setLine(((AccessExpressionContext)_localctx).l.getLine());
						setState(595);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(597);
						match(DOT);
						setState(598);
						((AccessExpressionContext)_localctx).i = identifier();
						((AccessExpressionContext)_localctx).expr =  new StructAccess(_localctx.expr, ((AccessExpressionContext)_localctx).i.identifierRet);
						     _localctx.expr.setLine(((AccessExpressionContext)_localctx).i.line);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(606);
					((AccessExpressionContext)_localctx).l = match(LBRACK);
					setState(607);
					((AccessExpressionContext)_localctx).ex = expression();
					((AccessExpressionContext)_localctx).expr =  new ListAccessByIndex(_localctx.expr, ((AccessExpressionContext)_localctx).ex.exprRet);
					     _localctx.expr.setLine(((AccessExpressionContext)_localctx).l.getLine());
					setState(609);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(611);
					match(DOT);
					setState(612);
					((AccessExpressionContext)_localctx).i = identifier();
					((AccessExpressionContext)_localctx).expr =  new StructAccess(_localctx.expr, ((AccessExpressionContext)_localctx).i.identifierRet);
					     _localctx.expr.setLine(((AccessExpressionContext)_localctx).i.line);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(619);
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
		public Expression expr;
		public ValueContext v;
		public IdentifierContext id;
		public Token l;
		public FunctionArgumentsContext f;
		public SizeContext s;
		public AppendContext ap;
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
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).expr =  ((OtherExpressionContext)_localctx).v.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).expr =  ((OtherExpressionContext)_localctx).id.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				((OtherExpressionContext)_localctx).l = match(LPAR);
				{
				setState(627);
				((OtherExpressionContext)_localctx).f = functionArguments();
				}
				setState(628);
				match(RPAR);
				ExprInPar ex = new ExprInPar(((OtherExpressionContext)_localctx).f.funcArgRet);
				     ex.setLine(((OtherExpressionContext)_localctx).l.getLine());
				     ((OtherExpressionContext)_localctx).expr =  ex;
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				((OtherExpressionContext)_localctx).s = size();
				((OtherExpressionContext)_localctx).expr =  ((OtherExpressionContext)_localctx).s.sizeRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				((OtherExpressionContext)_localctx).ap = append();
				((OtherExpressionContext)_localctx).expr =  ((OtherExpressionContext)_localctx).ap.appendRet;
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
		public ListSize sizeRet;
		public int line;
		public Token s;
		public ExpressionContext ex;
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
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			((SizeContext)_localctx).s = match(SIZE);
			setState(640);
			match(LPAR);
			setState(641);
			((SizeContext)_localctx).ex = expression();
			((SizeContext)_localctx).sizeRet =  new ListSize(((SizeContext)_localctx).ex.exprRet);
			     _localctx.sizeRet.setLine(((SizeContext)_localctx).s.getLine());
			     ((SizeContext)_localctx).line =  ((SizeContext)_localctx).s.getLine();
			setState(643);
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
		public ListAppend appendRet;
		public int line;
		public Token ap;
		public ExpressionContext ex1;
		public ExpressionContext ex2;
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
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			((AppendContext)_localctx).ap = match(APPEND);
			setState(646);
			match(LPAR);
			setState(647);
			((AppendContext)_localctx).ex1 = expression();
			setState(648);
			match(COMMA);
			setState(649);
			((AppendContext)_localctx).ex2 = expression();
			setState(650);
			match(RPAR);
			((AppendContext)_localctx).appendRet =  new ListAppend(((AppendContext)_localctx).ex1.exprRet, ((AppendContext)_localctx).ex2.exprRet);
			     _localctx.appendRet.setLine(((AppendContext)_localctx).ap.getLine());
			     ((AppendContext)_localctx).line =  ((AppendContext)_localctx).ap.getLine();
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
		public Token iv;
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
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				((ValueContext)_localctx).b = boolValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).b.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				((ValueContext)_localctx).iv = match(INT_VALUE);

				    ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).iv!=null?Integer.valueOf(((ValueContext)_localctx).iv.getText()):0));
				    _localctx.valueRet.setLine(((ValueContext)_localctx).iv.getLine());
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
		public BoolValue boolValueRet;
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
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				((BoolValueContext)_localctx).t = match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true);
				     _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).t.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				((BoolValueContext)_localctx).f = match(FALSE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false);
				     _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).f.getLine());
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
		public Identifier identifierRet;
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
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			    ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			    _localctx.identifierRet.setLine(((IdentifierContext)_localctx).id.getLine());
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TypeContext t;
		public IdentifierContext id;
		public FptrTypeContext f;
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
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				match(BOOL);
				((TypeContext)_localctx).typeRet =  new BoolType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				match(LIST);
				setState(674);
				match(SHARP);
				setState(675);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).typeRet =  new ListType(((TypeContext)_localctx).t.typeRet);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(STRUCT);
				setState(679);
				((TypeContext)_localctx).id = identifier();
				((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).id.identifierRet);
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(682);
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
		public TypeContext t1;
		public TypeContext t2;
		public TypeContext t3;
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
			 ArrayList<Type> args = new ArrayList<>(); 
			setState(688);
			match(FPTR);
			setState(689);
			match(LESS_THAN);
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(690);
				match(VOID);
				 args.add(new VoidType()); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(692);
				((FptrTypeContext)_localctx).t1 = type();
				 args.add(((FptrTypeContext)_localctx).t1.typeRet); 
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(694);
					match(COMMA);
					setState(695);
					((FptrTypeContext)_localctx).t2 = type();
					 args.add(((FptrTypeContext)_localctx).t2.typeRet); 
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(705);
			match(ARROW);
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(706);
				((FptrTypeContext)_localctx).t3 = type();
				((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(args, ((FptrTypeContext)_localctx).t3.typeRet);
				}
				break;
			case VOID:
				{
				setState(709);
				match(VOID);
				((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(args, new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(713);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\3\5\3\5\6\5\u0093\n"+
		"\5\r\5\16\5\u0094\3\5\3\5\3\5\5\5\u009a\n\5\5\5\u009c\n\5\3\5\6\5\u009f"+
		"\n\5\r\5\16\5\u00a0\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00ab\n\6\r\6"+
		"\16\6\u00ac\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bb"+
		"\n\7\3\b\3\b\6\b\u00bf\n\b\r\b\16\b\u00c0\3\b\3\b\3\b\3\b\7\b\u00c7\n"+
		"\b\f\b\16\b\u00ca\13\b\3\b\3\b\3\b\5\b\u00cf\n\b\6\b\u00d1\n\b\r\b\16"+
		"\b\u00d2\3\t\3\t\3\t\3\t\6\t\u00d9\n\t\r\t\16\t\u00da\3\n\3\n\3\n\3\n"+
		"\6\n\u00e1\n\n\r\n\16\n\u00e2\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00eb"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\6\13\u00f2\n\13\r\13\16\13\u00f3\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0100\n\f\f\f\16\f\u0103\13\f\5"+
		"\f\u0105\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0110\n\r\f\r\16"+
		"\r\u0113\13\r\5\r\u0115\n\r\3\16\3\16\3\16\3\16\6\16\u011b\n\16\r\16\16"+
		"\16\u011c\3\16\3\16\3\16\5\16\u0122\n\16\5\16\u0124\n\16\3\17\3\17\3\17"+
		"\3\17\6\17\u012a\n\17\r\17\16\17\u012b\3\17\3\17\3\17\5\17\u0131\n\17"+
		"\3\20\3\20\3\20\3\20\6\20\u0137\n\20\r\20\16\20\u0138\3\20\3\20\3\20\3"+
		"\20\7\20\u013f\n\20\f\20\16\20\u0142\13\20\3\20\3\20\3\20\5\20\u0147\n"+
		"\20\6\20\u0149\n\20\r\20\16\20\u014a\3\20\6\20\u014e\n\20\r\20\16\20\u014f"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015c\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0166\n\21\3\21\3\21\7\21\u016a"+
		"\n\21\f\21\16\21\u016d\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u017a\n\22\f\22\16\22\u017d\13\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u018c\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0199\n\24\3\25"+
		"\7\25\u019c\n\25\f\25\16\25\u019f\13\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01ab\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u01b9\n\30\f\30\16\30\u01bc\13\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01e8\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01f0\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\7\35\u01f8\n\35\f\35\16\35\u01fb\13\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\7\36\u0203\n\36\f\36\16\36\u0206\13\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u020e\n\37\f\37\16\37\u0211\13\37\3 \3 \3 \3 "+
		"\3 \3 \5 \u0219\n \3 \3 \3 \7 \u021e\n \f \16 \u0221\13 \3!\3!\3!\3!\3"+
		"!\3!\5!\u0229\n!\3!\3!\3!\7!\u022e\n!\f!\16!\u0231\13!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0239\n\"\3\"\3\"\3\"\7\"\u023e\n\"\f\"\16\"\u0241\13\"\3"+
		"#\3#\3#\3#\5#\u0247\n#\3#\3#\3#\3#\3#\3#\5#\u024f\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\7$\u025c\n$\f$\16$\u025f\13$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\7$\u026a\n$\f$\16$\u026d\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u0280\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\5(\u0295\n(\3)\3)\3)\3)\5)\u029b\n)\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02b0\n+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\7,\u02bd\n,\f,\16,\u02c0\13,\5,\u02c2\n,\3,\3,\3"+
		",\3,\3,\3,\5,\u02ca\n,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u02f2\2[\3\2\2\2\4h"+
		"\3\2\2\2\6|\3\2\2\2\b\u0083\3\2\2\2\n\u00a2\3\2\2\2\f\u00ba\3\2\2\2\16"+
		"\u00bc\3\2\2\2\20\u00d4\3\2\2\2\22\u00dc\3\2\2\2\24\u00e4\3\2\2\2\26\u00f5"+
		"\3\2\2\2\30\u0108\3\2\2\2\32\u0123\3\2\2\2\34\u0130\3\2\2\2\36\u0132\3"+
		"\2\2\2 \u0153\3\2\2\2\"\u016e\3\2\2\2$\u0185\3\2\2\2&\u018d\3\2\2\2(\u019d"+
		"\3\2\2\2*\u01aa\3\2\2\2,\u01ac\3\2\2\2.\u01b3\3\2\2\2\60\u01c1\3\2\2\2"+
		"\62\u01c7\3\2\2\2\64\u01e7\3\2\2\2\66\u01e9\3\2\2\28\u01f1\3\2\2\2:\u01fc"+
		"\3\2\2\2<\u0207\3\2\2\2>\u0212\3\2\2\2@\u0222\3\2\2\2B\u0232\3\2\2\2D"+
		"\u024e\3\2\2\2F\u0250\3\2\2\2H\u027f\3\2\2\2J\u0281\3\2\2\2L\u0287\3\2"+
		"\2\2N\u0294\3\2\2\2P\u029a\3\2\2\2R\u029c\3\2\2\2T\u02af\3\2\2\2V\u02b1"+
		"\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\5\4\3\2_c\b\2\1\2`b\7,\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hn\b\3\1\2ij\5\b\5"+
		"\2jk\b\3\1\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2"+
		"\2pn\3\2\2\2qr\5\24\13\2rs\b\3\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2{\5\3\2\2\2|}\b"+
		"\4\1\2}~\7\3\2\2~\177\7%\2\2\177\u0080\7&\2\2\u0080\u0081\5\32\16\2\u0081"+
		"\u0082\b\4\1\2\u0082\7\3\2\2\2\u0083\u0084\b\5\1\2\u0084\u0085\7\35\2"+
		"\2\u0085\u0086\5R*\2\u0086\u009b\b\5\1\2\u0087\u0088\7\30\2\2\u0088\u0089"+
		"\5\16\b\2\u0089\u008b\b\5\1\2\u008a\u008c\7,\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\7\31\2\2\u0090\u009c\3\2\2\2\u0091\u0093\7,\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\f\7\2\u0097\u0099\b\5\1\2\u0098"+
		"\u009a\7+\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0087\3\2\2\2\u009b\u0092\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009f\7,\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3\b\6\1\2\u00a3\u00a4"+
		"\5T+\2\u00a4\u00a5\5R*\2\u00a5\u00a6\b\6\1\2\u00a6\u00a7\5\26\f\2\u00a7"+
		"\u00a8\b\6\1\2\u00a8\u00aa\7\30\2\2\u00a9\u00ab\7,\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\b\6\1\2\u00b0\u00b1\5"+
		"\20\t\2\u00b1\u00b2\b\6\1\2\u00b2\u00b3\7\31\2\2\u00b3\13\3\2\2\2\u00b4"+
		"\u00b5\5 \21\2\u00b5\u00b6\b\7\1\2\u00b6\u00bb\3\2\2\2\u00b7\u00b8\5\n"+
		"\6\2\u00b8\u00b9\b\7\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00bb\r\3\2\2\2\u00bc\u00d0\b\b\1\2\u00bd\u00bf\7,\2\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\5\f\7\2\u00c3\u00c4\b\b\1\2\u00c4"+
		"\u00c5\7+\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00ce\b\b\1\2\u00cd\u00cf\7+"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00be\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\5\32\16\2\u00d6"+
		"\u00d8\b\t\1\2\u00d7\u00d9\7,\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd"+
		"\7 \2\2\u00dd\u00de\5\32\16\2\u00de\u00e0\b\n\1\2\u00df\u00e1\7,\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\23\3\2\2\2\u00e4\u00ea\b\13\1\2\u00e5\u00e6\5T+\2\u00e6\u00e7"+
		"\b\13\1\2\u00e7\u00eb\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00eb\b\13\1\2"+
		"\u00ea\u00e5\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\5R*\2\u00ed\u00ee\5\26\f\2\u00ee\u00ef\5\32\16\2\u00ef\u00f1\b\13\1\2"+
		"\u00f0\u00f2\7,\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f6\b\f\1\2\u00f6"+
		"\u0104\7%\2\2\u00f7\u00f8\5T+\2\u00f8\u00f9\5R*\2\u00f9\u0101\b\f\1\2"+
		"\u00fa\u00fb\7)\2\2\u00fb\u00fc\5T+\2\u00fc\u00fd\5R*\2\u00fd\u00fe\b"+
		"\f\1\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u00f7\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7&\2\2\u0107\27\3\2\2\2\u0108\u0114\b\r\1\2\u0109\u010a\5\66\34"+
		"\2\u010a\u0111\b\r\1\2\u010b\u010c\7)\2\2\u010c\u010d\5\66\34\2\u010d"+
		"\u010e\b\r\1\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u0115\3\2\2\2\u0115\31\3\2\2"+
		"\2\u0116\u0117\5\36\20\2\u0117\u0118\b\16\1\2\u0118\u0124\3\2\2\2\u0119"+
		"\u011b\7,\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5\64\33\2\u011f"+
		"\u0121\b\16\1\2\u0120\u0122\7+\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u011a\3\2\2\2\u0124"+
		"\33\3\2\2\2\u0125\u0126\5\36\20\2\u0126\u0127\b\17\1\2\u0127\u0131\3\2"+
		"\2\2\u0128\u012a\7,\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5\64"+
		"\33\2\u012e\u012f\b\17\1\2\u012f\u0131\3\2\2\2\u0130\u0125\3\2\2\2\u0130"+
		"\u0129\3\2\2\2\u0131\35\3\2\2\2\u0132\u0133\b\20\1\2\u0133\u0134\7\30"+
		"\2\2\u0134\u0148\b\20\1\2\u0135\u0137\7,\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0140\3\2"+
		"\2\2\u013a\u013b\5\64\33\2\u013b\u013c\b\20\1\2\u013c\u013d\7+\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\5\64\33\2\u0144\u0146\b\20\1\2\u0145\u0147\7+\2\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0136\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014e\7,\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\31"+
		"\2\2\u0152\37\3\2\2\2\u0153\u0154\b\21\1\2\u0154\u0155\5T+\2\u0155\u0156"+
		"\5R*\2\u0156\u015b\b\21\1\2\u0157\u0158\7#\2\2\u0158\u0159\58\35\2\u0159"+
		"\u015a\b\21\1\2\u015a\u015c\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u016b\b\21\1\2\u015e\u015f\7)\2\2\u015f"+
		"\u0160\5R*\2\u0160\u0165\b\21\1\2\u0161\u0162\7#\2\2\u0162\u0163\58\35"+
		"\2\u0163\u0164\b\21\1\2\u0164\u0166\3\2\2\2\u0165\u0161\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\21\1\2\u0168\u016a\3"+
		"\2\2\2\u0169\u015e\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c!\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\5H%\2\u016f"+
		"\u017b\b\22\1\2\u0170\u0171\7%\2\2\u0171\u0172\5\30\r\2\u0172\u0173\7"+
		"&\2\2\u0173\u0174\b\22\1\2\u0174\u017a\3\2\2\2\u0175\u0176\7*\2\2\u0176"+
		"\u0177\5R*\2\u0177\u0178\b\22\1\2\u0178\u017a\3\2\2\2\u0179\u0170\3\2"+
		"\2\2\u0179\u0175\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7%"+
		"\2\2\u017f\u0180\5\30\r\2\u0180\u0181\7&\2\2\u0181\u0182\b\22\1\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\b\22\1\2\u0184#\3\2\2\2\u0185\u0186\b\23\1"+
		"\2\u0186\u0187\7\4\2\2\u0187\u018b\b\23\1\2\u0188\u0189\5\66\34\2\u0189"+
		"\u018a\b\23\1\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3"+
		"\2\2\2\u018c%\3\2\2\2\u018d\u018e\7\t\2\2\u018e\u018f\5\66\34\2\u018f"+
		"\u0198\b\24\1\2\u0190\u0191\5\34\17\2\u0191\u0192\b\24\1\2\u0192\u0199"+
		"\3\2\2\2\u0193\u0194\5\32\16\2\u0194\u0195\b\24\1\2\u0195\u0196\5(\25"+
		"\2\u0196\u0197\b\24\1\2\u0197\u0199\3\2\2\2\u0198\u0190\3\2\2\2\u0198"+
		"\u0193\3\2\2\2\u0199\'\3\2\2\2\u019a\u019c\7,\2\2\u019b\u019a\3\2\2\2"+
		"\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\n\2\2\u01a1\u01a2\5\34\17\2"+
		"\u01a2\u01a3\b\25\1\2\u01a3)\3\2\2\2\u01a4\u01a5\5,\27\2\u01a5\u01a6\b"+
		"\26\1\2\u01a6\u01ab\3\2\2\2\u01a7\u01a8\5.\30\2\u01a8\u01a9\b\26\1\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a7\3\2\2\2\u01ab+\3\2\2\2"+
		"\u01ac\u01ad\b\27\1\2\u01ad\u01ae\7!\2\2\u01ae\u01af\5\66\34\2\u01af\u01b0"+
		"\b\27\1\2\u01b0\u01b1\5\34\17\2\u01b1\u01b2\b\27\1\2\u01b2-\3\2\2\2\u01b3"+
		"\u01b4\b\30\1\2\u01b4\u01b5\7\"\2\2\u01b5\u01b6\5\32\16\2\u01b6\u01ba"+
		"\b\30\1\2\u01b7\u01b9\7,\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\7!\2\2\u01be\u01bf\5\66\34\2\u01bf\u01c0\b\30\1\2\u01c0"+
		"/\3\2\2\2\u01c1\u01c2\7\7\2\2\u01c2\u01c3\7%\2\2\u01c3\u01c4\5\66\34\2"+
		"\u01c4\u01c5\b\31\1\2\u01c5\u01c6\7&\2\2\u01c6\61\3\2\2\2\u01c7\u01c8"+
		"\58\35\2\u01c8\u01c9\7#\2\2\u01c9\u01ca\5\66\34\2\u01ca\u01cb\b\32\1\2"+
		"\u01cb\63\3\2\2\2\u01cc\u01cd\5&\24\2\u01cd\u01ce\b\33\1\2\u01ce\u01e8"+
		"\3\2\2\2\u01cf\u01d0\5\60\31\2\u01d0\u01d1\b\33\1\2\u01d1\u01e8\3\2\2"+
		"\2\u01d2\u01d3\5\"\22\2\u01d3\u01d4\b\33\1\2\u01d4\u01e8\3\2\2\2\u01d5"+
		"\u01d6\5$\23\2\u01d6\u01d7\b\33\1\2\u01d7\u01e8\3\2\2\2\u01d8\u01d9\5"+
		"\62\32\2\u01d9\u01da\b\33\1\2\u01da\u01e8\3\2\2\2\u01db\u01dc\5 \21\2"+
		"\u01dc\u01dd\b\33\1\2\u01dd\u01e8\3\2\2\2\u01de\u01df\5*\26\2\u01df\u01e0"+
		"\b\33\1\2\u01e0\u01e8\3\2\2\2\u01e1\u01e2\5L\'\2\u01e2\u01e3\b\33\1\2"+
		"\u01e3\u01e8\3\2\2\2\u01e4\u01e5\5J&\2\u01e5\u01e6\b\33\1\2\u01e6\u01e8"+
		"\3\2\2\2\u01e7\u01cc\3\2\2\2\u01e7\u01cf\3\2\2\2\u01e7\u01d2\3\2\2\2\u01e7"+
		"\u01d5\3\2\2\2\u01e7\u01d8\3\2\2\2\u01e7\u01db\3\2\2\2\u01e7\u01de\3\2"+
		"\2\2\u01e7\u01e1\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e8\65\3\2\2\2\u01e9\u01ea"+
		"\58\35\2\u01ea\u01ef\b\34\1\2\u01eb\u01ec\7#\2\2\u01ec\u01ed\5\66\34\2"+
		"\u01ed\u01ee\b\34\1\2\u01ee\u01f0\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\67\3\2\2\2\u01f1\u01f2\5:\36\2\u01f2\u01f9\b\35\1\2\u01f3"+
		"\u01f4\7\24\2\2\u01f4\u01f5\5:\36\2\u01f5\u01f6\b\35\1\2\u01f6\u01f8\3"+
		"\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa9\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5<\37\2"+
		"\u01fd\u0204\b\36\1\2\u01fe\u01ff\7\23\2\2\u01ff\u0200\5<\37\2\u0200\u0201"+
		"\b\36\1\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0203\u0206\3\2\2\2"+
		"\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205;\3\2\2\2\u0206\u0204\3"+
		"\2\2\2\u0207\u0208\5> \2\u0208\u020f\b\37\1\2\u0209\u020a\7\17\2\2\u020a"+
		"\u020b\5> \2\u020b\u020c\b\37\1\2\u020c\u020e\3\2\2\2\u020d\u0209\3\2"+
		"\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"=\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\5@!\2\u0213\u021f\b \1\2\u0214"+
		"\u0215\7\21\2\2\u0215\u0219\b \1\2\u0216\u0217\7\22\2\2\u0217\u0219\b"+
		" \1\2\u0218\u0214\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\5@!\2\u021b\u021c\b \1\2\u021c\u021e\3\2\2\2\u021d\u0218\3\2\2"+
		"\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220?"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\5B\"\2\u0223\u022f\b!\1\2\u0224"+
		"\u0225\7\13\2\2\u0225\u0229\b!\1\2\u0226\u0227\7\f\2\2\u0227\u0229\b!"+
		"\1\2\u0228\u0224\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\5B\"\2\u022b\u022c\b!\1\2\u022c\u022e\3\2\2\2\u022d\u0228\3\2\2"+
		"\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230A"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\5D#\2\u0233\u023f\b\"\1\2\u0234"+
		"\u0235\7\r\2\2\u0235\u0239\b\"\1\2\u0236\u0237\7\16\2\2\u0237\u0239\b"+
		"\"\1\2\u0238\u0234\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\5D#\2\u023b\u023c\b\"\1\2\u023c\u023e\3\2\2\2\u023d\u0238\3\2\2"+
		"\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240C"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7\25\2\2\u0243\u0247\b#\1\2\u0244"+
		"\u0245\7\f\2\2\u0245\u0247\b#\1\2\u0246\u0242\3\2\2\2\u0246\u0244\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u0249\5D#\2\u0249\u024a\b#\1\2\u024a\u024f"+
		"\3\2\2\2\u024b\u024c\5F$\2\u024c\u024d\b#\1\2\u024d\u024f\3\2\2\2\u024e"+
		"\u0246\3\2\2\2\u024e\u024b\3\2\2\2\u024fE\3\2\2\2\u0250\u0251\5H%\2\u0251"+
		"\u025d\b$\1\2\u0252\u0253\7%\2\2\u0253\u0254\5\30\r\2\u0254\u0255\b$\1"+
		"\2\u0255\u0256\7&\2\2\u0256\u025c\3\2\2\2\u0257\u0258\7*\2\2\u0258\u0259"+
		"\5R*\2\u0259\u025a\b$\1\2\u025a\u025c\3\2\2\2\u025b\u0252\3\2\2\2\u025b"+
		"\u0257\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u026b\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\'\2\2\u0261"+
		"\u0262\5\66\34\2\u0262\u0263\b$\1\2\u0263\u0264\7(\2\2\u0264\u026a\3\2"+
		"\2\2\u0265\u0266\7*\2\2\u0266\u0267\5R*\2\u0267\u0268\b$\1\2\u0268\u026a"+
		"\3\2\2\2\u0269\u0260\3\2\2\2\u0269\u0265\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cG\3\2\2\2\u026d\u026b\3\2\2\2"+
		"\u026e\u026f\5N(\2\u026f\u0270\b%\1\2\u0270\u0280\3\2\2\2\u0271\u0272"+
		"\5R*\2\u0272\u0273\b%\1\2\u0273\u0280\3\2\2\2\u0274\u0275\7%\2\2\u0275"+
		"\u0276\5\30\r\2\u0276\u0277\7&\2\2\u0277\u0278\b%\1\2\u0278\u0280\3\2"+
		"\2\2\u0279\u027a\5J&\2\u027a\u027b\b%\1\2\u027b\u0280\3\2\2\2\u027c\u027d"+
		"\5L\'\2\u027d\u027e\b%\1\2\u027e\u0280\3\2\2\2\u027f\u026e\3\2\2\2\u027f"+
		"\u0271\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u027c\3\2"+
		"\2\2\u0280I\3\2\2\2\u0281\u0282\7\6\2\2\u0282\u0283\7%\2\2\u0283\u0284"+
		"\5\66\34\2\u0284\u0285\b&\1\2\u0285\u0286\7&\2\2\u0286K\3\2\2\2\u0287"+
		"\u0288\7\b\2\2\u0288\u0289\7%\2\2\u0289\u028a\5\66\34\2\u028a\u028b\7"+
		")\2\2\u028b\u028c\5\66\34\2\u028c\u028d\7&\2\2\u028d\u028e\b\'\1\2\u028e"+
		"M\3\2\2\2\u028f\u0290\5P)\2\u0290\u0291\b(\1\2\u0291\u0295\3\2\2\2\u0292"+
		"\u0293\7-\2\2\u0293\u0295\b(\1\2\u0294\u028f\3\2\2\2\u0294\u0292\3\2\2"+
		"\2\u0295O\3\2\2\2\u0296\u0297\7\26\2\2\u0297\u029b\b)\1\2\u0298\u0299"+
		"\7\27\2\2\u0299\u029b\b)\1\2\u029a\u0296\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"Q\3\2\2\2\u029c\u029d\7.\2\2\u029d\u029e\b*\1\2\u029eS\3\2\2\2\u029f\u02a0"+
		"\7\32\2\2\u02a0\u02b0\b+\1\2\u02a1\u02a2\7\33\2\2\u02a2\u02b0\b+\1\2\u02a3"+
		"\u02a4\7\34\2\2\u02a4\u02a5\7$\2\2\u02a5\u02a6\5T+\2\u02a6\u02a7\b+\1"+
		"\2\u02a7\u02b0\3\2\2\2\u02a8\u02a9\7\35\2\2\u02a9\u02aa\5R*\2\u02aa\u02ab"+
		"\b+\1\2\u02ab\u02b0\3\2\2\2\u02ac\u02ad\5V,\2\u02ad\u02ae\b+\1\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u029f\3\2\2\2\u02af\u02a1\3\2\2\2\u02af\u02a3\3\2"+
		"\2\2\u02af\u02a8\3\2\2\2\u02af\u02ac\3\2\2\2\u02b0U\3\2\2\2\u02b1\u02b2"+
		"\b,\1\2\u02b2\u02b3\7\36\2\2\u02b3\u02c1\7\22\2\2\u02b4\u02b5\7\5\2\2"+
		"\u02b5\u02c2\b,\1\2\u02b6\u02b7\5T+\2\u02b7\u02be\b,\1\2\u02b8\u02b9\7"+
		")\2\2\u02b9\u02ba\5T+\2\u02ba\u02bb\b,\1\2\u02bb\u02bd\3\2\2\2\u02bc\u02b8"+
		"\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02b4\3\2\2\2\u02c1\u02b6\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c9\7\20\2\2\u02c4\u02c5\5T+\2\u02c5"+
		"\u02c6\b,\1\2\u02c6\u02ca\3\2\2\2\u02c7\u02c8\7\5\2\2\u02c8\u02ca\b,\1"+
		"\2\u02c9\u02c4\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc"+
		"\7\21\2\2\u02ccW\3\2\2\2E[cnv\u008d\u0094\u0099\u009b\u00a0\u00ac\u00ba"+
		"\u00c0\u00c8\u00ce\u00d2\u00da\u00e2\u00ea\u00f3\u0101\u0104\u0111\u0114"+
		"\u011c\u0121\u0123\u012b\u0130\u0138\u0140\u0146\u014a\u014f\u015b\u0165"+
		"\u016b\u0179\u017b\u018b\u0198\u019d\u01aa\u01ba\u01e7\u01ef\u01f9\u0204"+
		"\u020f\u0218\u021f\u0228\u022f\u0238\u023f\u0246\u024e\u025b\u025d\u0269"+
		"\u026b\u027f\u0294\u029a\u02af\u02be\u02c1\u02c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
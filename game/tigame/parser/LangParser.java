// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		ID=33, STR=34, INT=35, BECOMES=36, HIDENL=37, NL=38, COMMENT=39, WS=40;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'done'", "'forever'", "'endif'", "'-'", "'*'", "'while'", 
		"'['", "'or'", "':'", "'not'", "'('", "'prgm'", "'if'", "'<'", "'continue'", 
		"'<='", "'break'", "'and'", "'else'", "'do'", "'%'", "')'", "'+'", "'global'", 
		"'='", "'goto'", "'>'", "'then'", "'endprgm'", "'/'", "'>='", "ID", "STR", 
		"INT", "':='", "HIDENL", "NL", "COMMENT", "WS"
	};
	public static final int
		RULE_file = 0, RULE_program = 1, RULE_global_var = 2, RULE_statement = 3, 
		RULE_ifstat = 4, RULE_endifstat = 5, RULE_elsestat = 6, RULE_loopcond = 7, 
		RULE_expr = 8;
	public static final String[] ruleNames = {
		"file", "program", "global_var", "statement", "ifstat", "endifstat", "elsestat", 
		"loopcond", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(LangParser.NL); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(LangParser.NL, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13 || _la==NL) {
				{
				setState(20);
				switch (_input.LA(1)) {
				case 13:
					{
					setState(18); program();
					}
					break;
				case NL:
					{
					setState(19); match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Global_varContext> global_var() {
			return getRuleContexts(Global_varContext.class);
		}
		public List<TerminalNode> NL() { return getTokens(LangParser.NL); }
		public Global_varContext global_var(int i) {
			return getRuleContext(Global_varContext.class,i);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode NL(int i) {
			return getToken(LangParser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(25); match(13);
			setState(26); match(ID);
			setState(27); match(NL);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(30);
					switch (_input.LA(1)) {
					case 25:
						{
						setState(28); global_var();
						}
						break;
					case NL:
						{
						setState(29); match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 27) | (1L << ID) | (1L << NL))) != 0)) {
				{
				{
				setState(35); statement();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); match(30);
			setState(42); match(NL);
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

	public static class Global_varContext extends ParserRuleContext {
		public Global_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_var; }
	 
		public Global_varContext() { }
		public void copyFrom(Global_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalContext extends Global_varContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public GlobalContext(Global_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_varContext global_var() throws RecognitionException {
		Global_varContext _localctx = new Global_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global_var);
		try {
			_localctx = new GlobalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(25);
			setState(45); match(ID);
			setState(46); match(NL);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends StatementContext {
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public TerminalNode BECOMES() { return getToken(LangParser.BECOMES, 0); }
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StatementContext {
		public ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfstatlabelContext extends StatementContext {
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public IfstatlabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfstatlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfstatlabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfstatlabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(LangParser.NL); }
		public LoopcondContext loopcond() {
			return getRuleContext(LoopcondContext.class,0);
		}
		public TerminalNode NL(int i) {
			return getToken(LangParser.NL, i);
		}
		public LoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayassignContext extends StatementContext {
		public TerminalNode BECOMES() { return getToken(LangParser.BECOMES, 0); }
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ArrayassignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArrayassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoContext extends StatementContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public GotoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelContext extends StatementContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public LabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PcallContext extends StatementContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public PcallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPcall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptylineContext extends StatementContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public EmptylineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterEmptyline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitEmptyline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEmptyline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(ID);
				setState(49); match(BECOMES);
				setState(50); expr(0);
				setState(51); match(NL);
				}
				break;

			case 2:
				_localctx = new ArrayassignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(ID);
				setState(54); match(8);
				setState(55); expr(0);
				setState(56); match(1);
				setState(57); match(BECOMES);
				setState(58); expr(0);
				setState(59); match(NL);
				}
				break;

			case 3:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(27);
				setState(62); match(ID);
				setState(63); match(NL);
				}
				break;

			case 4:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(ID);
				setState(65); match(10);
				setState(66); match(NL);
				}
				break;

			case 5:
				_localctx = new PcallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67); match(ID);
				setState(68); match(NL);
				}
				break;

			case 6:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69); loopcond();
				setState(70); match(21);
				setState(71); match(NL);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 27) | (1L << ID) | (1L << NL))) != 0)) {
					{
					{
					setState(72); statement();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78); match(2);
				setState(79); match(NL);
				}
				break;

			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(81); match(18);
				}
				break;

			case 8:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(82); match(16);
				}
				break;

			case 9:
				_localctx = new EmptylineContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(83); match(NL);
				}
				break;

			case 10:
				_localctx = new IfstatlabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(84); ifstat();
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

	public static class IfstatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public EndifstatContext endifstat() {
			return getRuleContext(EndifstatContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(14);
			setState(88); expr(0);
			setState(89); match(29);
			setState(90); match(NL);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 27) | (1L << ID) | (1L << NL))) != 0)) {
				{
				{
				setState(91); statement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); endifstat();
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

	public static class EndifstatContext extends ParserRuleContext {
		public EndifstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endifstat; }
	 
		public EndifstatContext() { }
		public void copyFrom(EndifstatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EndifContext extends EndifstatContext {
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public EndifContext(EndifstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterEndif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitEndif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEndif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElselabelContext extends EndifstatContext {
		public ElsestatContext elsestat() {
			return getRuleContext(ElsestatContext.class,0);
		}
		public ElselabelContext(EndifstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterElselabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitElselabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitElselabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndifstatContext endifstat() throws RecognitionException {
		EndifstatContext _localctx = new EndifstatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endifstat);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new EndifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99); match(4);
				setState(100); match(NL);
				}
				break;
			case 20:
				_localctx = new ElselabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); elsestat();
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

	public static class ElsestatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(LangParser.NL); }
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public TerminalNode NL(int i) {
			return getToken(LangParser.NL, i);
		}
		public ElsestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterElsestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitElsestat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitElsestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatContext elsestat() throws RecognitionException {
		ElsestatContext _localctx = new ElsestatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elsestat);
		int _la;
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(20);
				setState(105); match(NL);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 27) | (1L << ID) | (1L << NL))) != 0)) {
					{
					{
					setState(106); statement();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112); match(4);
				setState(113); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(20);
				setState(115); ifstat();
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

	public static class LoopcondContext extends ParserRuleContext {
		public LoopcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopcond; }
	 
		public LoopcondContext() { }
		public void copyFrom(LoopcondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeverContext extends LoopcondContext {
		public ForeverContext(LoopcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForever(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForever(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends LoopcondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileContext(LoopcondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopcondContext loopcond() throws RecognitionException {
		LoopcondContext _localctx = new LoopcondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopcond);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case 3:
				_localctx = new ForeverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(3);
				}
				break;
			case 7:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(7);
				setState(120); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAddsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivmodContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MuldivmodContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMuldivmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMuldivmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMuldivmod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public CmpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124); match(11);
				setState(125); expr(7);
				}
				break;

			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126); match(5);
				setState(127); expr(3);
				}
				break;

			case 3:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); match(ID);
				setState(129); match(8);
				setState(130); expr(0);
				setState(131); match(1);
				}
				break;

			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134); match(INT);
				}
				break;

			case 6:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); match(12);
				setState(136); expr(0);
				setState(137); match(23);
				}
				break;

			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139); match(STR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivmodContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(143);
						((MuldivmodContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 22) | (1L << 31))) != 0)) ) {
							((MuldivmodContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(144); expr(13);
						}
						break;

					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(146);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==24) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(147); expr(12);
						}
						break;

					case 3:
						{
						_localctx = new CmpContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(149);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 17) | (1L << 26) | (1L << 28) | (1L << 32))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(150); expr(11);
						}
						break;

					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(152); match(19);
						setState(153); expr(10);
						}
						break;

					case 5:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(155); match(9);
						setState(156); expr(9);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 12 >= _localctx._p;

		case 1: return 11 >= _localctx._p;

		case 2: return 10 >= _localctx._p;

		case 3: return 9 >= _localctx._p;

		case 4: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3*\u00a5\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\3\2\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\7\3!\n\3\f\3\16\3$\13\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16"+
		"\6b\13\6\3\6\3\6\3\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13"+
		"\b\3\b\3\b\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16"+
		"\n\u00a3\13\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\5\5\b\b\30\30!!\4\7\7\32"+
		"\32\7\21\21\23\23\34\34\36\36\"\"\u00ba\2\30\3\2\2\2\4\33\3\2\2\2\6.\3"+
		"\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fh\3\2\2\2\16v\3\2\2\2\20{\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\27\5\4\3\2\25\27\7(\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\32"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33\34"+
		"\7\17\2\2\34\35\7#\2\2\35\"\7(\2\2\36!\5\6\4\2\37!\7(\2\2 \36\3\2\2\2"+
		" \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#(\3\2\2\2$\"\3\2\2\2%\'\5"+
		"\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,"+
		"\7 \2\2,-\7(\2\2-\5\3\2\2\2./\7\33\2\2/\60\7#\2\2\60\61\7(\2\2\61\7\3"+
		"\2\2\2\62\63\7#\2\2\63\64\7&\2\2\64\65\5\22\n\2\65\66\7(\2\2\66X\3\2\2"+
		"\2\678\7#\2\289\7\n\2\29:\5\22\n\2:;\7\3\2\2;<\7&\2\2<=\5\22\n\2=>\7("+
		"\2\2>X\3\2\2\2?@\7\35\2\2@A\7#\2\2AX\7(\2\2BC\7#\2\2CD\7\f\2\2DX\7(\2"+
		"\2EF\7#\2\2FX\7(\2\2GH\5\20\t\2HI\7\27\2\2IM\7(\2\2JL\5\b\5\2KJ\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\4\2\2QR\7(\2"+
		"\2RX\3\2\2\2SX\7\24\2\2TX\7\22\2\2UX\7(\2\2VX\5\n\6\2W\62\3\2\2\2W\67"+
		"\3\2\2\2W?\3\2\2\2WB\3\2\2\2WE\3\2\2\2WG\3\2\2\2WS\3\2\2\2WT\3\2\2\2W"+
		"U\3\2\2\2WV\3\2\2\2X\t\3\2\2\2YZ\7\20\2\2Z[\5\22\n\2[\\\7\37\2\2\\`\7"+
		"(\2\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3"+
		"\2\2\2cd\5\f\7\2d\13\3\2\2\2ef\7\6\2\2fi\7(\2\2gi\5\16\b\2he\3\2\2\2h"+
		"g\3\2\2\2i\r\3\2\2\2jk\7\26\2\2ko\7(\2\2ln\5\b\5\2ml\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\6\2\2sw\7(\2\2tu\7\26\2\2"+
		"uw\5\n\6\2vj\3\2\2\2vt\3\2\2\2w\17\3\2\2\2x|\7\5\2\2yz\7\t\2\2z|\5\22"+
		"\n\2{x\3\2\2\2{y\3\2\2\2|\21\3\2\2\2}~\b\n\1\2~\177\7\r\2\2\177\u008f"+
		"\5\22\n\2\u0080\u0081\7\7\2\2\u0081\u008f\5\22\n\2\u0082\u0083\7#\2\2"+
		"\u0083\u0084\7\n\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\3\2\2\u0086\u008f"+
		"\3\2\2\2\u0087\u008f\7#\2\2\u0088\u008f\7%\2\2\u0089\u008a\7\16\2\2\u008a"+
		"\u008b\5\22\n\2\u008b\u008c\7\31\2\2\u008c\u008f\3\2\2\2\u008d\u008f\7"+
		"$\2\2\u008e}\3\2\2\2\u008e\u0080\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0087"+
		"\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u00a1\3\2\2\2\u0090\u0091\6\n\2\3\u0091\u0092\t\2\2\2\u0092\u00a0\5\22"+
		"\n\2\u0093\u0094\6\n\3\3\u0094\u0095\t\3\2\2\u0095\u00a0\5\22\n\2\u0096"+
		"\u0097\6\n\4\3\u0097\u0098\t\4\2\2\u0098\u00a0\5\22\n\2\u0099\u009a\6"+
		"\n\5\3\u009a\u009b\7\25\2\2\u009b\u00a0\5\22\n\2\u009c\u009d\6\n\6\3\u009d"+
		"\u009e\7\13\2\2\u009e\u00a0\5\22\n\2\u009f\u0090\3\2\2\2\u009f\u0093\3"+
		"\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\23\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\21\26\30 \"(MW`hov{\u008e\u009f\u00a1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
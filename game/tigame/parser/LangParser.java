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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		ID=25, STR=26, INT=27, BECOMES=28, HIDENL=29, NL=30, COMMENT=31, WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'%'", "']'", "'endif'", "')'", "'+'", "'*'", "'['", "'-'", 
		"'or'", "':'", "'not'", "'('", "'if'", "'prgm'", "'global'", "'<'", "'='", 
		"'goto'", "'<='", "'>'", "'and'", "'then'", "'/'", "'>='", "ID", "STR", 
		"INT", "':='", "HIDENL", "NL", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_global_var = 1, RULE_statement = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"program", "global_var", "statement", "expr"
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
		public TerminalNode NL() { return getToken(LangParser.NL, 0); }
		public Global_varContext global_var(int i) {
			return getRuleContext(Global_varContext.class,i);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
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
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(14);
			setState(9); match(ID);
			setState(10); match(NL);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==15) {
				{
				{
				setState(11); global_var();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 18) | (1L << ID) | (1L << NL))) != 0)) {
				{
				{
				setState(17); statement();
				}
				}
				setState(22);
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
		enterRule(_localctx, 2, RULE_global_var);
		try {
			_localctx = new GlobalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(15);
			setState(24); match(ID);
			setState(25); match(NL);
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
	public static class IfContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(LangParser.NL); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL(int i) {
			return getToken(LangParser.NL, i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIf(this);
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
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27); match(ID);
				setState(28); match(BECOMES);
				setState(29); expr(0);
				setState(30); match(NL);
				}
				break;

			case 2:
				_localctx = new ArrayassignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(ID);
				setState(33); match(7);
				setState(34); expr(0);
				setState(35); match(2);
				setState(36); match(BECOMES);
				setState(37); expr(0);
				setState(38); match(NL);
				}
				break;

			case 3:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40); match(18);
				setState(41); match(ID);
				setState(42); match(NL);
				}
				break;

			case 4:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43); match(ID);
				setState(44); match(10);
				setState(45); match(NL);
				}
				break;

			case 5:
				_localctx = new PcallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46); match(ID);
				setState(47); match(NL);
				}
				break;

			case 6:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(48); match(13);
				setState(49); expr(0);
				setState(50); match(22);
				setState(51); match(NL);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 18) | (1L << ID) | (1L << NL))) != 0)) {
					{
					{
					setState(52); statement();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58); match(3);
				setState(59); match(NL);
				}
				break;

			case 7:
				_localctx = new EmptylineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(61); match(NL);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65); match(11);
				setState(66); expr(7);
				}
				break;

			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(8);
				setState(68); expr(3);
				}
				break;

			case 3:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69); match(ID);
				setState(70); match(7);
				setState(71); expr(0);
				setState(72); match(2);
				}
				break;

			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75); match(INT);
				}
				break;

			case 6:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76); match(12);
				setState(77); expr(0);
				setState(78); match(4);
				}
				break;

			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); match(STR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivmodContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(84);
						((MuldivmodContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 23))) != 0)) ) {
							((MuldivmodContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(85); expr(13);
						}
						break;

					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(87);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==8) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(88); expr(12);
						}
						break;

					case 3:
						{
						_localctx = new CmpContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(90);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 17) | (1L << 19) | (1L << 20) | (1L << 24))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(91); expr(11);
						}
						break;

					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(93); match(21);
						setState(94); expr(10);
						}
						break;

					case 5:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(96); match(9);
						setState(97); expr(9);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\2\3\"j\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2"+
		"\16\2\22\13\2\3\2\7\2\25\n\2\f\2\16\2\30\13\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\4\5\4"+
		"A\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\2\6\2\4\6\b\2\5\5\3\3\b\b\31\31\4\7\7"+
		"\n\n\5\22\23\25\26\32\32y\2\n\3\2\2\2\4\31\3\2\2\2\6@\3\2\2\2\bS\3\2\2"+
		"\2\n\13\7\20\2\2\13\f\7\33\2\2\f\20\7 \2\2\r\17\5\4\3\2\16\r\3\2\2\2\17"+
		"\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\26\3\2\2\2\22\20\3\2\2\2\23"+
		"\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\3\3\2\2\2\30\26\3\2\2\2\31\32\7\21\2\2\32\33\7\33\2\2\33\34\7 \2\2\34"+
		"\5\3\2\2\2\35\36\7\33\2\2\36\37\7\36\2\2\37 \5\b\5\2 !\7 \2\2!A\3\2\2"+
		"\2\"#\7\33\2\2#$\7\t\2\2$%\5\b\5\2%&\7\4\2\2&\'\7\36\2\2\'(\5\b\5\2()"+
		"\7 \2\2)A\3\2\2\2*+\7\24\2\2+,\7\33\2\2,A\7 \2\2-.\7\33\2\2./\7\f\2\2"+
		"/A\7 \2\2\60\61\7\33\2\2\61A\7 \2\2\62\63\7\17\2\2\63\64\5\b\5\2\64\65"+
		"\7\30\2\2\659\7 \2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\5\2\2=>\7 \2\2>A\3\2\2\2?A\7 \2\2@\35"+
		"\3\2\2\2@\"\3\2\2\2@*\3\2\2\2@-\3\2\2\2@\60\3\2\2\2@\62\3\2\2\2@?\3\2"+
		"\2\2A\7\3\2\2\2BC\b\5\1\2CD\7\r\2\2DT\5\b\5\2EF\7\n\2\2FT\5\b\5\2GH\7"+
		"\33\2\2HI\7\t\2\2IJ\5\b\5\2JK\7\4\2\2KT\3\2\2\2LT\7\33\2\2MT\7\35\2\2"+
		"NO\7\16\2\2OP\5\b\5\2PQ\7\6\2\2QT\3\2\2\2RT\7\34\2\2SB\3\2\2\2SE\3\2\2"+
		"\2SG\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SR\3\2\2\2Tf\3\2\2\2UV\6\5\2"+
		"\3VW\t\2\2\2We\5\b\5\2XY\6\5\3\3YZ\t\3\2\2Ze\5\b\5\2[\\\6\5\4\3\\]\t\4"+
		"\2\2]e\5\b\5\2^_\6\5\5\3_`\7\27\2\2`e\5\b\5\2ab\6\5\6\3bc\7\13\2\2ce\5"+
		"\b\5\2dU\3\2\2\2dX\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2\t\20\269@Sdf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
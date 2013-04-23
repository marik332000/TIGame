// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ID=17, INT=18, BECOMES=19, NL=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'%'", "']'", "'endif'", "')'", "'+'", "'*'", "'['", "'-'", "':'", "'('", 
		"'if'", "'prgm'", "'global'", "'goto'", "'then'", "'/'", "ID", "INT", 
		"':='", "NL", "WS"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"INT", "BECOMES", "NL", "WS"
	};


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\27{\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\7\22c\n\22\f\22\16\22f\13\22\3\23\6\23i\n\23\r\23\16\23"+
		"j\3\24\3\24\3\24\3\25\5\25q\n\25\3\25\3\25\3\26\6\26v\n\26\r\26\16\26"+
		"w\3\26\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\2\3\2\6\4C\\c|\5\62;C\\c|\3\62;\5\13\13\16\16\"\"~\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2"+
		"\7\61\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2"+
		"\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31H\3\2\2\2\33M\3\2\2\2\35T\3"+
		"\2\2\2\37Y\3\2\2\2!^\3\2\2\2#`\3\2\2\2%h\3\2\2\2\'l\3\2\2\2)p\3\2\2\2"+
		"+u\3\2\2\2-.\7\'\2\2.\4\3\2\2\2/\60\7_\2\2\60\6\3\2\2\2\61\62\7g\2\2\62"+
		"\63\7p\2\2\63\64\7f\2\2\64\65\7k\2\2\65\66\7h\2\2\66\b\3\2\2\2\678\7+"+
		"\2\28\n\3\2\2\29:\7-\2\2:\f\3\2\2\2;<\7,\2\2<\16\3\2\2\2=>\7]\2\2>\20"+
		"\3\2\2\2?@\7/\2\2@\22\3\2\2\2AB\7<\2\2B\24\3\2\2\2CD\7*\2\2D\26\3\2\2"+
		"\2EF\7k\2\2FG\7h\2\2G\30\3\2\2\2HI\7r\2\2IJ\7t\2\2JK\7i\2\2KL\7o\2\2L"+
		"\32\3\2\2\2MN\7i\2\2NO\7n\2\2OP\7q\2\2PQ\7d\2\2QR\7c\2\2RS\7n\2\2S\34"+
		"\3\2\2\2TU\7i\2\2UV\7q\2\2VW\7v\2\2WX\7q\2\2X\36\3\2\2\2YZ\7v\2\2Z[\7"+
		"j\2\2[\\\7g\2\2\\]\7p\2\2] \3\2\2\2^_\7\61\2\2_\"\3\2\2\2`d\t\2\2\2ac"+
		"\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e$\3\2\2\2fd\3\2\2\2g"+
		"i\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k&\3\2\2\2lm\7<\2\2m"+
		"n\7?\2\2n(\3\2\2\2oq\7\17\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2"+
		"s*\3\2\2\2tv\t\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2"+
		"yz\b\26\2\2z,\3\2\2\2\7\2djpw";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
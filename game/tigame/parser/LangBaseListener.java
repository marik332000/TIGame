// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class LangBaseListener implements LangListener {
	@Override public void enterAssign(LangParser.AssignContext ctx) { }
	@Override public void exitAssign(LangParser.AssignContext ctx) { }

	@Override public void enterInt(LangParser.IntContext ctx) { }
	@Override public void exitInt(LangParser.IntContext ctx) { }

	@Override public void enterGlobal(LangParser.GlobalContext ctx) { }
	@Override public void exitGlobal(LangParser.GlobalContext ctx) { }

	@Override public void enterArrayassign(LangParser.ArrayassignContext ctx) { }
	@Override public void exitArrayassign(LangParser.ArrayassignContext ctx) { }

	@Override public void enterGoto(LangParser.GotoContext ctx) { }
	@Override public void exitGoto(LangParser.GotoContext ctx) { }

	@Override public void enterLabel(LangParser.LabelContext ctx) { }
	@Override public void exitLabel(LangParser.LabelContext ctx) { }

	@Override public void enterId(LangParser.IdContext ctx) { }
	@Override public void exitId(LangParser.IdContext ctx) { }

	@Override public void enterAddsub(LangParser.AddsubContext ctx) { }
	@Override public void exitAddsub(LangParser.AddsubContext ctx) { }

	@Override public void enterMuldivmod(LangParser.MuldivmodContext ctx) { }
	@Override public void exitMuldivmod(LangParser.MuldivmodContext ctx) { }

	@Override public void enterProgram(LangParser.ProgramContext ctx) { }
	@Override public void exitProgram(LangParser.ProgramContext ctx) { }

	@Override public void enterIf(LangParser.IfContext ctx) { }
	@Override public void exitIf(LangParser.IfContext ctx) { }

	@Override public void enterParen(LangParser.ParenContext ctx) { }
	@Override public void exitParen(LangParser.ParenContext ctx) { }

	@Override public void enterPcall(LangParser.PcallContext ctx) { }
	@Override public void exitPcall(LangParser.PcallContext ctx) { }

	@Override public void enterEmptyline(LangParser.EmptylineContext ctx) { }
	@Override public void exitEmptyline(LangParser.EmptylineContext ctx) { }

	@Override public void enterArray(LangParser.ArrayContext ctx) { }
	@Override public void exitArray(LangParser.ArrayContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}
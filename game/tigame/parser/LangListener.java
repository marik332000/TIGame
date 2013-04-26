// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LangListener extends ParseTreeListener {
	void enterAssign(LangParser.AssignContext ctx);
	void exitAssign(LangParser.AssignContext ctx);

	void enterIfstatlabel(LangParser.IfstatlabelContext ctx);
	void exitIfstatlabel(LangParser.IfstatlabelContext ctx);

	void enterCmp(LangParser.CmpContext ctx);
	void exitCmp(LangParser.CmpContext ctx);

	void enterGoto(LangParser.GotoContext ctx);
	void exitGoto(LangParser.GotoContext ctx);

	void enterWhile(LangParser.WhileContext ctx);
	void exitWhile(LangParser.WhileContext ctx);

	void enterId(LangParser.IdContext ctx);
	void exitId(LangParser.IdContext ctx);

	void enterBreak(LangParser.BreakContext ctx);
	void exitBreak(LangParser.BreakContext ctx);

	void enterEndif(LangParser.EndifContext ctx);
	void exitEndif(LangParser.EndifContext ctx);

	void enterFile(LangParser.FileContext ctx);
	void exitFile(LangParser.FileContext ctx);

	void enterLoop(LangParser.LoopContext ctx);
	void exitLoop(LangParser.LoopContext ctx);

	void enterElsestat(LangParser.ElsestatContext ctx);
	void exitElsestat(LangParser.ElsestatContext ctx);

	void enterParen(LangParser.ParenContext ctx);
	void exitParen(LangParser.ParenContext ctx);

	void enterIfstat(LangParser.IfstatContext ctx);
	void exitIfstat(LangParser.IfstatContext ctx);

	void enterPcall(LangParser.PcallContext ctx);
	void exitPcall(LangParser.PcallContext ctx);

	void enterEmptyline(LangParser.EmptylineContext ctx);
	void exitEmptyline(LangParser.EmptylineContext ctx);

	void enterNegate(LangParser.NegateContext ctx);
	void exitNegate(LangParser.NegateContext ctx);

	void enterOr(LangParser.OrContext ctx);
	void exitOr(LangParser.OrContext ctx);

	void enterInt(LangParser.IntContext ctx);
	void exitInt(LangParser.IntContext ctx);

	void enterGlobal(LangParser.GlobalContext ctx);
	void exitGlobal(LangParser.GlobalContext ctx);

	void enterArrayassign(LangParser.ArrayassignContext ctx);
	void exitArrayassign(LangParser.ArrayassignContext ctx);

	void enterElselabel(LangParser.ElselabelContext ctx);
	void exitElselabel(LangParser.ElselabelContext ctx);

	void enterLabel(LangParser.LabelContext ctx);
	void exitLabel(LangParser.LabelContext ctx);

	void enterAnd(LangParser.AndContext ctx);
	void exitAnd(LangParser.AndContext ctx);

	void enterNot(LangParser.NotContext ctx);
	void exitNot(LangParser.NotContext ctx);

	void enterAddsub(LangParser.AddsubContext ctx);
	void exitAddsub(LangParser.AddsubContext ctx);

	void enterMuldivmod(LangParser.MuldivmodContext ctx);
	void exitMuldivmod(LangParser.MuldivmodContext ctx);

	void enterForever(LangParser.ForeverContext ctx);
	void exitForever(LangParser.ForeverContext ctx);

	void enterProgram(LangParser.ProgramContext ctx);
	void exitProgram(LangParser.ProgramContext ctx);

	void enterString(LangParser.StringContext ctx);
	void exitString(LangParser.StringContext ctx);

	void enterContinue(LangParser.ContinueContext ctx);
	void exitContinue(LangParser.ContinueContext ctx);

	void enterArray(LangParser.ArrayContext ctx);
	void exitArray(LangParser.ArrayContext ctx);
}
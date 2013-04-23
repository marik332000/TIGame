// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LangListener extends ParseTreeListener {
	void enterAssign(LangParser.AssignContext ctx);
	void exitAssign(LangParser.AssignContext ctx);

	void enterInt(LangParser.IntContext ctx);
	void exitInt(LangParser.IntContext ctx);

	void enterGlobal(LangParser.GlobalContext ctx);
	void exitGlobal(LangParser.GlobalContext ctx);

	void enterArrayassign(LangParser.ArrayassignContext ctx);
	void exitArrayassign(LangParser.ArrayassignContext ctx);

	void enterGoto(LangParser.GotoContext ctx);
	void exitGoto(LangParser.GotoContext ctx);

	void enterLabel(LangParser.LabelContext ctx);
	void exitLabel(LangParser.LabelContext ctx);

	void enterId(LangParser.IdContext ctx);
	void exitId(LangParser.IdContext ctx);

	void enterAddsub(LangParser.AddsubContext ctx);
	void exitAddsub(LangParser.AddsubContext ctx);

	void enterMuldivmod(LangParser.MuldivmodContext ctx);
	void exitMuldivmod(LangParser.MuldivmodContext ctx);

	void enterProgram(LangParser.ProgramContext ctx);
	void exitProgram(LangParser.ProgramContext ctx);

	void enterIf(LangParser.IfContext ctx);
	void exitIf(LangParser.IfContext ctx);

	void enterParen(LangParser.ParenContext ctx);
	void exitParen(LangParser.ParenContext ctx);

	void enterPcall(LangParser.PcallContext ctx);
	void exitPcall(LangParser.PcallContext ctx);

	void enterEmptyline(LangParser.EmptylineContext ctx);
	void exitEmptyline(LangParser.EmptylineContext ctx);

	void enterArray(LangParser.ArrayContext ctx);
	void exitArray(LangParser.ArrayContext ctx);
}
// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	T visitAssign(LangParser.AssignContext ctx);

	T visitIfstatlabel(LangParser.IfstatlabelContext ctx);

	T visitCmp(LangParser.CmpContext ctx);

	T visitGoto(LangParser.GotoContext ctx);

	T visitWhile(LangParser.WhileContext ctx);

	T visitId(LangParser.IdContext ctx);

	T visitBreak(LangParser.BreakContext ctx);

	T visitEndif(LangParser.EndifContext ctx);

	T visitFile(LangParser.FileContext ctx);

	T visitLoop(LangParser.LoopContext ctx);

	T visitElsestat(LangParser.ElsestatContext ctx);

	T visitParen(LangParser.ParenContext ctx);

	T visitIfstat(LangParser.IfstatContext ctx);

	T visitPcall(LangParser.PcallContext ctx);

	T visitEmptyline(LangParser.EmptylineContext ctx);

	T visitNegate(LangParser.NegateContext ctx);

	T visitOr(LangParser.OrContext ctx);

	T visitInt(LangParser.IntContext ctx);

	T visitGlobal(LangParser.GlobalContext ctx);

	T visitArrayassign(LangParser.ArrayassignContext ctx);

	T visitElselabel(LangParser.ElselabelContext ctx);

	T visitLabel(LangParser.LabelContext ctx);

	T visitAnd(LangParser.AndContext ctx);

	T visitNot(LangParser.NotContext ctx);

	T visitAddsub(LangParser.AddsubContext ctx);

	T visitMuldivmod(LangParser.MuldivmodContext ctx);

	T visitForever(LangParser.ForeverContext ctx);

	T visitProgram(LangParser.ProgramContext ctx);

	T visitString(LangParser.StringContext ctx);

	T visitContinue(LangParser.ContinueContext ctx);

	T visitArray(LangParser.ArrayContext ctx);
}
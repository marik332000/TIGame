// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	T visitAssign(LangParser.AssignContext ctx);

	T visitInt(LangParser.IntContext ctx);

	T visitGlobal(LangParser.GlobalContext ctx);

	T visitArrayassign(LangParser.ArrayassignContext ctx);

	T visitGoto(LangParser.GotoContext ctx);

	T visitLabel(LangParser.LabelContext ctx);

	T visitId(LangParser.IdContext ctx);

	T visitAddsub(LangParser.AddsubContext ctx);

	T visitMuldivmod(LangParser.MuldivmodContext ctx);

	T visitProgram(LangParser.ProgramContext ctx);

	T visitIf(LangParser.IfContext ctx);

	T visitParen(LangParser.ParenContext ctx);

	T visitPcall(LangParser.PcallContext ctx);

	T visitEmptyline(LangParser.EmptylineContext ctx);

	T visitArray(LangParser.ArrayContext ctx);
}
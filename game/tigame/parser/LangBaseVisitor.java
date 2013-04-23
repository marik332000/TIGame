// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LangBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LangVisitor<T> {
	@Override public T visitAssign(LangParser.AssignContext ctx) { return visitChildren(ctx); }

	@Override public T visitNegate(LangParser.NegateContext ctx) { return visitChildren(ctx); }

	@Override public T visitOr(LangParser.OrContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LangParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitGlobal(LangParser.GlobalContext ctx) { return visitChildren(ctx); }

	@Override public T visitCmp(LangParser.CmpContext ctx) { return visitChildren(ctx); }

	@Override public T visitArrayassign(LangParser.ArrayassignContext ctx) { return visitChildren(ctx); }

	@Override public T visitGoto(LangParser.GotoContext ctx) { return visitChildren(ctx); }

	@Override public T visitLabel(LangParser.LabelContext ctx) { return visitChildren(ctx); }

	@Override public T visitAnd(LangParser.AndContext ctx) { return visitChildren(ctx); }

	@Override public T visitNot(LangParser.NotContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(LangParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddsub(LangParser.AddsubContext ctx) { return visitChildren(ctx); }

	@Override public T visitMuldivmod(LangParser.MuldivmodContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(LangParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitIf(LangParser.IfContext ctx) { return visitChildren(ctx); }

	@Override public T visitString(LangParser.StringContext ctx) { return visitChildren(ctx); }

	@Override public T visitParen(LangParser.ParenContext ctx) { return visitChildren(ctx); }

	@Override public T visitPcall(LangParser.PcallContext ctx) { return visitChildren(ctx); }

	@Override public T visitEmptyline(LangParser.EmptylineContext ctx) { return visitChildren(ctx); }

	@Override public T visitArray(LangParser.ArrayContext ctx) { return visitChildren(ctx); }
}
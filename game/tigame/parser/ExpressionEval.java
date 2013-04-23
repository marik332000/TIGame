	package tigame.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

import tigame.interp.*;

public class ExpressionEval extends LangBaseVisitor<Expression> implements LangVisitor<Expression> {
	private Program prgm;
	public ExpressionEval(Program prgm) {
		this.prgm = prgm;
	}
	@Override
	public Expression visitInt(LangParser.IntContext ctx) {
		return new Expression.IntegerLiteral(
				Integer.valueOf(ctx.INT().getText())
					);
	}

	@Override
	public Expression visitId(LangParser.IdContext ctx) {
		return new Expression.Variable(ctx.ID().getText(), prgm);
	}

	@Override
	public Expression visitAddsub(LangParser.AddsubContext ctx) {
		char op = ctx.op.getText().trim().charAt(0);
		if(op == '+') {
				return new Expression.Add(
					visit(ctx.expr(0)),
					visit(ctx.expr(1))
				);
		}
		else {
				return new Expression.Subtract(
					visit(ctx.expr(0)),
					visit(ctx.expr(1))
				);
		}
	}

	@Override
	public Expression visitMuldivmod(LangParser.MuldivmodContext ctx) {
		char op = ctx.op.getText().trim().charAt(0);
		if(op == '*') {
				return new Expression.Multiply(
					visit(ctx.expr(0)),
					visit(ctx.expr(1))
				);
		}
		else {
				return new Expression.Divide(
					visit(ctx.expr(0)),
					visit(ctx.expr(1))
				);
		}
	}

	@Override
	public Expression visitParen(LangParser.ParenContext ctx) {
		return visit(ctx.expr());
	}
}

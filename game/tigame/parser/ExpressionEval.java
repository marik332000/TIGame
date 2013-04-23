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
	public Expression visitString(LangParser.StringContext ctx) {
		return new Expression.StringLiteral(ctx.STR().getText());
	}

	@Override
	public Expression visitCmp(LangParser.CmpContext ctx) {
		String op = ctx.getText().trim();
		if( ">".equals(op)) {
			return new Expression.GreaterThan(
				visit(ctx.expr(0)),
				visit(ctx.expr(1))
			);
		}
		else if("<".equals(op)) {
			return new Expression.LessThan(
				visit(ctx.expr(0)),
				visit(ctx.expr(1))
			);
		}
		else if("<=".equals(op)) {
			return new Expression.Or(
					new Expression.LessThan(
						visit(ctx.expr(0)),
						visit(ctx.expr(1))
					),
					new Expression.EqualTo(
						visit(ctx.expr(0)),
						visit(ctx.expr(1))
					)
			);
		}
		else if(">=".equals(op)) {
			return new Expression.Or(
					new Expression.GreaterThan(
						visit(ctx.expr(0)),
						visit(ctx.expr(1))
					),
					new Expression.EqualTo(
						visit(ctx.expr(0)),
						visit(ctx.expr(1))
					)
			);
		}
		else {
			return new Expression.EqualTo(
				visit(ctx.expr(0)),
				visit(ctx.expr(1))
			);
		}
	}

	@Override
	public Expression visitNot(LangParser.NotContext ctx) {
		return new Expression.Not(visit(ctx.expr()));
	}

	@Override
	public Expression visitParen(LangParser.ParenContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public Expression visitNegate(LangParser.NegateContext ctx) {
		return new Expression.Negate(visit(ctx.expr()));
	}

	@Override
	public Expression visitOr(LangParser.OrContext ctx) {
		return new Expression.Or(
				visit(ctx.expr(0)),
				visit(ctx.expr(1))
		);
	}

	@Override
	public Expression visitAnd(LangParser.AndContext ctx) {
		return new Expression.And(
				visit(ctx.expr(0)),
				visit(ctx.expr(1))
		);
	}
}

// Generated from Lang.g4 by ANTLR 4.0

	package tigame.parser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Stack;

import tigame.interp.*;

public class InterpreterGenerator extends LangBaseListener implements LangListener {
	private Program prgm;
	private ExpressionEval visitor;
	private Stack<IfStat> ifstat;
	public InterpreterGenerator() {
		this.prgm = new Program();
		this.visitor = visitor;
		this.ifstat = new Stack<IfStat>();
		this.visitor = new ExpressionEval(this.prgm);
	}
	public Program getProgram() {
		return prgm;
	}
	@Override
	public void enterGlobal(LangParser.GlobalContext ctx) {
		prgm.setGlobal(ctx.ID().getText());
	}
	@Override
	public void enterAssign(LangParser.AssignContext ctx) {
		Assign assign = new Assign(ctx.ID().getText(), visitor.visit(ctx.expr()));
		prgm.addStatement(assign);
	}

	@Override
	public void enterGoto(LangParser.GotoContext ctx) {
		prgm.addStatement(new GotoStat(ctx.ID().getText()));
	}

	@Override
	public void enterLabel(LangParser.LabelContext ctx) {
		prgm.addStatement(prgm.getLabel(ctx.ID().getText()));
	}

	@Override
	public void enterPcall(LangParser.PcallContext ctx) {
		prgm.addStatement(new PCall(ctx.ID().getText()));
	}

	@Override
	public void enterIf(LangParser.IfContext ctx) {
		Expression expr = visitor.visit(ctx.expr());
		IfStat stat = new IfStat(expr);
		ifstat.push(stat);
		prgm.addStatement(stat);
	}
	@Override
	public void exitIf(LangParser.IfContext ctx) {
		EndIf endif = new EndIf();
		ifstat.pop().registerEndIf(endif);
		prgm.addStatement(endif);
	}
	@Override
	public void exitProgram(LangParser.ProgramContext ctx) {
		Program.registerProgram(ctx.ID().getText(), prgm);
	}

}

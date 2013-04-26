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
	private Stack<String> loops;
	private Stack<String> jumps;
	private int loopcount;
	private int jumpcount;
	public InterpreterGenerator() {
		this.ifstat = new Stack<IfStat>();
		this.loops = new Stack<String>();
		this.jumps = new Stack<String>();
	}
	public Program getProgram() {
		return prgm;
	}
	@Override
	public void enterLoop(LangParser.LoopContext ctx) {
		String label_name = "loop$#:"+loopcount++;
		prgm.addStatement(prgm.getLabel(label_name));
		loops.push(label_name);
	}

	@Override
	public void exitLoop(LangParser.LoopContext ctx) {
		String label_name = loops.pop();
		prgm.addStatement(new GotoStat(label_name));
		prgm.addStatement(prgm.getLabel("break:"+label_name));
	}
	@Override
	public void enterWhile(LangParser.WhileContext ctx) {
		Expression expr = visitor.visit(ctx.expr());
		expr = new Expression.Not(expr);
		IfStat ifstat = new IfStat(expr);
		prgm.addStatement(ifstat);

		String label_name = loops.peek();
		prgm.addStatement(new GotoStat("break:"+label_name));

		EndIf endif = new EndIf();
		prgm.addStatement(endif);
		ifstat.registerEndIf(endif);
	}

	@Override
	public void enterBreak(LangParser.BreakContext ctx) {
		String label_name = loops.peek();
		prgm.addStatement(new GotoStat("break:"+label_name));
	}

	@Override
	public void enterContinue(LangParser.ContinueContext ctx) {
		String label_name = loops.peek();
		prgm.addStatement(new GotoStat(label_name));
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
	public void enterArrayassign(LangParser.ArrayassignContext ctx) {
		ArrayAssign assign = new ArrayAssign(
				ctx.ID().getText(),
				visitor.visit(ctx.expr(0)),
				visitor.visit(ctx.expr(1))
				);
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
	public void enterIfstat(LangParser.IfstatContext ctx) {
		Expression expr = visitor.visit(ctx.expr());
		IfStat stat = new IfStat(expr);
		ifstat.push(stat);
		prgm.addStatement(stat);
	}
	@Override
	public void enterEndif(LangParser.EndifContext ctx) {
		EndIf endif = new EndIf();
		ifstat.pop().registerEndIf(endif);
		prgm.addStatement(endif);
	}
	@Override
	public void enterElsestat(LangParser.ElsestatContext ctx) {
		// If coming from the if, skip else section
		String jump_name = "else$"+(jumpcount++);
		prgm.addStatement(new GotoStat(jump_name));
		jumps.push(jump_name);
		// Else section enters here
		EndIf endif = new EndIf();
		prgm.addStatement(endif);
		ifstat.pop().registerEndIf(endif);
	}
	@Override
	public void exitElsestat(LangParser.ElsestatContext ctx) {
		// jump for skipping else section.
		String jump_name = jumps.pop();
		prgm.addStatement(prgm.getLabel(jump_name));
	}

	@Override
	public void enterProgram(LangParser.ProgramContext ctx) {
		this.prgm = new Program();
		this.visitor = new ExpressionEval(this.prgm);
		this.loopcount = 0;
		this.jumpcount = 0;
	}
	@Override
	public void exitProgram(LangParser.ProgramContext ctx) {
		Program.registerProgram(ctx.ID().getText(), prgm);
	}

}

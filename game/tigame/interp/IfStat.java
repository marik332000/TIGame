package tigame.interp;

public class IfStat extends Statement {
	private Expression expr;
	private EndIf endif;
	public IfStat(Expression expr) {
		this.expr = expr;
	}
	public void registerEndIf(EndIf endif) {
		this.endif = endif;
	}

	public void exec() {
		if(expr.eval() == 0) {
			this.endif.exec();
		}
	}
}

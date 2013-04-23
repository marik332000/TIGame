package tigame.interp;

public class Assign extends Statement {
	private String var_name;
	private Expression expr;
	public Assign(String var_name, Expression expr) {
		this.var_name = var_name;
		this.expr = expr;
	}
	public void exec() {
		Integer val = expr.eval();
		super.getProgram().setVariable(var_name, val);
	}
}

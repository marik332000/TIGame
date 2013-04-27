package tigame.interp;

public class ArrayAssign extends Statement {
	private String base_name;
	private Expression index;
	private Expression expr;
	public ArrayAssign(String base_name, Expression index, Expression expr) {
		this.base_name = base_name;
		this.index = index;
		this.expr = expr;
	}
	public void exec() {
		Integer val = expr.eval();
		// literally uses index in name to make associative arrays
		String var_name = base_name + "["+index.eval()+"]";
		if( super.getProgram().isGlobal(base_name) ) {
			super.getProgram().setGlobal(var_name);
		}
		super.getProgram().setVariable(var_name, val);
	}
}

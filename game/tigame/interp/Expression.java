package tigame.interp;

public class Expression {
	public int eval() {
		return 0;
	}

	public static class BinaryExpression extends Expression {
		private Expression op1, op2;

		public BinaryExpression(Expression op1, Expression op2) {
			this.op1 = op1;
			this.op2 = op2;
		}
		protected Expression getOp1() {
			return op1;
		}
		protected Expression getOp2() {
			return op2;
		}
	}
	public static class UnaryExpression extends Expression {
		private Expression op;
		public UnaryExpression(Expression op) {
			this.op = op;
		}
		protected Expression getOp() {
			return op;
		}
	}
	public static class Negate extends UnaryExpression {
		public Negate(Expression op) {
			super(op);
		}
		public int eval() {
			return -getOp().eval();
		}
	}
	public static class Not extends UnaryExpression {
		public Not(Expression op) {
			super(op);
		}
		public int eval() {
			return getOp().eval()==0? 1:0;
		}
	}
	public static class Multiply extends BinaryExpression {
		public Multiply(Expression op1, Expression op2) {
			super(op1,op2);
		}
		public int eval() {
			return getOp1().eval()*getOp2().eval();
		}
	}
	public static class Divide extends BinaryExpression {
		public Divide(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval()/getOp2().eval();
		}
	}
	public static class Add extends BinaryExpression {
		public Add(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval()+getOp2().eval();
		}
	}
	public static class And extends BinaryExpression {
		public And(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return (getOp1().eval() !=0 && getOp2().eval() != 0)? 1:0;
		}
	}
	public static class Or extends BinaryExpression {
		public Or(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return (getOp1().eval() !=0 || getOp2().eval() != 0)?1:0;
		}
	}
	public static class Subtract extends BinaryExpression {
		public Subtract(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval()-getOp2().eval();
		}
	}
	public static class LessThan extends BinaryExpression {
		public LessThan(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval() < getOp2().eval()? 1:0;
		}
	}
	public static class GreaterThan extends BinaryExpression {
		public GreaterThan(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval() > getOp2().eval()? 1:0;
		}
	}
	public static class EqualTo extends BinaryExpression {
		public EqualTo(Expression op1, Expression op2) {
			super(op1, op2);
		}
		public int eval() {
			return getOp1().eval() == getOp2().eval()?1:0;
		}
	}
	public static class IntegerLiteral extends Expression {
		private int val;
		public IntegerLiteral(int val) {
			this.val = val;
		}
		public int eval() {
			return val;
		}
	}
	public static class Variable extends Expression {
		private String name;
		private Program prgm;

		public Variable(String name, Program prgm) {
			this.name = name;
			this.prgm = prgm;
		}
		public int eval() {
			return prgm.getVariable(name);
		}
	}
	public static class StringLiteral extends Expression {
		private int id;
		public StringLiteral(String s) {
			id = Program.registerString(s);
		}
		public int eval() {
			return id;
		}
	}
}

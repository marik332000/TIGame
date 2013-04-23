package tigame.interp;

public class Test2 {
	public static void main(String[] args) {
		Program program = new Program();
		program.addStatement(new Statement());
		program.addStatement(new Statement());
		Expression expr = new Expression.IntegerLiteral(5);
		program.addStatement(new Assign("count", expr));
		program.addStatement(program.getLabel("label1"));
		program.addStatement(new Statement());
		IfStat ifstat = new IfStat(new Expression.Variable("count",program));
		program.addStatement(ifstat);
		program.addStatement(new Statement());
		program.addStatement(new Statement());
		expr = new Expression.Subtract(
				new Expression.Variable("count",program),
				new Expression.IntegerLiteral(1)
				);
		program.addStatement(new Assign("count", expr));
		program.addStatement(new GotoStat("label1"));
		EndIf endif = new EndIf();
		ifstat.registerEndIf(endif);
		program.addStatement(endif);
		program.addStatement(new GotoStat("label2"));
		program.addStatement(new Statement());
		program.addStatement(program.getLabel("label2"));
		program.exec();
	}
}

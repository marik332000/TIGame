package tigame.interp;

public class GotoStat extends Statement {
	private Label label;
	private String label_name;

	public GotoStat(String label_name) {
		this.label_name = label_name;
	}
	public void registerProgram(Program prgm) {
		super.registerProgram(prgm);
		this.label = prgm.getLabel(label_name);
	}
	public void exec() {
		if( ! label.isDefined() ) {
			throw new RuntimeException("Label "+label_name+" not found\n");
		}
		else {
			label.exec();
		}
	}
}

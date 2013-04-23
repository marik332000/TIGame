package tigame.interp;

public class Label extends Statement {
	private boolean defined;
	private String name;

	final public static int UNDEFINED = -1;

	public Label(String name) {
		this.name = name;
		this.defined = false;
	}
	public void registerPC(int pc) {
		if(! this.defined ) {
			this.defined = true;
		}
		else {
			throw new RuntimeException("Label "+name+" defined previously at "+super.getPC()+".");
		}
		super.registerPC(pc);
	}
	public void exec() {
		Program prgm = this.getProgram();
		prgm.setCounter(this.getPC());
	}
	public boolean isDefined() {
		return defined;
	}

	public String toString() {
		return name;
	}
}

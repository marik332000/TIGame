package tigame.interp;

public class PCall extends Statement {
	private String name;
	public PCall(String name) {
		this.name = name;
	}

	public void exec() {
		Program.pcall(name);
	}
}

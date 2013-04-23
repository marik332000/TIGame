package tigame.interp;

public class Statement {
	private Program prgm;
	private int pc;
	public Program getProgram() {
		return prgm;
	}
	public int getPC() {
		return pc;
	}
	public void exec() {
		/* nop */
	}
	public void registerPC(int pc) {
		this.pc = pc;
	}
	public void registerProgram(Program prgm) {
		this.prgm = prgm;
	}
}

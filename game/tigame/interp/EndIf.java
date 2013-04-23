package tigame.interp;

public class EndIf extends Statement {
	public void exec() {
		Program prgm = this.getProgram();
		prgm.setCounter(this.getPC());
	}
}

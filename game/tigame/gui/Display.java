package tigame.gui;

import tigame.interp.Program;

public class Display implements IContext {
	private int keyCode;
	private Screen screen;
	private Program prgm;

	public static Display display;

	public Display(Screen screen) {
		this.screen = screen;
		Display.display = this;
	}
	public int getKeyCode() {
		int code = keyCode;
		keyCode = 0;
		return code;
	}
	public void keyPressed(int keyCode) {
		if(keyCode == 0 ) return;
		this.keyCode = keyCode;
	}
	public void runProgram(String name) {
		screen.fill(0);
		screen.draw();
		this.prgm = Program.getProgram(name);
	}
	public Screen getScreen() {
		return screen;
	}
	public void step() {
		if(prgm != null) {
			try {
				prgm.step();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.err.println("Runtime Error in Program\n");
				prgm = null;
			}
			catch(StackOverflowError e) {
				System.err.println("Stack overflow\n");
				prgm = null;
			}
		}
	}
	public void draw() {
		//screen.draw();
	}
	public void halt() {
		if(prgm != null) {
			prgm.haltAll();
		}
	}
}

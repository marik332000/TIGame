package tigame.interp;

import tigame.gui.*;

public class Builtin extends Program {
	public static void register() {
		PrintErr.register();
		GetPixel.register();
		SetPixel.register();
		GetKey.register();
		DrawString.register();
	}

	public static class PrintErr extends Builtin {
		public static void register() {
			Program.registerProgram("printerr", new PrintErr());
		}
		public void exec() {
			setGlobal("argc");
			int argc = getVariable("argc");
			for(int i=0; i<argc; i++) {
				String name = "arg"+i;
				setGlobal(name);
				int v = getVariable(name);
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}
	public static class GetPixel extends Builtin {
		public static void register() {
			Program.registerProgram("getpixel", new GetPixel());
		}
		public void exec() {
			//if(Display.display == null) return;
			Screen screen = Display.display.getScreen();
			setGlobal("argx");
			setGlobal("argy");
			setGlobal("return");
			int shade = screen.getPixel(getVariable("argx"), getVariable("argy"));
			setVariable("return", shade);
		}
	}
	public static class SetPixel extends Builtin {
		public static void register() {
			Program.registerProgram("setpixel", new SetPixel());
		}
		public void exec() {
			//if(Display.display == null) return;
			Screen screen = Display.display.getScreen();
			setGlobal("argx");
			setGlobal("argy");
			setGlobal("argk");
			int x = getVariable("argx");
			int y = getVariable("argy");
			if( isDefined("argk") ) {
				int k = getVariable("argk");
				screen.setPixel(x,y,k);
			}
			else {
				screen.setPixel(x,y,2);
			}
			screen.draw();
		}
	}
	public static class DrawString extends Builtin {
		public static void register() {
			Program.registerProgram("drawstring", new DrawString());
		}
		public void exec() {
			//if(Display.display == null) return;
			Screen screen = Display.display.getScreen();
			setGlobal("args");
			setGlobal("argx");
			setGlobal("argy");
			setGlobal("argk");
			int x = getVariable("argx");
			int y = getVariable("argy");
			int s = getVariable("args");
			String str = Program.getString(s);
			if( isDefined("argk") ) {
				int k = getVariable("argk");
				screen.drawString(str,x,y,k);
			}
			else {
				screen.drawString(str,x,y);
			}
			screen.draw();
		}
	}
	public static class GetKey extends Builtin {
		public static void register() {
			Program.registerProgram("getkey", new GetKey());
		}
		public void exec() {
			setGlobal("return");
			int key = Display.display.getKeyCode();
			setVariable("return", key);
		}
	}
}

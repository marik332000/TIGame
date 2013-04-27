package tigame.interp;

import tigame.gui.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Builtin extends Program {
	public static void register() {
		PrintErr.register();
		GetPixel.register();
		SetPixel.register();
		GetKey.register();
		DrawString.register();
		Select.register();
		SelectProgram.register();
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
	public static class SelectProgram extends Builtin {
		public static void register() {
			Program.registerProgram("selectprog", new SelectProgram());
		}
		public void exec() {
			System.out.println("Select Program");
			Set<String> prgms = pcalls.keySet();
			String programs[] = new String[prgms.size()];
			int i=0;
			for(String prgm : prgms) {
				programs[i++] = prgm;
			}
			Builtin.Select select = new Builtin.Select("Select Program", programs);
			int index = select.realexec();
			System.out.println("Prgm select closed");
			Display.display.runProgram(programs[index]);
		}
		public void step() {
			exec();
		}
	}
	public static class Select extends Builtin {
		public static void register() {
			Program.registerProgram("select", new Select());
		}
		private String title;
		private String options[];
		private int selected;
		public Select() {}
		public Select(String title, String options[]) {
			this.title = title;
			this.options = options;
			this.selected = 0;
		}
		public void exec() {
			setGlobal("arg0"); // title
			setGlobal("arg1"); // array, options
			setGlobal("arg2"); // array, len
			title = getString(getVariable("arg0"));
			int len = getVariable("arg2");

			options = new String[len];
			for(int i=0; i<len; i++) {
				Expression.Array entry = new Expression.Array(
						"arg1",
						new Expression.IntegerLiteral(i),
						this);
				entry.eval();
				options[i] = getString(entry.eval());
			}

			realexec();

			setGlobal("return");
			setVariable("return", selected);
		}
		public int realexec() {
			selected = 0;
			drawSelect();
			int key;
			do {
				key = Display.display.getKeyCode();
				switch(key) {
					case KeyEvent.VK_UP:
						if( selected > 0 ) {
							selected--;
						}
						drawSelect();
						break;
					case KeyEvent.VK_DOWN:
						if( selected < options.length-1) {
							selected++;
						}
						drawSelect();
						break;
				}
				try {
				Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			} while(!done && key != KeyEvent.VK_ENTER);
			return selected;
		}

		protected void drawSelect() {
			Screen screen = Display.display.getScreen();
			screen.fill(0);
			screen.drawString(title, 2, 2, 3);
			for(int i=selected-4; i<selected+6; i++) {
				if(i<0 || i >= options.length) continue;
				int x_offset = 5+Math.abs(selected-i)+(selected-i)*(selected-i);
				int y_offset = 3+6*(1+(i-(selected-4)));
				screen.drawString(options[i],x_offset, y_offset, i==selected? 2:1);
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

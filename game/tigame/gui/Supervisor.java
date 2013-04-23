package tigame.gui;

import tigame.interp.*;
import tigame.parser.ProgramParser;

import java.util.ArrayList;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.CardLayout;
import java.awt.Container;

public class Supervisor implements KeyListener {
	private int keyCode;

	private int active;
	final private int EDITOR = 0;
	final private int REPL = 2;
	final private int DISP = 1;

	final static String EDITOR_DISP = "EDITOR";
	final static String GENERAL_DISP = "DISP";

	final Screen editor_disp;
	final Screen disp;
	final Container container;

	ArrayList<IContext> context;

	private Editor editor;
	private Display display;

	public Supervisor(Container container, int active) {
		this.active = active;
		editor_disp = new Screen();
		disp = new Screen();

		this.container = container;
		container.setLayout(new CardLayout());
		container.add(editor_disp, EDITOR_DISP);
		container.add(disp, GENERAL_DISP);
		editor = new Editor(editor_disp);
		display = new Display(disp);
		context = new ArrayList<IContext>();
		context.add(editor);
		context.add(display);
		//editor.setText("prgm main\n");
	}
	public Editor getEditor() {
		return editor;
	}
	@Override
	public void keyPressed(KeyEvent e) {

	}
	@Override
	public void keyReleased(KeyEvent e) {
		keyCode = 0;
		switch(e.getKeyCode()) {
			case KeyEvent.VK_INSERT:
				switchContext(DISP);
				break;
			case KeyEvent.VK_HOME:
				switchContext(EDITOR);
				break;
			case KeyEvent.VK_PAGE_UP:
				//switchContext(REPL);
				break;
			default:
				keyCode = e.getKeyCode();
			//System.out.println(KeyEvent.getKeyText(keyCode));
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	public void switchContext(int mode) {
		//if( active == mode) return;
		activeContext().halt();
		active = mode;

		switch(mode) {
			case DISP:
				ProgramParser.parse(editor.getText());
				((CardLayout)container.getLayout()).show(container,GENERAL_DISP);
				display.runProgram("main");
				break;
			case EDITOR:
				((CardLayout)container.getLayout()).show(container,EDITOR_DISP);
				break;
		}
		activeContext().draw();
	}
	public IContext activeContext() {
		return context.get(active);
	}
	public void step() {
		IContext context = activeContext();
		context.keyPressed(keyCode);
		keyCode = 0;
		context.step();
		context.draw();
	}
}

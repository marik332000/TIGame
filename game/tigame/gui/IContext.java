package tigame.gui;

public interface IContext {
	public void keyPressed(int keycode);
	public void draw();
	public void step();
	public void halt();
}

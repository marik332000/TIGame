import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyP {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(30,30);
		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
			//	System.out.println("P:"+e.getKeyCode());
			}
			public void keyReleased(KeyEvent e) {
				System.out.println("R:"+e.getKeyCode());
			}
			public void keyTyped(KeyEvent e) {
			//	System.out.println("T:"+e.getKeyCode());
			}
		});
		frame.setVisible(true);
	}
}

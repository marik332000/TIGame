package tigame;

import javax.swing.JFrame;
import tigame.interp.Builtin;
import tigame.gui.Supervisor;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Run {
	public static void main(String[] args) throws Exception {
		Builtin.register();

		JFrame frame = new JFrame();
		Supervisor s = new Supervisor(frame.getContentPane(),0);
		frame.addKeyListener(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setFocusable( true );
		frame.setResizable( false );
		frame.setVisible( true );
		frame.requestFocus();
		try {
			 File file = new File("base_code.txt");
			 if( file.exists() ) {
			 	String code = "";
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextLine()) {
					code += scanner.nextLine().trim() + "\n";
				}
				s.getEditor().setText(code);
			 }
			 else {
				s.getEditor().setText("prgm main:\n");
			 }
		} catch (IOException e) {
			s.getEditor().setText("prgm main:\n");
			System.err.println("Failed to read base code");
		}
		while(true) {
			frame.requestFocus();
			s.step();
			Thread.sleep(5);
		}
	}
}

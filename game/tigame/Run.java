package tigame;

import javax.swing.JFrame;
import tigame.interp.Builtin;
import tigame.gui.Supervisor;
import tigame.parser.ProgramParser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Run {
	public static void parseFile(File file, Supervisor s) throws IOException {
		String code = "";
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			code += scanner.nextLine().trim() + "\n";
		}
		// running through editor trims some illegal characters
		// and gives more predictable output
		s.getEditor().setText(code);
		ProgramParser.parse(s.getEditor().getText());
	}
	public static void walkCode(File folder, Supervisor s) throws IOException {
		 File[] files = folder.listFiles();
		 if( files != null ) {
		 	for(int i=0; i < files.length; i++) {
				 if( files[i].isFile() ) {
					 parseFile(files[i],s);
				 }
				 else if( files[i].isDirectory() ) {
					 walkCode(files[i],s);
				 }
			 }
		 }
	}
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
			 File folder = new File("code");
			 if( folder.exists() ) {
				 walkCode(folder,s);
			 }

			 s.getEditor().setText("");


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

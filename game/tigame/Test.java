package tigame;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import tigame.interp.*;
import tigame.parser.*;

import java.io.IOException;

public class Test {
	public static Program getProgram(String code) {
		ANTLRInputStream input = new ANTLRInputStream(code);

		LangLexer lexer = new LangLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LangParser parser = new LangParser(tokens);
		ParseTree tree = parser.program();

		ParseTreeWalker walker = new ParseTreeWalker();
		InterpreterGenerator extractor = new InterpreterGenerator();
		walker.walk(extractor, tree);
		Program prgm = extractor.getProgram();
		return prgm;
	}
	public static void main(String[] args) throws IOException {
		Builtin.register();
		String code =
			"prgm factorial\n" +
			"global argc\n" +
			"global arg0\n" +
			"ii := 0\n" +
			"m := 1\n" +
			"n := 5\n" +
			"start:\n" +
			"if n-ii then\n" +
			"  ii:=ii+1\n" +
			"  m :=ii*m\n" +
			"  goto start\n" +
			"endif\n" +
			"argc := 1\n"+
			"arg0 := m\n"+
			"printerr\n";
		Program prgm = getProgram(code);
		Program.pcall("factorial");
	}
}

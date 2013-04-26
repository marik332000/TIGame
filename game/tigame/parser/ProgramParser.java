package tigame.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import tigame.interp.Program;

public class ProgramParser {
	public static void parse(String code) {
		Program prgm = null;
		try {
			ANTLRInputStream input = new ANTLRInputStream(code);

			LangLexer lexer = new LangLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LangParser parser = new LangParser(tokens);
			ParseTree tree = parser.file();

			ParseTreeWalker walker = new ParseTreeWalker();
			InterpreterGenerator extractor = new InterpreterGenerator();
			walker.walk(extractor, tree);
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
}


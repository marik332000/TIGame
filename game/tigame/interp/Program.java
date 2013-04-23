package tigame.interp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program extends Statement {
	private static Map<String, Program> pcalls = new HashMap<String, Program>();
	private static Map<String, Integer> global_vars = new HashMap<String, Integer>();
	private static ArrayList<String> strs = new ArrayList<String>();
	private Set<String> defined_global;
	private ArrayList<Statement> statements;
	private Map<String, Integer> vars;
	private Map<String, Label> labels;
	private static int level = 0;
	private static int max_level = 10000;
	private static boolean done;

	public void haltAll() {
		done = true;
	}

	public static void registerProgram(String name, Program prgm) {
		pcalls.put(name,prgm);
	}
	public static void pcall(String name) {
		done = false;
		Program prgm = getProgram(name);
		if( prgm == null ) {
			throw new RuntimeException(name+": no such program.");
		}
		level++;
		if(level < max_level) {
			getProgram(name).exec();
		}
		else {
			System.err.println("Stack Overflow: Depth too large: max "+max_level);
			throw new StackOverflowError();
		}
		level--;
	}
	public static Program getProgram(String name) {
		done = false;
		if(pcalls.containsKey(name)) {
			return pcalls.get(name);
		}
		else {
			return null;//throw new RuntimeException(name+": no such program.");
		}
	}
	public static int registerString(String str) {
		strs.add(str);
		return strs.size()-1;
	}
	public static String getString(int id) {
		if( id <0 || id > strs.size() ) return null;
		return strs.get(id);
	}
	private int pc;
	public Program() {
		done = false;
		statements = new ArrayList<Statement>();
		vars = new HashMap<String,Integer>();
		labels = new HashMap<String, Label>();
		defined_global = new HashSet<String>();
	}
	public void setCounter(int pc) {
		this.pc = pc;
	}
	public int getCounter() {
		return pc;
	}
	public void setGlobal(String var) {
		defined_global.add(var);
	}
	public boolean isGlobal(String var) {
		return defined_global.contains(var);
	}
	public void setVariable(String var, int num) {
		if( isGlobal(var) ) {
			global_vars.put(var, num);
		}
		else {
			vars.put(var, num);
		}
	}
	public boolean isDefined(String var) {
		if( isGlobal(var) ) {
			return global_vars.containsKey(var);
		}
		else {
			return vars.containsKey(var);
		}
	}
	public int getVariable(String var) {
		if(! isDefined(var) )
			throw new RuntimeException("Variable "+var+" undefined.");
		if( isGlobal(var) ) {
			return global_vars.get(var);
		}
		else {
			return vars.get(var);
		}
	}
	public void addStatement(Statement stat) {
		stat.registerPC(statements.size());
		stat.registerProgram(this);
		statements.add(stat);
	}
	public Label getLabel(String name) {
		if( labels.containsKey(name) ) {
			return labels.get(name);
		}
		else {
			Label label = new Label(name);
			labels.put(name, label);
			return label;
		}
	}
	public boolean isDone() {
		return pc >= statements.size() || done;
	}
	public void step() {
		if(!isDone()) {
			Statement stat = statements.get(pc);
			stat.exec();
			pc++;
		}
	}
	public void exec() {
		while(pc < statements.size() && !done) {
			Statement stat = statements.get(pc);
			stat.exec();
			pc++;
		}
	}
}

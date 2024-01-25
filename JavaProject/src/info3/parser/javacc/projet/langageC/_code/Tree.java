package info3.parser.javacc.projet.langageC._code;

import info3.shared.Dot;
import info3.shared.Format;

public class Tree implements ITree {

	// SHARED : GLOBAL VARIABLE, CONSTANT

	public static final Tree NIL;

	public static Format format;

	public static int global_last_line_number;

	static {
		format = Format.XTERM;
		NIL = new Tree();
		global_last_line_number = -1;
	}

	// FIELDS : GIVEN

	public int line_number;
	public Tree first_instruction;

	// CONSTRUCTOR

	public Tree() {
		line_number = -1;
		first_instruction = null;
	}

	// PREDICATE

	public boolean isEmpty() {
		return this == NIL;
	}

	// PRETTY

	String newline(int d) {
		// TODO à modifier
		/*
		 * { return null; }
		 */
		String indent = "";
		for (int i = 0; i < d; i++) {
			indent += "    "; // Ajoute 4 espaces pour chaque niveau d'indentation
		}
		return indent;
	}

	public String pretty_with_line_number(int indentation) { // GIVEN
		this.line_number = global_last_line_number;
		String string = pretty(indentation);
		return string;
	}

	// TODO INFO3 : to be overriden in each subclass
	public String pretty(int indentation) {
		return "pretty: not implemented";
	}

	String pretty() {
		return pretty(0);
	}

	// CFG = CONTROL FLOW GRAPH = AUTOMATON

	// To be overriden in each subclass
	public Tree first_instruction() { // GIVEN
		return null;
	}

	// To be overriden in each subclass
	public String cfg(int src, int tgt, int exit) { // GIVEN
		return Dot.edge(src, format, pretty(), tgt);
	}

}
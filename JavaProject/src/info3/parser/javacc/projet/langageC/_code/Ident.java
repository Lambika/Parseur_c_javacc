package info3.parser.javacc.projet.langageC._code;

import info3.shared.Format;

public class Ident extends Tree implements ITree {

	String name;

	// CONSTRUCTOR

	public Ident(String name) {
		this.name = name;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String();
		string += newline(d) + this.name ;
		return Pretty.value(format, string);
	}
}
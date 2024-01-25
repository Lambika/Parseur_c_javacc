package info3.parser.javacc.projet.langageC._code;

import info3.shared.Format;

public class Parenthesis extends Tree implements ITree {
	
	//
	Tree content;

	// CONSTRUCTOR

	public Parenthesis(Tree content) {
		//
		this.content = content;
	}

	// PRETTY

	/* @........ */

	public String pretty(int d) {
		// TODO à modifier
		String string = new String();
		string+= Pretty.pa(format, "(") ;
		string+=content.pretty();
		string+= Pretty.pa(format, ")") ;
		return string ;
	}

}
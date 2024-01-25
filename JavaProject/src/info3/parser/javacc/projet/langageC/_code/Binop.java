package info3.parser.javacc.projet.langageC._code;

import info3.shared.Format;

public class Binop extends Tree implements ITree {

	/*
	 * ................... ................ ...................
	 */
	Tree lhs;
	String op;
	Tree rhs ;
	
	

	public Binop(Tree lhs, String op, Tree rhs) {
		this.lhs = lhs ;
		this.op = op ;
		this.rhs = rhs ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String() ; 
		string+=this.lhs.pretty(d);
		//string+=" ";
		string+=Pretty.op(format, this.op);
		//string+=" ";
		string+=this.rhs.pretty(d);
		return Pretty.binop(format,string);
	}

}
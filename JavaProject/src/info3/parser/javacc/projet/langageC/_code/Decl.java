package info3.parser.javacc.projet.langageC._code;

import info3.shared.Format;

public class Decl extends Tree implements ITree {

	String type;
	Tree var;

	// CONSTRUCTOR

	public Decl(String type, Tree var) {
		this.type = type ;
		this.var = var ; 
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String() ;
		//string += newline(d);
		string += "\t\t"+this.type  + this.var.pretty(d);
		string+=";\n"+newline(d);
		return Pretty.string(format, string) ;
	}

	// CFG

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

}
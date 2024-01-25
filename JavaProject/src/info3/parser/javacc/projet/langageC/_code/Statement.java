package info3.parser.javacc.projet.langageC._code;

public class Statement extends Tree implements ITree {

	/* .......... */
	Tree express ; 
	
	
	
	// CONSTRUCTOR

	public Statement(Tree expr) {
		this.express = expr ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		return this.express.pretty(d) + Pretty.cro(format, ";") ;
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
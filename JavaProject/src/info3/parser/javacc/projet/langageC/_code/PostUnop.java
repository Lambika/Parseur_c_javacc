package info3.parser.javacc.projet.langageC._code;

public class PostUnop extends Tree implements ITree {

	Tree operand;
	String op;

	// CONSTRUCTOR

	public PostUnop(Tree t, String s) {
		this.operand = t ;
		this.op = s ;
	}

	// PRETTY

	// TODO à compléter
	
	public String pretty(int d) {
		String string = new String() ;
		string += this.operand.pretty(d) + Pretty.op(format, this.op) +";" ;
		return Pretty.balanced(format, string);
	}

}
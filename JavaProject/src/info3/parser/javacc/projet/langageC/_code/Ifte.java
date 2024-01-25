package info3.parser.javacc.projet.langageC._code;

import info3.shared.Format;

public class Ifte extends Tree implements ITree {

	/* .................................. */
	
	Tree cond ;
	Tree then_block ;
	Tree else_block ;

	// CONSTRUCTOR

	public Ifte(Tree cond, Tree then_block, Tree else_block) {
		this.cond = cond ;
		this.else_block = else_block ;
		this.then_block = then_block ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String() ; 
		string += this.newline(d) + Pretty.ifel(format, "if");
		string += Pretty.pa(format, "(")  + this.cond.pretty(d)+Pretty.pa(format, ")") +Pretty.cro(format, "{")+"\n\t";
		string += this.then_block.pretty(d+1) + "\n";
		string += newline(d) + "\t"+Pretty.cro(format, "}")+ Pretty.ifel(format, "else")+ Pretty.cro(format, "{")+"\n\t\t" ;
		string+= this.else_block.pretty(d) ;
		string += "\n";
		string += newline(d) + "\t"+Pretty.cro(format, "}")+"\n" ;//+newline(d);
		return string ;
	}

	// CFG

	@Override
	public String cfg(int src, int target, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

}
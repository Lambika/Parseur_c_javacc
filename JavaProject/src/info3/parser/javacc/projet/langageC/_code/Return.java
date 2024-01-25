package info3.parser.javacc.projet.langageC._code;

import info3.shared.Dot;
import info3.shared.Format;

public class Return extends Tree implements ITree {

	/* .......... */
	Tree expres ;

	public Return(Tree expr) {
		this.expres = expr ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		return newline(d) + Pretty.balanced(format, "return")  + this.expres.pretty(d) + ";" ;
	}

	// CFG

	@Override
	public String cfg(int src, int __, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

	// INFORMATION

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}
}
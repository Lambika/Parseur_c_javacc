package info3.parser.javacc.projet.langageC._code;

public class While extends Tree implements ITree {

	Tree cond;
	Tree body;

	public While(Tree cond, Tree body) {
		this.cond = cond ;
		this.body = body ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String() ; 
		string += newline(d) +Pretty.ifel(format, "while")+ Pretty.pa(format,"(")+this.cond.pretty(d)+Pretty.pa(format,")")+Pretty.cro(format, "{")+"\n\t";
		string += this.body.pretty(d+1)+"\n";
		string += newline(d) + Pretty.cro(format,"}");
		return string ;
	}

	// CFG

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

	@Override
	public String cfg(int src, int tgt, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

}
package info3.parser.javacc.projet.langageC._code;

public class Block extends Tree implements ITree {

	Tree sequence;

	// CONSTRUCTOR

	public Block(Tree t) {
		this.sequence = t;
	}

	// PREDICATE

	@Override
	public boolean isEmpty() {
		// TODO à modifier
		return this.sequence == null ;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		if (sequence.isEmpty()) {
			string += "Empty Sequence";
		} else {
			string += sequence.pretty(d + 1);
		}
		return string;
	}

	// CFG

	@Override
	public String cfg(int src, int tgt, int exit) {
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
package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;

public class Call extends Tree implements ITree {

	Tree fun;
	ArrayList<Tree> args;

	// CONSTRUCTOR

	public Call(Tree t, ArrayList<Tree> ts) {
		this.fun = t ;
		this.args = ts;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		String string = new String();
		string += this.fun.pretty(d) + "(" ;
		for ( int i = 0 ; i < this.args.size() ; i++ ) {
			string+=this.args.get(i) ;
			if ( i < this.args.size() - 1 ) {
				string+=",";
			}
		}
		string+=")";
		return string ;
		
	}

}
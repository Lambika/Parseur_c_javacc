package info3.parser.javacc.projet.langageC._code;

public class PreUnop extends Tree implements ITree {

	// TODO à compléter
	String op ;
	Tree operande ;
	
	
	
	// CONSTRUCTOR

	public PreUnop(String s, Tree t) {
		this.op = s ;
		this.operande = t ;
	}

	// PRETTY

	// TODO à compléter
	@Override
    public String pretty(int d) {
        return this.op + this.operande.pretty(d);
	}

}
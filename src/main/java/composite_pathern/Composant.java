package composite_pathern;

public abstract class Composant {
	
	
	protected String nom;
	protected int level ;
	
	
	
	public Composant(String nom) {
		super();
		this.nom = nom;
	}




	public abstract void print() ;
	
	public String getTab() {
		String tab = "" ;
		for (int i=0; i<level; i++)
			tab += "\t" ;
		return tab;
	}

}

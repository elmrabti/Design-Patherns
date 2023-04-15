package composite_pathern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {
	
	private List<Composant> composants = new ArrayList<>() ;

	public Folder(String nom) {
		super(nom);
		
	}

	@Override
	public void print() {
		System.out.println(getTab()+"Folder "+nom);
		for (Composant c : composants)
			c.print();
		
	}
	
	
	
	public Composant addChild(Composant composant) {
		composant.level = this.level +1 ;
		this.composants.add(composant) ;
		return composant;
	}
	

}

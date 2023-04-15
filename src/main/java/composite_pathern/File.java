package composite_pathern;

public class File extends Composant {

	public File(String nom) {
		super(nom);
		
	}

	@Override
	public void print() {
		System.out.println(getTab()+"File "+nom);
		
	}

}

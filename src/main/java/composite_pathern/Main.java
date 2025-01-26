package composite_pathern;

public class Main {

	public static void main(String[] args) {

		Folder folder = new Folder("racine");

		folder.addChild(new File("projet.java") ) ;
		folder.addChild(new File("config.properties") ) ;
		
		Folder folderSec = (Folder) folder.addChild(new Folder("ressources") ) ;
		
		folderSec.addChild(new File("creation.sql") ) ;
		Folder folderTest = (Folder) folderSec.addChild(new Folder("test") );
		folderTest.addChild(new File("test1.java")) ;

		folder.print();

	}

}

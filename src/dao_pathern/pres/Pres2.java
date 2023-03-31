package dao_pathern.pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao_pathern.dao.DaoImp;
import dao_pathern.dao.IDao;
import dao_pathern.metier.IMetier;
import dao_pathern.metier.MetierImp;

public class Pres2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
		Scanner scanner = new Scanner(new File("config.txt")) ;  //Fichier dans la racine de projet
		
		// DaoImp dao = new DaoImp() ; // Static

		String daoClassName = scanner.nextLine() ; //Lire la classe DaoImp...
		Class cDao = Class.forName(daoClassName) ;
		IDao dao = (IDao) cDao.getConstructor().newInstance() ; // new DaoImp()
			
		
		//MetierImp metier = new MetierImp()  //Static  
		
		String metierClassName = scanner.nextLine() ;
		Class cMetier = Class.forName(metierClassName) ;
		IMetier metier = (IMetier) cMetier.getConstructor().newInstance() ;
		
		
		
		//metier.setDao(dao); // Static
		
		Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class) ; 
		// puisqu'on peut pas appeler setDao() de metier directement parceque metier de type
		// IMetier qui ne contient pas pas setDao()
		// Donc on appelle la methode dynamiquement 
		// On appelle setDao de la classe cMetier qui est définit dynamiquement
		setDao.invoke(metier, dao) ;
		
		
		
		
		System.out.println(metier.calcul() );
		
		

	}

}

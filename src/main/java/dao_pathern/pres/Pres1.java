package dao_pathern.pres;

import dao_pathern.dao.DaoImp;
import dao_pathern.dao.DaoImp2;
import dao_pathern.metier.MetierImp;

public class Pres1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetierImp metier = new MetierImp() ;
		DaoImp dao = new DaoImp() ;
		metier.setDao(dao);
		System.out.println(metier.calcul() );
		
		DaoImp2 dao2 = new DaoImp2() ;
		metier.setDao(dao2);
		System.out.println(metier.calcul() );
		

	}

}

package dao_pathern.dao;

import org.springframework.stereotype.Component;

//@Component("dao_bd")
public class DaoImp implements IDao {

	
	@Override
	public double getData() {
		System.out.println("Valeur r�cup�r�e par la base de donn�es");
		double data = 19 ;
		return data ;
	}

}

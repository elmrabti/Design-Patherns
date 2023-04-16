package dao_pathern.dao;

import org.springframework.stereotype.Component;

//@Component("dao_bd")
public class DaoImp implements IDao {

	
	@Override
	public double getData() {
		System.out.println("Valeur récupérée par la base de données");
		double data = 19 ;
		return data ;
	}

}

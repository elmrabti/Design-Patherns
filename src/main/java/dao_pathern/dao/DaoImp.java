package dao_pathern.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao_bd")
public class DaoImp implements IDao {

	
	@Override
	public double getData() {
		System.out.println("Valeur recuperee par la base de donnees");
		double data = 19 ;
		return data ;
	}

}

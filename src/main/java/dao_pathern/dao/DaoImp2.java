package dao_pathern.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao_ws")
@Repository
public class DaoImp2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Valeur récupérée par le web service");
		double data = 25 ;
		return data ;
	}

}

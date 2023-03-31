package dao_pathern.dao;

public class DaoImp implements IDao {

	@Override
	public double getData() {
		System.out.println("Valeur récupérée par la base de données");
		double data = 19 ;
		return data ;
	}

}

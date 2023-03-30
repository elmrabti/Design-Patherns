package dao_pathern.dao;

public class DaoImp implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("Valeur récupérée par la base de données");
		double data = 19 ;
		return data ;
	}

}

package dao_pathern.dao;

public class DaoImp2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Valeur r�cup�r�e par le web service");
		double data = 25 ;
		return data ;
	}

}

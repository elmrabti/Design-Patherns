package dao_pathern.dao;

public class DaoImp implements IDao {

	@Override
	public double getData() {
		System.out.println("Valeur r�cup�r�e par la base de donn�es");
		double data = 19 ;
		return data ;
	}

}
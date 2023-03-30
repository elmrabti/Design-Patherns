package dao_pathern.metier;

import dao_pathern.dao.IDao;

public class MetierImp implements IMetier {
	
	private IDao dao ;  // Couplage faible
  
	@Override
	public double calcul() {
		double data = dao.getData() ;
		double res = data * 15 ;
 		return res ;
	}

	public void setDao(IDao dao) {
		// Pour injecter dans la variable un objet de type dao
		this.dao = dao;
	}

}

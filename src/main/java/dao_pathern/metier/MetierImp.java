package dao_pathern.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao_pathern.dao.IDao;

//@Component
@Service
public class MetierImp implements IMetier {
	
	//@Autowired
	//@Qualifier("dao_ws")
	private IDao dao ;  // Couplage faible
	
	
	public MetierImp(IDao dao) {
		this.dao = dao;
		System.out.println("Consructeur MetierImp");
	}

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

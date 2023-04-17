package proxy_pathern;

public class Proxy implements IService {

	private ServiceImp service = new ServiceImp() ;
	
	public double compute(double val) {
										
		System.out.println("Before proxy");
		double resultat = service.compute(val) ;
		System.out.println("After proxy");

		return resultat;
	}

}

package proxy_pathern;

public class Proxy implements IService {

	private ServiceImp service = new ServiceImp() ;
	
	@Override
	public double compute(double val) {
										
		System.out.println("Before proxy");
		double resultat = service.compute(val) ;
		System.out.println("Before proxy");

		return resultat;
	}

}

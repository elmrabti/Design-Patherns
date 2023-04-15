package proxy_pathern;

public class Context {
	
	private IService service ;
	
	public void compute(double val) {
		System.out.println("==============");
		double result = service.compute(val) ;
		System.out.println(result);
		System.out.println("==============");

	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	
	

}

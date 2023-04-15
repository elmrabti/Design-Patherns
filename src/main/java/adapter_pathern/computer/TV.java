package adapter_pathern.computer;
import java.lang.String;


public class TV implements Hdmi {

	public void view(byte[] data) {
		
		System.out.println(",,,,,,,,,,,TV,,,,,,,,,,,");
		String message = new String(data) ;
		//System.out.println(massage);
		System.out.println(",,,,,,,,,,,TV,,,,,,,,,,,");
		

	}

}

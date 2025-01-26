package adapter_pathern.adapter;

import adapter_pathern.computer.Hdmi;
import adapter_pathern.computer.TV;
import adapter_pathern.computer.Vga;

public class HdmiVgaAdapterHerit extends TV implements Vga {

	
	public void print(String message) {
		System.out.println("=========Adapter avec heritage==========");
		byte[] bytes = message.getBytes() ;
		super.view(bytes);
		System.out.println("=========Adapter avec heritage==========");

	}

	
	

}

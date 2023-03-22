package adapter_pathern.adapter;

import adapter_pathern.computer.Hdmi;
import adapter_pathern.computer.Vga;

public class HdmiVgaAdapter implements Vga {

	private Hdmi hdmi ;
	
	@Override
	public void print(String message) {
		System.out.println("=========Adapter==========");
		byte[] bytes = message.getBytes() ;
		hdmi.view(bytes);
		System.out.println("=========Adapter==========");

	}

	public void setHdmi(Hdmi hdmi) {
		this.hdmi = hdmi;
	}
	
	

}

package adapter_pathern;

import adapter_pathern.adapter.HdmiVgaAdapter;
import adapter_pathern.adapter.HdmiVgaAdapterHerit;
import adapter_pathern.computer.Monitor;
import adapter_pathern.computer.TV;
import adapter_pathern.computer.UniteCentrale;
import adapter_pathern.computer.VideoProjector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniteCentrale uniteCentral = new UniteCentrale() ;
		uniteCentral.setVga(new VideoProjector() );
		uniteCentral.print("Hello World");
		
		HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter() ;
		hdmiVgaAdapter.setHdmi(new TV() );
		uniteCentral.setVga(hdmiVgaAdapter);
		uniteCentral.print("Bonjour");
		
		HdmiVgaAdapterHerit hdmiVgaAdapterHerit = new HdmiVgaAdapterHerit() ;
		uniteCentral.setVga(hdmiVgaAdapterHerit);
		uniteCentral.print("Good evening");

	}

}

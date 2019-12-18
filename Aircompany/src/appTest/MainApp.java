package appTest;

import FlayTyps.*;
import Flayers.Flayer;

public class MainApp {

	public static void main(String[] args) {
		// I fill array here. It can be created separate class for this.
		
		AppRequest app=new AppRequest();
		Flayer[]flayers=new Flayer[5];
		flayers[0]=new SmallFlyear("Sikorski",1500,210,20,1000);
		flayers[1]=new MiddleFlayer("Antonow",2000,300,10,2000);
		
		app.appConsole(flayers);
	}

}

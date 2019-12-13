package lab2.test;
import lab2.model.*;
import lab2.store.*;
import Products.*;

public class TestApp {

	private WoodDirectory wd=new WoodDirectory();
	private ProductStore ps=new ProductStore();
	private void startApp() {
		ps.addTimber(new Timber(wd.get(1),5f,0.5f,0.4f));
		ps.addTimber(new Timber(wd.get(2),10f,0.5f,0.4f));
		ps.addTimber(new Cylinder(wd.get(1),5f,4f));
		ps.addTimber(new Cylinder(wd.get(1),11f,2f));
		System.out.println(wd);
		System.out.println(ps);
		System.out.printf("General weight: %1.3f", calcWeight());
		
	}
	private float calcWeight() {
		float full_weight=0;
		for(AbstractTimber el:ps.getTimmb()) {
			full_weight+=el.weight();
		}
		return full_weight;
	}
	public static void main(String[] args) {
		
//		WoodDirectory wd=new WoodDirectory();
//		System.out.println(wd.get(3)+"\n");
//		Wood w=new Wood(4,"Dub",1f);
//		if(wd.add(w)) {
//			System.out.println(wd);
//		}
//		if(!wd.add(w)) {
//			System.out.println(w+" exist!");
//		}
		
//		TestApp app=new TestApp();
//		app.startApp();
		

	}

}

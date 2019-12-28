package car;

import java.util.Random;
import car.Material;

public class Handlebar {

	double diametr;
	String material;
	
	public Handlebar() {

		diametr=randomDiametr();
		material=randomMaterial();
	}
	public Handlebar(double diametr, String material) {
	
		this.diametr = diametr;
		this.material = material;
	}
	public double getDiametr() {
		return diametr;
	}
	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Diametr:" + diametr + ",\nmaterial:" + material;
	}
	
	public String randomMaterial() {
		Random rnd=new Random();
		return Material.values()[rnd.nextInt(2)].toString();
	}
	public double randomDiametr() {
		Random rnd=new Random();
		return (200.0+rnd.nextDouble()+301);
	}
}

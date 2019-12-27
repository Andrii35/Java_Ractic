package car;

import java.util.Random;
import car.Material;

public class Handlebar {

	double diametr;
	String material;
	
	public Handlebar() {

		diametr=200;
		material=randomMaterial();
	}
	public Handlebar(double diametr, String material) {
	
		this.diametr = diametr;
		this.material = material;
	}
	private double getDiametr() {
		return diametr;
	}
	private void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	private String getMaterial() {
		return material;
	}
	private void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Diametr:" + diametr + ",\nmaterial:" + material;
	}
	
	public String randomMaterial() {
		Random rnd=new Random();
		Material mat = null;
		return mat.values()[rnd.nextInt(2)].toString();
	}
}

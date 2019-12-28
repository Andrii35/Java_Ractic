package car;

import java.util.Random;

public class Engeene {

	int zylinder;

	public Engeene() {
		zylinder=randomZylinder();
	}
	public Engeene(int zylinder) {
		
		this.zylinder = zylinder;
	}
	public int getZylinder() {
		return zylinder;
	}
	public void setZylinder(int zylinder) {
		this.zylinder = zylinder;
	}
	@Override
	public String toString() {
		return "Engeene have " + zylinder+ " zylinder";
	}
	public int randomZylinder() {
		Random rnd=new Random();
		return (2+rnd.nextInt(9));
		}
}

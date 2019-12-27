package car;

public class Engeene {

	int zylinder;

	public Engeene() {
		zylinder=2;
	}
	public Engeene(int zylinder) {
		
		this.zylinder = zylinder;
	}
	private int getZylinder() {
		return zylinder;
	}
	private void setZylinder(int zylinder) {
		this.zylinder = zylinder;
	}
	@Override
	public String toString() {
		return "Engeene have " + zylinder+ " zylinder";
	}
	
}

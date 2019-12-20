package su27Control;

public abstract class Plane {

	double length;
	double bright;
	double weight;
	
	public Plane() {
		length=0;
		bright=0;
		weight=0;
	}
	
	public Plane(double length, double bright, double weight) {
		this();
		this.length = length;
		this.bright = bright;
		this.weight = weight;
	}

	
	private double getLength() {
		return length;
	}

	private void setLength(double length) {
		this.length = length;
	}

	private double getBright() {
		return bright;
	}

	private void setBright(double bright) {
		this.bright = bright;
	}

	private double getWeight() {
		return weight;
	}

	private void setWeight(double weight) {
		this.weight = weight;
	}

	public void startEngene() {
		System.out.println("To flyeng  "+(int)(22+Math.random()*88+1)+" seconds");
	}
	public void planeFly() {
		System.out.println("Plane can fly "+Math.random()*10000+" km");
	}
	public void planeLanding() {
		System.out.println("Plain landing");
	}
	
}

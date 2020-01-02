package verchovnaRada;

public class Human {

	private double weight;
	private double hight;
	
	
	public Human() {
		
		this.weight = 0;
		this.hight = 0;
	}
	public Human(double weight, double hight) {
	
		this.weight = weight;
		this.hight = hight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	@Override
	public String toString() {
		return "Weight: " + weight + "\nHeight=" + hight;
	}
	
	
	
}

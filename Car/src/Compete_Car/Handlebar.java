package Compete_Car;

public class Handlebar {
private int radius;
private String type;
public Handlebar() {
	radius=20;
	type="usual";
}
public Handlebar(int radius, String type) {
	this();
	this.radius = radius;
	this.type = type;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public void changeHanlebar(int rad, String typ) {
	radius=rad;
	type=typ;
}

public String toString() {
	return "Handlebar: \n[Radius: "+radius+"\nType: "+type;
}
}

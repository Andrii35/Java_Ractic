package Compete_Car;

public class Handlebar {
int radius;
String type;
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


}

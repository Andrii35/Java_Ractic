package Compete_Car;

public class Weel {
private int radius;
private String mark;
public Weel() {
	radius=13;
	mark="Rosava";
}
public Weel(int radius, String mark) {
	this();
	this.radius = radius;
	this.mark = mark;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public String getMark() {
	return mark;
}
public void setMark(String mark) {
	this.mark = mark;
}
public String toString() {
	return "Weels: \n[Radius: "+radius+"\nMark: "+mark;
}

}

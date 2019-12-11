package Compete_Car;

public class Car {
private CarBody cb=new CarBody();
private Handlebar hb=new Handlebar();
private Weel wells=new Weel();
private String color;
private int ps;
public Car() {
	color="weight";
	ps=65;
}
public Car(CarBody cb, Handlebar hb, Weel wells, String color, int ps) {
	this();
	this.cb = cb;
	this.hb = hb;
	this.wells = wells;
	this.color = color;
	this.ps = ps;
}
public CarBody getCb() {
	return cb;
}
public void setCb(CarBody cb) {
	this.cb = cb;
}
public Handlebar getHb() {
	return hb;
}
public void setHb(Handlebar hb) {
	this.hb = hb;
}
public Weel getWells() {
	return wells;
}
public void setWells(Weel wells) {
	this.wells = wells;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPs() {
	return ps;
}
public void setPs(int ps) {
	this.ps = ps;
}
@Override
public String toString() {
	return "Car [Carbody=" + cb + ",\n Handlebar=" + hb + ",\n weels=" + wells + ",\n color=" + color + ",\n ps=" + ps + "]";
}
public void addPs() {
	ps+=10;
}

}

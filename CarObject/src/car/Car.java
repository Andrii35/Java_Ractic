package car;

public class Car {

	private int ps;
	private int year;
	private Engeene engeene;
	private Handlebar hb;
	
	public Car() {
		ps=20;
		year=0;
		engeene=new Engeene();
		hb=new Handlebar();
	}
	public Car(int ps, int year, Engeene engeene, Handlebar hb) {
		this();
		this.ps = ps;
		this.year = year;
		this.engeene = engeene;
		this.hb = hb;
	}
	private int getPs() {
		return ps;
	}
	private void setPs(int ps) {
		this.ps = ps;
	}
	private int getYear() {
		return year;
	}
	private void setYear(int year) {
		this.year = year;
	}
	private Engeene getEngeene() {
		return engeene;
	}
	private void setEngeene(Engeene engeene) {
		this.engeene = engeene;
	}
	private Handlebar getHb() {
		return hb;
	}
	private void setHb(Handlebar hb) {
		this.hb = hb;
	}
	
	
	
	
	
}

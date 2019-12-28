package car;

import java.util.Random;

public class Car {

	private int ps;
	private int year;
	private Engeene engeene;
	private Handlebar hb;
	
	public Car() {
		ps=randomPSAndYear(40,540);
		year=randomPSAndYear(2000,2019);
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
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Engeene getEngeene() {
		return engeene;
	}
	public void setEngeene(Engeene engeene) {
		this.engeene = engeene;
	}
	public Handlebar getHb() {
		return hb;
	}
	public void setHb(Handlebar hb) {
		this.hb = hb;
	}
	@Override
	public String toString() {
		return "\nCar have " + ps +" ps"+ ",\nyear:" + year + "\n"+engeene.toString()+" "+hb.toString();
	}
		
	public int randomPSAndYear(int min,int max) {
		Random rnd=new Random();
		return (min+rnd.nextInt(max-min+1));
		}
}

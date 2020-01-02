package verchovnaRada;

import java.util.ArrayList;
import java.util.List;

public class VerchovnaRada {

	public static VerchovnaRada vr;
	public static VerchovnaRada getVr() {
		if(vr==null) {
			vr=new VerchovnaRada();
		}
		return vr;
	}
	
	private List<Fraction>fractions=new ArrayList<Fraction>();
	
	public List<Fraction> getFractions() {
		return fractions;
	}
	public void addFraction(Fraction obj) {
		fractions.add(obj);
	}
	public void removeFraction(Fraction obj) {
		fractions.remove(obj);
	}
	public void showAllFractions() {
		for(Fraction item:fractions) {
			System.out.println(item);
		}
	}
	public void showFraction(Fraction obj) {
		for(Fraction item:fractions) {
			if(item.getName()==obj.getName())
			System.out.println(item);
		}
	}
	public void addDeputatToFraction(Fraction fr, Deputat dep) {
		for(Fraction item:fractions) {
			if(item.getName()==fr.getName())
		    item.addDeputat(dep);
		}
	}
	
	public void removeDeputatFromFraction(Deputat obj) {
		for(int i=0;i<fractions.size();i++) 
		{
			for(int j=0;j<fractions.get(i).getFraction().size();j++) {
				if(fractions.get(i).getFraction().get(j)==obj) {
					fractions.get(i).getFraction().remove(obj);
				}
			}
		}
	}
	public void showAllCoruptionersInFraction(Fraction fr) {
		for(Fraction item:fractions) {
			if(item.getName()==fr.getName())
		    item.showCoruptDeputats();
		}
	}
	public void showBiggestCoruptionerInFraction(Fraction fr) {
		for(Fraction item:fractions) {
			if(item.getName()==fr.getName())
		    item.showBiggerCoruptioner();
		}
	}
	public void showAllDeputatsInFraction(Fraction fr) {
		for(Fraction item:fractions) {
			if(item.getName()==fr.getName())
		    item.showAllDeputats();
		}
	}
}

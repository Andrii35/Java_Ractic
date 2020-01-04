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
	public void removeFraction(String obj) {
		for(int i=0;i<fractions.size();i++)
			if(obj.equals(fractions.get(i).getName())) {
				fractions.remove(fractions.get(i));
			}
		
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
	public void addDeputatToFraction(String fr, Deputat dep) {
		for(Fraction item:fractions) {
			if(item.getName()==fr)
		    item.addDeputat(dep);
		}
	}
	
	public void removeDeputatFromFraction(String depName) {
		for(int i=0;i<fractions.size();i++) 
		{
			for(int j=0;j<fractions.get(i).getFraction().size();j++) {
				if(depName.equals(fractions.get(i).getFraction().get(j).getName())) {
					fractions.get(i).removeDeputat(fractions.get(i).getFraction().get(j));
				}
			}
		}
	}
	public void showAllCoruptionersInFraction(String fr) {
		for(Fraction item:fractions) {
			if(fr.equals(item.getName())) {
		    item.showCoruptDeputats();
		    }
		}
	}
	@Override
	public String toString() {
		return fractions.toString();
	}
	public void showBiggestCoruptionerInFraction(String fr) {
		for(Fraction item:fractions) {
			if(fr.equals(item.getName()))
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

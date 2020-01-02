package verchovnaRada;

import java.util.ArrayList;
import java.util.List;

//Створити клас Фракція ,якому описати наступні методи: 
//
//додати депутата (вводимо з консолі);
//видалити депутата(вводимо з консолі);
//вивести всіх хабарників у фракції;
//вивести найбільшого хабарника у фракції;
//вивести всіх депутатів  фракції;
//очистити всю фракцію від депутатів.

public class Fraction {

	private List<Deputat>fraction;
	private String name;

	public Fraction() {
		name="first";
		fraction=new ArrayList();
	}
	public Fraction(String name,List<Deputat> fraction) {
		this.name=name;
		this.fraction = fraction;
	}
	
	
	public List<Deputat> getFraction() {
		return fraction;
	}
	public void setFraction(List<Deputat> fraction) {
		this.fraction = fraction;
	}
	@Override
	public String toString() {
		return  fraction.toString();
	}
	public void addDeputat(Deputat obj) {
		fraction.add(obj);
	}
	public void removeDeputat(Deputat obj) {
		fraction.remove(obj);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showCoruptDeputats() {
		for(Deputat item:fraction) {
			if(item.isCoruptions()) {
				System.out.println(item);
			}
		}
	}
	
	public void showBiggerCoruptioner() {
		int maxcorupt=0;
		Deputat temp = null;
		for(Deputat item:fraction) {
			if(item.isCoruptions()) {
				if(item.getCoruptMoney()>maxcorupt) {
					maxcorupt=item.getCoruptMoney();
					temp=item;
				}
				
			}
		}
		System.out.println(temp);
	}
	
	public void showAllDeputats() {
		for(Deputat item:fraction) {
			
				System.out.println(item);
			
		}
	}
	
	public void clearAllDeputats() {
		fraction.clear();
	}
}

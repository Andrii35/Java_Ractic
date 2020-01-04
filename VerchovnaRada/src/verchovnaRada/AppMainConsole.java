package verchovnaRada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMainConsole {

	private static Deputat createDeputat() {
		String tempname;
		String tempsurname;
		int age;
		boolean corupt;
		double weight;
		double height;
		System.out.println("Enter name");
		tempname=new Scanner(System.in).next();
		System.out.println("Enter surname");
		tempsurname=new Scanner(System.in).next();
		System.out.println("Enter age");
		age=new Scanner(System.in).nextInt();
		System.out.println("Enter isCorupt");
		corupt=new Scanner(System.in).nextBoolean();
		System.out.println("Enter weight");
		weight=new Scanner(System.in).nextDouble();
		System.out.println("Enter heigth");
		height=new Scanner(System.in).nextDouble();
		Deputat temp=new Deputat(tempname, tempsurname,age,corupt,weight,height);
		return temp;
	}
	
	private static Fraction createFraction() {
		
		String fractionName;
		int countOfDeputats;
		Fraction temp=new Fraction();
		System.out.println("Enter a fraction name");
		fractionName=new Scanner(System.in).next();
		System.out.println("Enter a number of deputats, who musst be added to the fraction");
		countOfDeputats=new Scanner(System.in).nextInt();
		for(int i=0;i<countOfDeputats;i++) {
			temp.addDeputat(createDeputat());
			System.out.println("Deputat was added sucsessifull");
		}
		return temp;
	}
	public static void appConsole(VerchovnaRada obj) {
		int count=100;
		while(count!=0) {
			
			System.out.println("You are in Verchovna Rada program.");
			System.out.println("You can make actions");
			System.out.println("Choose your action:");
			System.out.println("1.Add fraction");
			System.out.println("2.Remove fraction");
			System.out.println("3.Show all fractions");
			System.out.println("4.Clear fraction");
			System.out.println("5.Show fraction");
			System.out.println("6.Add deputat to fraction");
			System.out.println("7.Remove deputat from fraction");
			System.out.println("8.Show coruptioners");
			System.out.println("9.Show the biggest coruptioner");
			System.out.println("0.Exit");
			count=new Scanner(System.in).nextInt();
			
			switch(count) {
			case 1:{
				obj.addFraction(createFraction());
            	break;
				}
			case 2:{
				String frName;
				System.out.println("Enter a fraction name");
				frName=new Scanner(System.in).next();
				obj.removeFraction(frName);
				break;
			}
			case 3:{
				obj.showAllFractions();
				break;
			}
			case 4:{
				System.out.println("Enter a fraction name to clear it");
				String name;
				name=new Scanner(System.in).next();
				for(int i=0;i<obj.getFractions().size();i++) {
					if(name.equals(obj.getFractions().get(i).getName())) {
						obj.getFractions().get(i).clearAllDeputats();
					}
				}
				break;
			}
			case 5:{
				System.out.println("Enter a fraction name to show it");
				String name;
				name=new Scanner(System.in).next();
				for(int i=0;i<obj.getFractions().size();i++) {
					if(name.equals(obj.getFractions().get(i).getName())) {
						obj.getFractions().get(i).showAllDeputats();
					}
				}
				break;
			}
			case 6:{
				System.out.println("Enter a fraction name to add a deputat");
				String name;
				name=new Scanner(System.in).next();
				obj.addDeputatToFraction(name, createDeputat());
				break;
			}
			case 7:{
				System.out.println("Enter a deputat name to delete deputat from fraction");
				String name;
				name=new Scanner(System.in).next();
				obj.removeDeputatFromFraction(name);
				break;
			}
			case 8:{
				System.out.println("Enter a fraction name to show all coruptioners");
				String name;
				name=new Scanner(System.in).next();
				obj.showAllCoruptionersInFraction(name);
				break;
			}
			case 9:{
				System.out.println("Enter a fraction name to show a biggest coruptioner in fraction");
				String name;
				name=new Scanner(System.in).next();
				obj.showBiggestCoruptionerInFraction(name);
				break;
			}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
//		Deputat dep=new Deputat("Ivan","Petrov",57,true,67,178);
//		Deputat dep1=new Deputat("Sergiy","Volodimirovich",59,false,80,178);
//		Deputat dep2=new Deputat(" Olga","Dubok",37,true,60,169);
//		Deputat dep3=new Deputat("Inna","Shuk",27,false,55,168);
//		List<Deputat>depts=new ArrayList();
//		depts.add(dep);
//		depts.add(dep1);
//		depts.add(dep2);
//		depts.add(dep3);
		VerchovnaRada vr=new VerchovnaRada();
		appConsole(vr);
		
	}

}

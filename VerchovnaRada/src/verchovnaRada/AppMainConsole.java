package verchovnaRada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMainConsole {

	public void appConsole(VerchovnaRada obj) {
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
				System.out.println("Create Fraction");
				int temp=10;
				while(temp!=0) {
				System.out.println("Choose an action");
				System.out.println("1.Add deputat");
				System.out.println("2.Remove deputat");
				System.out.println("3.Show all deputats");
				System.out.println("4.Clear fraction");
				System.out.println("5.Show all deputats");
				System.out.println("0.Exit");
				temp=new Scanner(System.in).nextInt();
				switch(temp) {
				case 1: {
					String tempname;
					String tempsurname;
					int age;
					boolean corupt;
					double weight;
					double height;
					System.out.println("Enter name");
					System.out.println("Enter surname");
					System.out.println("Enter age");
					System.out.println("Enter isCorupt");
					System.out.println("Enter weight");
					System.out.println("Enter heigth");
					
				}
				}
				}
			}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		Deputat dep=new Deputat("Ivan","Petrov",57,true,67,178);
		Deputat dep1=new Deputat("Sergiy","Volodimirovich",59,false,80,178);
		Deputat dep2=new Deputat(" Olga","Dubok",37,true,60,169);
		Deputat dep3=new Deputat("Inna","Shuk",27,false,55,168);
		List<Deputat>depts=new ArrayList();
		depts.add(dep);
		depts.add(dep1);
		depts.add(dep2);
		depts.add(dep3);
		
	}

}

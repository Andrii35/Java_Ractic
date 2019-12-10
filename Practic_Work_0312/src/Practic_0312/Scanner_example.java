package Practic_0312;

import java.util.Scanner;
import java.lang.Math;

public class Scanner_example {

	public static void main(String[] args) {
		
//Scanner in=new Scanner(System.in);
//int number=0;
//System.out.println("Enter you number:");
//number=in.nextInt();
//int temp=0;
////temp=number%10;
//if(number>=1&&number<=10) {
//	temp=number;
//}
//else if(number>10&&number<100) {
//	temp=number%10;
//}
//else if(number>=100&&number<1000) {
//	temp=number%100;
//	if(temp>10) {
//		temp=temp%10;
//	}
//}
//System.out.println(temp);
//switch(temp) {
//case 1:{
//	System.out.println(number+" ïğîãğàì³ñò");
//	break;
//}
//case 2:{
//	System.out.println(number+" ïğîãğàì³ñòè");
//	break;
//}
//case 3:{
//	System.out.println(number+" ïğîãğàì³ñòè");
//	break;
//}
//case 4:{
//	System.out.println(number+" ïğîãğàì³ñòè");
//	break;
//}
//case 5:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//case 6:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//case 7:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//case 8:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//case 9:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//case 10:{
//	System.out.println(number+" ïğîãğàì³ñò³â");
//	break;
//}
//}

		// CHes Color Squer Position
//		int x=0;
//		int y=0;
//		int x1=0;
//		int y1=0;
//		
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter numbers from 1 to 8");
//		System.out.println("Enter x: ");
//		x=in.nextInt();
//		System.out.println("Enter y: ");
//		y=in.nextInt();
//		System.out.println("Enter x1: ");
//		x1=in.nextInt();
//		System.out.println("Enter y1: ");
//		y1=in.nextInt();
//		if(x>8||y>8||x1>8||y1>8||x<1||y<1||x1<1||y1<1) {
//			System.out.println("Error");
//		}
//		else if(x/y==1&&x1/y1==1||x%2!=0&&y%2!=0&&x1%2!=0&&y1%2!=0) {
//			System.out.println("YES");
//		
//		else {
//			System.out.println("No");
//		}
		
		// Ches King position and Step
//		int x=0;
//		int y=0;
//		int x1=0;
//		int y1=0;
//		
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter King position");
//		System.out.println("Enter x: ");
//		x=in.nextInt();
//		System.out.println("Enter y: ");
//		y=in.nextInt();
//		System.out.println("Enter next Step position for King");
//		System.out.println("Enter x1: ");
//		x1=in.nextInt();
//		System.out.println("Enter y1: ");
//		y1=in.nextInt();
//		if(x>8||y>8||x1>8||y1>8||x<1||y<1||x1<1||y1<1) {
//			System.out.println("Error");
//		}
//		else if(Math.abs(x-x1)==1&&Math.abs(y-y1)==1||Math.abs(x-x1)==0&&Math.abs(y-y1)==1||Math.abs(x-x1)==1&&Math.abs(y-y1)==0) {
//			System.out.println("YES");
//		}
//		else {
//			System.out.println("NO");
//		}
//		
		// Ches Elefant position and Step
//				int x=0;
//				int y=0;
//				int x1=0;
//				int y1=0;
//				boolean step=false;
//				Scanner in=new Scanner(System.in);
//				System.out.println("Enter Elefant position");
//				System.out.println("Enter x: ");
//				x=in.nextInt();
//				System.out.println("Enter y: ");
//				y=in.nextInt();
//				System.out.println("Enter next Step position for Elefant");
//				System.out.println("Enter x1: ");
//				x1=in.nextInt();
//				System.out.println("Enter y1: ");
//				y1=in.nextInt();
//				if(x>8||y>8||x1>8||y1>8||x<1||y<1||x1<1||y1<1) {
//					System.out.println("Error");
//				}
//				else {
//					for(int i=0;i<9;i++) {
//						if(x==x1+i&&y==y1+i) {
//							step=true;
//						}
//						if(x==x1-i&&y==y1-i) {
//							step=true;
//						}
//					}
//					}
//				if(step) {
//				System.out.println("Yes");
//				}
//				else {
//					System.out.println("No");
//				}
//					
				
				// Ches  Queen and Step
//				int x=0;
//				int y=0;
//				int x1=0;
//				int y1=0;
//				boolean step=false;
//				Scanner in=new Scanner(System.in);
//				System.out.println("Enter Queen position");
//				System.out.println("Enter x: ");
//				x=in.nextInt();
//				System.out.println("Enter y: ");
//				y=in.nextInt();
//				System.out.println("Enter next Step position for Elefant");
//				System.out.println("Enter x1: ");
//				x1=in.nextInt();
//				System.out.println("Enter y1: ");
//				y1=in.nextInt();
//				if(x>8||y>8||x1>8||y1>8||x<1||y<1||x1<1||y1<1) {
//					System.out.println("Error");
//					return;
//				}
//				else {
//					for(int i=0;i<9;i++) {
//						if(x==x1+i&&y==y1+i||x==x1+i&&y==y1||x==x1&&y==y1+i) {
//							step=true;
//						}
//						if(x==x1-i&&y==y1-i||x==x1-i&&y==y1||x==x1&&y==y1-i) {
//							step=true;
//						}
//					}
//					}
//				if(step) {
//				System.out.println("Yes");
//				}
//				else {
//					System.out.println("No");
//				}
	}

}

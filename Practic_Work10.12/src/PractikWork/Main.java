package PractikWork;
import java.util.Arrays;
import java.util.Scanner;

import func_masiv.func_masiv;

public class Main {

	public static void main(String[] args) {
//		int n,k;
//		System.out.println("Enter number n");
//		Scanner in =new Scanner(System.in);
//		n=in.nextInt();
//		//System.out.println("Enter number k");
//		k=in.nextInt();
//		//double result=(factor(n)+factor(k))/factor(3);
//		int result=stepinj(n,k);
//		System.out.println("Result= "+result);
//		int n,k;
//		System.out.println("Enter mas langth n");
//		Scanner in =new Scanner(System.in);
//		n=in.nextInt();
//		System.out.println("Enter number k");
//		k=in.nextInt();
//		int[]arr=new int[n];
//		func_masiv.masiv(n, arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(func_masiv.max(arr));
//		System.out.println(func_masiv.min(arr));
//	
//		int[][] array=new int[n][k];
//		func_masiv.fill_mas(array);
		//func_masiv.print_Array(array);
		
		System.out.println(func_masiv.suma(12,23,34));

		
	}
	
	public static int factor(int numb) {
		if(numb==1) {
			return 1;
		}
		else {
			return numb*factor(numb-1);
		}
	}
	
	public static int stepinj(int numb, int step) {
		if(step==0) {
			return 1;
		}
		else {
			
			return numb*stepinj(numb,step-1);
		}
	}

}

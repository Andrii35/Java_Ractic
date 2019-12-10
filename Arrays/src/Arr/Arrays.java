package Arr;
import java.lang.Math;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
//System.out.println("Ex1");
//
//		int []myList=new int[10];
//		int min=1000;
//		int max=0;
//		int aver=0;
//		for(int i=0;i<10;i++) {
//			myList[i]=(int)(Math.random()*1000);
//			System.out.println(myList[i]);
//		}
//		
//		for(int i=0;i<myList.length;i++) {
//			if(min>myList[i]) {
//				min=myList[i];
//			}
//			if(max<myList[i]) {
//				max=myList[i];
//			}
//			aver+=myList[i];
//		}
//System.out.println("Min= "+min+"\nMax= "+max+"\nAverage= "+aver/myList.length);
//		
//	
//System.out.println("Ex2");
//	
//	boolean pointer;
//	int i,j;
//	for (i=2; i<1000; i++) {
//        pointer=true;
//        for (j=2; j<i; j++) {
//        	if (i%j==0)
//        	{ pointer=false;
//        	    break;
//        	}
//        	}       
//        
//        if (pointer==true) {
//        	System.out.println(j);
//        }
//        }
//	
//	System.out.println("Ex3");
	
		System.out.println("Enter first number");
		Scanner in =new Scanner(System.in);
		int first=in.nextInt();
//		System.out.println("Enter second number");
//		int second=in.nextInt();
//		int []arr=new int[20];
//		for(int i=0;i<20;i++) {
//			arr[i]=numbersReturn.numbRet(first, second);
//		}
//		for(int a: arr) {
//			System.out.print(a+" ");
//		}
//		System.out.println();
		
		System.out.println(numbersReturn.Fibonachi(first));
		
	}
}

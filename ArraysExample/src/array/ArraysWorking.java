package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;



public class ArraysWorking {

	public static void main(String[] args) {
		// 2D array
//		int[][]arrays= {{1,2,3},{4,5,6}};
//
//		System.out.println(Arrays.deepToString(arrays));//vivid masiva po elementno (dla dvovimirnih i bilshe elementiv
//		System.out.println(Arrays.toString(arrays));
//		// 3D array
//		int[][][]arrays1= {{{1,2},{2,3}},{{4,5},{5,6}}};
//		System.out.println(Arrays.deepToString(arrays1));
		//Person [][] person1={{new Person("Alex",16),new Person("Olga",20)},{new Person("Pop",26),new Person("Inga",25)}};
		//System.out.println(Arrays.deepToString(person1));
		
//		int []arr=new int[7];
//		Arrays.fill(arr, 4 );
//		System.out.println(Arrays.toString(arr));
//		boolean []arr1=new boolean[6];
//		Arrays.fill(arr1, true );
//		System.out.println(Arrays.toString(arr1));
//		byte []arr2=new byte[5];
//		Arrays.fill(arr2, (byte)8 );
//		System.out.println(Arrays.toString(arr2));
//		
//		String[]arr3=new String[7];
//		Arrays.fill(arr3, "lesson" );
//		System.out.println(Arrays.toString(arr3));
//		Arrays.fill(arr3, 2,5,"java");
//		System.out.println(Arrays.toString(arr3));
//		
//		int [][]arr4=new int[5][8];
//		//Arrays.fill(arr4,9);
//		
//		for(int i=0;i<arr4.length;i++) {
//			Arrays.fill(arr4[i], 5);
//		}
//		System.out.println(Arrays.deepToString(arr4));
//		int []arr5=new int[7];
//		Arrays.fill(arr, 4 );
//		int []arr6=new int[7];
//		Arrays.fill(arr, 4 );
//		System.out.println(Arrays.equals(arr5, arr6));
//		
//		Integer []arr7={1,3,9,4,8,6};
//		Arrays.sort(arr7, Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr7));
		
		Integer []arr=new Integer[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=randomOfInt(10,210);
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.deepToString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.deepToString(arr));
	}
	
	public static int randomOfInt(int min,int max) {
		Random rnd=new Random();
		return (min+rnd.nextInt(max-min+1));
	}

}
	

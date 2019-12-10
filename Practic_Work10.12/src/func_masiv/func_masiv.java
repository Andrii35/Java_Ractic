package func_masiv;

public class func_masiv {
	
	public static int max(int []arr) {
	
	int max=0;
		
	for(int i=0;i<arr.length;i++) {
		
		if(max<arr[i]) {
			max=arr[i];
		}
		}
	return max;
		}
	
	public static int[] masiv(int x, int mas[]) {
		for(int i=0;i<x;i++) {
			mas[i]=(int)(Math.random()*1000);
		}
		return mas;
	}
	
	public static int min(int [] arr) {
		int min=1000;
		
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min=arr[i];
			}
			}
		return min;
	}
	
	public static int [][]fill_mas(int[][] mas){
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				mas[i][j]=(int)(Math.random()*1000);
			}
		}
		return mas;
		
	}
	
	public static void print_Array(int [][]mas) {
		for(int i=0;i<mas.length;i++) {
			for(int j=0;j<mas[i].length;j++) {
				System.out.print( mas[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int suma(int ...elem) {// функція із змінною к-тю параметрів
		int sum=0;
		for(int element:elem) {
			sum+=element;
		}
		return sum;
		
	}
	public static int suma(int[] ...elem) {
		int sum=0;
		for(int[] element:elem) {
			for(int el:element) {
				sum+=el;
			}
		}
		return sum;
		
	}
	
	
}

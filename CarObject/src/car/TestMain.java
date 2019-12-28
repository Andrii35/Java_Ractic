package car;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	public static void appConsole(Car[]car) {
		int choose=4;
		while(choose!=0) {
			System.out.println("Choose an acrion:\n1.Show a car\n2.Fill array\n0.Exit");
			choose=new Scanner(System.in).nextInt();
			switch(choose) {
			case 1:{
				System.out.println(Arrays.deepToString(car));
				break;
			}
			case 2:{
				Arrays.fill(car, new Car());
				System.out.println(Arrays.deepToString(car));
				break;
			}
		  }
		}
		
	}
	public static void main(String[] args) {
		Car[]cars= {new Car(),new Car(), new Car(),new Car()};
		appConsole(cars);

	}

}

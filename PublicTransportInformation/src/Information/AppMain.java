package Information;
import java.util.Scanner;
import java.util.Arrays;

public class AppMain {

	
	public void consoleApp(Information obj) {
		int choise=10;
		Scanner in=new Scanner(System.in);
		while(choise!=0) {
			System.out.println("What information would you like to see:\n1.Bus line\n2.Price info\n3.Move Interval\n0.Exit");
			choise=in.nextInt();
			switch(choise) {
			case 1:{
				System.out.println("Line number: "+obj.showLine());
				break;
			}
			case 2:{
				System.out.println("Price: "+obj.showTicketPrice()+" ua");
				break;
			}
			case 3:{
				System.out.println("Move interval: "+obj.showTimeInterval()+" minutes");
			}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Information obj=new Information(5,"34",6);
		Information obj1=new Information(10,"65",6);
		Information obj2=new Information(8,"51",6);
		AppMain app=new AppMain();
		
		app.consoleApp(obj2);
		
		

	}

}

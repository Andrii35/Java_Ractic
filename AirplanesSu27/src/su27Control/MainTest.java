package su27Control;
import java.util.Scanner;
public class MainTest {

	
	public static void planeControl(Su27 obj) {
		int choose=1;
		Scanner in =new Scanner(System.in);
		while(choose!=10) {
			System.out.println("Chose an action\n1.Start engeene\2.Plane beginn to flying\n3.Move up\n"
					+ "4.Move down\n5.Move left\n6.Move right\n7.ON Stels technology\n"
					+ "8.Nuclear strike\n9.ON turbo speed\n10.Landing");
			choose=in.nextInt();
			switch(choose) {
			case 1:{
				obj.startEngene();
				break;
			}
			case 2:{
				obj.planeFly();
				break;
			}
			case 3:{
				obj.up();
				break;
			}
			case 4:{
				obj.down();
				break;
			}
			case 5:{
				obj.left();
				break;
			}
			case 6:{
				obj.right();
				break;
			}
			case 7:{
				obj.stelsTechnology();
				break;
			}
			case 8:{
				obj.nuclearStrike();
				break;
			}
			case 9:{
				obj.turboSpeed();
			}
			case 10:{
				obj.planeLanding();
				break;
			}
			}
			
		}
	}
	public static void main(String[] args) {
		Su27 plane1=new Su27(1100,"pixel");
		planeControl(plane1);

	}

}

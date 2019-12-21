package enums;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

	
	
	public static void consoleApp() {
		Scanner in=new Scanner(System.in);
		int choose=1;
		while(choose!=0) {
			System.out.println("Choose an action:\n1.Check month existing\n2.Show all month with the same seasons\n"
					+ "3.Show the next season\n4.Show all month with the same days\n0.EXIT ");
			choose=in.nextInt();
			switch(choose) {
			case 1:{
				System.out.println("Enter a month name");
				String month=in.next().toUpperCase();
				Month temp=Month.valueOf(month);
				for(Month elem:Month.values()) {
					
					if(elem.equals(temp)) {
						System.out.println(month +" name exist");
					}
					
//					else {
//						System.out.println(month+"don't exist");
//					}
				}
				break;
			}
			case 2:{
				System.out.println("Enter a month name");
				String month=in.next().toUpperCase();
				Month temp=Month.valueOf(month);
				for(Month elem:Month.values()) {
					if(temp.equals(elem)) {
						for(Month elems:Month.values()) {
							if(elems.getSeason()==elem.getSeason()) {
								System.out.println(elems);
							}
						}
						
					}
				}
				break;
			}
			case 3:{
				System.out.println("Enter a season");
				String season=in.next().toUpperCase();
				boolean flag=false;
				int index=0;
				Seasons temp=Seasons.valueOf(season);
				for(Seasons elem:Seasons.values()) {
					if(elem.equals(temp)){
						index=elem.ordinal();
						flag=true;
						}
					}
				if(flag) {
					if(index==Seasons.values().length-1) {
					 System.out.println(Seasons.values()[0]);
					}else {
						index++;
						System.out.println(Seasons.values()[index]);
						}
					}
					else {
						System.out.println("Season don't exist");
					}break;
				}
			case 4:{
				int days=0;
				System.out.println("Enter number of days");
				days=in.nextInt();
				for(Month elem:Month.values()) {
					if(elem.getDays()==days) {
						System.out.println(elem);
					}
				}
			}
			}
			}
		}
	
	
	public static void main(String[] args) {
		
//		Seasons seas=Seasons.WINTER;
//		System.out.println(seas);
//		Seasons []mas=Seasons.values();
//		System.out.println(Arrays.toString(mas));
//		String season="Winter".toUpperCase();
//		seas=Seasons.valueOf(season);
//		System.out.println(seas);
//		for(Seasons elem:mas) {
//			System.out.println(elem.name());
//		}
//		
//		System.out.println(Seasons.SPRING.compareTo(Seasons.AUTUMN));
//		System.out.println(Seasons.AUTUMN.getInfoWeather());
//		System.out.println(Month.APRIL.getSeason());
//		System.out.println(Seasons.AUTUMN.countRain(5));
		consoleApp();
	}
	 

}

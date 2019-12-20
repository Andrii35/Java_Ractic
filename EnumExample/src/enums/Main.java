package enums;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Seasons seas=Seasons.WINTER;
		System.out.println(seas);
		Seasons []mas=Seasons.values();
		System.out.println(Arrays.toString(mas));
		String season="Winter".toUpperCase();
		seas=Seasons.valueOf(season);
		System.out.println(seas);
		for(Seasons elem:mas) {
			System.out.println(elem.name());
		}
		
		System.out.println(Seasons.SPRING.compareTo(Seasons.AUTUMN));

	}

}

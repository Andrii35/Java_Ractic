package Compete_Car;

public class Main {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.addPs();
		System.out.println(car1.getCb().toString());
		car1.setCb(new CarBody(4000,1900,"hatchback"));
		car1.getColor();
		System.out.println();
		car1.setColor("braun");
		System.out.println(car1.getHb().toString());
		car1.setHb(new Handlebar(25,"Sport"));
		System.out.println(car1.getWells().toString());
		car1.setWells(new Weel(17,"Michelin"));
		System.out.println(car1.toString());

	}

}

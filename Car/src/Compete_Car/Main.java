package Compete_Car;

public class Main {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.addPs();
		car1.getCb().toString();
		System.out.println();
		car1.setCb(new CarBody(4000,1900,"hatchback"));
		car1.getColor();
		System.out.println();
		car1.setColor("braun");
		car1.getHb().toString();
		System.out.println();
		car1.setHb(new Handlebar(25,"Sport"));
		car1.getWells().toString();
		System.out.println();
		car1.setWells(new Weel(17,"Michelin"));
		car1.toString();

	}

}

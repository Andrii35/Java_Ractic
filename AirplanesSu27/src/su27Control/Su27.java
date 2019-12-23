package su27Control;
import java.lang.Math;
//ЗАВДАННЯ 1. Реалізувати ООП модель літака Cy27, зміст якої визначається наступними частинами:
//
//І частина. Створити класи Су27, Керування Літаком (ControlPlane). В класі Керування літаком створити методи:
//
//РухВверх
//РухВниз
//РухВліво
//РухВправо
//При виклику даних методів необхідно реалізувати випадкову генерацію числа, яке представлятиме відстань, на яку буде переміщуватись даний корабель.
public class Su27 extends Plane implements CapabilitiesOfPlane {


	int maxSpeed;
	String color;
	static int id=0;
	public Su27 () {
		id++;
	}
	public Su27(int maxSpeed,String color) {
		this();
		this.maxSpeed=maxSpeed;
		this.color=color;
	}
	
	private int getMaxSpeed() {
		return maxSpeed;
	}
	private void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private String getColor() {
		return color;
	}
	private void setColor(String color) {
		this.color = color;
	}
	private  int getId() {
		return id;
	}
	
	@Override
	public void turboSpeed() {
		int turboSpeed=maxSpeed;
		turboSpeed=maxSpeed+(int)(Math.random()*1000);
		System.out.println(turboSpeed+" km/h");
		
	}
	@Override
	public void stelsTechnology() {
		
		System.out.println("Su27 is unvisible during "+(10+((int)Math.random()*20))+" minutes");
	}
	@Override
	public void nuclearStrike() {
		System.out.println("It will be used "+(1+((int)Math.random()*11))+" bombs");		
		
	}
	
	
	
}


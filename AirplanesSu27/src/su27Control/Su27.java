package su27Control;
import java.lang.Math;
//�������� 1. ���������� ��� ������ ����� Cy27, ���� ��� ����������� ���������� ���������:
//
//� �������. �������� ����� ��27, ��������� ˳����� (ControlPlane). � ���� ��������� ������ �������� ������:
//
//��������
//�������
//�������
//���������
//��� ������� ����� ������ ��������� ���������� ��������� ��������� �����, ��� �������������� �������, �� ��� ���� ������������� ����� ��������.
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


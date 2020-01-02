package verchovnaRada;
import java.util.Scanner;
//�������� ���� �������, ����������� ���� �� ������. 
//������� ���� ������ ������: �������, ��"�, ��, �������� (������),"
//		 " ����� ������ (�� ���������� � �����������). ������ ���������������� ����. "
//		 ""
//		 "������ �����: ���� �����(), � ����� ����������� ��������: ���� ���� �������� false � �� ������� �� �������: "
//��� ������� �� ���� ������", ���� ����� �� ����������, �� ������ � ������ ���� ������, ��� �� ����. ���� �� ���� ����� 5000,"
//		+ " ������� �� ������� "������ ��"������ ��������", ���� �� �����, �� ������� � ���� ����� ����� ���� ����.
public class Deputat extends Human  {

	private String name;
	private String surname;
	private int age;
	private boolean coruptions;
	private int coruptMoney;
	public Deputat() {
		super();
		name="none";
		surname="none";
		age=0;
		coruptions=false;
		coruptMoney=0;
	}
	public Deputat(  String name,String surname,int age, boolean coruptions,double weight,double hight) {
		super(weight, hight);
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.coruptions=coruptions;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCoruptions() {
		return coruptions;
	}
	public void setCoruptions(boolean coruptions) {
		this.coruptions = coruptions;
	}
	public int getCoruptMoney() {
		return coruptMoney;
	}
	public void setCoruptMoney(int coruptMoney) {
		this.coruptMoney = coruptMoney;
	}
	
	
	@Override
	public String toString() {
		return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\ncoruptions: " + coruptions
				+ "\ncoruptMoney: " + coruptMoney+super.toString();
	}
	public void giveCoruptMoney() {
		int money;
		if(coruptions) {
			System.out.println("Enter a sum of given  money");
			money=new Scanner(System.in).nextInt();
			if(money>5000) {
				System.out.println("Police will arest a deputat");
			}else {
				setCoruptMoney(money+getCoruptMoney());
			}
		}
		else {
			System.out.println("Deputat don't take a coruptmoney");
		}
	}
	
	
	
}

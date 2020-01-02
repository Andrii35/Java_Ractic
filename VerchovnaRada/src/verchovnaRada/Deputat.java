package verchovnaRada;
import java.util.Scanner;
//Створити клас Депутат, унаслідувати його від Людини. 
//Описати його такими полями: прізвище, ім"я, вік, хабарник (булеве),"
//		 " розмір хабаря (не передавати в конструктор). Додати джентельменський набір. "
//		 ""
//		 "Додати метод: дати хабар(), в якому передбачити наступне: якщо поле хабарник false – то вивести на консоль: "
//Цей депутат не бере хабарів", якщо умова не виконується, то ввести з консолі суму хабаря, яку ви даєте. Якщо ця сума більша 5000,"
//		+ " вивести на консоль "Поліція ув"язнить депутата", якщо не більша, то занести в поле класу хабар дану суму.
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

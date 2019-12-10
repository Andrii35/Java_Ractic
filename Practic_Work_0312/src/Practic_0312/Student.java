package Practic_0312;

import java.util.Scanner;
public class Student {

	String name;
	String surname;
	int age;
	String birthday;
	public Student()
	{
		
	}
	public Student(String name, String surname, int age, String birthday) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	    this.birthday=birthday;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void printStudent() {
		System.out.println(name+" "+surname+" Age: "+age+"Birthday: "+birthday);
	}
}

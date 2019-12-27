package exampleCollection;

public class Person {

	private String Name;
	private int age;
	public Person() {
		Name="none";
		age=0;
	}
	public Person(String name, int age) {
				
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}
	
	
}

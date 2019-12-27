package array;

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
	private String getName() {
		return Name;
	}
	private void setName(String name) {
		Name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}
	
	
}

package Human;

public class Person {
private String name;
private String surname;
private int age;
public Person(){
	name="none";
	surname="none";
	age=0;
}
//Person (String name){
//    this();//                 Виклик консьруктора по дуфолту
//	this.name=name;
//	
////	surname="none";
////	age=0;
//}
//Person(String name, String surname){
//	this(name);
//	this.surname=surname;
//	
//}
//Person(String name, String surname, int age){
//	this(name,surname);
//	this.age=age;
//}
public Person(String name, String surname, int age){
	this();
	this.name=name;
	this.surname=surname;
	this.age=age;
}
public String getName() {
	return name;
}
public String getSurname() {
	return surname;
}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name=name;
}
public void setUsername(String username) {
	this.surname=username;
}
public void seAge(int age) {
	this.age=age;
}

public void display() {
	System.out.println("Name: "+name+" Surname: "+surname+" Age: "+age);
}
@Override
public String toString() {
	return "Name: "+name+"\nSurname: "+surname+"\nAge: "+age;
}
}

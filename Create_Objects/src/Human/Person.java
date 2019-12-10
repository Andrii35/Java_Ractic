package Human;

public class Person {
String name;
String surname;
int age;
Person(){
	name="none";
	surname="none";
	age=0;
}
Person (String name){
    this();//                 Виклик консьруктора по дуфолту
	this.name=name;
	
//	surname="none";
//	age=0;
}
Person(String name, String surname){
	this(name);
	this.surname=surname;
	
}
Person(String name, String surname, int age){
	this(name,surname);
	this.age=age;
}
void display() {
	System.out.println("Name: "+name+" Surname: "+surname+" Age: "+age);
}
}

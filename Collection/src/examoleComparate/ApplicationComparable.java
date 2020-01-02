package examoleComparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;



public class ApplicationComparable {

	public static void main(String[] args) {
		
		ArrayList <String> list1=new ArrayList<>();
		list1.add("Java");
		list1.add("Python");
		list1.addAll(Arrays.asList("C#","C++"));
		
		for(String elem:list1) {
			System.out.println(elem);
		}
		
		Collections.sort(list1);
		
		for(String elem:list1) {
			System.out.println(elem);
		}
		System.out.println();
		LinkedList<Student>person=new LinkedList<Student>();
		person.add(new Student("Joe",18,1));
		person.add(new Student("Petro", 21,2));
		person.add(new Student("Joe",40,4));
		person.add(new Student("Ivan",30,2));
		person.add(new Student("Kate",44,4));
		
		for(Student elem:person) {
			System.out.println(elem);
			
		}
		// using comparable
//		System.out.println();
		Collections.sort(person,new StudentsAllFieldsComparator());
		
		for(Student elem:person) {
			System.out.println(elem);
			
		}
	System.out.println();
	
		
		

	}

}

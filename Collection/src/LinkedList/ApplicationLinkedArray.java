package LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ApplicationLinkedArray {

	public static void main(String[] args) {
//		LinkedList <String> list1=new LinkedList<>();
//		list1.add("Java");
//		list1.add("Python");
//		list1.addAll(Arrays.asList("C#","C++"));
//		System.out.println(list1);
//		list1.offer("C#");
//		System.out.println(list1);
//		list1.push("Node.JS");
//		System.out.println(list1);
////		for(String str:list1) {
////			System.out.println(str);
////			list1.remove(str);
////		}
//		for(int i=0;i<list1.size();i++) {
//			String string=list1.get(i);
//			if(list1.get(i).contains("y")) {
//				list1.remove(i);
//			}
//		}
//		System.out.println(list1);
		
		LinkedList<Person>person=new LinkedList<Person>();
		person.add(new Person("Joe",18));
		person.add(new Person("Petro", 21));
		person.add(new Person("Joe",40));
		person.add(new Person("Ivan",30));
		person.add(new Person("Kate",44));
		System.out.println(person);
		
//		for(int i=0;i<person.size();i++) {
//			
//			if("Joe"==person.get(i).getName()&&person.get(i).getAge()>25) {
//				person.remove(i);
//			}
//			
//		}
//		System.out.println(person);
		
		
//		Iterator<Person> iter=person.iterator();// Iterator for deleting elements
//		
//		for(Person item:person) {
//			System.out.println(item);
//		}
//		System.out.println();
//		while(iter.hasNext()) {
//			Person pers=iter.next();// Create object, while iterator.next() go allways to the next elem, wheni call it 
//			//System.out.println(iter.next().getName());
//			//System.out.println(iter.next().getAge()>25);
//			if(pers.getName().equalsIgnoreCase("Joe")||pers.getAge()>25) {
//				iter.remove();
//			}
//		}
//		for(Person item:person) {
//			System.out.println(item);
//		}
//		System.out.println();
//		person.add(3, new Person("Viktorija",20));
//		
//		for(Person item:person) {
//			System.out.println(item);
//		}
		
		ListIterator<Person> listiter=person.listIterator();
		
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
			System.out.println(listiter.nextIndex());
		}
		System.out.println();
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
			System.out.println(listiter.previousIndex());
			
		}
	}

}

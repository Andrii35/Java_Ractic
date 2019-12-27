package exampleCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;//dla roboti z listami
import java.util.Collections;//dla roboti z massivami
import java.util.Iterator;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Hello");
		list.add("4.5");
		System.out.println(list);
		System.out.println(list.get(0));
		
		Collection<Integer>  collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println( collection.size());
		 collection.add(100);
		Integer sum=0;
	    for(Integer el: collection) {
	    	sum+=el.intValue();
	    }
	    System.out.println(sum);
	   
	    List<Person> person1=new ArrayList<Person>(Arrays.asList(new Person("Klara",34),new Person("Petr",18)));
	    List<Person>person2=new ArrayList<Person>() { {add(new Person("Vita",32));
	                                                 add(new Person("Kolja",20));}
	    };
	    System.out.println(person1);
	    System.out.println(person2);
	    person1.add(new Person("Sasha",30));
	    person1.add(2, new Person("Pop",40));
	    System.out.println(person1);
	    person1.remove(0);
	    int average=0;
	    for(Person el:person1) {
	    	average+=el.getAge();
	    }
	    System.out.println("Average of persons are: "+average/person1.size());
	    average=0;
	    Iterator<Person>p1=person1.iterator();
	    while(p1.hasNext()) {
	    	Person currentPerson=p1.next();
	    	average+=currentPerson.getAge();
	    }
	    System.out.println("Average of persons are: "+average/person1.size());

	   

	}

}

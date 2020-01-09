
/**
 * Company "Nazaruk Clobal Tech
 */
package zooClub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class ZooClub create object zoo club with diferent funcyions
 * @author Andriy Nazaruk
 * @version 1.0
 * @since java 7.0
 */

public class ZooClub {

	/**
	 * Field of map 
	 */
	private Map<Person,List<Animal>>map;
	/**
	 * default constructor for creating Hashmap
	 */
	public ZooClub() {
		map=new HashMap<Person,List<Animal>>();
	}
	/**
	 * Constructor became created map
	 * @param map
	 */
	public ZooClub(Map<Person, List<Animal>> map) {

		this.map = map;
	}
	/**
	 * Method 
	 * @return map
	 */
	public Map<Person, List<Animal>> getMap() {
		return map;
	}
	/**
	 * Method become created map
	 * @param map
	 */
	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}
	/**
	 * Override of hashCode for this class
	 * @return hashCode from class object 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}
	/**
	 * Override of equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}
	
	/**
	 * Override of String
	 */
	@Override
	public String toString() {
		return "ZooClub: " + map;
	}
    /**
     * Method add new person to zoo club an create list of animals for this person
     * @param p is Person object
     * @see Person#Person(String, int) 
     */
	public void addNewPerson(Person p) {
		map.put(p, new ArrayList<Animal>());
	}
	
	/**
	 * Method add animal object to the person by name
	 * @param name of person
	 * @see Person#getName()
	 * @param an Animal object 
	 * @see Animal#Animal(String, String)
	 */
	public void addAnimalToPerson(String name, Animal an) {
	   Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
	   while(iterator.hasNext()) {
		   Entry<Person, List<Animal>> animals = iterator.next();
		   if(animals.getKey().getName().equalsIgnoreCase(name)) {
			   animals.getValue().add(an);
		   }

	   }
	}
	
	/**
	 * Method remove animal object from person by persons name
	 * @param name of person
	 * @see Person#getName()
	 * @param an Animal object 
	 * @see Animal#Animal(String, String)
	 */
	
	public void removeAnimalFromPerson(String name, Animal an) {
		   Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		   while(iterator.hasNext()) {
			   Entry<Person, List<Animal>> animals = iterator.next();
			   if(animals.getKey().getName().equalsIgnoreCase(name)) {
				   animals.getValue().remove(an);
			   }

		   }
		}
	
	/**
	 * Method remove person from zoo club
	 * @param name name of person
	 * @see Person#getName()
	 */
	public void removePersonFromZooClub(String name) {
		   Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		   while(iterator.hasNext()) {
			   Entry<Person, List<Animal>> animals = iterator.next();
			   if(animals.getKey().getName().equalsIgnoreCase(name)) {
				   iterator.remove();
			   }

		   }
		}
	
	/**
	 * Method  remove animal kind from all persons of zoo club
	 * @param animalTyp is kind of animal
	 * @see Animal#getType()
	 */
	public void removeAnimalFromAllPersons(String animalTyp) {
		   Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		   while(iterator.hasNext()) {
			   Entry<Person, List<Animal>> animals = iterator.next();
			   Iterator<Animal> anim = animals.getValue().iterator();
			   while(anim.hasNext()) {
				   Animal next = anim.next();
				   if(next.getType().equalsIgnoreCase(animalTyp)) {
					   anim.remove();
				   }
			   }
			   
			}
		}
	/**
	 * Method show all persons and their animals in zoo club
	 */
	public void showZooClub() {
		for(Entry<Person,List<Animal>> elem:map.entrySet()) {
			System.out.println(elem);
			
		}
	}
	
	
}

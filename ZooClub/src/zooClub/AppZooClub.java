package zooClub;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;




public class AppZooClub {

	public static void reflection() throws IllegalArgumentException, IllegalAccessException, ReflectiveOperationException, SecurityException  {
		
		Class sc=Animal.class;// object by Class
		System.out.println("Name of class "+sc.getName());
		System.out.println("Simple name of class "+sc.getSimpleName());
		//  get modifiers
		int modifiers=sc.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.toString(2));
        System.out.println("Modifier ist static? " +Modifier.isStatic(modifiers));
        
        System.out.println("Info packkage "+ sc.getPackage());
        
        System.out.println(sc.getSuperclass());
        
        // get constructors
        
        Constructor<Animal>[] constructors = sc.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}
        Constructor<Animal>consrtuctor=constructors[0];
        System.out.println(consrtuctor);
        
        Class<?>[] parameterTypes = consrtuctor.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));
        
        Constructor constructor1 = sc.getConstructor(String.class,String.class);
        System.out.println(constructor1);
        Animal instanceNewAnimal=constructors[1].newInstance("Dog","Tusik");
        // get fields
//        Field []fields=sc.getFields();// public fields
//        for (Field field : fields) {
//			System.out.println(field);
//		}
        
        Field[]fieldsAll=sc.getDeclaredFields();// give access to the private fields
        for (Field field : fieldsAll) {
			System.out.println(field);
		}
        
        System.out.println("Before change instance "+instanceNewAnimal.getName());
        
        Field ageField=fieldsAll[1];
        ageField.setAccessible(true);// give access to the private fields
        ageField.set(instanceNewAnimal, "Vasja");
        System.out.println("After change instance "+instanceNewAnimal.getName());
        System.out.println();
        System.out.println("Methods:");
        Method []methods=sc.getMethods();
        for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
        System.out.println();
        System.out.println("Befor"+instanceNewAnimal);
        Method method = sc.getMethod("setName", String.class);
        method.invoke(instanceNewAnimal, "Paravosik");
        System.out.println();
        System.out.println("After"+instanceNewAnimal);
        
		
	}
	public static void appConsole(ZooClub obj) {
		
		int choose=10;
		Scanner in =new Scanner(System.in);
		while(choose!=0) {
			System.out.println("Make a choose:");
			System.out.println("1. Add new person to zoo club");
			System.out.println("2. Add animal to a person");
			System.out.println("3. Remove animal from person");
			System.out.println("4. Remove person from zoo club");
			System.out.println("5. Remove animal type from all persons");
			System.out.println("6. Show zoo club");
			System.out.println("0. Close programm");
			choose=in.nextInt();
			switch(choose) {
			case 1:{
				System.out.println("Enter person name");
				String name=in.next();
				System.out.println("Enter person age");
				int age=in.nextInt();
				obj.addNewPerson(new Person(name,age));
				break;
			}
			case 2:{
				System.out.println("Enter person name");
				String name=in.next();
				System.out.println("Enter animal typ");
				String typ=in.next();
				System.out.println("Enter animal name");
				String animalName=in.next();
				obj.addAnimalToPerson(name, new Animal(typ,animalName));
				break;		
			
			}
			case 3:{
				System.out.println("Enter person name");
				String name=in.next();
				System.out.println("Enter animal typ");
				String typ=in.next();
				System.out.println("Enter animal name");
				String animalName=in.next();
				obj.removeAnimalFromPerson(name, new Animal(typ,animalName));
				break;		
			}
			case 4:{
				System.out.println("Enter person name");
				String name=in.next();
				obj.removePersonFromZooClub(name);
				break;
			}
			case 5:{
				System.out.println("Enter animal type for removing");
				String name=in.next();
				obj.removeAnimalFromAllPersons(name);
				break;
			}
			case 6:{
				obj.showZooClub();
				break;
			}
			case 0:{
				in.close();
			}
			}
			
		}
	}
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SecurityException, ReflectiveOperationException, FileNotFoundException, IOException {
		
//		ZooClub zooClub=new ZooClub();
//		appConsole(zooClub);
//		reflection();
		ArrayList<Animal> animal=new ArrayList<>();
		animal.add(new Animal("Tiger","Sherchan"));
		animal.add(new Animal("Cat","Barsik"));
		
		Map<Person,ArrayList<Animal>> first=new HashMap<>();
		first.put(new Person("Vasja", 23), animal);
		first.put(new Person("Kolja",34), animal);
		
	 // ставорення папки
		File dir=new File("test");
		dir.mkdir();
		//  перевірка чи існує директорія
		if(dir.isDirectory()) {
			File[] listFiles = dir.listFiles();
			for(File elem:listFiles) {
				System.out.println(elem);
			}
		}
		try(ObjectOutputStream outMapPerson=new ObjectOutputStream(Files.newOutputStream(Paths.get("zooclub.txt")))){
			outMapPerson.writeObject(first);
		}
		catch(EOFException e) {
			System.out.println(e);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		try(ObjectInputStream inMapClub=new ObjectInputStream(Files.newInputStream(Paths.get("zooclub.txt")))) {
			
		
			Map<Person,ArrayList<Animal>> tempMap=new HashMap<>();
			tempMap=(HashMap)inMapClub.readObject();
			
			Set<Person> person = tempMap.keySet();
			for(Person el:person) {
				System.out.println(el.getName());
			}
			
		
		}
		
		catch(EOFException e) {
			e.getStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.getException();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		

	}

}

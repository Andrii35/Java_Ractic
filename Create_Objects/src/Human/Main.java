package Human;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Student obj=new Student("Nazaruk","Andrii","Iakovich", "14.12.1983","Soborna str","0679106345","Programmer",2,21);
		Student []students=new Student[10];
		for(int i=0;i<students.length;i++) {
			students[i]=new Student("Petruk","Andrii","Iakovich", "14.12.1983","Soborna str","0679106345","Informatiker",2,22+i);
		}
		obj.toPrint();
		
		Person first=new Person("Andrii");
		first.display();
	}

}

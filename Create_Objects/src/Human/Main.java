package Human;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		Student obj=new Student("Nazaruk","Andrii","Iakovich", "14.12.1983","Soborna str","0679106345","Programmer",2,21);
//		Student []students=new Student[10];
//		for(int i=0;i<students.length;i++) {
//			students[i]=new Student("Petruk","Andrii","Iakovich", "14.12.1983","Soborna str","0679106345","Informatiker",2,22+i);
//		}
//		obj.toPrint();
		
//		Person first=new Person("Andrii", "Nazaruk",35);
//		System.out.println(first);
		
		Abiturient[]abiturients=new Abiturient[5];
		
		for(int i=0;i<abiturients.length;i++) {
			abiturients[i]=new Abiturient();
			abiturients[i].setId(i+1);
			System.out.println("Enter abiturient name");
			abiturients[i].setName(new Scanner(System.in).nextLine());
			System.out.println("Enter abiturient surname");
			abiturients[i].setSurname(new Scanner(System.in).nextLine());
			System.out.println("Enter abiturient adress");
			abiturients[i].setAdress(new Scanner(System.in).nextLine());
			
			for(int j=0;j<abiturients[i].getNotes().length;j++) {
				abiturients[i].setNotes(j, (int)(1+Math.random()*13));
			}
			
		}
		
		for(int i=0;i<abiturients.length;i++) {
			for(int j=0;j<abiturients[i].getNotes().length;j++)
			if(abiturients[i].getNotes(j)<4) {
				System.out.println(abiturients[i]);
				break;
			}
		}
		@SuppressWarnings("resource")
		Scanner file=new Scanner(System.in);
		System.out.println("Enter an average note");
		int aver=file.nextInt();
		for(int i=0;i<abiturients.length;i++) {
			if(abiturients[i].averNote()>aver) {
				System.out.println(abiturients[i]);
			}
		}
		
//		System.out.println("Enter a max average note");
//		aver=file.nextInt();
		System.out.println("Enter a number of students");
		int count=file.nextInt();
		
		int []averages=new int[abiturients.length];
		for(int i=0;i<abiturients.length;i++) {
			averages[i]=abiturients[i].averNote();
		}
		Arrays.sort(averages);
		
		System.out.println("Students with most average note:");
		
		for(int j=0;j<abiturients.length;j++) {
			for(int i=averages.length-1;i>averages.length-1-count;i--) {
			if(abiturients[j].averNote()==averages[i]) {
				System.out.println(abiturients[j]);
				
			}
			
		  }
		
		
		}
		
		System.out.println("Enter a passing note");
		int passing=file.nextInt();
		
		System.out.println("Students with passing score");
		for(int i=0;i<abiturients.length;i++) {
			if(abiturients[i].averNote()>=passing&&abiturients[i].averNote()<aver) {
				System.out.println(abiturients[i]);
			}
		}
		
		
	}

}

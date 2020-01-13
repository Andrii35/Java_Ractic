package filesIO;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class AppFileIO {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		Student st=new Student("Alex",21);
		Student st1=new Student("Ivan",23);
		Student st2=new Student("Olga",24);
		List<Student>listST=new ArrayList<Student>();
		listST.add(st);
		listST.add(st1);
		listST.add(st2);
		
		File nameChar=new File("D://symbol.txt");
		
		try(FileWriter outChar=new FileWriter(nameChar)){
			for(Student stud:listST) {
				outChar.write(stud.getName()+"\t"+stud.getAge()+"\n");

		}

	}
		
		try(BufferedReader inChar=new BufferedReader(new FileReader(nameChar))){
			String s;
			while((s=inChar.readLine())!=null) {
				System.out.println(s);
			}
		}
		
		File testdir=new File("D:/testdir");
		testdir.mkdir();
	    File nameFile=new File(testdir.getAbsolutePath()+"/"+"Students.txt");
	    System.out.println(nameFile.getPath());// повний шлях до файлу
	    System.out.println(nameFile.getParent());// шлях до файлу
	    
	    nameFile.createNewFile();
	    
//		try(Formatter formater=new Formatter(nameFile)){
//		for(Student stud:listST) {
//			formater.format("%s is %d years %n", stud.getName(),stud.getAge());
//		}
//		}
//	
//		
//		try(ObjectOutputStream fileStudent=new ObjectOutputStream(new FileOutputStream(nameFile))){
//			
//			
//				fileStudent.writeObject(listST);
//			
//		}
//		
//		
//		
//		try(ObjectInputStream inStudent=new ObjectInputStream(new FileInputStream(nameFile))){
//			List<Student>temp=new ArrayList<Student>();
//			temp=(ArrayList<Student>)inStudent.readObject();
//
//			for(Student stu:temp) {
//				System.out.println(stu);
//			}
//		}
		
		
//		List<Student>temp=new ArrayList<Student>();
//		try(ObjectInputStream inStudent=new ObjectInputStream( Files.newInputStream(Paths.get("D://ListStudent.txt")))){
//			
//			//temp=(ArrayList<Student>)inStudent.readObject();
//			
//			while(true) {
//				Student st5=(Student)inStudent.readObject();
//				temp.add(st5);
//			}
//			
//						
//		}
//		catch(EOFException e) {
//			e.getStackTrace();
//		}
//		catch(ClassNotFoundException e) {
//			e.getException();
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
//		for(Student stu:temp) {
//			System.out.println(stu);
//		}

}
	
}

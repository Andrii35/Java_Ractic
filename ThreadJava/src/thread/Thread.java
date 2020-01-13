package thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Thread {

	public static void main(String[] args) throws IOException {
//		Scanner s=null;
//		double sum=0;
//		try {
//			s=new Scanner(new BufferedReader(new FileReader("D:\\Andriy Nazaruk\\ThreadJava\\src\\thread\\user.txt")));
//			while(s.hasNext()) {
//				if(s.hasNextDouble()) {
//					sum+=s.nextDouble();
//				}else {
//					s.next();
//				}
//			}
//		}finally {
//			s.close();
//		}
//		System.out.println(sum);
		
		Scanner in=new Scanner(System.in);
		try(Writer outtext=new FileWriter("test.txt")){
			outtext.write(in.nextLine());
		}catch(InputMismatchException ex) {
			System.out.println("Entered date was fallse");
		}
		finally {
			in.close();
		}
				
		try(BufferedReader input=new BufferedReader(new FileReader("test.txt"))){
			String temp;
			
			while((temp=input.readLine())!=null) {
				System.out.println(temp);
			}
		}

	}

}

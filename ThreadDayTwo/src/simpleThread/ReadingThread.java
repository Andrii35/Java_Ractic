package simpleThread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingThread extends Thread {
public static  ArrayList<Integer>numbers1=new ArrayList<>();
	
	
	@Override
	public  void run() {
		
		
		try{
			readFile(numbers1);
			System.out.println("Stream 1");
			//Thread.sleep(500);
			for(Integer el:numbers1) {
				System.out.println(el);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		}

	private static synchronized void readFile(ArrayList<Integer> numbers1) throws FileNotFoundException {
		Scanner s=new Scanner(new BufferedReader(new FileReader("numbers.txt")));
		
		while(s.hasNext()) {
			if(s.hasNextInt()) {
				numbers1.add(s.nextInt());
				
			}else {
				s.next();
			}
		
						
		}
		s.close();
		
	}

	
}

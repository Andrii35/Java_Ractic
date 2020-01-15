package simpleThread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingSekondThread implements Runnable {

	Thread thread;
	public ReadingSekondThread() {
		thread=new Thread(this);
		thread.start();
	}
	@Override
	public void run() {

		Scanner s=null;
		try{
			s=new Scanner(new BufferedReader(new FileReader("numbers1.txt")));
			ArrayList<Integer>numbers1=new ArrayList<>();
			while(s.hasNext()) {
				if(s.hasNextInt()) {
					numbers1.add(s.nextInt());
					
				}else {
					s.next();
				}
				System.out.println("Stream 2");
				Thread.sleep(1000);
			}s.close();
			for(Integer el:numbers1) {
				System.out.println(el);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}

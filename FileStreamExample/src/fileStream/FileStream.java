package fileStream;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
public class FileStream {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
//		try(FileInputStream fin=new FileInputStream("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Material.java");
//				FileOutputStream fout=new FileOutputStream("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Material2.java")) {
//			
////			byte[] buffer = new byte[fin.available()];
////			
////			fin.read(buffer, 0, fin.available());
////			 
////			System.out.println("File data:");
////			for(int i=0; i<buffer.length;i++){
////			 
////				System.out.print((char)buffer[i]);
////			}
//			 int i=-1;
//			 int count=0;
//			 char[]temp=new char[fin.available()];
//	            while((i=fin.read())!=-1){
//	              temp[count]+=(char)i;
//	               // System.out.print((char)i);
//	              count++;
//	            }   
//	            String s=new String(temp);
//	            
//	            System.out.println(s);
//	            byte[] buffer = new byte[fin.available()];
//	            // считываем буфер
//	            fin.read(buffer, 0, buffer.length);
//	            // записываем из буфера в файл
//	            fout.write(buffer, 0, buffer.length);
//	           
//	            
//		}

//		Random rnd=new Random();
//		try(FileOutputStream fout=new FileOutputStream("numbers.txt",true)){
//			
//			for(int i=0;i<10;i++) {
//				fout.write(10+rnd.nextInt(111));
//			}
//			
//		}
//		
//		try(FileInputStream fin=new FileInputStream("numbers.txt")){
//			int c;
//			int []arr=new int[fin.available()];
//			int count=0;
//			while((c=fin.read())!=-1) {
//				arr[count]=c;
//				count++;
////				System.out.println(c);
//			}
//			Arrays.sort(arr);
//			for(int el:arr) {
//				System.out.println(el);
//			}
//		}
		
//		try(FileReader read=new FileReader("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Material.java")){
//			int c;
//			File f=new File("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Material.java");
//			int count=0;
//			char[]arr=new char[(int)f.length()];
//			while((c=read.read())!=-1) {
//				arr[count]=(char)c;
//				//System.out.print((char)c);
//				count++;
//			}
//			String s=new String(arr);
//			System.out.println(s);
//			s.replaceAll(" ", "private");
//			System.out.println(s);
//		}
//		File nameByte=new File("D://byte.txt");
//		File nameChar=new File("D://symbol.txt");
//		int []mas= {2,6,3,8,5,6,8,4,5,3};
//		byte[]bufferByte=new byte[mas.length];
//		char[]bufferChar=new char[mas.length];
//		for(int i=0;i<mas.length;i++) {
//			bufferByte[i]=(byte)mas[i];
//			bufferChar[i]=(char)mas[i];
//		}
//		FileOutputStream outBytes=null;
//		FileWriter outChar=null;
//		try {
//			outBytes=new FileOutputStream(nameByte);
//			outChar=new FileWriter(nameChar);
//			outBytes.write(bufferByte);
//			outChar.write(bufferChar);
//			
//		}catch(IOException ex) {
//			System.out.println("Error "+ex);
//		}
//		finally {
//			try {
//			outBytes.close();
//			outChar.close();
//			}catch(IOException ex) {
//				System.out.println("Stream was't close");
//			}
//			System.out.println("Writing was sucsessufull");
//		}
//		
//		
//		try(FileInputStream inByte=new FileInputStream(nameByte);
//				FileOutputStream outByte=new FileOutputStream(nameByte))	{
//			int b;
//			int i=0;
//			while((b=inByte.read())!=-1) {
//				mas[i]=(int)b;
//				Arrays.sort(mas);
//				for(int j=0;j<mas.length;j++) {
//					bufferByte[j]=(byte)mas[j];
//				}
//				outByte.write(bufferByte);
//				
//				
//			}
//			
//		}catch(IOException ex) {
//			System.out.println(ex.getMessage());
//		}
//		finally {
//			System.out.println("Operation was sucssufully");
//		}
//		
//		try(FileReader inChar=new FileReader(nameChar);
//				FileWriter outChars=new FileWriter(nameChar)){
//			int c;
//			int i=0;
//			while((c=inChar.read())!=-1){
//				mas[i]=(int)c;
//				Arrays.sort(mas);
//				outChars.write(Arrays.toString(mas));
//			}
//			
//		}catch(IOException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		try(FileReader read=new FileReader("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Car.java")){
			int c;
			File f=new File("D:\\Andriy Nazaruk\\CarObject\\src\\car\\Car.java");
			int count=0;
			char[]arr=new char[(int)f.length()];
			while((c=read.read())!=-1) {
				arr[count]=(char)c;
				//System.out.print((char)c);
				count++;
			}
			
			String s=new String(arr);
			System.out.println(s);
			String temp=s.replaceAll("public", "private");
//			s.replaceAll(" ", "private");
			System.out.println(temp);
		}
		
	}

}

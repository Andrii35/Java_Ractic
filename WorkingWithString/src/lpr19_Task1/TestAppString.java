package lpr19_Task1;
import java.util.Scanner;

public class TestAppString {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String word;
//		System.out.println("Enter a word");
//		word=in.next();
		LPR19_Task1 first=new LPR19_Task1();
//		try {
//		System.out.println(first.isPalindrom(word));
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
	//	System.out.println("Enter a word");
		//word=in.next();
		//System.out.println(first.replaceChar(word));
		
		System.out.println("Enter a sentense");
		word=in.nextLine();
		System.out.println(first.mostWordInSentense(word));
		System.out.println("Sentence have "+first.countWords(word)+" words");
		
	}

}

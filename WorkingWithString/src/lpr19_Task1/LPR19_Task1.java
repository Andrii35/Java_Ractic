package lpr19_Task1;

import java.util.Arrays;

public class LPR19_Task1 {

	public boolean isPalindrom(String word) throws Exception {
		
		StringBuffer sb1=new StringBuffer(word);
		String temp=sb1.reverse().toString();
		
		
			if(sb1.length()==5&&word.equalsIgnoreCase(temp))
					return true;
			else {
				String message="Error!";
				throw new Exception(message);
				
			}
	}
		public String replaceChar(String word) {
			
			char[]arr=word.toCharArray();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='a'||arr[i]=='o'||arr[i]=='i'
						||arr[i]=='u'||arr[i]=='e') {
					arr[i]='-';
				}
			}
			word=Arrays.toString(arr);
			return word;
		}
		
		public String mostWordInSentense(String word) {
			String temp =null;
			int count=0;
			int max=0;
			String []temp_string=word.split(" ");
			
			for(int i=0;i<temp_string.length;i++) {
				for(int j=0;j<temp_string.length;j++) {
					if(temp_string[i].equalsIgnoreCase(temp_string[j])) {
						count++;
						
					}		
				}
					if(max<count) {
						max=count;
						temp=temp_string[i];
					}
					else if(count==1){
						temp="Sentense haven't heer equels words";
					}
					count=0;
				}
			
			return temp;
		}
		
		public int countWords(String word) {
			
			int count=word.split(" ").length;
			return count;
		}
	
}

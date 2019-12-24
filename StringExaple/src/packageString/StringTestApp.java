package packageString;

import java.util.Arrays;

public class StringTestApp {

	public static void main(String[] args) {
		String s="Java";//javna inizializacija
		String s1=new String("cool ");
		char[] arr= {'l','e','n','g'};
		String s3=new String(arr);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		byte[]arrbyte= {67,87,97};
		String s4=new String(arrbyte);
		System.out.println(s4);
		
		System.out.println(s1.charAt(2));
        System.out.println(s1+s+s3);
        System.out.println(s.length());
        System.out.println(s.getBytes());
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.equals("Java "));// porivnjuje znzchennja
        System.out.println(s.equalsIgnoreCase("java"));// ignoruje registr pri porivnjanni
        System.out.println(s.concat(s1));// pojednuje rjadki
        System.out.println(s.startsWith("Ja"));//  chi je pochatkom rjadka
        System.out.println(s.startsWith("Ja",1));//  chi je pochatkom rjadka z pershoi pozicii
        System.out.println(s.compareTo("Jawa"));//povertaje riznicju po tablici ASCII. 
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf("av"));
        System.out.println("We learn java   ".trim());
        System.out.println(s.substring(2));
        System.out.println(s.subSequence(1, 3));
        System.out.println(s.join("!", s1,s4,s3));//objednuje rjadki, vstavlajuchi mig nimi vkazaniy simvol
        
        StringBuffer sb=new StringBuffer();
        sb.append("Point");
        sb.append(s);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2, 5, "go"));
        System.out.println(sb.capacity());
        
        System.out.println(Arrays.toString("My name is Tetjana".split(" ")));// rozdiljuvach
        
        
		}
	}



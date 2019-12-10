package Practic_0312;

import java.lang.Math;// підключення бібліотек
import java.util.LinkedList;;

public class Main {

	public static void main(String[] args) {
		//R=x2(x+1)/b-sin2(x+a);
		//s=sqrt x*b/a+cos2(x+b)3
		
		double a=0.7,b=0.05,x=0.5;
		double R=0;
		double s=0;
	    R=Math.pow(x, 2)*(x+1)/b-Math.pow(Math.sin(x+a),2);
	    s=Math.sqrt((x*b)/a)+Math.pow(Math.cos(Math.pow(x+b, 3)),2);
	    
	    //System.out.printf("R=%5.2f",R);
	    //System.out.printf("\ns=%5.2f",s);
	    //System.out.printf("R="+Math.round(R));
	    //System.out.printf("\ns="+Math.round(s));
	    
	   LinkedList<Student>student=new LinkedList<Student>();
	   for(int i=0;i<3;i++) {
		   student.add(new Student("Ivan","Durenj", 22,"23.12.2019"));
	   }
	    
	   student.getFirst().printStudent();
	    

	}

}


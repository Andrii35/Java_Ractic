package examoleComparate;

import java.util.Comparator;

public class StudentNameComparable implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
			
		}else {
			if(o1.getName().compareTo(o2.getName())<0) {
				return -1;
			}
		return 0;
	    }
	
	}
}

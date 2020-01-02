package examoleComparate;

import java.util.Comparator;

public class StudentKursComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getKurs()>obj2.getKurs()) {
			return 1;
			}
		else {
			if(obj1.getKurs()<obj2.getKurs()){
			return -1;
		   }
			return 0;
		}
    }
}

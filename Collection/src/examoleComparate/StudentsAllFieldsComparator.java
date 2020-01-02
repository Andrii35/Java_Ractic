package examoleComparate;
import java.util.Comparator;

public class StudentsAllFieldsComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getKurs()>o2.getKurs()) {
			return 1;
			}
		else {
			if(o1.getKurs()<o2.getKurs()){
			return -1;
		}else {
			if(o1.getName().compareTo(o2.getName())>0) {
				return 1;
				
			}else {
				if(o1.getName().compareTo(o2.getName())<0) {
					return -1;
				}else {
					if(o1.getAge()>o2.getAge()) {
						return 1;
					}
					else {
						if(o1.getAge()<o2.getAge()) {
							return -1;
						}
					}
				}
			}
		}
		
		}
		return 0;
	}

}

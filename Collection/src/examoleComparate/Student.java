package examoleComparate;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private int kurs;
	public Student() {
		kurs=1;
		name="none";
		age=0;
	}
	public Student(String name, int age, int kurs) {
				
		this.name = name;
		this.age = age;
		this.kurs=kurs;
	}
	public int getKurs() {
		return kurs;
	}
	public void setKurs(int kurs) {
		this.kurs = kurs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age+"\nKourse: "+kurs;
	}
	@Override
	public int compareTo(Student arg0) {
		
		if(this.kurs>arg0.getKurs()) {
			return 1;
			}
		else {
			if(this.kurs<arg0.getKurs()){
			return -1;
		}else {
			if(this.name.compareTo(arg0.getName())>0) {
				return 1;
				
			}else {
				if(this.name.compareTo(arg0.getName())<0) {
					return -1;
				}else {
					if(this.age>arg0.getAge()) {
						return 1;
					}
					else {
						if(this.age<arg0.getAge()) {
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

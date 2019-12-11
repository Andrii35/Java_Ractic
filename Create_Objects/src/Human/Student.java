package Human;
//1. Student: id, Прізвище, Ім'я, По батькові, Дата народження, Адреса, Телефон, Факультет, Курс, Група. 
//
//Створити масив об'єктів. Вивести:
//
//список студентів заданого факультету;
//списки студентів для кожного факультету та курсу;
//список студентів, які народились після заданого року;
//список навчальної групи.
public class Student {
    static int id=0;
    String surname;
    String name;
    String fathersname;
    String dateofbirth;
    String adress;
    String phone;
    String fakultet;
    int kours;
    int group;
    Student() {
       
//    	name="none";
//    	surname="none";
//    	fathersname="none";
//        dateofbirth="none";
//        adress="none";
//        phone="none";
//        fakultet="none";
//        kours=0;
//        group=0;
    	
    }
    
    Student(String surname, String name, String fathername,String date, String adress, String phone,String fakultet,
    		              int kours,int group)
    {
    	
    	this.surname=surname;
    	this.surname=surname;
    	this.name=name;
    	this.fathersname=fathername;
    	dateofbirth=date;
    	this.adress=adress;
    	this.phone=phone;
    	this.fakultet=fakultet;
    	this.kours=kours;
    	this.group=group;
    }
    
   int getId() {
    	return id;
    }
    String getSurname() {
    	return surname;
    }
     String getName() {
    	return name;
    }
     String getDateOfBirth() {
    	return dateofbirth;
    }
    void setSurname(String surn) {
    	surname=surn;
    }
    void setName(String nam) {
    	name=nam;
    }
    void setDateOfBirth(String date) {
    	dateofbirth=date;
    }
    
    void toPrint() {
    	System.out.print(id+". "+surname+" "+name+" "+fathersname);
    	System.out.println("\nDate of Birth: "+ dateofbirth);
    	System.out.println("Adress: "+ adress);
    	System.out.println("Phone: "+phone);
    	System.out.println("Fakultet: "+fakultet);
    	System.out.println("Kourse: "+kours+ "\nGroup: "+group);
    }
    
	@Override
	public String toString() {
		return name;
	}
}

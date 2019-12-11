package Human;

//Abiturient: id, Прізвище, Ім'я, По батькові, Адреса, Телефон, Оцінки. 
//
//Створити масив об'єктів. Вивести:
//
//список абітурієнтів, які мають незадовільні оцінки;
//список абітурієнтів, середній бал у яких вище заданого;
//вибрати задане число n абітурієнтів, що мають найвищий середній бал (вивести також повний список абітурієнтів, що мають напівпрохідний бал).

public class Abiturient {

	private int id;
	private String name;
	private String surname;
	private String adress;
	private int[]notes;
	public Abiturient() {
		id=0;
		name="none";
		surname="none";
		adress="none";
		notes=new int[10];
	}
	public Abiturient(int id, String name, String surname, String adress, int[]notes) {
		this();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.adress=adress;
		this.notes=notes;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getAdress() {
		return adress;
	}
	public int getNotes(int i){
		return notes[i];
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String name) {
		surname=name;
	}
	public void setAdress(String adress) {
		this.adress=adress;
	}
	public void setNotes(int i, int note) {
		this.notes[i]=note;
	}
	public int []getNotes(){
		return notes;
	}
	@Override
	public String toString() {
		return "ID. "+id+" "+name+" "+surname+"\nAdress: "+adress+"\nAverage: "+averNote();
	}
	
	public int averNote() {
		int average=0;
		for(int i=0;i<notes.length;i++) {
			average+=notes[i];
		}
		return average/notes.length;
	}
	
	
	

	
}

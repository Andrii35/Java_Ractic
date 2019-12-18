package Flayers;
//Определить иерархию самолетов. Создать авиакомпанию.
//Посчитать общую вместимость и грузоподъемность. Провести сортировку
//самолетов компании по дальности полета. Найти самолет в компании, со-
//ответствующий заданному диапазону параметров потребления горючего.
public abstract class Flayer {

	String type;
	int tank;
	int places;
	double useSprit;
	double maxLoad;
	static int count=0; 
	public Flayer() {
		type="none";
		tank=0;
		places=0;
		useSprit=0;
		maxLoad=0;
		count++;
	}
	public Flayer(String type, int tank, int places, double useSprit, double maxLoad) {
		
		this.type = type;
		this.tank = tank;
		this.places = places;
		this.useSprit = useSprit;
		this.maxLoad = maxLoad;
		count++;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public double getUseSprit() {
		return useSprit;
	}
	public void setUseSprit(double useSprit) {
		this.useSprit = useSprit;
	}
	public double getMaxLoad() {
		return maxLoad;
	}					
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	public int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "Type: " + type + "\ntank: " + tank + ",\nplaces=" + places + "\nuseSprit=" + useSprit
				+ "\nmaxLoad=" + maxLoad;
	}
	
}
				
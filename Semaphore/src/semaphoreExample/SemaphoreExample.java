package semaphoreExample;

import java.util.LinkedList;

//Місце для паркування. Доступно декілька машиномісць. 
//На одному місці може знаходитися тільки один автомобіль.
//Якщо всі місця зайняті, то автомобіль не стане чекати 
//більше певного часу і поїде на іншу стоянку.
public class SemaphoreExample {

	public static void main(String[] args) {
		
		LinkedList<Place> list = new LinkedList<Place>() {
			{
			this.add(new Place(11));
			this.add(new Place(12));
			this.add(new Place(13));
			this.add(new Place(14));
			
			}
		
			};
			CarParkingPool<Place> pool = new CarParkingPool<>(list);
			for (int i = 0; i < 20; i++) {
			new Car(pool).start();
			}

	}

}

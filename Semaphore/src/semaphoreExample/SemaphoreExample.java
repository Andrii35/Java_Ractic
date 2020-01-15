package semaphoreExample;

import java.util.LinkedList;

//̳��� ��� ����������. �������� ������� ����������. 
//�� ������ ���� ���� ����������� ����� ���� ���������.
//���� �� ���� ������, �� ��������� �� ����� ������ 
//����� ������� ���� � ���� �� ���� �������.
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

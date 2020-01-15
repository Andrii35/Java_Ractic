package semaphoreExample;

public class Car extends Thread{

	private boolean reading=false;
	private CarParkingPool<Place>pool;
	public Car( CarParkingPool<Place> pool) {
		
		this.pool = pool;
	}
	
	public void run() {
		Place place  = null;
		try {
		place = pool.getResource(500); 
		reading = true;
		System.out.println("Car #" + this.getId()
		+ " took place #" + place.getId());

		place.usingPlace();
		} catch (InterruptedException e) {
		System.out.println("Car #" + this.getId() + " car move to other parking ->"
		+ e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("Can't exists");
		}
		finally {
		if (place != null) {
		reading = false;
		System.out.println("Place for Car #" + this.getId() + " : "
		+ place.getId() + " place released");

		pool.returnResource(place);
		}
		}
	}
	
	public boolean isReding() {
		return reading;
	}
	
}

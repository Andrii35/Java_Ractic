package semaphoreExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CarParkingPool<T> {

	private final static int POOL_SIZE=4;
	private final Semaphore semaphore=new Semaphore(POOL_SIZE);
	private final Queue<T>car=new LinkedList<T>();
	public CarParkingPool(Queue<T> source) {
		car.addAll(source);
		}
	
	public T getResource(long maxWaitMillis) throws InterruptedException {
		try {
			if(semaphore.tryAcquire(maxWaitMillis,TimeUnit.MILLISECONDS)) {
				T res=car.poll();
				return res;
			}
						
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		throw new InterruptedException(": over witing timelimit!");
	}

	public void returnResource(T res) {
		car.add(res); 
		semaphore.release();
	}
}

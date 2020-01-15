package semaphoreExample;

import java.util.Random;

public class Place {
	
   private int id;

public Place(int id) {
	
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void usingPlace() {
	try {
		Thread.sleep(new Random().nextInt(1000));
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
   

}

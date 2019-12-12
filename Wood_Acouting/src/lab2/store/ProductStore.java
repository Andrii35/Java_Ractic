package lab2.store;
import java.util.Arrays;

import lab2.model.*;
public class ProductStore {
private int count=0;
private Timber[]timber=new Timber[2];


public Timber[]getTimmb() {
	return timber;
}
public void addTimber(Timber newTimber) {
	
	
	if(timber.length==count) {
		timber=Arrays.copyOf(timber, count+count/2);
		
	}
	
	timber[count]=new Timber(newTimber.getWood(),newTimber.getLength(),newTimber.getHeight(),newTimber.getWidth());
	count++;
	
}

public String toString() {
	
	StringBuilder sb=new StringBuilder("Timbers list: \n");
	for(int i=0;i<count;i++) {
		sb.append(timber[i]).append("\n");
	}
	return sb.toString();
}
}

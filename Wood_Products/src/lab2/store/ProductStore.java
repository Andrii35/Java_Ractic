package lab2.store;
import java.util.Arrays;
import lab2.model.*;


public class ProductStore {
private int count=0;
private AbstractTimber[]timber=new AbstractTimber[2];


public AbstractTimber[]getTimmb() {
	return timber;
}
public void addTimber(AbstractTimber newProduct) {
	
	
	if(timber.length==count) {
		timber=Arrays.copyOf(timber, count+count/2);
		
	}
	
	timber[count]=newProduct;
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

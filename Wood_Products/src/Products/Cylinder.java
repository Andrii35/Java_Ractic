package Products;
import java.lang.Math;
import lab2.model.AbstractTimber;
import lab2.model.*;
public class Cylinder extends AbstractTimber {

	private float length;
	private float diametr;
	public Cylinder() {
		super();
	}
	
	public Cylinder(Wood wood,float length, float diametr) {
		super(wood);
		this.length = length;
		this.diametr = diametr;
	}
	
	@Override
	public float volume() {
		
		return (float)Math.PI*length*diametr;
	}

	@Override
	public String toString() {
		return "Cylinder [length=" + length + ", diametr=" + diametr + ", volume()=" + volume() + ", weight()="
				+ weight() + "]";
	}
	
	

}

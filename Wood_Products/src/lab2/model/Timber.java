package lab2.model;

public class Timber extends AbstractTimber {

	private float length;
	private float height;
	private float width;
	public Timber() {
		super();
	}
	public Timber(Wood wood, float length, float height, float width) {
		
		super(wood);
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public float getHeight() {
		return height;
	}
	public float getWidth() {
		return width;
	}
	@Override
	public float volume() {
		return length*height*width;
	}
	@Override
	public String toString() {
		return "Timber [" + wood.getName() + ", weight(): " + weight() + "]";
	}
	
	
}

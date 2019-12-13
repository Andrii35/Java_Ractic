package lab2.model;

public abstract class AbstractTimber {

	protected Wood wood;

	public AbstractTimber() {
		
	}
	

	public AbstractTimber(Wood wood) {
		super();
		this.wood = wood;
	}


	public Wood getWood() {
		return wood;
	}

	public  float weight() {
		return wood.getDensity()*volume();
	}
	
    public abstract float volume(); 
}
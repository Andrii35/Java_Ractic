package su27Control;
import java.lang.Math;

public class Control {

		
	public void up() {
	System.out.println("Flayer go up for "+Math.random()*1000+" meter");	
	}
	public void down() {
		System.out.println("Flayer go down for "+Math.random()*1000+" meter");	
		}
	public void left() {
		System.out.println("Flayer turn left for "+Math.random()*1000+" meter");	
		}
	public void right() {
		System.out.println("Flayer turn right for "+Math.random()*1000+" meter");	
		}
	
}

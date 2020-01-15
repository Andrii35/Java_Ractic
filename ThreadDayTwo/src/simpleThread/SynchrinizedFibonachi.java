package simpleThread;

public class SynchrinizedFibonachi {

	private static int previous=0;
	private static int current=1;
	
	public static void main(String[] args) {
		
		Thread f1=new Thread(new CalculateFibbo());
		Thread f2=new Thread(new CalculateFibbo());
		f1.start();
		f2.start();
	}
	private static synchronized void calcFibbo() {
		int next=previous+current;
		System.out.println(next);
		previous=current;
		current=next;
	}
	private static class CalculateFibbo implements Runnable{

		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			calcFibbo();
			}
			
		}

		
		
	}
}

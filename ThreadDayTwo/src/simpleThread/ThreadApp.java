package simpleThread;

public class ThreadApp {

	volatile private static int counter=0;
	
	public static void main(String[] args) {

//		new ReadingSekondThread();
		Thread stream1=new Thread(new ReadingThread());
		Thread stream2=new Thread(new ReadingThread());
		
		stream1.start();
		stream2.start();
//		try {
//			stream1.join();
//			for(int i=0;i<3;i++) {
//				System.out.println(i);
//				Thread.sleep(400);
//			}
//			
//		}catch(InterruptedException e) {
//			e.getMessage();
//		}
//
		System.out.println("Stream main");
		
		// Example Synchronyzide
//		new AddCounter().start();
//		new PrintCounter().start();
		
		
	}
	
	
	private  static class AddCounter extends Thread {

		@Override
		public void run() {
			int temp=counter;
			try {
			for(int i=0;i<10;i++) {
				System.out.println("Counter add"+temp);
				counter=++temp;
				Thread.sleep(1000);
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		
	}
		
}
	
	private static class PrintCounter extends Thread{
		@Override
		public void run() {
			int i=0;
			int temp=counter;
			try {
			while(i<10) {
				
					System.out.println("Print counter"+counter);
				    i++;
					Thread.sleep(1000);
				} 
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			
		
	}
	}
	



package Information;

public class Information {

	Info obj;
	public Information()
	{
	    obj=new Info();
	}
		
		public Information(int time, String line, int paymant) {
			this();
			obj.setTime(time);
			obj.setLine(line);
			obj.setPaymant(paymant);
		
	}
		public String showLine() {
			return obj.getLine();
		}
		public int showTimeInterval() {
			return obj.getTime();
		}
		public int showTicketPrice() {
			return obj.getPaymant();
		}
				
		
		class Info{
			private int time;
			private String line;
			private int paymant;
			public Info()
			{
				time=0;
				line="12";
				paymant=0;
			}
			private int getTime() {
				return time;
			}
			private void setTime(int time) {
				this.time = time;
			}
			private String getLine() {
				return line;
			}
			private void setLine(String line) {
				this.line = line;
			}
			private int getPaymant() {
				return paymant;
			}
			private void setPaymant(int paymant) {
				this.paymant = paymant;
			}
			@Override
			public String toString() {
				return "Time: " + time + "\nline: " + line + "\npaymant: " + paymant;
			}
			
		}
	
	
}

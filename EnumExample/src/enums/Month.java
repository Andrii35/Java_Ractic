package enums;

public enum Month {

	JANUARY(31,Seasons.WINTER), 
	FEBRUARY(28,Seasons.WINTER), 
	MARCH(31,Seasons.SPRING), 
	APRIL(30,Seasons.SPRING),
	MAI(31,Seasons.SPRING), 
	JUNE(30,Seasons.SUMMER), 
	JULI(31,Seasons.SUMMER), 
	AUGUST(31,Seasons.SUMMER), 
	SEPTEMPER(30,Seasons.AUTUMN), 
	OKTOBER(31,Seasons.AUTUMN), 
	NOVEMBER(30,Seasons.AUTUMN), 
	DECEMBER(31,Seasons.WINTER);
	private int days;
	Seasons season;
	
	private Month(int days, Seasons season) {
		this.days = days;
		this.season = season;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}


	public Seasons getSeason() {
		return season;
	}
	
}

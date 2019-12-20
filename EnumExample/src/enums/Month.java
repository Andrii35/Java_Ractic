package enums;

public enum Month {

	JANUARY(31,Seasons.WINTER), 
	FEBRUARY(28,Seasons.WINTER), 
	MARCH(31,Seasons.WINTER), 
	APRIL(30,Seasons.WINTER),
	MAI(31,Seasons.WINTER), 
	JUNE(30,Seasons.WINTER), 
	JULI(31,Seasons.WINTER), 
	AUGUST(31,Seasons.WINTER), 
	SEPTEMPER(30,Seasons.WINTER), 
	OKTOBER(31,Seasons.WINTER), 
	NOVEMBER(30,Seasons.WINTER), 
	DECEMBER(31,Seasons.WINTER);
	private int days;
	Seasons season;
	
	
	private Month(int days, Seasons season) {
		this.days = days;
		this.season = season;
	}

	private int getDays() {
		return days;
	}

	private void setDays(int days) {
		this.days = days;
	}
	
}

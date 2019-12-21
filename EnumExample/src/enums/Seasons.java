package enums;

public enum Seasons {

	WINTER,
	SPRING,
	SUMMER,
	AUTUMN("rain"){public String getInfoWeather() {return super.getInfoWeather()+ " and falling leaves";}
	       public int countRain(int day)
	              {return day+3;}
	       };
	private String infoWeather;
	Seasons(){}
	Seasons(String infoWeather){
		this.infoWeather=infoWeather;
	}
	public String getInfoWeather() {
		return infoWeather;
	}
	public int countRain(int day) {return day;}
	
}


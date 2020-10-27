
public class Station {
	
	public String stationName;
	public String freq;

	public Station(String stationName, String freq) {
		
		this.stationName = stationName;
		this.freq = freq;
		
	}
	
	public String str() {
		
		return stationName + " "+ freq;
		
	}

}

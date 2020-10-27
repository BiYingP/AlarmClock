
public class Radio {
	
	private Station currentRadioStation;
	private boolean isRadioOn;
	private int volume;
	
	
	public Radio(Station s) {
		
		this.currentRadioStation = s;
		this.isRadioOn = true;
		
	}
	
	public void setRadioStation(Station s) {
		
		this.currentRadioStation = s;
		
	}
	
	public Station getRadioStation() {
		
		return currentRadioStation;
		
	}
	
	public boolean isRadioOn() {
		
		return this.isRadioOn;
		
	}

	public void turnOn() {
		
		isRadioOn = true;
		System.out.println("Radio on");
		
	}
	
	public void turnOff() {
		
		isRadioOn = false;
		System.out.println("Radio off");
		
	}
	
	public void setVolume(int v) {
		
		this.volume = v;
		
	}
	
	public int getVolume() {
		
		return this.volume;
		
	}
	
	// print radio status
	public void str() {
		if (isRadioOn = true) {
			System.out.println( "Radio is on, playing " + getRadioStation().str() + " at volume " + getVolume());
		}
		else {
			System.out.println( "Radio is off");
		}
		
	}
}


public class AlarmClockRadio extends AlarmClock {
	
	protected Radio radio;

	public AlarmClockRadio(String clockTime, String alarmTime) {
		
		super(clockTime, alarmTime);
		
		Station radioStation = new Station("1060", "AM");
		Radio theRadio = new Radio(radioStation);
		radio = theRadio;
	}
	
	public Station getRadioStation() {
		return radio.getRadioStation();
	}
	
	public void setRadioStation(String n, String f) {
		Station s = new Station(n, f);
		radio.setRadioStation(s);
		
	}
	
	public int getVolume() {
		return radio.getVolume();
	}
	
	public void setVolume(int v) {
		radio.setVolume(v);
	}
	
	public void turnRadioOn() {
		radio.turnOn();
	}
	
	public void turnRadioOff() {
		radio.turnOff();
	}
	
	// display radio information
	public void showRadio() {
		radio.str();
	}
	
	@Override
	public void checkAlarm() {
		
		// check alarm time
		if (isAlarmOn == true && equal(getCurrentTime(), getAlarm())) {
			System.out.println("Buzz Buzz Buzz");
		}
		// check 9 minute snooze
		if (isAlarmOn == true && (snoozeTime != null) && equal(getCurrentTime(), snoozeTime)) {
			showRadio();
		}
		
	}
}


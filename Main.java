//BiYing Pan
//CS350 Lab1

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlarmClockRadio myClock = new AlarmClockRadio("8:00 AM", "8:05 AM");
		System.out.print("Inintial time: ");
		myClock.showTime();
		
		// display radio station and set volume to 3
		myClock.setVolume(3);
		myClock.showRadio();
			
		for (int i = 0; i <= 5; i++){
			
			myClock.showTime();

		 	for (int seconds = 0; seconds < 60; seconds++) {
		 		
		 		myClock.checkAlarm();
		 		myClock.tick();
		 	}
		 }
		 myClock.snooze();
		 
		 for (int i = 0; i < 9; i++) {
			 
			 myClock.showTime();
			 
			 for (int seconds = 0; seconds < 60; seconds++){
				 myClock.checkAlarm();
				 myClock.tick();
			 }
		 }
		 
		 myClock.turnAlarmOff();
		 
		 // change radio station and volume to 8
		 myClock.setRadioStation("102.9", "PM");
		 myClock.setVolume(8);
		 myClock.showRadio();
		 myClock.turnRadioOff();
		 
	}

}

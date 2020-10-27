import java.util.*;
import java.text.*;

public class AlarmClock extends Clock{
	
	protected Date alarmTime;
	protected boolean isAlarmOn;
	protected Date snoozeTime;
	
	
	public AlarmClock(String clockTime, String alarmTime) {
		
		super (clockTime);
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		try {
			setAlarm(dateFormat.parse(alarmTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		turnAlarmOn();
	}

	public void setAlarm(Date alarmTime) {
		this.alarmTime = alarmTime;
	
	}
	public Date getAlarm() {
		
		return this.alarmTime;
		
	}
	public void turnAlarmOn() {
		
		this.isAlarmOn = true;
		
	}
	
	public void turnAlarmOff() {
		
		this.isAlarmOn = false;
		snoozeTime = null;
		//System.out.println("Buzz Buzz Buzz");
		System.out.println("The alarm off");
		
	}
	
//	public void isAlarmOn() {
//		
//		this.isAlarmOn = true;
//		
//	}
	
	public void snooze() {
		
		Calendar c = Calendar.getInstance();
		if (snoozeTime == null) {
			c.setTime(getAlarm());	
		}else {
			c.setTime(snoozeTime);
		}
		// set snooze time for 9 minute
		c.add(Calendar.MINUTE, 9);
		snoozeTime = c.getTime();
		
		System.out.println("Snooze was pressed");
		
	}
	
	protected boolean equal(Date d1, Date d2) {
		
		int h1, m1, s1, h2, m2, s2;
		
		// set time 1 and time 2 
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		
		// get hours minutes and seconds for time1 and time2
		h1 = c1.get(Calendar.HOUR_OF_DAY);
		m1 = c1.get(Calendar.MINUTE);
		s1 = c1.get(Calendar.SECOND);
		h2 = c2.get(Calendar.HOUR_OF_DAY);
		m2 = c2.get(Calendar.MINUTE);
		s2 = c2.get(Calendar.SECOND);
		
		return ((h1==h2)&&(m1==m2)&&(s1==s2));
	}
	
	public void checkAlarm() {
		
		// check alarm time
		if (isAlarmOn == true && equal(getCurrentTime(), getAlarm())) {
			System.out.println("Buzz Buzz Buzz");
		}
		// check 9 minute snooze
		if (isAlarmOn == true && (snoozeTime != null) && equal(getCurrentTime(), snoozeTime)) {
			System.out.println("Buzz Buzz Buzz");
		}
		
	}
	
}

import java.util.*;
import java.text.*;

public abstract class Clock {
	
	protected Date currentTime;

	public Clock(String clockTime) {
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		
		try {
			setCurrentTime(dateFormat.parse(clockTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//accessor
	public Date getCurrentTime() {
		
		return this.currentTime;	
		
	}
	
	//mutator
	public void setCurrentTime(Date currentTime) {
		
		this.currentTime = currentTime;
	}
	
	public void tick() {
		
		Calendar c = Calendar.getInstance();
		c.setTime(currentTime);
		c.add(Calendar.SECOND, 1);
		setCurrentTime(c.getTime());
		
	}
	
	// print current clock time
	public void showTime() {
		
		//Displaying current time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
    	
    	System.out.println(dateFormat.format(currentTime));
	}
	
}

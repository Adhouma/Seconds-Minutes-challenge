package com.learnJava;

public class Main {
	/**
	 * Create a method called getDurationString with 2 parameters (minutes and seconds)
	 * Validate that minutes >= 0
	 * validate that seconds >= 0 && seconds <= 59
	 * 
	 * The method should return "Invalid value" if either of the above are not true
	 * If the parameters are valid then calculate how many hours, minutes and seconds equal the minutes and
	 * seconds passed to the method and return that value as a string in format "XXh YYm ZZs" where XX represents
	 * number of hours, YY the minutes and ZZ the seconds.
	 * 
	 * Create a 2nd method of the same name but with only one parameter (second)
	 * Validate that second >= 0
	 * If it is valid calculate how many minutes are in the seconds value and then call the other overloaded method
	 * passing the correct minutes and seconds calculated so it can calculate correctly.
	 * 
	 * BONUS:
	 * For the input 61 minutes output should be 01h 01m 00s
	 */
	public static void main(String[] args) {
		// Should return 1h 5m 45s
		String testFirstMethod = getDurationString(65, 45);
		System.out.println(testFirstMethod);
		
		// Should return 1h 5m 45s
		String testSecondMethod = getDurationString(3945);
		System.out.println(testSecondMethod);
		
		// Should return "Invalid value"
		String testInavlidMethod = getDurationString(98, 145);
		System.out.println(testInavlidMethod);
	}
	private static final String INVALID_STRING_MESSAGE= "Invalid value";
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
			int hours = minutes / 60;
			int remainingMinutes = minutes % 60;
			
			String hoursString = hours + "h ";
			if(hours < 10) {
				hoursString = "0" + hoursString;
			}
			
			String minutesString = remainingMinutes + "m ";
			if(remainingMinutes < 10) {
				minutesString = "0" + minutesString;
			}
			
			String secondsString = seconds + "s";
			if(seconds < 10) {
				secondsString = "0" + secondsString;
			}
			
			return hoursString + minutesString + secondsString;
		} else {
			return INVALID_STRING_MESSAGE;
		}
	}
	
	public static String getDurationString(int seconds) {
		if(seconds >= 0) {
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			return getDurationString(minutes, remainingSeconds);
		} else {
			return INVALID_STRING_MESSAGE;
		}
	}

}

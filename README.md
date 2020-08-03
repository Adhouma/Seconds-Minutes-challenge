# Seconds-Minutes-challenge

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

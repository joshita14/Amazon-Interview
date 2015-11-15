package com.interview.prep.amazon;

public class AngleMinuteHandAndHourHand {
	
	
	/*
	 * find angle b/w minute and hour hand at 6:50
	 * So the hour is 6 and 15 is the minute
	 */
	
	void angleHourHandAndMinute(){
		//angle hour hand and minute hand
		
		//calculate angle for hour hand first;
		/*
		 * In 1 hr it moves  360 degree
		 * 360/60 = 6 degree, in a minute
		 * so in 1 minute : 6 degree, so in 
		 * 
		 * in 15 minutes, 50*6 =300 degree
		 */
		/*
		 * hour hand matlab choti wali jo sirf 12 gante mai 306 pura karti hai:
		 * hour hand , 12 hr 360 degree, hence degree is 360/12 = 30 degree
		 * 1 hr = 360/12 = 30
		 * 1 minute = 1/60 *30 = .5
		 * In 50 minutes = .5 * 50 = 25 degree.
		 * In 6hr 50 minutes : 30*6+25 = 205
		 * 
		 * Now Minute hand :
		 * In 60 minutes, 360 
		 * 1 minute = 360/60 = 6 degree
		 * In 50 minutes : 6*50 = 300
		 * 
		 * Hence the angle b/w two hands is : 300-205 = 95 degree
		 * 
		 * NICE EXAMPLE : http://www.careercup.com/question?id=14875869
		 */
	}
	
	public static void main(String[] args) {
		AngleMinuteHandAndHourHand angle = new AngleMinuteHandAndHourHand();
	}

}

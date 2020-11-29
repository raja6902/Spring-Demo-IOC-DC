package com.raja.springdemo.test;

import com.raja.springdemo.TrackCoach;
import com.raja.springdemo.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}

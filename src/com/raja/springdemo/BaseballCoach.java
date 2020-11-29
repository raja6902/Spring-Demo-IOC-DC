package com.raja.springdemo;

import com.raja.springdemo.interfaces.Coach;
import com.raja.springdemo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	//Define private field for the dependency.
	
	private FortuneService fortuneService;
	
	// Define constructor for Dependency injection.
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		 
		return fortuneService.getFortuneService();
	}

}





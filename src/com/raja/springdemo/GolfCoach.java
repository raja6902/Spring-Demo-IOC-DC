package com.raja.springdemo;

import com.raja.springdemo.interfaces.Coach;
import com.raja.springdemo.interfaces.FortuneService;

public class GolfCoach implements Coach {
	
	
	private FortuneService fortuneService;
  
	public GolfCoach(FortuneService fortuneService) {
		 
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return " Practice putting skill daily";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}

}

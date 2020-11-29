package com.raja.springdemo;

import com.raja.springdemo.interfaces.Coach;
import com.raja.springdemo.interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortuneService();
	}

	// add init method
	public void doMySatartUpStuff() {
		System.out.println("TrackCoach :  inside method doMyStartUpStuff");
	}

	// add a destroy method
	public void doMyCleanUpStuff() {

		System.out.println("TrackCoach :  inside method doMyCleanUpStuff");

	}
}

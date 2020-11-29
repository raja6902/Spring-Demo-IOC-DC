package com.raja.springdemo;

import com.raja.springdemo.interfaces.Coach;
import com.raja.springdemo.interfaces.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public CricketCoach() {

	}

	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "50 push ups and 5 km run daily";
	}

	@Override
	public String getDailyFortune() {

		return "Just DO it:" + fortuneService.getFortuneService();
	}

}

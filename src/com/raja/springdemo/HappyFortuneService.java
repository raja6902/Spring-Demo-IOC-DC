package com.raja.springdemo;

import com.raja.springdemo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		 
		return "Today is your lucky day!";
	}

}

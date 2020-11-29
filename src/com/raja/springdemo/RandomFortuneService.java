package com.raja.springdemo;

import java.util.Random;

import com.raja.springdemo.interfaces.FortuneService;

public class RandomFortuneService implements FortuneService {

	 
		
		private String[] data = {"Beware of wolf in sheep's clothing",
				                  "Deligince is the mother of good luck",
				                  "The journey is reward"};
		
		// Create a Random generator
		private Random myRandom = new Random();
		
		@Override
		public String  getFortuneService() {
			// Pick a random String from the array
			
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			return theFortune;
			
			
			
				                  
		
	}

}

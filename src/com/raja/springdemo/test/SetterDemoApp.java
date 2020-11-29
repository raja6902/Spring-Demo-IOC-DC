package com.raja.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raja.springdemo.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		 // Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );
		
		//retrieve bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class)	;
		//call method on bean
		System.out.println(theCoach.getDailyWorkout()); 
		System.out.println(theCoach.getDailyFortune()); 
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close context
        context.close();
	}

}

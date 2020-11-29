package com.raja.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raja.springdemo.interfaces.Coach;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml" );
		
		Coach theCoach = context.getBean("myGolfCoach" ,Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}

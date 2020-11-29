package com.raja.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raja.springdemo.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );
		
		//retrieve  bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call the method on beans
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method.
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context.
		context.close();
		
	}

}

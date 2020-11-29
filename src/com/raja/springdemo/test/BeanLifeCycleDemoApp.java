package com.raja.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raja.springdemo.CricketCoach;
import com.raja.springdemo.interfaces.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		 // Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml" );
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach", Coach.class)	;
		//call method on bean
		 System.out.println(theCoach.getDailyWorkout());
		 
		//close context
        context.close();
	}

}

package com.mightycoder.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean from the container
        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        // call the method from the container
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        // close the application context
        context.close();
    }
}

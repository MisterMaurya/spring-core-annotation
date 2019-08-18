package com.mightycoder.di.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        // load the configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean from the container
        Coach myFavCoach = context.getBean("myFavCoach", Coach.class);

        // call the method form the bean
        System.out.println(myFavCoach.getDailyWorkout());
        System.out.println(myFavCoach.getFortune());

        // close the application context
        context.close();
    }
}

package com.mightycoder.di.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean from the container
        Coach mySecFavCoach = context.getBean("mySecFavCoach", Coach.class);

        // call the method form the bean
        System.out.println(mySecFavCoach.getDailyWorkout());
        System.out.println(mySecFavCoach.getFortune());

        // close the container
        context.close();
    }
}

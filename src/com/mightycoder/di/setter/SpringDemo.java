package com.mightycoder.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        // load the configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean from the container
        Coach boxerCoach = context.getBean("boxerCoach", Coach.class);

        // call the method form the bean
        System.out.println(boxerCoach.getDailyWorkout());
        System.out.println(boxerCoach.getFortune());

        // close the application context
        context.close();
    }
}

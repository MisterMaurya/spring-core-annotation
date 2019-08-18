package com.mightycoder.withoutbeanidatclasslevel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        // load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean from the container
        Coach theCoach = context.getBean("cricketCoach", Coach.class);

        // call the method from the bean
        System.out.println(theCoach.getDailyWorkout());
        // close the application context
    }
}


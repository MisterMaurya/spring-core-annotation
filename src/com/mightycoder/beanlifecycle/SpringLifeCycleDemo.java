package com.mightycoder.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleDemo {
    public static void main(String[] args) {

        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean form the container
        HeyCoach heyCoach = context.getBean("heyCoach", HeyCoach.class);

        // call the function from bean
        System.out.println(heyCoach.getDailyWorkout());
        System.out.println(heyCoach.StartUp());


        // close the application context
        context.close();
        System.out.println("close-----------");
       // System.out.println(heyCoach.cleanUp());

    }
}

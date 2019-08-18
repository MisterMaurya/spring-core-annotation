package com.mightycoder.di.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoQualifier {
    public static void main(String[] args) {
        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean form the container
        Coach helloCoach = context.getBean("helloCoach", Coach.class);


        // call the method from the bean
        System.out.println(helloCoach.getDailyWorkout());
        System.out.println(helloCoach.getFortune());

        // close the application context
        context.close();
    }
}

package com.mightycoder.withbeanidatclasslevel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {
    public static void main(String[] args) {

        // load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextwithbeanid.xml");

        // get the bean form the application container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call the method form the beans
        System.out.println(theCoach.getDailyWorkout());

        // close the application context
        context.close();
    }
}

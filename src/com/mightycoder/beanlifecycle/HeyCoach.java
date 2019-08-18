package com.mightycoder.beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HeyCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "You are superb";
    }

    public HeyCoach() {
        System.out.println("Constructor call");
    }

    @PostConstruct
    public String StartUp() {
        return "Hey Dude start";
    }

    @PreDestroy
    public String cleanUp() {
        return "Hey Dude kill";
    }

}

package com.mightycoder.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloCoach implements Coach {

    @Autowired
    @Qualifier("randomFortune3")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "What happened";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

package com.mightycoder.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoxerCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Whats going on here";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

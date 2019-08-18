package com.mightycoder.di.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySecFavCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    void applyMethodInjection(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "You are doing wrong";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

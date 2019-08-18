package com.mightycoder.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFavCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Hello Bro";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

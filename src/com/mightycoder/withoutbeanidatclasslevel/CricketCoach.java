package com.mightycoder.withoutbeanidatclasslevel;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Hurry up guys";
    }
}

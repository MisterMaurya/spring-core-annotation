package com.mightycoder.withbeanidatclasslevel;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Everyday practice";
    }

}

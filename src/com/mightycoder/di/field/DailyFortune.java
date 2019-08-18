package com.mightycoder.di.field;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DailyFortune implements FortuneService {

    String[] fortunes = {
            "Welcome day",
            "Good Morning",
            "Good Evening"

    };

    Random random = new Random();

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}

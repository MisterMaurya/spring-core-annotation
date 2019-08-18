package com.mightycoder.di.method;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortune implements FortuneService {

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

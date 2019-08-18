package com.mightycoder.di.setter;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EverydayFortune implements FortuneService {

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

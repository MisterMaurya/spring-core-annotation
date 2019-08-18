package com.mightycoder.di.qualifier;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune2 implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortune2";
    }
}

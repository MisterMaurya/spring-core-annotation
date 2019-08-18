package com.mightycoder.di.qualifier;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune1 implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortune1";
    }
}

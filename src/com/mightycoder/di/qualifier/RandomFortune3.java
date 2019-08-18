package com.mightycoder.di.qualifier;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune3 implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortune3";
    }
}

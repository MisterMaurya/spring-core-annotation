package com.mightycoder.di.constructor;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You are a lucky guys";
    }
}

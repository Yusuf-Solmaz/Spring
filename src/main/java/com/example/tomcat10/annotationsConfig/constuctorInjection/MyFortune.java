package com.example.tomcat10.annotationsConfig.constuctorInjection;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyFortune implements FortuneService {

    public String[] fortune={"You will be successful in your work.","You will be unusually successful in business.","You will enjoy good health."};

    private Random random = new Random();
    int myRandomIndex = random.nextInt(fortune.length);

    @Override
    public String getFortune() {
        return fortune[myRandomIndex];
    }
}

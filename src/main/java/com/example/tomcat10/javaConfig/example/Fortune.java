package com.example.tomcat10.javaConfig.example;

import java.util.Random;

public class Fortune implements FortuneService{

    private String[] fortunes={"Your love of music will be an important part of your life."," Your goal will be reached very soon.","Your loyalty is a virtue, but not when it’s wedded with blind stubbornness.","Your mind is creative, original and alert.","Your mentality is alert, practical, and analytical."};
    private Random random = new Random();
    private int myRandom = random.nextInt(fortunes.length);


    @Override
    public String getFortune() {
        return fortunes[myRandom];
    }


}

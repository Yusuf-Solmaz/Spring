package com.example.tomcat10.javaConfig;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomWeather implements WeatherService {

    private String[] weathers = {"Sunny","Snowy", "Foggy", "Rainy"};

    private Random random = new Random();
    private int myRandom = random.nextInt(weathers.length);


    @Override
    public String getWeather() {
        return weathers[myRandom];
    }
}

package com.example.tomcat10.javaConfig;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Weather implements WeatherService{

    private String[] weathers = {"Sunny","Snowy","Foggy","Rainy"};
    private Random random = new Random();
    private int myRandom = random.nextInt(weathers.length); ;

    @Override
    public String getWeather() {
        return "Today's weather is: "+weathers[myRandom];
    }
}

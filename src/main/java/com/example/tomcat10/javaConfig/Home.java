package com.example.tomcat10.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home implements DoSomething {

    @Autowired
    WeatherService weatherService;

    @Override
    public String eat() {
        return "You have your dinner in the kitchen.";
    }

    @Override
    public String watch() {
        return "You are watching a cartoon in your living room.";
    }

    @Override
    public String getWeather() {
        return weatherService.getWeather();
    }
}

package com.example.tomcat10.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("doInSchool")
public class School implements DoSomething {

    @Autowired
    WeatherService weatherService;

    @Override
    public String eat() {
        return "You have your lunch in the dining hall.";
    }

    @Override
    public String watch() {
        return "You are watching a documentary in history lesson.";
    }

    @Override
    public String getWeather() {
        return weatherService.getWeather();
    }
}


package com.example.tomcat10.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Backyard implements DoSomething{

    @Value("${prop.name}")
    private String name;

    @Value("${prop.Date}")
    private String date;

    WeatherService weatherService;

    public Backyard(WeatherService weatherService) {
        this.weatherService=weatherService;
    }

    @Override
    public String eat() {
        return  name+" eating a hot dog in backyard.At "+ date;
    }

    @Override
    public String watch() {
        return "You are watching insects.";
    }

    @Override
    public String getWeather() {
        return weatherService.getWeather();
    }
}

package com.example.tomcat10.javaConfig;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MyDay implements DoSomething {

    WeatherService weatherService;

    @Autowired
    public MyDay(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public String watch() {
        return "You are watching a documentary.";
    }

    @Override
    public String getWeather() {
        return weatherService.getWeather();
    }
}

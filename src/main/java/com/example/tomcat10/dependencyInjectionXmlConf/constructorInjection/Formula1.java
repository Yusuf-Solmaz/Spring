package com.example.tomcat10.dependencyInjectionXmlConf.constructorInjection;

public class Formula1 implements WatchSports{

    private WeatherService weatherService;

    public Formula1(WeatherService weatherService){
        this.weatherService=weatherService;
    }

    @Override
    public String watch() {
        return "You are watching Formula 1.";
    }

    @Override
    public String getDailyWeather() {
        return weatherService.getWeather();
    }
}

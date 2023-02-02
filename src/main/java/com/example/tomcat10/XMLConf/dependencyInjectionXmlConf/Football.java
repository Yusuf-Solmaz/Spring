package com.example.tomcat10.XMLConf.dependencyInjectionXmlConf;

public class Football implements WatchSports{

    private WeatherService weatherService;

    public Football(WeatherService weatherService){
        this.weatherService=weatherService;
    }

    @Override
    public String watch() {
        return "You are watching Football.";
    }

    @Override
    public String getDailyWeather() {
        return weatherService.getWeather();
    }
}

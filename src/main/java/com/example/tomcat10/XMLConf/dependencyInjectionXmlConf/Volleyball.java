package com.example.tomcat10.XMLConf.dependencyInjectionXmlConf;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Volleyball implements WatchSports{
    private String teamName;

    private String date;

    WeatherService weatherService;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public Volleyball(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String watch() {
        return "You are watching volleyball.";
    }

    @Override
    public String getDailyWeather() {
        return weatherService.getWeather();
    }
}

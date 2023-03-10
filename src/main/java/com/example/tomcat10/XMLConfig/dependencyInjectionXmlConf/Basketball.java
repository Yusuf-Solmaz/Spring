package com.example.tomcat10.XMLConfig.dependencyInjectionXmlConf;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Basketball implements WatchSports{

    private String teamName;

    private String date;

    WeatherService weatherService;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDate() {
        return date;
    }

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public String watch() {
        return "You are watching basketball.";
    }

    @Override
    public String getDailyWeather() {
        return weatherService.getWeather();
    }
}

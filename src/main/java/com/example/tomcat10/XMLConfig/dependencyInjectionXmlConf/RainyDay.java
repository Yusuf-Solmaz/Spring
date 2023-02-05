package com.example.tomcat10.XMLConfig.dependencyInjectionXmlConf;

public class RainyDay implements WeatherService{
    @Override
    public String getWeather() {
        return "Today is rainy.";
    }
}

package com.example.tomcat10.XMLConf.dependencyInjectionXmlConf;

public class RainyDay implements WeatherService{
    @Override
    public String getWeather() {
        return "Today is rainy.";
    }
}
package com.example.tomcat10.XMLConf.dependencyInjectionXmlConf;

public class SunnyDay implements WeatherService{
    @Override
    public String getWeather() {
        return "Today is sunny.";
    }
}

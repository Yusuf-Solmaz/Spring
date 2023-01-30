package com.example.tomcat10.dependencyInjectionXmlConf.constructorInjection;

public class SunnyDay implements WeatherService{
    @Override
    public String getWeather() {
        return "Today is sunny.";
    }
}

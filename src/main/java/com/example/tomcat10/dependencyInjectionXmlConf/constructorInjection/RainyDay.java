package com.example.tomcat10.dependencyInjectionXmlConf.constructorInjection;

public class RainyDay implements WeatherService{
    @Override
    public String getWeather() {
        return "Today is rainy.";
    }
}

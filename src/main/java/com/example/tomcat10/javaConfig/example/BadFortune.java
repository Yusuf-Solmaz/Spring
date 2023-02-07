package com.example.tomcat10.javaConfig.example;

public class BadFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "This is a bad fortune.";
    }
}

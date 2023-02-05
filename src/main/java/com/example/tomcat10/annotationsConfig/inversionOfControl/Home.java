package com.example.tomcat10.annotationsConfig.inversionOfControl;

import org.springframework.stereotype.Component;

@Component
public class Home implements DoSomething {
    @Override
    public String eat() {
        return "You have your dinner in the kitchen.";
    }

    @Override
    public String watch() {
        return "You are watching a cartoon in your room.";
    }
}

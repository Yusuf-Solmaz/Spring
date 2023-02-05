package com.example.tomcat10.XMLConfig.inversionOfControl;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 20 min on treadmill.";
    }
}

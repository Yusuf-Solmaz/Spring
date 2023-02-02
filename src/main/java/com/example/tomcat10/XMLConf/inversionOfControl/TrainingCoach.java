package com.example.tomcat10.XMLConf.inversionOfControl;

public class TrainingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 3 laps.";
    }
}

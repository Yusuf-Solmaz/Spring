package com.example.tomcat10.inversionOfControl;

public class TrainingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 3 laps.";
    }
}

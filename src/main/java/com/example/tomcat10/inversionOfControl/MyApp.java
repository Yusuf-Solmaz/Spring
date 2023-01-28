package com.example.tomcat10.inversionOfControl;

public class MyApp {



    public static void main(String[] args) {
        Coach baseBallCoach = new BaseballCoach();

        Coach traininCoach = new TrainingCoach();

        System.out.println(baseBallCoach.getDailyWorkout());

        System.out.println(traininCoach.getDailyWorkout());
    }

}

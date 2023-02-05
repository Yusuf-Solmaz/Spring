package com.example.tomcat10.XMLConfig.dependencyInjectionXmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportPropsApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        Volleyball volleyball = context.getBean("watchVolleyball",Volleyball.class);

        System.out.println(volleyball.watch());
        System.out.println(volleyball.getDailyWeather());
        System.out.println(volleyball.getTeamName());
        System.out.println(volleyball.getDate());

        context.close();
    }
}

package com.example.tomcat10.XMLConf.dependencyInjectionXmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        //WatchSports watchSports = context.getBean("watchBasketball",WatchSports.class);

        Basketball watchSports = context.getBean("watchBasketball",Basketball.class);

        System.out.println(watchSports.watch());

        System.out.println(watchSports.getDailyWeather());

        System.out.println(watchSports.getDate());

        System.out.println(watchSports.getTeamName());
        
        
        context.close();

    }
}

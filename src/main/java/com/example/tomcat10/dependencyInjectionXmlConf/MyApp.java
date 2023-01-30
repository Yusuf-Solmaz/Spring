package com.example.tomcat10.dependencyInjectionXmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContextNew.xml");

        WatchSports watchSports = context.getBean("watchSports",WatchSports.class);

        System.out.println(watchSports.watch()+"\t");
        System.out.println(watchSports.getDailyWeather());

        context.close();

    }


}

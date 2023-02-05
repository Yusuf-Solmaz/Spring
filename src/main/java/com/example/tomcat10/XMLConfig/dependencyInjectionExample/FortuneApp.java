package com.example.tomcat10.XMLConfig.dependencyInjectionExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FortuneApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        DoSomething myDay = context.getBean("myDay",DoSomething.class);

        System.out.println(myDay.doSomething());

        System.out.println(myDay.getDailyFortune());

        context.close();

    }

}

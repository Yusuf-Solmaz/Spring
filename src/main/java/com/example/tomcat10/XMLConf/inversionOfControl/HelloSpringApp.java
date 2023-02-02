package com.example.tomcat10.XMLConf.inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        //retrive bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //If we need another coach, just change class path in applicationContextNew.xml .

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}

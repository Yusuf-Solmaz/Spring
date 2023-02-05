package com.example.tomcat10.javaConfigg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaConfigApp {

    public static void main(String[] args) {


        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsContext.xml");

        DoSomething myDay = context.getBean("myDay",DoSomething.class);

        System.out.println(myDay.watch());

        System.out.println(myDay.getWeather());

        context.close();
    }


}

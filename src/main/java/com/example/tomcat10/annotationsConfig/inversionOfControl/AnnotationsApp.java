package com.example.tomcat10.annotationsConfig.inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsContext.xml");

        DoSomething doSomething = context.getBean("home",DoSomething.class);

        System.out.println(doSomething.eat());

        System.out.println(doSomething.watch());

        context.close();
    }
}

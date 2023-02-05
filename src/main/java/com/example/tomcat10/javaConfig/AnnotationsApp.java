package com.example.tomcat10.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsApp {



    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        DoSomething doSomething = context.getBean("home", DoSomething.class);

        System.out.println(doSomething.eat());

        System.out.println(doSomething.watch());

        context.close();
    }
}

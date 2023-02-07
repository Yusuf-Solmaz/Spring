package com.example.tomcat10.javaConfig.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleJavaConfigApp {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        DoSomething doSomething = context.getBean("doSomethingInPark",DoSomething.class);

        System.out.println(doSomething.read());

        System.out.println(doSomething.getFortune());

        context.close();
    }
}

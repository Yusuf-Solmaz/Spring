package com.example.tomcat10.XMLConfig.iocExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        Store store = context.getBean("myStore",Store.class);

        System.out.println(store.buy());

        context.close();

    }





}

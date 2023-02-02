package com.example.tomcat10.XMLConf.iocExample;

import com.example.tomcat10.XMLConf.iocExample.Store;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");

        Store store = context.getBean("myStore",Store.class);

        System.out.println(store.buy());

        context.close();

    }





}

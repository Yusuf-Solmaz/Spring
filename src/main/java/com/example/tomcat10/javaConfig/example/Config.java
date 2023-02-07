package com.example.tomcat10.javaConfig.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public FortuneService myFortune(){
        return new BadFortune();
    }

    @Bean
    public DoSomething doSomethingInPark(){
        return new Park(myFortune());
    }

}

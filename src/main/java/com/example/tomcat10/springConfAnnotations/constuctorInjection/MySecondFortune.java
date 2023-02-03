package com.example.tomcat10.springConfAnnotations.constuctorInjection;

import org.springframework.stereotype.Component;

@Component()
public class MySecondFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "This is a second fortune and you will be lucky today.";
    }
}

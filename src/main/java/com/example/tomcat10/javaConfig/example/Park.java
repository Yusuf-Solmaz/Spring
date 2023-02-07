package com.example.tomcat10.javaConfig.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Park implements DoSomething{

    FortuneService fortuneService;


    @Override
    public String read() {
        return "You are reading a novel.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

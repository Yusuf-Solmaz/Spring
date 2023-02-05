package com.example.tomcat10.XMLConfig.dependencyInjectionExample;

public class MyDay implements DoSomething{

    FortuneService fortuneService;

    public MyDay(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    @Override
    public String doSomething() {
        return "You will read a book.";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}

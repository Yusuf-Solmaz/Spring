package com.example.tomcat10.springConfAnnotations.constuctorInjection;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MyDay implements DoSomething {

    FortuneService fortuneService;

    // Constuctor Injection
    @Autowired
    public MyDay(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    /* Setter Injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
    //Method Injection
    /*@Autowired
    public void methodInj(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/

    @Override
    public String doSomething() {
        return "You will read a book.";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}

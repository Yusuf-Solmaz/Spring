package com.example.tomcat10.springConfAnnotations.constuctorInjection;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@NoArgsConstructor
@Scope("prototype") // Default scope is singleton
public class MyDay implements DoSomething {

    FortuneService fortuneService;

     /*
    //Field Injection
    @Autowired
    @Qualifier("mySecondFortune")
    FortuneService fortuneService;
    */

    // Constuctor Injection
    @Autowired
    public MyDay(@Qualifier("mySecondFortune") FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    /* Setter Injection
    @Autowired
    @Qualifier("mySecondFortune")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
    //Method Injection
    /*@Autowired
    public void methodInj(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/

    //init method
    @PostConstruct
    public void initMethod(){
        System.out.println("Init method worked.");
    }

    //For "prototype" scoped beans, Spring does not call the @PreDestroy method.
    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroy method worked.");
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

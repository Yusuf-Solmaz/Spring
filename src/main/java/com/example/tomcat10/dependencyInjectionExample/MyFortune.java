package com.example.tomcat10.dependencyInjectionExample;

public class MyFortune implements FortuneService{

    public String[] fortune={"You will be successful in your work.","You will be unusually successful in business.","You will enjoy good health."};

    public int randomVar= (int) (Math.random()*2)+1;

    public String getRandomFortune(){
        if (randomVar>=0 && randomVar<1){
            return fortune[0];
        }
        else if (randomVar>=1 && randomVar<2){
            return fortune[1];
        }
        else {
        return fortune[2];
    }
    }

    @Override
    public String getFortune() {
        return getRandomFortune();
    }
}

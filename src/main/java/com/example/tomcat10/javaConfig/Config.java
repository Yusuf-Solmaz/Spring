package com.example.tomcat10.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example.tomcat10.javaConfig")
@PropertySource("classpath:sportProps")
public class Config {

    @Bean
    public WeatherService weather(){
        return new Weather();
    }

    @Bean
    public DoSomething backyard() {
        return new Backyard(weather());
    }
}

package com.example.tomcat10.springConfAnnotations.inversionOfControl;

import com.example.tomcat10.springConfAnnotations.inversionOfControl.DoSomething;
import org.springframework.stereotype.Component;

@Component("doInSchool")
public class School implements DoSomething {

    @Override
    public String eat() {
        return "You have your lunch in the dining hall.";
    }

    @Override
    public String watch() {
        return "You are watching a documentary in history lesson.";
    }
}


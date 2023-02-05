package com.example.tomcat10.XMLConfig.iocExample;

public class PhonePart implements Store {

    @Override
    public String buy() {
        return "Bought a phone.";
    }
}

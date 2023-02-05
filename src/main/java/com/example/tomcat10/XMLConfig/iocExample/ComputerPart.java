package com.example.tomcat10.XMLConfig.iocExample;

public class ComputerPart implements Store {
    @Override
    public String buy() {
        return "Bought a computer.";
    }
}

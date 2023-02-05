package com.example.tomcat10.annotationsConfig.constuctorInjection;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component()
public class MySecondFortune implements FortuneService{

    private String textPath = "C:/Users/Yusuf/Desktop/Spring/src/main/resources/fortunes.txt";
    private List<String> fortune = new ArrayList<String>();
    private Random random = new Random();


    public MySecondFortune() {

    }

    @PostConstruct
    public void readTxt() throws IOException{
        File file = new File(textPath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            fortune.add(line);
        }
    }

    @Override
    public String getFortune() {

        int index = random.nextInt(fortune.size());
        String tempFortune = fortune.get(index);

        return tempFortune;
    }
}

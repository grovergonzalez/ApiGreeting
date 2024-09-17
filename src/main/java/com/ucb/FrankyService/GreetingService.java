package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greet}")
    private String greet;
    @Value("${greetWithName}")
    private String greetWithName;
    @Value("${greetInEnglish}")
    private String greetInEnglish;
    public String getGreeting(){
        return greet;
    }

    public String getGreetingWithName(String name) {
        return String.format(greetWithName, name);
    }
    public String getGreetingInEnglish(String lang){
        String greeting = " ";
        if(lang.equals("en"))
        {
            greeting = greetInEnglish;
        }
        return greeting;
    }
}

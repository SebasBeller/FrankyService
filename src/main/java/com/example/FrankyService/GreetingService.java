package com.example.FrankyService;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    String greet="Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.";

    public String getGreeting() {
        return greet;
    }

}

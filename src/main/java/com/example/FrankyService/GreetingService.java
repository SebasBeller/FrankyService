package com.example.FrankyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    ConfigurationParam configurationParam;

    public String getGreeting() {
        return configurationParam.getGreet();
    }

}

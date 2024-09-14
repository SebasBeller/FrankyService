package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/get")
    String getGreet(){
        return greetingService.getGreeting();
    }

}

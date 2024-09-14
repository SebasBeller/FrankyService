package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/get")
    public String getGreet() {
        return greetingService.getGreeting();
    }

    @PostMapping("/greeting-for-employee")
    public ResponseEntity<GreetingResponseDto> greetingForEmployee(
            @RequestBody  GreetingRequestDto greetingRequestDto
    ) {
        GreetingResponseDto reponse=new GreetingResponseDto(
                greetingService.getGreetingFor(
                        greetingRequestDto.name())
        );
        return ResponseEntity.ok(reponse);
    }
}

package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

        @Autowired
        ConverterService converterService;

        @GetMapping("/status")
        public String getStatus() {
                return "OK";
        }

        @PostMapping("/converter/celcius-to-fahrenheit")
        public ResponseEntity<ConverterResponseDto> celsiusToFahrenheit(
                        @RequestBody ConverterRequestDto converterRequestDto) {
                ConverterResponseDto response = new ConverterResponseDto(
                                converterService.celciusToFahrenheit(
                                                converterRequestDto.value()),
                                "Fahrenheit");
                return ResponseEntity.ok(response);

        }

        @PostMapping("/convert/bolivian-to-dollar")
        public ResponseEntity<ConverterResponseDto> bolivianToDollar(
                        @RequestBody ConverterRequestDto converterRequestDto) {
                ConverterResponseDto response = new ConverterResponseDto(
                                converterService.bolivianToDollar(
                                                converterRequestDto.value()),
                                "Dollars");
                return ResponseEntity.ok(response);

        }
}
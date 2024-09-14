package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    @Autowired
    ConfigurationParam configurationParam;

    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double bolivianToDollar(double bolivian) {
        return bolivian / configurationParam.getOfficialDollar();
    }
}
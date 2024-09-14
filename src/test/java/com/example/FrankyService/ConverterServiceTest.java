package com.example.FrankyService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {

    @Mock
    ConfigurationParam configParam;

    @InjectMocks
    ConverterService converterService;

    @Test
    @DisplayName("Method to convert Celcius to farenheit") // para especificar el tes
    void celciusToFahrenheit() {
        assertEquals(212, converterService.celciusToFahrenheit(100));
    }

    @Test
    @DisplayName("Method to Convert Fahrenheit to Celcius")
    void fahrenheitToCelcius() {
        assertEquals(100, converterService.fahrenheitToCelcius(212));
    }

    @Test
    void bolivianToDollar() {
        when(configParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(100, converterService.bolivianToDollar(696));

    }
}
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
class GreetingServiceTest {

    @Mock
    ConfigurationParam configurationParam;

    @InjectMocks
    GreetingService greetingService;

    @Test
    @DisplayName("Method to show the greeting message")
    void getGreeting() {
        when(configurationParam.getGreet()).thenReturn("Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.");
        assertEquals(
                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana."
                , greetingService.getGreeting());
    }
}
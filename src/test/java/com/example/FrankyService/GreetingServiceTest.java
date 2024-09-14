package com.example.FrankyService;

import com.deepl.api.DeepLException;
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
                when(configurationParam.getGreet()).thenReturn(
                                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.");
                assertEquals(
                                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.",
                                greetingService.getGreeting());
        }

        @Test
        void getGreetingFor() {
                when(configurationParam.getGreet()).thenReturn(
                                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.");
                assertEquals(
                                "Sebastian. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.",
                                greetingService.getGreetingFor("Sebastian"));
        }

        @Test
        void getGreetingToPersonInAnyLanguage() throws DeepLException, InterruptedException {
                when(configurationParam.getGreet())
                                .thenReturn(
                                                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.");
                when(configurationParam.getAuthKey())
                                .thenReturn(
                                                "70b0f821-14f2-46f9-9c44-a15a620c2085:fx");
                assertEquals(
                                "Sébastien. Demandez-vous si ce que vous faites aujourd'hui vous rapproche de l'endroit où vous voulez être demain.",
                                greetingService.getGreetingToPersonInAnyLanguage("Sebastian", "fr"));
        }
}
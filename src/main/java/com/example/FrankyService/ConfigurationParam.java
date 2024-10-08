package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationParam {

    @Value("${dollarOfficial}") // importamos una var de entorno
    double officialDollar;

    public double getOfficialDollar() {
        return officialDollar;
    }

    @Value("${greet}")
    String greet;

    public String getGreet() {
        return greet;
    }

    @Value("${authKey}")
    String authKey;

    public String getAuthKey() {
        return authKey;
    }

}

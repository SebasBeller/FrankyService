package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ConfigurationParam {
    @Value("${dollarOfficial}")// importamos una var de entorno
    double officialDollar;
    public double getOfficialDollar() {
        return officialDollar;
    }

}

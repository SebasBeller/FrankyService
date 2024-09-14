package  com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class ConverterService {
    @Autowired
    ConfigurationParam configurationParam;




//    Si lo hacemos asi se generara una dependencia que entre converter service con el yml por eso esta mal
//    @Value("${dollarOfficial}")// importamos una var de entorno
//    double officialDollar;

    public double celciusToFahrenheit(double celcius) {
//        System.out.println(officialDollar);
        return (celcius * 9 / 5 )+ 32;
    }
    public double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit-32) * 5 / 9;
    }
    public double bolivianToDollar(double bolivian) {
        return bolivian /configurationParam.getOfficialDollar();
    }
}
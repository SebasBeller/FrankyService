package com.example.FrankyService;
import com.deepl.api.DeepLException;
import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    ConfigurationParam configurationParam;

    private String translate(String text,String languageToTranslate) throws DeepLException, InterruptedException {
        String authKey = "70b0f821-14f2-46f9-9c44-a15a620c2085:fx";
        Translator translator = new Translator(authKey);
        TextResult result =
                translator.translateText(text, null, languageToTranslate);
        return result.getText();

    }
    public String getGreeting() {
        return configurationParam.getGreet();
    }
    public String getGreetingFor(String name) {
        return name+". "+getGreeting();
    }
    public String getGreetingToPersonInAnyLanguage(String name,String languageToTranslate)
            throws DeepLException, InterruptedException{
        String text=getGreetingFor(name);
        return translate(text,languageToTranslate);
    }

}

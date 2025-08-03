package factory;

import java.util.HashMap;
import java.util.Map;

public class SpanishLocalizer implements Localizer {
    @Override
    public String localize(String message) {
        Map<String, String> translations = new HashMap<>();
        translations.put("pizza", "pizza");
        translations.put("rice", "el arroz");
        return translations.getOrDefault(message, message);
    }
}

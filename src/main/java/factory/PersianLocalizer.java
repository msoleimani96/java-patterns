package factory;

import java.util.HashMap;
import java.util.Map;

public class PersianLocalizer implements Localizer {
    @Override
    public String localize(String message) {
        Map<String, String> translations = new HashMap<>();
        translations.put("pizza", "پیتزا");
        translations.put("rice", "برنج");
        return translations.getOrDefault(message, message);
    }
}

package factory;

import java.util.Map;

public class PersianLocalizer implements Localizer {
    private static final Map<String, String> TRANSLATIONS = Map.of(
            "pizza", "پیتزا",
            "rice", "برنج"
    );

    @Override
    public String localize(String message) {
        return TRANSLATIONS.getOrDefault(message, message);
    }
}

package creational.factory;

import java.util.Map;

public class SpanishLocalizer implements Localizer {
    private static final Map<String, String> TRANSLATIONS = Map.of(
            "pizza", "pizza",
            "rice", "el arroz"
    );

    @Override
    public String localize(String message) {
        return TRANSLATIONS.getOrDefault(message, message);
    }
}

package factory;

import lombok.SneakyThrows;

public class LocalizerFactory {
    @SneakyThrows
    public static Localizer create(String language) {
        return switch (language) {
            case "es" -> new SpanishLocalizer();
            case "fa" -> new PersianLocalizer();
            default -> throw new Exception("Unsupported language.");
        };
    }
}

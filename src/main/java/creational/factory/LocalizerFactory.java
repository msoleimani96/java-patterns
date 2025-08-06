package creational.factory;

import lombok.SneakyThrows;

public abstract class LocalizerFactory {
    public abstract Localizer createLocalizer();

    @SneakyThrows
    public static LocalizerFactory getFactory(String language) {
        return switch (language) {
            case "es" -> new SpanishLocalizerFactory();
            case "fa" -> new PersianLocalizerFactory();
            default -> throw new Exception("Unsupported language.");
        };
    }
}

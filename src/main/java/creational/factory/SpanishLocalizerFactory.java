package creational.factory;

public class SpanishLocalizerFactory extends LocalizerFactory {
    @Override
    public Localizer createLocalizer() {
        return new SpanishLocalizer();
    }
}

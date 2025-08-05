package creational.factory;

public class PersianLocalizerFactory extends LocalizerFactory {
    @Override
    public Localizer createLocalizer() {
        return new PersianLocalizer();
    }
}

package creational.factory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text you want to translate: ");
        String text = scanner.nextLine();

        System.out.println("Enter your desired language: ");
        String language = scanner.nextLine();

        scanner.close();

        try {
            Localizer localizer = LocalizerFactory.getFactory(language).createLocalizer();
            String translatedText = localizer.localize(text);
            System.out.println(translatedText);
        } catch (Exception exception) {
            System.out.println("Error! Message: " + exception.getMessage());
        }
    }
}

package creational.builder;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Where are you from? (Imagine you are a request that comes to back-end house for a party;)");
        Scanner scanner = new Scanner(System.in);
        RequestOriginTypesEnum originType = RequestOriginTypesEnum.of(scanner.nextLine());
        scanner.close();

        SMSProviderDirector director = new SMSProviderDirector(new DefaultSMSProviderBuilder());

        SMSProvider smsProvider = director.build(originType);

        System.out.println(smsProvider);
    }
}

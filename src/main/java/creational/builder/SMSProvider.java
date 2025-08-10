package creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SMSProvider {
    private String url;
    private String token;
    private Integer retryAttempts;

    @Override
    public String toString() {
        return "SMSProvider = {\nURL: " + url + "\n" + "Retry attempts: " + retryAttempts + "\n}";
    }
}

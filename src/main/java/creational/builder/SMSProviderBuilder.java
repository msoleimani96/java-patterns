package creational.builder;

public interface SMSProviderBuilder {

    SMSProviderBuilder setUrl(String url);

    SMSProviderBuilder setToken(String token);

    SMSProviderBuilder setRetryAttempts(Integer retryAttempts);

    SMSProvider build();

}
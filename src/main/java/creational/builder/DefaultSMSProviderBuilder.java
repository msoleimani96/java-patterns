package creational.builder;

public class DefaultSMSProviderBuilder implements SMSProviderBuilder {
    private SMSProvider smsProvider;

    public DefaultSMSProviderBuilder() {
        this.smsProvider = new SMSProvider();
    }

    @Override
    public SMSProviderBuilder setUrl(String url) {
        smsProvider.setUrl(url);
        return this;
    }

    @Override
    public SMSProviderBuilder setToken(String token) {
        smsProvider.setToken(token);
        return this;
    }

    @Override
    public SMSProviderBuilder setRetryAttempts(Integer retryAttempts) {
        smsProvider.setRetryAttempts(retryAttempts);
        return this;
    }

    @Override
    public SMSProvider build() {
        SMSProvider built = this.smsProvider;
        this.smsProvider = new SMSProvider();
        return built;
    }
}

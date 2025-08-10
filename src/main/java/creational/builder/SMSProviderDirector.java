package creational.builder;

import static creational.builder.Constants.COMPANY_API_BASE_URL;
import static creational.builder.Constants.DEFAULT_RETRY_ATTEMPTS;

public class SMSProviderDirector {
    private SMSProviderBuilder builder;

    public SMSProviderDirector(SMSProviderBuilder builder) {
        this.builder = builder;
    }

    public SMSProvider build(RequestOriginTypesEnum originType) {
        return switch (originType) {
            case CLIENT -> clientBuild();
            case BACKOFFICE -> backOfficeBuild();
            case INTERNAL -> internalBuild();
        };
    }

    private SMSProvider internalBuild() {
        return builder
                .setUrl(COMPANY_API_BASE_URL + "/internal/v1/transport/sms")
                .setToken("INTERNAL_TOKEN")
                .setRetryAttempts(DEFAULT_RETRY_ATTEMPTS)
                .build();
    }

    private SMSProvider backOfficeBuild() {
        return builder
                .setUrl(COMPANY_API_BASE_URL + "/backoffice/v1/transport/sms")
                .setToken("BACKOFFICE_TOKEN")
                .setRetryAttempts(DEFAULT_RETRY_ATTEMPTS)
                .build();
    }

    private SMSProvider clientBuild() {
        return builder
                .setUrl(COMPANY_API_BASE_URL + "/v1/transport/sms")
                .setToken("CLIENT_TOKEN")
                .setRetryAttempts(5)
                .build();
    }
}
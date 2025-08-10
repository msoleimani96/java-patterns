package creational.builder;

public enum RequestOriginTypesEnum {
    CLIENT,
    BACKOFFICE,
    INTERNAL;

    public static RequestOriginTypesEnum of(String text) {
        for (RequestOriginTypesEnum origin : values()) {
            if (origin.name().equalsIgnoreCase(text))
                return origin;
        }

        throw new IllegalArgumentException("Origin type not found. (ALIEN)");
    }
}

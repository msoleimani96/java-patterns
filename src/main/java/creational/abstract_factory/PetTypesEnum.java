package creational.abstract_factory;

public enum PetTypesEnum {
    DOG,
    CAT;
    
    public static PetTypesEnum of(String type) throws Exception {
       for (PetTypesEnum value : values()) {
            if (value.toString().equalsIgnoreCase(type))
                return value;
       }

       throw new Exception("Pet type not found.");
    }
}

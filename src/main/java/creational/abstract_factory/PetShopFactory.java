package creational.abstract_factory;

import creational.abstract_factory.cat.CatShopFactory;
import creational.abstract_factory.dog.DogShopFactory;

public abstract class PetShopFactory {
    public abstract Pet createPet();

    public abstract Food createFood();

    public abstract Toy createToy();

    public static PetShopFactory getFactory(PetTypesEnum type) {
        switch (type) {
            case CAT:
                return new CatShopFactory();
            case DOG:
                return new DogShopFactory();
            default:
                throw new IllegalArgumentException("Unknown pet type: " + type);
        }
    }
}

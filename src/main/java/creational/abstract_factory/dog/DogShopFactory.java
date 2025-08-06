package creational.abstract_factory.dog;

import creational.abstract_factory.Food;
import creational.abstract_factory.Pet;
import creational.abstract_factory.PetShopFactory;
import creational.abstract_factory.Toy;

public class DogShopFactory extends PetShopFactory {

    @Override
    public Pet createPet() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new DogFood();
    }

    @Override
    public Toy createToy() {
        return new DogToy();
    }
    
}

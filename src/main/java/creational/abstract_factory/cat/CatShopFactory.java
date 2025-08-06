package creational.abstract_factory.cat;

import creational.abstract_factory.Food;
import creational.abstract_factory.Pet;
import creational.abstract_factory.PetShopFactory;
import creational.abstract_factory.Toy;

public class CatShopFactory extends PetShopFactory {

    @Override
    public Pet createPet() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new CatFood();
    }

    @Override
    public Toy createToy() {
        return new CatToy();
    }

}

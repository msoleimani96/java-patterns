package creational.abstract_factory.dog;

import creational.abstract_factory.Food;

public class DogFood implements Food {
    @Override
    public String getName() {
        return "Dog food";
    }

}

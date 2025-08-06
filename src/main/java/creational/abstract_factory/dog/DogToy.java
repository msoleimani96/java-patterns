package creational.abstract_factory.dog;

import creational.abstract_factory.Toy;

public class DogToy implements Toy {
    @Override
    public String getName() {
        return "Dog toy";
    }
}

package creational.abstract_factory.cat;

import creational.abstract_factory.Food;

public class CatFood implements Food {
    @Override
    public String getName() {
        return "Cat Food";
    }

}

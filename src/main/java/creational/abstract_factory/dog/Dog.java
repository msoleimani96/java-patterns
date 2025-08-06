package creational.abstract_factory.dog;

import creational.abstract_factory.Food;
import creational.abstract_factory.Pet;
import creational.abstract_factory.Toy;

public class Dog implements Pet {
    @Override
    public String speak() {
        return "Haap!";
    }

    @Override
    public String eat(Food food) {
        return "Dog is eating " + food.getName() + ". " + speak();
    }

    @Override
    public String play(Toy toy) {
        return "Dog is playing with " + toy.getName() + ". " + speak();
    }
    
}

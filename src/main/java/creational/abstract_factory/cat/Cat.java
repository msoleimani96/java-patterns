package creational.abstract_factory.cat;

import creational.abstract_factory.Food;
import creational.abstract_factory.Pet;
import creational.abstract_factory.Toy;

public class Cat implements Pet {

    @Override
    public String speak() {
        return "meow!";
    }

    @Override
    public String eat(Food food) {
        return "Cat is eating " + food.getName() + ". " + speak();
    }

    @Override
    public String play(Toy toy) {
        return "Cat is playing with " + toy.getName() + ". " + speak();
    }

}

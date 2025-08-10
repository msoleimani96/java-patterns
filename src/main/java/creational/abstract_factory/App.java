package creational.abstract_factory;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        scanner.close();
        PetTypesEnum petType = PetTypesEnum.of(type);

        PetShopFactory petShopFactory = PetShopFactory.getFactory(petType);
        Pet pet = petShopFactory.createPet();
        Food food = petShopFactory.createFood();
        Toy toy = petShopFactory.createToy();

        System.out.println(pet.speak());
        System.out.println(pet.eat(food));
        System.out.println(pet.play(toy));
    }
}

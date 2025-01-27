package AnimalGeneric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        animal.add(new Animal(10));
        animal.add(new Animal(120));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(animal);
        test(dogs);
    }

    private static void test(List<? extends Animal> list){ //generiки
        for (Animal animal : list){
            System.out.println(animal);
        }
    }
}

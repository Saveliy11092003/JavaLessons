package Wildcards;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());
        animalList.add(new Animal());
        test(animalList);
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        test(dogList);
    }

    public static void test(List<? extends Animal> list){
        for(Animal animal : list){
            animal.eat();
        }
    }
}

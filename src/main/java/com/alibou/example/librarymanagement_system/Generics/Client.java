package com.alibou.example.librarymanagement_system.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PairOld pair = new PairOld();
        pair.setFirst("Mani");
        pair.setSecond("Indu");
        pair.setSecond(65494);
      //  System.out.println(pair.getSecond());

        Pair<String ,String> newPair = new Pair<String, String>();
        newPair.setFirst("Mani");
        newPair.setSecond("Indu");
      //  newPair.setSecond(5);
     //   System.out.println(newPair.getSecond());

        Pair<Double,Integer> pair3 = new Pair<Double,Integer>();
        pair3.setFirst(1.0);
        pair3.setSecond(2);
      //  System.out.println(pair3.getFirst() + pair3.getSecond());
        String temp = pair3.doSomething("Mani");
        System.out.println(temp);


        Animal animal = new Animal();
        animal.setName("Something Animal");
        Animal animal2 = new Animal();
        animal2.setName("Something Animal 2");

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        dog.setName("Dog");
        dog.setName("Dog2");

        Cat cat = new Cat();
        cat.setName("Cat");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        animals.add(dog);
        animals.add(cat);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog2);

     //   AnimalUtil.printAnimalNames(animals);
        AnimalUtil.printAnimalNamesGeneral(dogs);
    }
}

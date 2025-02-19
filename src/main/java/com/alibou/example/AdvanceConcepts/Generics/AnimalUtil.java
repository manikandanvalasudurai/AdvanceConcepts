package com.alibou.example.AdvanceConcepts.Generics;

import java.util.List;

public class AnimalUtil {
    public static void printAnimalNames(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
    public static <T extends Animal>void printAnimalNamesGeneral(List<T> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
    // ? --> anything with extends animal
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}

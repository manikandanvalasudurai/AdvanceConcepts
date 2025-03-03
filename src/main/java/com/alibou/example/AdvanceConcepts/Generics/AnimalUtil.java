package com.alibou.example.AdvanceConcepts.Generics;

import java.util.List;

public class AnimalUtil {
    //printing list of ANIMALS
    public static void printAnimalNames(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
    //PRINTING LIST OF CLASSES WHICH EXTENDS ANIMAL
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

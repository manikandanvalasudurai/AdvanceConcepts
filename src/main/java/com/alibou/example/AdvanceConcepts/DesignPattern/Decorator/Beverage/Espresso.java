package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage;

public class Espresso extends Beverage{
    @Override
    public int getCost() {
        return 2550;
    }

    @Override
    public void getDescription() {
        System.out.println("Espresso");
    }
}

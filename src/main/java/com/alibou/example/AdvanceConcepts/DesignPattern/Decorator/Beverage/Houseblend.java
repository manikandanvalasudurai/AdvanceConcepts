package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage;

public class Houseblend extends Beverage{
    @Override
    public int getCost() {
        return 8481;
    }

    @Override
    public void getDescription() {
        System.out.println("Houseblend");
    }
}

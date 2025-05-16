package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage.Beverage;

public class Mocha extends AddOn {
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 100 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Mocha as a Add on");
    }
}

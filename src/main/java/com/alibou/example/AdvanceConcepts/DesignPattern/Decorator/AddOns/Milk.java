package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage.Beverage;

public class Milk extends AddOn {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 25 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added milk as Add on top That " );
    }
}

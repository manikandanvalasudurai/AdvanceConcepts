package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage.Beverage;

public class Whip extends AddOn {
    private Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 25 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Whip added as a Addon");
    }
}

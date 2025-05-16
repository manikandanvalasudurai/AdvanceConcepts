package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage;

public class DarkRoast extends Beverage{
    @Override
    public int getCost() {
        return 2552;
    }

    @Override
    public void getDescription() {
        System.out.println("DarkRoast");
    }
}

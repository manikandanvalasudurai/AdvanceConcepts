package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Scoops;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.IceCream;

public class Pistascoop implements IceCream {
    //Always Add-Ons
    private IceCream iceCream;
    public Pistascoop() {}
    public Pistascoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream == null){
            throw new NullPointerException("Pistascoop doesn't have iceCream");
        }
        return iceCream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Pistascoop ";
    }
}

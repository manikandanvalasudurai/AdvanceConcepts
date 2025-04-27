package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Scoops;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.IceCream;

public class Vanillascoop implements IceCream {
    private IceCream iceCream;
    Vanillascoop() {
    }
    public Vanillascoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    //Always Add-Ons
    @Override
    public int getCost() {
        if(iceCream == null){
            throw new NullPointerException("IceCream is null");
        }
        return iceCream.getCost() + 45;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Vanillascoop ";
    }
}

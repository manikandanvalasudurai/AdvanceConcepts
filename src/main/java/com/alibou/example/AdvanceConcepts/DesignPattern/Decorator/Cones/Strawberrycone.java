package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Cones;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.IceCream;

public class Strawberrycone implements IceCream {

    private  IceCream iceCream;

    public Strawberrycone(){ }

    public Strawberrycone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    //BASE + Add-On
    @Override
    public int getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 45;
        }
        return 45;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Strawberrycone on Top of ";
    }
}

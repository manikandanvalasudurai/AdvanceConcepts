package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Cones;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.IceCream;

public class Chococone implements IceCream {

    //BASE + Add-On
    private IceCream iceCream;

    public Chococone() {}

    public Chococone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null) {
            int i = iceCream.getCost() + 30;
            return i;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chococone on Top of ";
    }
}


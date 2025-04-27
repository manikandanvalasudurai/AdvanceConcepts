package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Cones;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.IceCream;

public class Orangecone implements IceCream {
    //BASE
    @Override
    public int getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Orangecone on Top of ";
    }
}

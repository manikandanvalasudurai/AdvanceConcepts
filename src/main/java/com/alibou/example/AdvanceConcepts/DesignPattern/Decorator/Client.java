package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Cones.Orangecone;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Cones.Strawberrycone;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Scoops.Pistascoop;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Scoops.Vanillascoop;

public class Client {
    public static void main(String[] args) {
        IceCream desert =  new Vanillascoop( new Pistascoop( new Strawberrycone(
                                        new Orangecone()
        )));

        System.out.println(desert.getCost());
        System.out.println(desert.getDescription());
    }
}

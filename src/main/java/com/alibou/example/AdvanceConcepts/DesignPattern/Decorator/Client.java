package com.alibou.example.AdvanceConcepts.DesignPattern.Decorator;

import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns.Milk;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns.Mocha;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.AddOns.Whip;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage.Beverage;
import com.alibou.example.AdvanceConcepts.DesignPattern.Decorator.Beverage.Houseblend;
import com.sun.source.tree.WhileLoopTree;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Houseblend();
        System.out.println(beverage.getCost());
        beverage.getDescription();
        //houseblend with Whip as a Add on
        beverage = new Whip(beverage);
        System.out.println(beverage.getCost());
        beverage.getDescription();
        //Double Mocha Houseblend with Whip and Milk
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getCost());
        beverage.getDescription();
    }
}

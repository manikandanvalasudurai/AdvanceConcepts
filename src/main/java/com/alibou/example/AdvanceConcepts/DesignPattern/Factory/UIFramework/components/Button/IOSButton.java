package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked IOS button");
    }
}

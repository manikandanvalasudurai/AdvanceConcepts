package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button;

public class IOSButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("IOS Button");
    }
}

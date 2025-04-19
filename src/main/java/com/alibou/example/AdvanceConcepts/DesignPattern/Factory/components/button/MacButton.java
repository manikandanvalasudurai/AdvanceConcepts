package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button;

public class MacButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("MAC Button");
    }
}

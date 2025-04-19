package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button;

public class WindowsButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Windows Button");
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button;

public class AndroidButton implements Button {

    @Override
    public void displayButton() {
        System.out.println("AndroidButton");
    }
}

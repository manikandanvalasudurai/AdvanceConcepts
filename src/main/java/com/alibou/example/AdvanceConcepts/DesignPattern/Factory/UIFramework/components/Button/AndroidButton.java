package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("AndroidButton clicked");
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu;

public class IOSMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("IOS Menu");
    }
}

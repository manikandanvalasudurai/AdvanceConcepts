package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu;

public class WindowsMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("Windows Menu");
    }
}

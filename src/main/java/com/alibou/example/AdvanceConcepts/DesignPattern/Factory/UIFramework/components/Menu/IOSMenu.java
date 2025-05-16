package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu;

public class IOSMenu implements Menu {
    @Override
    public void showOptions() {
        System.out.println("IOS Menu");
    }
}

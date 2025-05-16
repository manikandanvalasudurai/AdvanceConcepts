package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

public class Android extends Platform{
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}

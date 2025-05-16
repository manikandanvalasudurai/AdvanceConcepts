package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

public class IOS extends Platform {
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform) {
        if(platform.equals(platform.WINDOWS)){
            return new WindowsUIFactory();
        }
        else if(platform.equals(platform.IOS)){
            return new IOSUIFactory();
        }
        else if(platform.equals(platform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(platform.MAC)){
            return new MACUIFactory();
        }
        return null;
    }
}

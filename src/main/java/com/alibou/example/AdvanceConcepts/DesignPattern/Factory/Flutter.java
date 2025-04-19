package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

public class Flutter {
    //Non Factory Methods
    void refreshUI(){
        System.out.println("Refreshing UI");
    }
    void setTheme(){
        System.out.println("Setting theme from Flutter");
    }

    public UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }
}

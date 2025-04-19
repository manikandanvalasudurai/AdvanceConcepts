package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID);
        Button button = uiFactory.createButton();
        button.displayButton();
        Menu menu = uiFactory.createMenu();
        menu.displayMenu();
    }
}

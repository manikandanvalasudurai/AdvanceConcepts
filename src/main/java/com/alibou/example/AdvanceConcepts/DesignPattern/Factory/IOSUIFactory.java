package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.IOSButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.IOSMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}

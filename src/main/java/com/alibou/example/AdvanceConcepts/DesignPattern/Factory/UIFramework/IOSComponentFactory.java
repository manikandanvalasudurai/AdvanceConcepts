package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.IOSButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.IOSMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
       return new IOSMenu();
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.AndroidButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.AndroidMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return  new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.AndroidButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.AndroidMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu()    ;
    }
}

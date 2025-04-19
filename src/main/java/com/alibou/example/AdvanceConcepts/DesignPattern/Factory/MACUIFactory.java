package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.MacButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.MACMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;

public class MACUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MACMenu();
    }
}

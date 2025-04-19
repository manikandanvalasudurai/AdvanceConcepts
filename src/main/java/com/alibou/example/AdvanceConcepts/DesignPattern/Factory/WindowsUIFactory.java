package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.WindowsButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.AndroidMenu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

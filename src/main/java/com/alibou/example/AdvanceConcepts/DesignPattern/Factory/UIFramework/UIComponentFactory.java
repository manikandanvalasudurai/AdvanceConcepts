package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.Menu;


public interface UIComponentFactory {
    Button createButton();
    Menu createMenu();
}

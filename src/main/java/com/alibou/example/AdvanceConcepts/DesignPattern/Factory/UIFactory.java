package com.alibou.example.AdvanceConcepts.DesignPattern.Factory;


import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods
    Button createButton();  //return object of Respective button
    Menu createMenu(); //return object of Respective Menu
}

package com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework;

import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.AndroidButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.Button;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Button.IOSButton;
import com.alibou.example.AdvanceConcepts.DesignPattern.Factory.UIFramework.components.Menu.Menu;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       String platformName = scanner.nextLine();
       //simple factory to create platform object based on user input
       Platform platform = PlatformFactory.getPlatformByName(platformName);
        //factorymethod to create UI ComponenetFactory object based on Platform Object
        UIComponentFactory uiComponentFactory = platform.createUIComponentFactory();
        //Abstract factory to create multiple component objects
        Menu menu =  uiComponentFactory.createMenu();
        Button button = uiComponentFactory.createButton();
        menu.showOptions();
        button.click();
    }
}

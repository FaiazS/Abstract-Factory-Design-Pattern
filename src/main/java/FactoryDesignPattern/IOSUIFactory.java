package FactoryDesignPattern;

import FactoryDesignPattern.Button.Button;

import FactoryDesignPattern.Button.IOSButton;

import FactoryDesignPattern.Dropdown.Dropdown;

import FactoryDesignPattern.Dropdown.IOSDropdown;

import FactoryDesignPattern.Menu.IOSMenu;

import FactoryDesignPattern.Menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public IOSButton buildButton(){

        return new IOSButton();


    }

    @Override
    public IOSDropdown buildDropdown(){

        return new IOSDropdown();


    }

    @Override
    public IOSMenu buildMenu(){

        return new IOSMenu();

    }
}

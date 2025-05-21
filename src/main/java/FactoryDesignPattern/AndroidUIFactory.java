package FactoryDesignPattern;

import FactoryDesignPattern.Button.AndroidButton;

import FactoryDesignPattern.Button.Button;

import FactoryDesignPattern.Dropdown.AndroidDropdown;

import FactoryDesignPattern.Dropdown.Dropdown;

import FactoryDesignPattern.Menu.AndroidMenu;

import FactoryDesignPattern.Menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public AndroidButton buildButton(){

        return new AndroidButton();


    }

    @Override
    public AndroidDropdown buildDropdown(){

        return new AndroidDropdown();


    }


    @Override
    public AndroidMenu buildMenu(){

        return new AndroidMenu();

    }
}

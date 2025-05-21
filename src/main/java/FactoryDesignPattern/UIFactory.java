package FactoryDesignPattern;

import FactoryDesignPattern.Button.Button;

import FactoryDesignPattern.Dropdown.Dropdown;

import FactoryDesignPattern.Menu.Menu;

public interface UIFactory {

    Button buildButton();

    Menu buildMenu();

    Dropdown buildDropdown();

}

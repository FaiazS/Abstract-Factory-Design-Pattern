package FactoryDesignPattern;

import FactoryDesignPattern.Button.Button;

import FactoryDesignPattern.Dropdown.Dropdown;

import FactoryDesignPattern.Menu.Menu;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter(PlatformsSupported.ANDROID);

        UIFactory uiFactory = flutter.buildUIFactory();

        Button button = uiFactory.buildButton();

        button.modifyButtonSize();

        Dropdown dropdown = uiFactory.buildDropdown();

        Menu menu = uiFactory.buildMenu();

    }
}

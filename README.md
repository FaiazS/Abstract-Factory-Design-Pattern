# Abstract-Factory-Design-Pattern
---
# Overview
---
This project demonstrates the Abstract Factory Design Pattern using a simplified example of building platform-specific UI components. The goal is to encapsulate the creation of related objects (Button, Dropdown, Menu) without specifying their concrete classes. This allows you to easily add support for new platforms without changing the client code.
---
# Features

-Implements Abstract Factory Pattern in Java.

-Supports Android and iOS platforms with platform-specific UI components.

-Provides interfaces for UI components (Button, Dropdown, Menu) and factories (UIFactory).

-Factory classes produce platform-specific UI elements.

-Client code uses factories abstractly without knowing the underlying platform.

---

# Project Structure

FactoryDesignPattern/
├── Button/
│   ├── Button.java          # Button interface
│   ├── AndroidButton.java   # Android Button implementation
│   └── IOSButton.java       # iOS Button implementation
├── Dropdown/
│   ├── Dropdown.java        # Dropdown interface
│   ├── AndroidDropdown.java # Android Dropdown implementation
│   └── IOSDropdown.java     # iOS Dropdown implementation
├── Menu/
│   ├── Menu.java            # Menu interface
│   ├── AndroidMenu.java     # Android Menu implementation
│   └── IOSMenu.java         # iOS Menu implementation
├── Client.java              # Main client demonstrating usage
├── Flutter.java             # Platform handler class
├── PlatformsSupported.java  # Enum for supported platforms (ANDROID, IOS)
├── UIFactory.java           # Abstract factory interface
├── AndroidUIFactory.java    # Android-specific factory
├── IOSUIFactory.java        # iOS-specific factory
└── UIFactoryFactory.java    # Factory producer that returns platform-specific factories

---

# How It Works

1. Client creates a Flutter instance specifying the target platform (e.g., ANDROID or IOS).

2. Flutter calls UIFactoryFactory to get a platform-specific UIFactory.

3. Using the UIFactory, the client builds UI components like Button, Dropdown, and Menu.

4. Each UI component behaves according to its platform-specific implementation.

5. Adding support for new platforms requires implementing new factories and components without changing the client.

---

# Design Pattern Concepts

Abstract Factory: 

Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Factory Method: 

Used internally by the abstract factory to instantiate concrete products.

Product Interfaces: 

Button, Dropdown, and Menu define interfaces for product families.

Concrete Products: 

Platform-specific classes implement these interfaces.

Client: 

Uses these abstract factory interfaces without depending on concrete implementations.

---

# Extendability

Further Enhancements can be made such as:

1. Adding support for a new platform (e.g., Web):

2. Defining new UI component classes (WebButton, WebDropdown, WebMenu) implementing the existing interfaces.

3. Defining a new factory class (WebUIFactory) implementing UIFactory.

4. Updating UIFactoryFactory to return WebUIFactory when the new platform is requested.

No changes needed in the client code.

---

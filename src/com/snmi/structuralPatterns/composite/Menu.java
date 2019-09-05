package com.snmi.structuralPatterns.composite;

import java.util.Iterator;

/**
 * Menu object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Menu extends MenuComponent{

    /**
     * Custom constructor
     * @param name take the name
     * @param url take the url
     */
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * Add and remove methods
     */
    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    /**
     * Implementation of to string method
     * @return the menu as string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }

}

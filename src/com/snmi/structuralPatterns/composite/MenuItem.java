package com.snmi.structuralPatterns.composite;

/**
 * Menu item
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class MenuItem extends MenuComponent {

    /**
     * Custom constructor
     * @param name take the name
     * @param url take the url
     */
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * Implement to string method
     * @return the result of parent print method
     */
    @Override
    public String toString() {
        return print(this);
    }
}

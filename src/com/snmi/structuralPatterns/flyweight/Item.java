package com.snmi.structuralPatterns.flyweight;

/**
 * This object will be flyweight
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Item {

    /**
     * Immutable variable
     */
    private final String name;

    /**
     * Custom constructor
     * @param name take the item's name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Get the item's name
     * @return the item's name
     */
    public String toString() {
        return name;
    }

}

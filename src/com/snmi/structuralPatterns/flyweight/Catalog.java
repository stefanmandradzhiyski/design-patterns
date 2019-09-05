package com.snmi.structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Catalog as Factory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Catalog {

    /**
     * Map variable
     */
    private Map<String, Item> items = new HashMap<>();

    /**
     * Factory method to create an item
     * @param itemName take the item name
     * @return the existing item in the map
     */
    public Item lookUp(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }

        return items.get(itemName);
    }

    /**
     * Print the map size
     * @return the map size
     */
    public int totalItemsMade() {
        return items.size();
    }
}

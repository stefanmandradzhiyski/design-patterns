package com.snmi.structuralPatterns.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The client in this case
 * @author Stefan Mandradzhiysi
 * @version 1.0
 */
public class InventorySystem {

    private static final String TOTAL = "\nTotal Item objects made: %d";

    /**
     * Immutable variables
     */
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    /**
     * Take a specific order and add it to the list
     * @param itemName take the item name
     * @param orderNumber take the order number
     */
    public void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    /**
     * Iterate through the orders, print and remove it from the list
     */
    public void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    /**
     * Show the total size of catalog
     * @return the total size
     */
    public String report() {
        return  String.format(TOTAL, catalog.totalItemsMade());
    }

}

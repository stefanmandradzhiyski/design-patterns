package com.snmi.structuralPatterns.flyweight;

/**
 * Concrete flyweight object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Order {

    /**
     * Constants
     */
    private static final String PROCESS_ORDER = "Ordering %s for order number: %d";

    /**
     * Immutable variables
     */
    private final int orderNumber;
    private final Item item;

    /**
     * Custom constructor
     * @param orderNumber take the order number
     * @param item take the item
     */
    public Order (int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    /**
     * Print the order on console
     */
    public void processOrder() {
        System.out.printf(PROCESS_ORDER, item, orderNumber);
        System.out.println();
    }
}

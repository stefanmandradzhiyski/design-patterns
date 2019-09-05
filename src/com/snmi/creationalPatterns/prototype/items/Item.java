package com.snmi.creationalPatterns.prototype.items;

/**
 * Item abstract class which implement Cloneable
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Item implements Cloneable{

    /**
     * Variables
     */
    private String title;
    private double price;

    /**
     * Custom constructor
     * @param title take the item's title
     * @param price take the item's price
     */
    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Setters and getters
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Override the clone method
     * @return new instance by cloning the existing object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

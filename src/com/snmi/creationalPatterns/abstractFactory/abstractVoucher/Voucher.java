package com.snmi.creationalPatterns.abstractFactory.abstractVoucher;

/**
 * Voucher abstract class
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Voucher {

    /**
     * Variables
     */
    private String name;
    private double price;

    /**
     * Default constructor
     */
    public Voucher() {}

    /**
     * Custom constructor
     * @param name take the Voucher's name
     * @param price take the Voucher's price
     */
    public Voucher(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Setters and getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

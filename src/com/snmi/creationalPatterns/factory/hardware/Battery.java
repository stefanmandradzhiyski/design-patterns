package com.snmi.creationalPatterns.factory.hardware;

/**
 * Battery object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Battery extends Hardware{

    /**
     * Constants
     */
    private static final String SHOW_BATTERY_INFO = "Battery %s with capacity %d";

    /**
     * Variables
     */
    private int capacity;

    /**
     * Default constructor
     */
    public Battery() {}

    /**
     * Custom constructor
     * @param brand take the Battery's brand
     * @param capacity take the Battery's capacity
     */
    public Battery(String brand, int capacity) {
        super (brand);
        this.capacity = capacity;
    }

    /**
     * Setters and getters
     */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Battery implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_BATTERY_INFO, super.getBrand(), getCapacity());
        System.out.println();
    }
}

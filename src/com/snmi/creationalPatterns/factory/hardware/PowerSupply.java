package com.snmi.creationalPatterns.factory.hardware;

/**
 * Power supply object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class PowerSupply extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_POWER_SUPPLY_INFO = "Power supply %s with %d effect";

    /**
     * Variables
     */
    private int percent;

    /**
     * Default constructor
     */
    public PowerSupply() {}

    /**
     * Custom constructor
     * @param brand take the Power supply brand
     * @param percent take the Power supply percent
     */
    public PowerSupply(String brand, int percent) {
        super (brand);
        this.percent = percent;
    }

    /**
     * Setters and getters
     */
    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    /**
     * Power supply implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_POWER_SUPPLY_INFO, super.getBrand(), getPercent());
        System.out.println();
    }
}

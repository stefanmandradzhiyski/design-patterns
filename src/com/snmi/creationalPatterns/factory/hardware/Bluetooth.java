package com.snmi.creationalPatterns.factory.hardware;

/**
 * Battery object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Bluetooth extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_BLUETOOTH_INFO = "Bluetooth %s version %s";

    /**
     * Variables
     */
    private String version;

    /**
     * Default constructor
     */
    public Bluetooth() {}

    /**
     * Custom constructor
     * @param brand take the Bluetooth's brand
     * @param version take the Bluetooth's brand
     */
    public Bluetooth(String brand, String version) {
        super (brand);
        this.version = version;
    }

    /**
     * Setters and getters
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Bluetooth implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_BLUETOOTH_INFO, super.getBrand(), getVersion());
        System.out.println();
    }
}

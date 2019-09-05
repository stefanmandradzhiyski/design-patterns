package com.snmi.creationalPatterns.factory.hardware;

/**
 * Hardware abstract class
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Hardware {

    public String brand;

    public Hardware() {}

    public Hardware(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Show information that need to be implemented by all child objects
     */
    public abstract void showInformation();

}

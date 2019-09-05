package com.snmi.creationalPatterns.factory.hardware;

/**
 * Motherboard object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Motherboard extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_MOTHERBOARD_INFO = "Motherboard %s %s";

    /**
     * Variables
     */
    private String model;

    /**
     * Default constructor
     */
    public Motherboard() {}

    /**
     * Custom constructor
     * @param brand take the Motherboard's brand
     * @param model take the Motherboard's model
     */
    public Motherboard(String brand, String model) {
        super (brand);
        this.model = model;
    }

    /**
     * Setters and getters
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Motherboard implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_MOTHERBOARD_INFO, super.getBrand(), getModel());
        System.out.println();
    }
}

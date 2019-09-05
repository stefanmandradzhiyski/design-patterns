package com.snmi.creationalPatterns.factory.hardware;

/**
 * CPU object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CPU extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_CPU_INFO = "CPU %s %s with %f Ghz";

    /**
     * Variables
     */
    private String model;
    private double frequency;

    /**
     * Default constructor
     */
    public CPU() {}

    /**
     * Custom constructor
     * @param brand take the CPU's brand
     * @param model take the CPU's model
     * @param frequency take the CPU's frequency
     */
    public CPU(String brand, String model, double frequency) {
        super (brand);
        this.model = model;
        this.frequency = frequency;
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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    /**
     * CPU implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_CPU_INFO, super.getBrand(), getModel(), getFrequency());
        System.out.println();
    }
}

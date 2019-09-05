package com.snmi.creationalPatterns.factory.hardware;

/**
 * RAM object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class RAM extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_RAM_INFO = "RAM %s %s with %d %s";

    /**
     * Variables
     */
    private String model;
    private int memory;
    private String DDR;

    /**
     * Default constructor
     */
    public RAM() {}

    /**
     * Custom constructor
     * @param brand take the RAM's brand
     * @param model take the RAM's model
     * @param memory take the RAM's memory
     * @param DDR take the RAM's DDR
     */
    public RAM(String brand, String model, int memory, String DDR) {
        super (brand);
        this.model = model;
        this.memory = memory;
        this.DDR = DDR;
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getDDR() {
        return DDR;
    }

    public void setDDR(String DDR) {
        this.DDR = DDR;
    }

    /**
     * RAM implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_RAM_INFO, super.getBrand(), getModel(), getMemory(), getDDR());
        System.out.println();
    }
}

package com.snmi.creationalPatterns.factory.hardware;

/**
 * GPU object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class GPU extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_GPU_INFO = "GPU %s %s with %d GB %d bit";

    /**
     * Variables
     */
    private String model;
    private int memory;
    private int bandwidthBit;

    /**
     * Default constructor
     */
    public GPU() {}

    /**
     * Custom constructor
     * @param brand take the GPU's brand
     * @param model take the GPU's model
     * @param memory take the GPU's memory
     * @param bandwidthBit take the GPU's bandwidth bits
     */
    public GPU(String brand, String model, int memory, int bandwidthBit) {
        super (brand);
        this.model = model;
        this.memory = memory;
        this.bandwidthBit = bandwidthBit;
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

    public int getMemory() { return memory; }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBandwidthBit() {
        return bandwidthBit;
    }

    public void setBandwidthBit(int bandwidthBit) {
        this.bandwidthBit = bandwidthBit;
    }

    /**
     * GPU implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_GPU_INFO, super.getBrand(), getModel(), getMemory(), getBandwidthBit());
        System.out.println();
    }
}

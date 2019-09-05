package com.snmi.creationalPatterns.factory.hardware;

/**
 * Water cooler object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class WaterCooler extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_WATER_COOLER_INFO = "WaterCooler %s";

    /**
     * Default constructor
     */
    public WaterCooler() {}

    /**
     * Custom constructor
     * @param brand take the Water cooler brand
     */
    public WaterCooler(String brand) {
        super (brand);
    }

    /**
     * Water cooler implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_WATER_COOLER_INFO, super.getBrand());
        System.out.println();
    }
}

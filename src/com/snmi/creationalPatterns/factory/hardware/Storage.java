package com.snmi.creationalPatterns.factory.hardware;

/**
 * Storage object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Storage extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_STORAGE_INFO = "Storage %s %d GB";

    /**
     * Variables
     */
    private int storage;

    /**
     * Default constructor
     */
    public Storage() {}

    /**
     * Custom constructor
     * @param brand take the Storage's brand
     * @param storage take the Storage size
     */
    public Storage(String brand, int storage) {
        super (brand);
        this.storage = storage;
    }

    /**
     * Setters and getters
     */
    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * Storage implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_STORAGE_INFO, super.getBrand(), getStorage());
        System.out.println();
    }
}

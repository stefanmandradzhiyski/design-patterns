package com.snmi.creationalPatterns.factory.hardware;

/**
 * WiFi object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class WiFi extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_WIFI_INFO = "WiFi %s version %s";

    /**
     * Variables
     */
    private String version;

    /**
     * Default constructor
     */
    public WiFi() {}

    /**
     * Custom constructor
     * @param brand take the WiFi's brand
     * @param version take the WiFi's version
     */
    public WiFi(String brand, String version) {
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
     * WiFi implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_WIFI_INFO, super.getBrand(), getVersion());
        System.out.println();
    }
}

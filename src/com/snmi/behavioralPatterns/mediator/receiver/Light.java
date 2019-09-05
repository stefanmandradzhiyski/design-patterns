package com.snmi.behavioralPatterns.mediator.receiver;

/**
 * Light receiver
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Light {

    private static final String LIGHT_ON = "%s light switched ON";
    private static final String LIGHT_OFF = "%s light switched OFF";

    /**
     * Variables
     */
    private String lightName;
    private boolean isOn = false;

    /**
     * Custom constructor
     * @param lightName take the light's name
     */
    public Light(String lightName) {
        this.lightName = lightName;
    }

    /**
     * Getters
     */
    public String getLightName() {
        return lightName;
    }

    public boolean isOn() {
        return isOn;
    }

    /**
     * Toggle method
     */
    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    /**
     * Light on method
     */
    public void on() {
        System.out.printf(LIGHT_ON, getLightName());
        System.out.println();
    }

    /**
     * Light off method
     */
    public void off() {
        System.out.printf(LIGHT_OFF, getLightName());
        System.out.println();
    }

}

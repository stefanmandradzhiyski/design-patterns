package com.snmi.structuralPatterns.bridge;

/**
 * Detail object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Detail {

    /**
     * Variables
     */
    private String label;
    private String value;

    /**
     * Custom constructor
     * @param label take the label
     * @param value take the value
     */
    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    /**
     * Getters
     */
    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}


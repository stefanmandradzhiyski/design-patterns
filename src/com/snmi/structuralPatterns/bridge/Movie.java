package com.snmi.structuralPatterns.bridge;

/**
 * Movie object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Movie {

    /**
     * Variables
     */
    private String classification;
    private String runtime;
    private String title;
    private String year;

    /**
     * Setters and getters
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClassification() {
        return classification;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}

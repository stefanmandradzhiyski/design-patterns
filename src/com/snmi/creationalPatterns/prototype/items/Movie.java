package com.snmi.creationalPatterns.prototype.items;

/**
 * Movie object that extends Item
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Movie extends Item {

    /**
     * Variables
     */
    private String runtime;

    /**
     * Custom constructor
     * @param title take the Movie's title
     * @param price take the Movie's price
     * @param runtime take the Movie's runtime
     */
    public Movie(String title, double price, String runtime) {
        super (title, price);
        this.runtime = runtime;
    }

    /**
     * Setters and getters
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * Override the toString method
     * @return the presentation of Movie
     */
    @Override
    public String toString() {
        return "Movie{" +
                "runtime='" + runtime + '\'' +
                '}';
    }
}

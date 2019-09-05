package com.snmi.creationalPatterns.prototype.items;

import com.snmi.creationalPatterns.prototype.enums.PlatformType;

/**
 * Game object that extends Item
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Game extends Item {

    /**
     * Variables
     */
    private PlatformType platformType;

    /**
     * Custom constructor
     * @param title take the Game's title
     * @param price take the Game's price
     * @param platformType take the Game's platform
     */
    public Game(String title, double price, PlatformType platformType) {
        super (title, price);
        this.platformType = platformType;
    }

    /**
     * Setters and getters
     */
    public PlatformType getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType;
    }

    /**
     * Override the toString method
     * @return the presentation of Game
     */
    @Override
    public String toString() {
        return "Game{" +
                "platformType=" + platformType +
                '}';
    }
}

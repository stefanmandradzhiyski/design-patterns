package com.snmi.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Menu component
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class MenuComponent {

    /**
     * Constants
     */
    private static final String FEATURE_NOT_SUPPORTED = "Feature not implemented at this level.";

    /**
     * Variables
     */
    protected String name;
    protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    /**
     * Print method which the menu name and his url
     * @param menuComponent take the menu component
     * @return the menu
     */
    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }

    /**
     * Add and remove methods
     */
    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException(FEATURE_NOT_SUPPORTED);
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException(FEATURE_NOT_SUPPORTED);
    }

    public abstract String toString();

}

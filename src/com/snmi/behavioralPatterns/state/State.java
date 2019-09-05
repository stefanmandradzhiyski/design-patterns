package com.snmi.behavioralPatterns.state;

/**
 * State abstract class
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class State {

    /**
     * Constants
     */
    private static final String WRONG_IMPLEMENTATION = "Shouldn't be able to get here";

    public void handleRequest() {
        System.out.println(WRONG_IMPLEMENTATION);
    }

}

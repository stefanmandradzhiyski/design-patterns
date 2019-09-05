package com.snmi.structuralPatterns.decorator;

/**
 * Naked model concrete component
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class NakedModel implements Model {

    /**
     * Constants
     */
    private static final String NAKED_MODEL = "I'm naked. Please put clothes on me. ";

    /**
     * Implementation of model put on method
     * @return specific action
     */
    @Override
    public String putOn() {
        return NAKED_MODEL;
    }

}

package com.snmi.behavioralPatterns.state.conreteStates;

import com.snmi.behavioralPatterns.state.Fan;
import com.snmi.behavioralPatterns.state.State;

/**
 * Low state of the fan
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FanLowState extends State {

    /**
     * Constants
     */
    private static final String FAN_NEXT_STATE = "Turning fan on to medium.";
    private static final String FAN_CURRENT_STATE = "Fan is on low.";

    /**
     * Variable
     */
    private Fan fan;

    /**
     * Custom constructor
     * @param fan take the fan
     */
    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    /**
     * Implementation of the handle request
     */
    @Override
    public void handleRequest() {
        System.out.println(FAN_NEXT_STATE);
        fan.setState(fan.getFanMediumState());
    }

    /**
     * Implementation of toString method
     * @return fan current state
     */
    @Override
    public String toString() {
        return FAN_CURRENT_STATE;
    }

}

package com.snmi.behavioralPatterns.state.conreteStates;

import com.snmi.behavioralPatterns.state.Fan;
import com.snmi.behavioralPatterns.state.State;

/**
 * High state of the fan
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FanHighState extends State {

    /**
     * Constants
     */
    private static final String FAN_NEXT_STATE = "Turning fan to off.";
    private static final String FAN_CURRENT_STATE = "Fan is on high.";

    /**
     * Variable
     */
    private Fan fan;

    /**
     * Custom constructor
     * @param fan take the fan
     */
    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    /**
     * Implementation of the handle request
     */
    @Override
    public void handleRequest() {
        System.out.println(FAN_NEXT_STATE);
        fan.setState(fan.getFanOffState());
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

package com.snmi.behavioralPatterns.state;

import com.snmi.behavioralPatterns.state.conreteStates.FanHighState;
import com.snmi.behavioralPatterns.state.conreteStates.FanLowState;
import com.snmi.behavioralPatterns.state.conreteStates.FanMediumState;
import com.snmi.behavioralPatterns.state.conreteStates.FanOffState;

/**
 * Fan context object which make request to state
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Fan {

    /**
     * Variables
     */
    private State fanOffState;
    private State fanLowState;
    private State fanMediumState;
    private State fanHighState;
    private State state;

    /**
     * Default constructor
     */
    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        state = fanOffState;
    }

    /**
     * Make a request to the state
     */
    public void pullChain() {
        state.handleRequest();
    }

    /**
     * @return state string presentation
     */
    @Override
    public String toString() {
        return state.toString();
    }

    /**
     * Set the state of fan
     * @param state take the state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Getters
     */
    public State getFanOffState() { return fanOffState; }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public State getFanHighState() {
        return fanHighState;
    }
}

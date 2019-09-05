package com.snmi.behavioralPatterns.state;

/**
 * The program implement the State design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramState {

    public static void main(String[] args) {
        Fan fan = new Fan();
        changeFanState(fan, 4);
    }

    /**
     * Dynamically change the fan state
     * @param fan take the fan
     * @param stateButtonClicks take the numbers of button clicks
     */
    private static void changeFanState(Fan fan, int stateButtonClicks) {
        for (int i = 0; i < stateButtonClicks; i++) {
            fan.pullChain();
            System.out.println(fan);
        }
    }

}

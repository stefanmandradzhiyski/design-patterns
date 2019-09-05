package com.snmi.behavioralPatterns.mediator.command;

import com.snmi.behavioralPatterns.mediator.Mediator;

/**
 * Turn on all lights
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class TurnOnAllLightsCommand implements Command {

    /**
     * Mediator variable
     */
    private Mediator mediator;

    /**
     * Turn on all lights
     * @param mediator take the mediator
     */
    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Implementation of the command execute method
     */
    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }

}

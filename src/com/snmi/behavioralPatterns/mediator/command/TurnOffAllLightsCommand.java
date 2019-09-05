package com.snmi.behavioralPatterns.mediator.command;

import com.snmi.behavioralPatterns.mediator.Mediator;

/**
 * Turn off all lights
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class TurnOffAllLightsCommand implements Command {

    /**
     * Mediator variable
     */
    private Mediator mediator;

    /**
     * Turn off method
     * @param mediator take the mediator
     */
    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Implementation of the command execute method
     */
    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}

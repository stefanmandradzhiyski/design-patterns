package com.snmi.behavioralPatterns.mediator;

import com.snmi.behavioralPatterns.mediator.command.TurnOffAllLightsCommand;
import com.snmi.behavioralPatterns.mediator.command.TurnOnAllLightsCommand;
import com.snmi.behavioralPatterns.mediator.command.Command;
import com.snmi.behavioralPatterns.mediator.receiver.Light;

/**
 * The program implement the Mediator design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramMediator {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }

}

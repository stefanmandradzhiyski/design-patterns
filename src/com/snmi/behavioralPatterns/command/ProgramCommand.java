package com.snmi.behavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The program show the implementation of Command design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramCommand {

    public static void main(String[] args) {
        Switch switcher = new Switch();

        List<Light> lights = new ArrayList<>();
        lights.add(new Light("Bedroom"));
        lights.add(new Light("Kitchen"));
        lights.add(new Light("Living"));
        lights.add(new Light("Bathroom"));

        Command command = new AllLightsCommand(lights);
        switcher.storeAndExecute(command);
        switcher.storeAndExecute(command);
    }

}

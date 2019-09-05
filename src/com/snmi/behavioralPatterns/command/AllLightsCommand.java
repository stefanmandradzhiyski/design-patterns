package com.snmi.behavioralPatterns.command;

import java.util.List;

/**
 * All lights command which implement Command and execute the toggle method of every light
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AllLightsCommand implements Command {

    /**
     * Collection
     */
    private List<Light> lights;

    /**
     * Custom constructor
     * @param lights take the list of lights
     */
    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    /**
     * Implementation of command's execute method
     */
    @Override
    public void execute() {
        lights.forEach(Light::toggle);
    }

}

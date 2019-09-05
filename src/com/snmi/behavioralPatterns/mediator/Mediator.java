package com.snmi.behavioralPatterns.mediator;

import com.snmi.behavioralPatterns.mediator.receiver.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Mediator {

    /**
     * List of lights
     */
    private List<Light> lights = new ArrayList<>();

    /**
     * Add/register new light
     * @param light take a specific light
     */
    public void registerLight(Light light) {
        lights.add(light);
    }

    /**
     * Turn on all lights
     */
    public void turnOnAllLights() {
        lights.stream().filter(light -> !light.isOn()).forEach(Light::toggle);
    }

    /**
     * Turn off all lights
     */
    public void turnOffAllLights() {
        lights.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}

package com.snmi.creationalPatterns.factory.devices;

import com.snmi.creationalPatterns.factory.hardware.Hardware;

import java.util.ArrayList;
import java.util.List;

/**
 * Device abstraction
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Device {

    /**
     * List of Device's hardware
     */
    public List<Hardware> hardwareList = new ArrayList<>();

    /**
     * Default constructor
     */
    public Device() {
        createDevice();
    }

    /**
     * Create device method which need to be implemented by all child objects
     */
    public abstract void createDevice();
}

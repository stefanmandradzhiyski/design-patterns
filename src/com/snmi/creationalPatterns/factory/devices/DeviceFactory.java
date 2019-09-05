package com.snmi.creationalPatterns.factory.devices;

import com.snmi.creationalPatterns.factory.DeviceType;

/**
 * Device factory which create devices by type
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class DeviceFactory {

    private static final String NO_SUCH_DEVICE = "That device type hasn't implemented yet";

    /**
     * Create a specific device
     * @param deviceType the device type
     * @return the new device
     */
    public Device getDevice(DeviceType deviceType) {
        switch (deviceType) {
            case LAPTOP: return new Laptop();
            case SMARTPHONE: return new Smartphone();
            case PERSONAL_COMPUTER: return new PersonalComputer();
            default: throw new IllegalArgumentException(NO_SUCH_DEVICE);
        }
    }

}

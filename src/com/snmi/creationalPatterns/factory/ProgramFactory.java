package com.snmi.creationalPatterns.factory;

import com.snmi.creationalPatterns.factory.devices.Device;
import com.snmi.creationalPatterns.factory.devices.DeviceFactory;
import com.snmi.creationalPatterns.factory.hardware.Hardware;

/**
 * The program implement the Factory Method design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramFactory {

    /**
     * Constants
     */
    private static final String SPLITTER = "---------------------------";

    public static void main(String[] args) {
        visualizeObject(DeviceType.LAPTOP);
        visualizeObject(DeviceType.SMARTPHONE);
        visualizeObject(DeviceType.PERSONAL_COMPUTER);
    }

    /**
     * Create and print wanted device
     * @param deviceType the type of device you want to create
     */
    private static void visualizeObject(DeviceType deviceType) {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device device;
        device = deviceFactory.getDevice(deviceType);
        device.hardwareList.forEach(Hardware::showInformation);
        System.out.println(SPLITTER);
    }

}

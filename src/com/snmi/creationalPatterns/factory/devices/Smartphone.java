package com.snmi.creationalPatterns.factory.devices;

import com.snmi.creationalPatterns.factory.hardware.*;

/**
 * Smartphone object which extends Device
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Smartphone extends Device {

    /**
     * Smartphone implementation of Device's create device method
     */
    @Override
    public void createDevice() {
        hardwareList.add(new Motherboard("MOBILE-SMARTPHONE", "8900"));
        hardwareList.add(new Battery("BATTERY-SMARTPHONE", 4000));
        hardwareList.add(new CPU("CPU-SMARTPHONE", "k900", 4));
        hardwareList.add(new GPU("GPU-SMARTPHONE", "Dragon", 2, 128));
        hardwareList.add(new RAM("RAM-SMARTPHONE", "FuryX", 4, "DDR3"));
        hardwareList.add(new Storage("STORAGE-SMARTPHONE", 128));
        hardwareList.add(new Bluetooth("BLUETOOTH-SMARTPHONE", "5.0v"));
        hardwareList.add(new WiFi("WIFI-SMARTPHONE", "6.1v"));
        hardwareList.add(new Camera("CAMERA-SMARTPHONE", 48));
    }

}

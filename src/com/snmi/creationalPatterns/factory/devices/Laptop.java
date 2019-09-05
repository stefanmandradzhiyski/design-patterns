package com.snmi.creationalPatterns.factory.devices;

import com.snmi.creationalPatterns.factory.hardware.*;

/**
 * Laptop object that extend Device
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Laptop extends Device {

    /**
     * Laptop implementation of Device's create device method
     */
    @Override
    public void createDevice() {
        hardwareList.add(new Battery("BATTERY-LAPTOP", 4000));
        hardwareList.add(new PowerSupply("POWER-SUPPLY-LAPTOP", 80));
        hardwareList.add(new Motherboard("MOTHERBOARD-LAPTOP", "d56n"));
        hardwareList.add(new CPU("CPU-LAPTOP", "i5-8200m", 3.2));
        hardwareList.add(new GPU("GPU-LAPTOP", "2080GTX", 8, 256));
        hardwareList.add(new RAM("RAM-LAPTOP", "FuryX", 16, "DDR4"));
        hardwareList.add(new Storage("STORAGE-LAPTOP", 1000));
        hardwareList.add(new Bluetooth("BLUETOOTH-LAPTOP", "4.0v"));
        hardwareList.add(new WiFi("WIFI-LAPTOP", "5.1v"));
    }

}

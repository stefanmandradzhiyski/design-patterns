package com.snmi.creationalPatterns.factory.devices;

import com.snmi.creationalPatterns.factory.hardware.*;

/**
 * Personal computer which extend Device
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class PersonalComputer extends Device {

    /**
     * Personal computer implementation of Device's create device method
     */
    @Override
    public void createDevice() {
        hardwareList.add(new Motherboard("MOTHERBOARD-PC", "b85d"));
        hardwareList.add(new PowerSupply("POWER-SUPPLY-PC", 90));
        hardwareList.add(new CPU("CPU-PC", "i7-8600k", 3.9));
        hardwareList.add(new GPU("GPU-PC", "2080GTX", 12, 256));
        hardwareList.add(new RAM("RAM-PC", "Advantage", 64, "DDR4"));
        hardwareList.add(new Storage("STORAGE-PC", 1000));
        hardwareList.add(new WaterCooler("WATER-COOLER-PC"));
    }

}

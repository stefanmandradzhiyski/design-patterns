package com.snmi.structuralPatterns.flyweight;

/**
 * The program implement the Flyweight design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramFlyweight {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("PS4", 1111);
        inventorySystem.takeOrder("PS4", 2222);
        inventorySystem.takeOrder("JOYSTICK", 7654);
        inventorySystem.takeOrder("XBOX", 3333);
        inventorySystem.takeOrder("WII", 4444);
        inventorySystem.takeOrder("XBOX", 5521);
        inventorySystem.takeOrder("WII", 1122);
        inventorySystem.takeOrder("WII", 2233);
        inventorySystem.takeOrder("JOYSTICK", 4567);
        inventorySystem.takeOrder("JOYSTICK", 9876);
        inventorySystem.takeOrder("PS4", 2233);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }

}

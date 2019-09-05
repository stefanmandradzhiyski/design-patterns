package com.snmi.behavioralPatterns.command;


/**
 * Switch as Invoker
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Switch {

    /**
     * Store and execute the command
     * @param command take the command
     */
    public void storeAndExecute(Command command) {
        command.execute();
    }

}

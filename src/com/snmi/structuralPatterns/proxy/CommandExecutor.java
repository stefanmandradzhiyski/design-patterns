package com.snmi.structuralPatterns.proxy;

/**
 * Command executor interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface CommandExecutor {

    void runCommand(String cmd) throws Exception;

}

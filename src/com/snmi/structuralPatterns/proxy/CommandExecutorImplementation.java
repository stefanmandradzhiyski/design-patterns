package com.snmi.structuralPatterns.proxy;

/**
 * Concrete command executor implementation
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CommandExecutorImplementation implements CommandExecutor {

    /**
     * Constants
     */
    private static final String CMD_EXECUTE = "%s execute the command";

    /**
     * Implementation of the command executor run command method
     * @param cmd take the command
     * @throws Exception
     */
    @Override
    public void runCommand(String cmd) throws Exception {
        System.out.printf(CMD_EXECUTE, cmd);
        System.out.println();
    }

}

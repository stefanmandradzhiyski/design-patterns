package com.snmi.structuralPatterns.proxy;

/**
 * Command executor Proxy
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CommandExecutorProxy implements CommandExecutor{

    /**
     * Constants
     */
    private static final String USERNAME = "chefo";
    private static final String PASSWORD = "chefo2020";
    private static final String ADMIN_COMMAND = "rm";
    private static final String NOT_ADMIN_EXCEPTION = "rm command isn't allowed for non-admin users";

    /**
     * Variables
     */
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    /**
     * Custom constructor
     * @param username take the username
     * @param password take the password
     */
    public CommandExecutorProxy(String username, String password) {
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImplementation();
    }

    /**
     * Implementation of the command executor method
     * @param cmd take the command
     * @throws Exception
     */
    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith(ADMIN_COMMAND)) {
                throw new Exception(NOT_ADMIN_EXCEPTION);
            } else {
                commandExecutor.runCommand(cmd);
            }
        }
    }
}

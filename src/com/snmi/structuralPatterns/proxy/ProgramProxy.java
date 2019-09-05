package com.snmi.structuralPatterns.proxy;

/**
 * The program implement the Proxy design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramProxy {

    /**
     * Constants
     */
    private static final String FIRST_COMMAND = "say HELLO";
    private static final String SECOND_COMMAND = "rm HELLO";
    private static final String EXCEPTION_SENTENCE = "Exception message: %s";

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("chefo","chefo202");
        try {
            commandExecutor.runCommand(FIRST_COMMAND);
            commandExecutor.runCommand(SECOND_COMMAND);
        } catch (Exception e) {
            System.out.printf(EXCEPTION_SENTENCE, e.getMessage());
            System.out.println();
        }
    }

}

package com.snmi.creationalPatterns.singleton;

/**
 * DesktopUI - Singleton object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class DesktopUI {

    /**
     * Class constants
     */
    private static final String FIRST_WELCOME_MESSAGE = "UI: Main form is starting for the first time...";
    private static final String SECOND_WELCOME_MESSAGE = "UI: Main form is already running";

    /**
     * Class variables
     */
    private static volatile DesktopUI instance = null;
    private String welcomeMessage;

    /**
     * Default constructor with private access
     */
    private DesktopUI() {}

    /**
     * Main method of Singleton pattern (Lazy one). Its thread safe too
     * @return the new/existing instance of DesktopUI
     */
    public static DesktopUI getInstance() {
        if (instance == null) {
            synchronized (DesktopUI.class) {
                if (instance == null) {
                    instance = new DesktopUI();
                }
            }
        }

        return instance;
    }

    /**
     * Getters and setters
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    /**
     * Printing the DesktopUI form state
     */
    public void showUIForm() {
        if (this.welcomeMessage == null) {
            setWelcomeMessage(FIRST_WELCOME_MESSAGE);
            System.out.println(getWelcomeMessage());
        } else {
            setWelcomeMessage(SECOND_WELCOME_MESSAGE);
            System.out.println(getWelcomeMessage());
        }

    }
}

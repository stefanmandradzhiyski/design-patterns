package com.snmi.creationalPatterns.singleton;

/**
 * The program implement Singleton design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramSingleton {

    /**
     * Program constants
     */
    private static final String USER_ACTION = "User is trying to open form again";

    public static void main(String[] args) {
        openForm();

        System.out.println(USER_ACTION);

        openForm();
    }

    /**
     * Open form method
     */
    private static void openForm() {
        DesktopUI desktopUI = DesktopUI.getInstance();
        desktopUI.showUIForm();
    }

}

package com.snmi.structuralPatterns.composite;

/**
 * The program implement the Composite design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramComposite {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        assignMenuItem(mainMenu, "Safety", "/safety");
        assignMenuItem(mainMenu, "Claims", "/claims");
        assignMenuItem(mainMenu, "Personal Claims", "/personalClaims");
        System.out.println(mainMenu.toString());
    }

    /**
     * Assign new menu item to the main menu with his name and url
     * @param mainMenu take the maim menu
     * @param menuItemName take the menu item name
     * @param menuItemUrl take the menu item url
     */
    private static void assignMenuItem(Menu mainMenu, String menuItemName, String menuItemUrl) {
        MenuItem menuItem = new MenuItem(menuItemName, menuItemUrl);
        mainMenu.add(menuItem);
    }

}

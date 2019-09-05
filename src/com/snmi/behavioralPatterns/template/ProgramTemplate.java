package com.snmi.behavioralPatterns.template;

/**
 * The program implement the Template design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramTemplate {

    /**
     * Constants
     */
    private static final String WEB_ORDER = "WEB Order: ";
    private static final String STORE_ORDER = "STORE Order: ";

    public static void main(String[] args) {
        System.out.println(WEB_ORDER);
        OrderTemplate orderWebTemplate = new WebOrder();
        orderWebTemplate.processOrder();
        System.out.println();

        System.out.println(STORE_ORDER);
        OrderTemplate orderStoreTemplate = new StoreOrder();
        orderStoreTemplate.processOrder();
    }

}

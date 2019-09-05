package com.snmi.behavioralPatterns.template;

/**
 * Abstract Template of order
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class OrderTemplate {

    /**
     * Constants
     */
    private static final String WRAP_GIFT = "Gift was wrapped.";

    /**
     * Variable
     */
    public boolean isGift;

    /**
     * Abstract methods which all child need to implement
     */
    public abstract void doCheckOut();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    /**
     * Wrap gift
     * Child class can't override it
     */
    public final void wrapGift() {
        System.out.println(WRAP_GIFT);
    }

    /**
     * Process the order
     * Child class can't override it
     */
    public final void processOrder() {
        doCheckOut();
        doPayment();

        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }
}

package com.snmi.behavioralPatterns.template;

/**
 * Concrete class Store order which extends the order template
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class StoreOrder extends OrderTemplate {

    /**
     * Constants
     */
    private static final String DO_CHECK_OUT = "Ring up items from card.";
    private static final String DO_PAYMENT = "Process payment with Card present";
    private static final String DO_RECEIPT = "Bag items at counter";
    private static final String DO_DELIVERY = "Print receipt\"";

    /**
     * Override all order template methods
     */
    @Override
    public void doCheckOut() {
        System.out.println(DO_CHECK_OUT);
    }

    @Override
    public void doPayment() {
        System.out.println(DO_PAYMENT);
    }

    @Override
    public void doReceipt() {
        System.out.println(DO_RECEIPT);
    }

    @Override
    public void doDelivery() { System.out.println(DO_DELIVERY); }

}

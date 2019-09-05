package com.snmi.behavioralPatterns.template;

/**
 * Concrete class Web order which extends the order template
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class WebOrder extends OrderTemplate {

    /**
     * Constants
     */
    private static final String DO_CHECK_OUT_FIRST_ACTION = "Get items from card,";
    private static final String DO_CHECK_OUT_SECOND_ACTION = "Set gift preferences,";
    private static final String DO_CHECK_OUT_THIRD_ACTION = "Set delivery address,";
    private static final String DO_CHECK_OUT_FORTH_ACTION = "Set billing address.";
    private static final String DO_PAYMENT = "Process payment without Card present";
    private static final String DO_RECEIPT = "Ship the item to address";
    private static final String DO_DELIVERY = "Email receipt";

    /**
     * Override all order template methods
     */
    @Override
    public void doCheckOut() {
        System.out.println(DO_CHECK_OUT_FIRST_ACTION);
        System.out.println(DO_CHECK_OUT_SECOND_ACTION);
        System.out.println(DO_CHECK_OUT_THIRD_ACTION);
        System.out.println(DO_CHECK_OUT_FORTH_ACTION);
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
    public void doDelivery() {
        System.out.println(DO_DELIVERY);
    }

}

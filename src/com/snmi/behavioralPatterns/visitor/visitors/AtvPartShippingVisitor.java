package com.snmi.behavioralPatterns.visitor.visitors;

import com.snmi.behavioralPatterns.visitor.*;
import com.snmi.behavioralPatterns.visitor.parts.Fender;
import com.snmi.behavioralPatterns.visitor.parts.Oil;
import com.snmi.behavioralPatterns.visitor.parts.Wheel;

import java.util.List;

/**
 * Concrete visitor - ATV part shipping visitor
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AtvPartShippingVisitor implements AtvPartVisitor {

    /**
     * Constants
     */
    private static final String DISPLAY_FENDER = "Fender is light and cheap to ship";
    private static final String DISPLAY_OIL = "Oil is hazardous and has a fee to ship";
    private static final String VISIT_WHEEL = "Wheels are bulky and expensive to ship";
    private static final String VISIT_PART_ORDER_PROMOTION = "If they bought more than 3 things we will give them a discount on shipping";
    private static final String VISIT_ORDER = "Shipping amount is: %.2f$";

    /**
     * Variable
     */
    private double shippingAmount = 0;

    /**
     * Implement the visit method of every part
     */
    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println(DISPLAY_FENDER);
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println(DISPLAY_OIL);
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println(VISIT_WHEEL);
    }

    @Override
    public void visit(PartOrder partOrder) {
        System.out.println(VISIT_PART_ORDER_PROMOTION);
        List<ATVPart> parts = partOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.printf(VISIT_ORDER, shippingAmount);
        System.out.println();
    }

}

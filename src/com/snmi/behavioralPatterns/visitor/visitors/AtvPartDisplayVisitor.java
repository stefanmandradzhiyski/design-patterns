package com.snmi.behavioralPatterns.visitor.visitors;

import com.snmi.behavioralPatterns.visitor.parts.Fender;
import com.snmi.behavioralPatterns.visitor.parts.Oil;
import com.snmi.behavioralPatterns.visitor.PartOrder;
import com.snmi.behavioralPatterns.visitor.parts.Wheel;

/**
 * Concrete visitor - ATV part display visitor
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AtvPartDisplayVisitor implements AtvPartVisitor {

    /**
     * Constants
     */
    private static final String DISPLAY_FENDER = "We have a fender";
    private static final String DISPLAY_OIL = "We have a oil";
    private static final String VISIT_WHEEL = "We have a wheel";
    private static final String VISIT_PART_ORDER = "We have an order";

    /**
     * Implement the visit method of every part
     */
    @Override
    public void visit(Fender fender) {
        System.out.println(DISPLAY_FENDER);
    }

    @Override
    public void visit(Oil oil) {
        System.out.println(DISPLAY_OIL);
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println(VISIT_WHEEL);
    }

    @Override
    public void visit(PartOrder partOrder) {
        System.out.println(VISIT_PART_ORDER);
    }

}

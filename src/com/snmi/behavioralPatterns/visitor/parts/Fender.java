package com.snmi.behavioralPatterns.visitor.parts;

import com.snmi.behavioralPatterns.visitor.ATVPart;
import com.snmi.behavioralPatterns.visitor.visitors.AtvPartVisitor;

/**
 * Fender object which implement ATV Part
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Fender implements ATVPart {

    /**
     * Implementation of ATV Part accept method
     * @param visitor take the visitor
     */
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}

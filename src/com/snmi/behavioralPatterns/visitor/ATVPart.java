package com.snmi.behavioralPatterns.visitor;

import com.snmi.behavioralPatterns.visitor.visitors.AtvPartVisitor;

/**
 * ATV Part interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface ATVPart {

    void accept(AtvPartVisitor visitor);

}

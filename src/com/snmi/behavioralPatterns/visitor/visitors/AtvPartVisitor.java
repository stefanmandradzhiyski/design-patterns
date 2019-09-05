package com.snmi.behavioralPatterns.visitor.visitors;

import com.snmi.behavioralPatterns.visitor.parts.Fender;
import com.snmi.behavioralPatterns.visitor.parts.Oil;
import com.snmi.behavioralPatterns.visitor.PartOrder;
import com.snmi.behavioralPatterns.visitor.parts.Wheel;

/**
 * ATV Part Visitor which every visitor need to implement
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface AtvPartVisitor {

    void visit(Fender fender);
    void visit(Oil oil);
    void visit(Wheel wheel);
    void visit(PartOrder partOrder);

}

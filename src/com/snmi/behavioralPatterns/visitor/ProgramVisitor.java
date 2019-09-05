package com.snmi.behavioralPatterns.visitor;

import com.snmi.behavioralPatterns.visitor.parts.Fender;
import com.snmi.behavioralPatterns.visitor.parts.Oil;
import com.snmi.behavioralPatterns.visitor.parts.Wheel;
import com.snmi.behavioralPatterns.visitor.visitors.AtvPartDisplayVisitor;
import com.snmi.behavioralPatterns.visitor.visitors.AtvPartShippingVisitor;

/**
 * The program implement the Visitor design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramVisitor {

    public static void main(String[] args) {
        PartOrder partOrder = new PartOrder();
        partOrder.addPart(new Fender());
        partOrder.addPart(new Oil());
        partOrder.addPart(new Wheel());
        partOrder.addPart(new Wheel());
        partOrder.accept(new AtvPartShippingVisitor());
        partOrder.accept(new AtvPartDisplayVisitor());
    }

}

package com.snmi.structuralPatterns.decorator.concreteDecorators;

import com.snmi.structuralPatterns.decorator.Model;
import com.snmi.structuralPatterns.decorator.ModelDecorator;
import com.snmi.structuralPatterns.decorator.clothesSpecification.ColorType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.SizeType;

/**
 * Jeans concrete decorator which extend model decorator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class JeansDecorator extends ModelDecorator {

    /**
     * Constants
     */
    private static final String DECORATOR_ACTION = "Put on %s jeans size %s on him. ";

    /**
     * Concrete decorator constructor
     * @param model take the model
     * @param colorType take the jeans's color type
     * @param sizeType take the jeans's size type
     */
    public JeansDecorator(Model model, ColorType colorType, SizeType sizeType) {
        super(model, colorType, sizeType);
    }

    /**
     * Implementation of model put on method
     * @return the action
     */
    public String putOn() {
        return model.putOn() + putJeans();
    }

    /**
     * Put specific jeans on the model
     * @return the putted jeans
     */
    private String putJeans() {
        return String.format(DECORATOR_ACTION, colorType, sizeType);
    }
}

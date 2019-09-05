package com.snmi.structuralPatterns.decorator.concreteDecorators;

import com.snmi.structuralPatterns.decorator.Model;
import com.snmi.structuralPatterns.decorator.ModelDecorator;
import com.snmi.structuralPatterns.decorator.clothesSpecification.ColorType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.SizeType;

/**
 * Shirt concrete decorator which extend model decorator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ShirtDecorator extends ModelDecorator {

    /**
     * Constants
     */
    private static final String DECORATOR_ACTION = "Put on %s shirt size %s on him. ";

    /**
     * Concrete decorator constructor
     * @param model take the model
     * @param colorType take the shirt's color type
     * @param sizeType take the shirt's size type
     */
    public ShirtDecorator(Model model, ColorType colorType, SizeType sizeType) {
        super(model, colorType, sizeType);
    }

    /**
     * Implementation of model put on method
     * @return the action
     */
    public String putOn() {
        return model.putOn() + putShirt();
    }

    /**
     * Put specific shirt on the model
     * @return the putted shirt
     */
    private String putShirt() {
        return String.format(DECORATOR_ACTION, colorType, sizeType);
    }
}

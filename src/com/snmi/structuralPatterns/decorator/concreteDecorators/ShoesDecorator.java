package com.snmi.structuralPatterns.decorator.concreteDecorators;

import com.snmi.structuralPatterns.decorator.Model;
import com.snmi.structuralPatterns.decorator.ModelDecorator;
import com.snmi.structuralPatterns.decorator.clothesSpecification.ColorType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.ShoesSizeType;

/**
 * Shoes concrete decorator which extend model decorator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ShoesDecorator extends ModelDecorator {

    /**
     * Variables
     */
    private ShoesSizeType shoesSizeType;

    /**
     * Constants
     */
    private static final String DECORATOR_ACTION = "Put on %s shoes size %s on him. ";

    /**
     * Concrete decorator constructor
     * @param model take the model
     * @param colorType take the shoes's color type
     * @param shoesSizeType take the shoes's size type
     */
    public ShoesDecorator(Model model, ColorType colorType, ShoesSizeType shoesSizeType) {
        super(model, colorType);
        this.shoesSizeType = shoesSizeType;
    }

    /**
     * Implementation of model put on method
     * @return the action
     */
    public String putOn() {
        return model.putOn() + putShoes();
    }

    /**
     * Put specific shoes on the model
     * @return the putted shoes
     */
    private String putShoes() {
        return String.format(DECORATOR_ACTION, colorType, shoesSizeType.getShoesSize());
    }
}

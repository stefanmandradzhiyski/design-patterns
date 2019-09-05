package com.snmi.structuralPatterns.decorator;

import com.snmi.structuralPatterns.decorator.clothesSpecification.ColorType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.SizeType;

/**
 * Model decorator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ModelDecorator implements Model{

    /**
     * Take the component variable
     */
    protected Model model;
    protected ColorType colorType;
    protected SizeType sizeType;

    /**
     * Decorator constructor
     * @param model take the model
     * @param colorType take the concrete decorator's color type
     * @param sizeType take the concrete decorator's size type
     */
    public ModelDecorator(Model model, ColorType colorType, SizeType sizeType) {
        this.model = model;
        this.colorType = colorType;
        this.sizeType = sizeType;
    }

    /**
     * Decorator constructor
     * @param model take the model
     * @param colorType take the concrete decorator's color type
     */
    public ModelDecorator(Model model, ColorType colorType) {
        this.model = model;
        this.colorType = colorType;
    }

    /**
     * Implementation of model put on method
     * @return the action
     */
    @Override
    public String putOn() {
        return model.putOn();
    }
}

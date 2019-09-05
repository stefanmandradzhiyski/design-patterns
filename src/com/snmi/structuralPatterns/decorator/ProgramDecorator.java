package com.snmi.structuralPatterns.decorator;

import com.snmi.structuralPatterns.decorator.clothesSpecification.ColorType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.ShoesSizeType;
import com.snmi.structuralPatterns.decorator.clothesSpecification.SizeType;
import com.snmi.structuralPatterns.decorator.concreteDecorators.JeansDecorator;
import com.snmi.structuralPatterns.decorator.concreteDecorators.ShirtDecorator;
import com.snmi.structuralPatterns.decorator.concreteDecorators.ShoesDecorator;

/**
 * The program implement the Decorator design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramDecorator {

    public static void main(String[] args) {
        Model model =
                new ShoesDecorator(
                    new JeansDecorator(
                            new ShirtDecorator(
                                    new NakedModel(), ColorType.WHITE, SizeType.L),
                            ColorType.GRAY, SizeType.M),
                    ColorType.BLACK,
                ShoesSizeType.SIZE_45);

        System.out.println(model.putOn());
    }

}

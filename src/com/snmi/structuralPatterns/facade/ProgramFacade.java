package com.snmi.structuralPatterns.facade;

/**
 * The program implement the Facade design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramFacade {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawRectangle(8,4);
        shapeFacade.drawSquare(5);

    }

}

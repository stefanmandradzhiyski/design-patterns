package com.snmi.structuralPatterns.facade;

/**
 * Shape Facade which draw two figure types for the client
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ShapeFacade {

    /**
     * Constants
     */
    private static final String STAR = " * ";
    private static final String EMPTY = "   ";
    private static final int START = 1;
    private static final int FIRST_EMPTY_POSITION = 2;
    private static final String DRAWING_RECTANGLE = "The program is drawing a rectangle with size %d length and %d height ...";
    private static final String DRAWING_SQUARE = "The program is drawing a square with size %d ...";

    /**
     * Draw a rectangle with specific length and height
     * @param length take the rectangle's length
     * @param height take the rectangle's height
     */
    public void drawRectangle(int length, int height) {
        System.out.printf(DRAWING_RECTANGLE, length, height);
        System.out.println();

        for (int i = START; i <= height; i++) {
            if (i == START) {
                for (int j = START; j <= length; j++) {
                    System.out.print(STAR);
                }
            } else if (i == height) {
                for (int j = START; j <= length; j++) {
                    System.out.print(STAR);
                }
            } else {
                System.out.print(STAR);
                for (int j = FIRST_EMPTY_POSITION; j < length; j++) {
                    System.out.print(EMPTY);
                }
                System.out.print(STAR);
            }

            System.out.println();
        }

        System.out.println();
    }

    /**
     * Draw a square with specific side size
     * @param sideSize take the square's size
     */
    public void drawSquare(int sideSize) {
        System.out.printf(DRAWING_SQUARE, sideSize);
        System.out.println();

        for (int i = START; i <= sideSize; i++) {
            if (i == START) {
                for (int j = START; j <= sideSize; j++) {
                    System.out.print(STAR);
                }
            } else if (i == sideSize) {
                for (int j = START; j <= sideSize; j++) {
                    System.out.print(STAR);
                }
            } else {
                System.out.print(STAR);
                for (int j = FIRST_EMPTY_POSITION; j < sideSize; j++) {
                    System.out.print(EMPTY);
                }
                System.out.print(STAR);
            }

            System.out.println();
        }

        System.out.println();
    }

}

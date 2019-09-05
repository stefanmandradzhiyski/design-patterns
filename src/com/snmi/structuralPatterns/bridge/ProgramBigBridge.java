package com.snmi.structuralPatterns.bridge;

import com.snmi.structuralPatterns.bridge.formatters.Formatter;
import com.snmi.structuralPatterns.bridge.formatters.HTMLFormatter;
import com.snmi.structuralPatterns.bridge.formatters.PrintFormatter;

/**
 * The program implement the Bridge design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramBigBridge {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:35");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HTMLFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);
    }

}

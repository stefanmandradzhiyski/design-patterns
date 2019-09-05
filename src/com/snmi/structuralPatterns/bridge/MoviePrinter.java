package com.snmi.structuralPatterns.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Movie printer which extends Printer
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class MoviePrinter extends Printer {

    /**
     * Constants
     */
    private static final String TITLE = "Title";
    private static final String YEAR = "Year";
    private static final String RUNTIME = "Runtime";

    /**
     * Variable
     */
    private Movie movie;

    /**
     * Custom constructor
     * @param movie take the movie object
     */
    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    /**
     * Fill the list and return it
     * @return return the filled list
     */
    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail(TITLE, movie.getTitle()));
        details.add(new Detail(YEAR, movie.getYear()));
        details.add(new Detail(RUNTIME, movie.getRuntime()));

        return details;
    }

    /**
     * Get the movie classification
     * @return the movie classification
     */
    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

}

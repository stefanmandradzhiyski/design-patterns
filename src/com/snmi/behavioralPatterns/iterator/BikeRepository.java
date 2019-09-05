package com.snmi.behavioralPatterns.iterator;

import java.util.Iterator;

/**
 * Bike repository = Iterator
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class BikeRepository implements Iterable<String>{

    /**
     * Constants
     */
    private static final String NOT_CREATED = "Not created yet";

    /**
     * Variables
     */
    private String[] bikes;
    private int index;

    /**
     * Default constructor
     */
    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    /**
     * Add method which add new bike to the list
     * @param bike take the bike
     */
    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }

        bikes[index] = bike;
        index++;
    }

    /**
     * Iterate through the bike repository
     * @return the iterator
     */
    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(NOT_CREATED);
            }
        };

        return iterator;
    }
}

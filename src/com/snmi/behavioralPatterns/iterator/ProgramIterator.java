package com.snmi.behavioralPatterns.iterator;

import java.util.Iterator;

/**
 * Program that implement the Iterator design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramIterator {

    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("BMX");
        bikeRepository.addBike("BMW");

        Iterator<String> bikeIterator = bikeRepository.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

    }

}

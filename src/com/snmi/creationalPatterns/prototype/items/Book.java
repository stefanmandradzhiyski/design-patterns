package com.snmi.creationalPatterns.prototype.items;

/**
 * Book object that extends Item
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Book extends Item {

    /**
     * Variables
     */
    private int numberOfPages;

    /**
     * Custom constructor
     * @param title take the Book's title
     * @param price take the Book's price
     * @param numberOfPages take the Book's pages
     */
    public Book(String title, double price, int numberOfPages) {
        super (title, price);
        this.numberOfPages = numberOfPages;
    }

    /**
     * Setters and getters
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * Override the toString method
     * @return the presentation of Book
     */
    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                '}';
    }
}

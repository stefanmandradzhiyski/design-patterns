package com.snmi.behavioralPatterns.strategy;

/**
 * Credit card object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CreditCard {

    /**
     * Variables
     */
    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy validationStrategy;

    /**
     * Custom constructor
     * @param validationStrategy take the validation strategy
     */
    public CreditCard(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    /**
     * Setters and getters
     */
    public boolean isValid() {
        return validationStrategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}

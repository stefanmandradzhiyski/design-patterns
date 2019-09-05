package com.snmi.behavioralPatterns.strategy;

import com.snmi.behavioralPatterns.strategy.concreteStrategy.AmexStrategy;
import com.snmi.behavioralPatterns.strategy.concreteStrategy.VisaStrategy;

/**
 * The program implement the Strategy design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramStrategy {

    public static void main(String[] args) {
        createCard(new AmexStrategy(), "379185883464283", "08/2025", "123");
        createCard(new AmexStrategy(), "379185883464282", "07/2023", "456");
        createCard(new VisaStrategy(), "4539589763663402", "10/2030", "789");
    }

    /**
     * Create new credit card and validate it
     * @param validationStrategy take the validation strategy
     * @param cardNumber take the card number
     * @param cardDate take the card date
     * @param CVV take the card cvv
     */
    private static void createCard(ValidationStrategy validationStrategy, String cardNumber,
                                   String cardDate, String CVV) {
        CreditCard card = createSpecificCard(validationStrategy);
        card.setNumber(cardNumber);
        card.setDate(cardDate);
        card.setCvv(CVV);
        System.out.println("Is card valid: " + card.isValid());
    }

    /**
     * Create specific credit card
     * @param validationStrategy take the validation strategy
     * @return new credit card
     */
    private static CreditCard createSpecificCard(ValidationStrategy validationStrategy) {
        CreditCard card;

        if (validationStrategy instanceof AmexStrategy) {
            card = new CreditCard(new AmexStrategy());
        } else {
            card = new CreditCard(new VisaStrategy());
        }

        return card;
    }

}

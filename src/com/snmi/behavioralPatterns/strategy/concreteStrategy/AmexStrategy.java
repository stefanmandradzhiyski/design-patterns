package com.snmi.behavioralPatterns.strategy.concreteStrategy;

import com.snmi.behavioralPatterns.strategy.CreditCard;
import com.snmi.behavioralPatterns.strategy.ValidationStrategy;

/**
 * Concrete strategy - Amex
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AmexStrategy extends ValidationStrategy {

    /**
     * Constants
     */
    private static final String FIRST_VALID_CARD_NUMBER_START = "37";
    private static final String SECOND_VALID_CARD_NUMBER_START = "34";
    private static final int VALID_LENGTH = 15;

    /**
     * Implementation of validation strategy isValid method by Amex strategy
     * @param creditCard take the credit card
     * @return boolean validation result
     */
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid;

        isValid = creditCard.getNumber().startsWith(FIRST_VALID_CARD_NUMBER_START) ||
                creditCard.getNumber().startsWith(SECOND_VALID_CARD_NUMBER_START);

        if (isValid) {
            isValid = creditCard.getNumber().length() == VALID_LENGTH;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}

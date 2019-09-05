package com.snmi.behavioralPatterns.strategy.concreteStrategy;

import com.snmi.behavioralPatterns.strategy.CreditCard;
import com.snmi.behavioralPatterns.strategy.ValidationStrategy;

/**
 * Concrete strategy - Visa
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VisaStrategy extends ValidationStrategy {

    /**
     * Constants
     */
    private static final String VALID_CARD_NUMBER_START = "4";
    private static final int VALID_LENGTH = 16;

    /**
     * Implementation of validation strategy isValid method by visa strategy
     * @param creditCard take the credit card
     * @return boolean validation result
     */
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid;

        isValid = creditCard.getNumber().startsWith(VALID_CARD_NUMBER_START);

        if (isValid) {
            isValid = creditCard.getNumber().length() == VALID_LENGTH;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}

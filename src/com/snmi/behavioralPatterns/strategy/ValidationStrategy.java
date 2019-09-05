package com.snmi.behavioralPatterns.strategy;

/**
 * Validation strategy abstract class
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class ValidationStrategy {

    /**
     * Abstract method that need to be implemented from all childes
     * @param creditCard take the credit card
     * @return boolean result
     */
    public abstract boolean isValid(CreditCard creditCard);

    /**
     * Luhn validation method for valid credit card
     * @param creditCardNumber take the credit card
     * @return boolean result if the card is valid
     */
    protected boolean passesLuhn(String creditCardNumber) {
        int sum = 0;
        boolean alternate = false;

        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(creditCardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}

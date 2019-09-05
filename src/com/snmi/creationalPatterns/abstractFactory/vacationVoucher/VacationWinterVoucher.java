package com.snmi.creationalPatterns.abstractFactory.vacationVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Vacation Winter Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VacationWinterVoucher extends Voucher {

    /**
     * Default constructor
     */
    public VacationWinterVoucher() {}

    /**
     * Custom constructor
     * @param name take the Vacation voucher name
     * @param price take the Vacation voucher price
     */
    public VacationWinterVoucher(String name, double price) {
        super (name, price);
    }

}

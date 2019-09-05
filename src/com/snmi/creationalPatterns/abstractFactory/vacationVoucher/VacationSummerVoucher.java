package com.snmi.creationalPatterns.abstractFactory.vacationVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Vacation Summer Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VacationSummerVoucher extends Voucher {

    /**
     * Default constructor
     */
    public VacationSummerVoucher() {}

    /**
     * Custom constructor
     * @param name take the Vacation voucher name
     * @param price take the Vacation voucher price
     */
    public VacationSummerVoucher(String name, double price) {
        super (name, price);
    }

}

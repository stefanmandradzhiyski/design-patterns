package com.snmi.creationalPatterns.abstractFactory.vacationVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Vacation Spring Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VacationSpringVoucher extends Voucher {

    /**
     * Default constructor
     */
    public VacationSpringVoucher() {}

    /**
     * Custom constructor
     * @param name take the Vacation voucher name
     * @param price take the Vacation voucher price
     */
    public VacationSpringVoucher(String name, double price) {
        super (name, price);
    }

}

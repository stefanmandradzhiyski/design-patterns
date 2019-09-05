package com.snmi.creationalPatterns.abstractFactory.adventureVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Adventure Autumn Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AdventureAutumnVoucher extends Voucher {

    /**
     * Default constructor
     */
    public AdventureAutumnVoucher() {}

    /**
     * Custom constructor
     * @param name take the Adventure voucher name
     * @param price take the Adventure voucher price
     */
    public AdventureAutumnVoucher(String name, double price) {
        super (name, price);
    }

}

package com.snmi.creationalPatterns.abstractFactory.adventureVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Adventure Winter Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AdventureWinterVoucher extends Voucher {

    /**
     * Default constructor
     */
    public AdventureWinterVoucher() {}

    /**
     * Custom constructor
     * @param name take the Adventure voucher name
     * @param price take the Adventure voucher price
     */
    public AdventureWinterVoucher(String name, double price) {
        super (name, price);
    }

}

package com.snmi.creationalPatterns.abstractFactory.adventureVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Adventure Spring Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AdventureSummerVoucher extends Voucher {

    /**
     * Default constructor
     */
    public AdventureSummerVoucher() {}

    /**
     * Custom constructor
     * @param name take the Adventure voucher name
     * @param price take the Adventure voucher price
     */
    public AdventureSummerVoucher(String name, double price) {
        super (name, price);
    }

}

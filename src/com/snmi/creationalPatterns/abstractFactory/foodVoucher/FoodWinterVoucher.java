package com.snmi.creationalPatterns.abstractFactory.foodVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Food Winter Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FoodWinterVoucher extends Voucher {

    /**
     * Default constructor
     */
    public FoodWinterVoucher() {}

    /**
     * Custom constructor
     * @param name take the Food voucher name
     * @param price take the Food voucher price
     */
    public FoodWinterVoucher(String name, double price) {
        super (name, price);
    }
}

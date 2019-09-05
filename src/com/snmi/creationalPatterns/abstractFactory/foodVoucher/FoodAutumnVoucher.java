package com.snmi.creationalPatterns.abstractFactory.foodVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Food Autumn Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FoodAutumnVoucher extends Voucher {

    /**
     * Default constructor
     */
    public FoodAutumnVoucher() {}

    /**
     * Custom constructor
     * @param name take the Food voucher name
     * @param price take the Food voucher price
     */
    public FoodAutumnVoucher(String name, double price) {
        super (name, price);
    }

}

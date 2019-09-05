package com.snmi.creationalPatterns.abstractFactory.foodVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Food Summer Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FoodSummerVoucher extends Voucher {

    /**
     * Default constructor
     */
    public FoodSummerVoucher() {}

    /**
     * Custom constructor
     * @param name take the Food voucher name
     * @param price take the Food voucher price
     */
    public FoodSummerVoucher(String name, double price) {
        super (name, price);
    }

}

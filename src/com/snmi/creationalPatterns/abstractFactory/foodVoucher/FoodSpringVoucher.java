package com.snmi.creationalPatterns.abstractFactory.foodVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;

/**
 * Food Spring Voucher which extends Voucher
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FoodSpringVoucher extends Voucher {

    /**
     * Default constructor
     */
    public FoodSpringVoucher() {}

    /**
     * Custom constructor
     * @param name take the Food voucher name
     * @param price take the Food voucher price
     */
    public FoodSpringVoucher(String name, double price) {
        super (name, price);
    }

}

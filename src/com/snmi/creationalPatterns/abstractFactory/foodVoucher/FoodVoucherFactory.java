package com.snmi.creationalPatterns.abstractFactory.foodVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherSeasonType;

/**
 * Food Voucher Factory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FoodVoucherFactory extends VoucherFactory {

    /**
     * Create specific food voucher by season
     * @param voucherSeasonType take the voucher's season type
     * @return new specific food voucher
     */
    @Override
    public Voucher getVoucher(VoucherSeasonType voucherSeasonType) {
        switch (voucherSeasonType) {
            case SPRING: return new FoodSpringVoucher("1kg Strawberry", 5);
            case SUMMER: return new FoodSummerVoucher("10kg water lemon", 4);
            case AUTUMN: return new FoodAutumnVoucher("1kg harsh almond", 17);
            case WINTER: return new FoodWinterVoucher("1kg Sudzhuk", 5);
            default: throw new IllegalArgumentException("Illegal season!");
        }
    }

}

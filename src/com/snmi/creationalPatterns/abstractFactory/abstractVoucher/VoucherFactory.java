package com.snmi.creationalPatterns.abstractFactory.abstractVoucher;

import com.snmi.creationalPatterns.abstractFactory.adventureVoucher.AdventureVoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.foodVoucher.FoodVoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.vacationVoucher.VacationVoucherFactory;

/**
 * Voucher Abstract Factory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class VoucherFactory {

    /**
     * Create specific Voucher Factory by voucher score
     * @param voucherScore take voucher score
     * @return the new voucher factory object
     */
    public static VoucherFactory getVoucherFactory(int voucherScore) {
        if (voucherScore >= 300) {
            return new VacationVoucherFactory();
        } else if (voucherScore >= 200) {
            return new AdventureVoucherFactory();
        } else {
            return new FoodVoucherFactory();
        }
    }

    /**
     * Method that every Voucher Factory need to implement
     * @param voucherSeasonType take the voucher's season type
     * @return voucher
     */
    public abstract Voucher getVoucher(VoucherSeasonType voucherSeasonType);
}

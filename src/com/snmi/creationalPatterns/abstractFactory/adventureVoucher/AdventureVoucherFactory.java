package com.snmi.creationalPatterns.abstractFactory.adventureVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherSeasonType;

/**
 * Adventure Voucher Factory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class AdventureVoucherFactory extends VoucherFactory {

    /**
     * Create specific adventure voucher by season
     * @param voucherSeasonType take the voucher's season type
     * @return new specific adventure voucher
     */
    @Override
    public Voucher getVoucher(VoucherSeasonType voucherSeasonType) {
        switch (voucherSeasonType) {
            case SPRING: return new AdventureSpringVoucher("River boat", 40);
            case SUMMER: return new AdventureSummerVoucher("Fly with Balloon", 60);
            case AUTUMN: return new AdventureAutumnVoucher("Carting", 70);
            case WINTER: return new AdventureWinterVoucher("Ski race", 110);
            default: throw new IllegalArgumentException("Illegal season!");
        }
    }

}

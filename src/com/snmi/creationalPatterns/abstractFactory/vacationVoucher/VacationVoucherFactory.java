package com.snmi.creationalPatterns.abstractFactory.vacationVoucher;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherSeasonType;

/**
 * Vacation Voucher Factory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class VacationVoucherFactory extends VoucherFactory {

    /**
     * Create specific vacation voucher by season
     * @param voucherSeasonType take the voucher's season type
     * @return new specific vacation voucher
     */
    @Override
    public Voucher getVoucher(VoucherSeasonType voucherSeasonType) {
        switch (voucherSeasonType) {
            case SPRING: return new VacationSpringVoucher("Domaine Peshtera HB Studio", 80);
            case SUMMER: return new VacationSummerVoucher("Elenite HB Double room", 100);
            case AUTUMN: return new VacationAutumnVoucher("Infinity AI Studio", 130);
            case WINTER: return new VacationWinterVoucher("Pamporovo HB Double room", 115);
            default: throw new IllegalArgumentException("Illegal season!");
        }
    }

}

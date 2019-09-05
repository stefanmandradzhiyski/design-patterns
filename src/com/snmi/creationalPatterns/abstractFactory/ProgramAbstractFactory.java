package com.snmi.creationalPatterns.abstractFactory;

import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.Voucher;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherFactory;
import com.snmi.creationalPatterns.abstractFactory.abstractVoucher.VoucherSeasonType;

/**
 * The program implement the Abstract Factory design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramAbstractFactory {

    /**
     * Program constants
     */
    private static final String VOUCHER = "You got voucher %s for a fabolous price of %.2f leva";

    public static void main(String[] args) {
        getVoucher(130, VoucherSeasonType.AUTUMN);
        getVoucher(260, VoucherSeasonType.SUMMER);
        getVoucher(310, VoucherSeasonType.WINTER);
    }

    /**
     * Abstract Factory create specific voucher for you
     * @param voucherScore take voucher score
     * @param voucherSeasonType take voucher season type
     */
    private static void getVoucher(int voucherScore, VoucherSeasonType voucherSeasonType) {
        VoucherFactory voucherFactory = VoucherFactory.getVoucherFactory(voucherScore);
        Voucher voucher = voucherFactory.getVoucher(voucherSeasonType);
        String voucherSentence = String.format(VOUCHER, voucher.getName(), voucher.getPrice());
        System.out.println(voucherSentence);
        System.out.println();
    }
}

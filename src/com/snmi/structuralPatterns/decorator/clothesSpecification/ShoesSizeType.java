package com.snmi.structuralPatterns.decorator.clothesSpecification;

/**
 * Shoes sizes
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public enum ShoesSizeType {

    SIZE_41(41),
    SIZE_42(42),
    SIZE_43(43),
    SIZE_44(44),
    SIZE_45(45),
    SIZE_46(46);

    private int shoesSize;

    ShoesSizeType(int shoesSize) {
        this.shoesSize = shoesSize;
    }

    public int getShoesSize() {
        return shoesSize;
    }

}

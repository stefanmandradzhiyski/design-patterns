package com.snmi.creationalPatterns.builder;

import com.snmi.creationalPatterns.builder.menuTypes.*;

/**
 * FastFood is an example of Builder
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FastFood {

    /**
     * Cook == Builder
     */
    public static class Cook {

        /**
         * Cook variables
         */
        private FoodType foodType;
        private BreadType breadType;
        private MeatType meatType;
        private SaladType saladType;
        private boolean withPotatoes;
        private SauceType sauceType;

        /**
         * Cook == build method
         * @return new instance of Fast food
         */
        public FastFood cook() {
            return new FastFood(this);
        }

        /**
         * Default constructor of Cook
         */
        public Cook() {}

        /**
         * Specific Cooker's method for all variables
         */
        public Cook food(FoodType foodType) {
            this.foodType = foodType;
            return this;
        }

        public Cook bread(BreadType breadType) {
            this.breadType = breadType;
            return this;
        }

        public Cook meat(MeatType meatType) {
            this.meatType = meatType;
            return this;
        }

        public Cook salad(SaladType saladType) {
            this.saladType = saladType;
            return this;
        }

        public Cook withPotatoes(boolean withPotatoes) {
            this.withPotatoes = withPotatoes;
            return this;
        }

        public Cook sauce(SauceType sauceType) {
            this.sauceType = sauceType;
            return this;
        }
    }

    /**
     * Food variables
     */
    private FoodType foodType;
    private BreadType breadType;
    private MeatType meatType;
    private SaladType saladType;
    private boolean withPotatoes;
    private SauceType sauceType;

    /**
     * FastFood constructor which take Cooker as parameter
     * @param cook take already cooked food by Cooker
     */
    public FastFood(Cook cook) {
        this.foodType = cook.foodType;
        this.breadType = cook.breadType;
        this.meatType = cook.meatType;
        this.saladType = cook.saladType;
        this.withPotatoes = cook.withPotatoes;
        this.sauceType = cook.sauceType;
    }

    /**
     * Getters
     */
    public FoodType getFoodType() {
        return foodType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public SaladType getSaladType() {
        return saladType;
    }

    public boolean isWithPotatoes() {
        return withPotatoes;
    }

    public SauceType getSauceType() {
        return sauceType;
    }
}

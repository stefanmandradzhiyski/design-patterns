package com.snmi.creationalPatterns.builder;

import com.snmi.creationalPatterns.builder.menuTypes.*;

/**
 * The program implement Builder design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramBuilder {

    /**
     * Class constants
     */
    private static final String WELCOME_CFF_MESSAGE = "Worker: Hello to CFF, what do you want to purchase?";
    private static final String CLIENT_ORDER = "Client: Hello, I want to order a %s with %s bread, %s meat, %s salad, %s potatoes and %s sauce";
    private static final String COOKING = "Worker: I'm start cooking.";
    private static final String READY_FOOD = "Here you are, your %s with %s bread, %s meat, %s salad, %s potatoes and %s sauce";
    private static final String WITH = "with";
    private static final String WITHOUT = "without";

    public static void main(String[] args) {
        buyFood(FoodType.SANDWICH, BreadType.WHOLEGRAIN, MeatType.CHICKEN, SaladType.CESAR, true, SauceType.BBQ);
    }

    /**
     * The process of buying fast food in CCF
     * @param foodType take the food's type
     * @param breadType take the bread's type
     * @param meatType take the meat's type
     * @param saladType take the salad's type
     * @param withPotatoes with/without potatoes
     * @param sauceType take the sauce's type
     */
    private static void buyFood(FoodType foodType, BreadType breadType, MeatType meatType, SaladType saladType, boolean withPotatoes, SauceType sauceType) {
        System.out.println(WELCOME_CFF_MESSAGE);
        makeOrder(foodType, breadType, meatType, saladType, withPotatoes, sauceType);
        FastFood fastFood = prepareOrder(foodType, breadType, meatType, saladType, withPotatoes, sauceType).cook();
        printOrder(fastFood);
    }

    /**
     * Make a fast food order and print it
     * @param foodType take the food's type
     * @param breadType take the bread's type
     * @param meatType take the meat's type
     * @param saladType take the salad's type
     * @param withPotatoes with/without potatoes
     * @param sauceType take the sauce's type
     */
    private static void makeOrder(FoodType foodType, BreadType breadType, MeatType meatType, SaladType saladType, Boolean withPotatoes, SauceType sauceType) {
        String clientOrder;

        if (withPotatoes) {
            clientOrder = String.format(CLIENT_ORDER, foodType, breadType, meatType, saladType, WITH, sauceType);
        } else {
            clientOrder = String.format(CLIENT_ORDER, foodType, breadType, meatType, saladType, WITHOUT, sauceType);
        }

        System.out.println(clientOrder);
    }

    /**
     * Prepare the food by client's order
     * @param foodType take the food's type
     * @param breadType take the bread's type
     * @param meatType take the meat's type
     * @param saladType take the salad's type
     * @param withPotatoes with/without potatoes
     * @param sauceType take the sauce's type
     * @return the cooked food
     */
    private static FastFood.Cook prepareOrder(FoodType foodType, BreadType breadType, MeatType meatType, SaladType saladType, Boolean withPotatoes, SauceType sauceType) {
        System.out.println(COOKING);
        return new FastFood.Cook().food(foodType).bread(breadType).meat(meatType)
                .salad(saladType).withPotatoes(withPotatoes).sauce(sauceType);
    }

    /**
     * Print the cooked food
     * @param fastFood take the cooked fast food
     */
    private static void printOrder(FastFood fastFood) {
        String readyFood;
        if (fastFood.isWithPotatoes()) {
            readyFood = String.format(READY_FOOD, fastFood.getFoodType(), fastFood.getBreadType(), fastFood.getMeatType(),
                    fastFood.getSaladType(), WITH, fastFood.getSauceType());
        } else {
            readyFood = String.format(READY_FOOD, fastFood.getFoodType(), fastFood.getBreadType(), fastFood.getMeatType(),
                    fastFood.getSaladType(), WITHOUT, fastFood.getSauceType());
        }

        System.out.println(readyFood);
    }

}

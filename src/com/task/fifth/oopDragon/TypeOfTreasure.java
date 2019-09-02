package com.task.fifth.oopDragon;

import java.util.Random;

public enum TypeOfTreasure {

    GOLD, SILVER, PEARLS, DIAMONDS, NOT_VALUABLE;

    public static TypeOfTreasure getTypeTreasure(){

        TypeOfTreasure[] types = TypeOfTreasure.values();
        Random rand = new Random();
        return types[rand.nextInt(types.length)];
    }

    public int getPriceOfGramm() {

        int priceGram = 0;

        switch (this) {
            case GOLD :
                priceGram = 190;
                break;
            case SILVER :
                priceGram = 10;
                break;
            case PEARLS :
                priceGram = 100;
                break;
            case DIAMONDS :
                priceGram = 400;
                break;
            case NOT_VALUABLE :
                priceGram = 0;
        }
        return priceGram;
    }
}

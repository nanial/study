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

        int priceOfGram = 0;

        switch (this) {
            case GOLD :
                priceOfGram = 190;
                break;
            case SILVER :
                priceOfGram = 10;
                break;
            case PEARLS :
                priceOfGram = 100;
                break;
            case DIAMONDS :
                priceOfGram = 400;
                break;
            case NOT_VALUABLE :
                priceOfGram = 3;
        }
        return priceOfGram;
    }
}

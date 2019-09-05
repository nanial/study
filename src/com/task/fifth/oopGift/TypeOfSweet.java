package com.task.fifth.oopGift;

import java.util.Random;

public enum TypeOfSweet {

    CHOCOLATES, MARSHMALLOWS, TOFFEE, CAKES, COOKIES, TURKISH_DELIGHT, ORIENTAL_SWEETS;

    public static TypeOfSweet getTypeSweet(){

        TypeOfSweet[] types = TypeOfSweet.values();
        Random rand = new Random();
        return types[rand.nextInt(types.length)];
    }
    public int getPriceOfPound() {

        int priceOfPound = 0;

        switch (this) {
            case CHOCOLATES:
                priceOfPound = 50;
                break;
            case MARSHMALLOWS:
                priceOfPound = 10;
                break;
            case TOFFEE:
                priceOfPound = 60;
                break;
            case CAKES:
                priceOfPound = 70;
                break;
            case COOKIES:
                priceOfPound = 20;
                break;
            case TURKISH_DELIGHT:
                priceOfPound = 120;
                break;
            case ORIENTAL_SWEETS:
                priceOfPound = 200;
                break;
        }
        return priceOfPound;
    }
}

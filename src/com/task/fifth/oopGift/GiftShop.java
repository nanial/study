package com.task.fifth.oopGift;

import java.util.Random;

public class GiftShop extends AbstractShop {

    Random rand = new Random();

    public  AbstractSweet preferSweet(){

        Sweet sweet = new Sweet(Math.round(rand.nextDouble() * 10000) / 100,
                TypeOfSweet.getTypeSweet());
        sweet.setCost(sweet.getWeight() * sweet.getType().getPriceOfPound());
        return sweet;
    }

    public  AbstractPack preferPack(){

        return new Pack(Math.round(rand.nextDouble() * 10000) / 100, TypeOfPack.getTypePack());
    }
}

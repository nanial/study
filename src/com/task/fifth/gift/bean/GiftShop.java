package com.task.fifth.gift.bean;

import com.task.fifth.gift.bean.classification.TypeOfPack;
import com.task.fifth.gift.bean.classification.TypeOfSweet;

import java.util.Random;

//builder
public class GiftShop extends AbstractShop {

    Random rand = new Random();

    public AbstractSweet preferSweet() {

        Sweet sweet = new Sweet(Math.round(rand.nextDouble() * 10000) / 1000,
                TypeOfSweet.getTypeSweet());
        sweet.setCost(sweet.getWeight() * sweet.getType().getPriceOfPound());
        return sweet;
    }

    public AbstractPack preferPack() {

        return new Pack(Math.round(rand.nextDouble() * 10000) / 1000, TypeOfPack.getTypePack());
    }
}

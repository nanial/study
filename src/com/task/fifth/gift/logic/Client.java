package com.task.fifth.gift.logic;

import com.task.fifth.gift.bean.abstraction.AbstractPack;
import com.task.fifth.gift.bean.abstraction.AbstractShop;
import com.task.fifth.gift.bean.abstraction.AbstractSweet;

public class Client {

    private AbstractSweet sweet;
    private AbstractPack pack;

    public Client(AbstractShop shop){

        sweet = shop.preferSweet();
        pack = shop.preferPack();
    }

    public void run(){

        pack.doGift(sweet);
    }
}

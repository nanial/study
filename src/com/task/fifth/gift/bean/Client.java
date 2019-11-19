package com.task.fifth.gift.bean;

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

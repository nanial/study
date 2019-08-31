package com.task.fifth.oopDragon;

public class Dragon {

    public void visionOfTreasure(){

        Grotto grotto = new Grotto();

        for (Treasure t : grotto.fillingCollect()) {
            System.out.println("The treasure id "+ t.getId() +
                    " costs " + t.getCost() + " denariy " + t.getType() + " weight " + t.getWeight());
        }
    }
}

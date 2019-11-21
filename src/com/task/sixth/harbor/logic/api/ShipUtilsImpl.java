package com.task.sixth.harbor.logic.api;

import com.task.sixth.harbor.bean.Ship;
import com.task.sixth.harbor.logic.api.ShipUtils;

public class ShipUtilsImpl implements ShipUtils {

    private Ship ship;

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void loading() {

        System.out.println("For init on board of " + ship.getName() + " are " +
                ship.getCurrentNumberOfBox() + " boxes");

        ship.setCurrentNumberOfBox(ship.getCurrentNumberOfBox() + ship.getBoxToLoad());

        System.out.println("After loading on board of " + ship.getName() + " are " +
                ship.getCurrentNumberOfBox() + " boxes");

        ship.getPort().setCurrentNumOfBox(ship.getPort().getCurrentNumOfBox() -
                ship.getBoxToLoad());

        System.out.println("After loading in port remain " +
                ship.getPort().getCurrentNumOfBox() + " boxes");

    }

    public void unloading() {

        System.out.println("For init on board of ship " + ship.getName() + " are " +
                ship.getCurrentNumberOfBox() + " boxes");
        ship.setCurrentNumberOfBox(ship.getCurrentNumberOfBox() - ship.getBoxToUnload());

        System.out.println("After unloading on board of " + ship.getName() + " are " +
                ship.getCurrentNumberOfBox() + " boxes");

        ship.getPort().setCurrentNumOfBox(ship.getPort().getCurrentNumOfBox() + ship.getBoxToUnload());

        System.out.println("After unloading in port remain " +
                ship.getPort().getCurrentNumOfBox() + " boxes");

    }

}

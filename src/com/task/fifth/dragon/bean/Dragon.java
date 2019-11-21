package com.task.fifth.dragon.bean;

import com.task.fifth.dragon.logic.impl.GrottoUtilsImpl;

import java.util.Arrays;

public class Dragon {

    GrottoUtilsImpl grottoUtilsImpl = new GrottoUtilsImpl();
    Treasure[] treasures = grottoUtilsImpl.fillingCollect();

    public Dragon() {
    }

    public GrottoUtilsImpl getGrottoUtilsImpl() {
        return grottoUtilsImpl;
    }

    public void setGrottoUtilsImpl(GrottoUtilsImpl grottoUtilsImpl) {
        this.grottoUtilsImpl = grottoUtilsImpl;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon)) return false;

        Dragon dragon = (Dragon) o;

        if (getGrottoUtilsImpl() != null ? !getGrottoUtilsImpl().equals(dragon.getGrottoUtilsImpl()) : dragon.getGrottoUtilsImpl() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getTreasures(), dragon.getTreasures());
    }

    @Override
    public int hashCode() {
        int result = getGrottoUtilsImpl() != null ? getGrottoUtilsImpl().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getTreasures());
        return result;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "grotto=" + grottoUtilsImpl +
                ", treasures=" + Arrays.toString(treasures) +
                '}';
    }
}

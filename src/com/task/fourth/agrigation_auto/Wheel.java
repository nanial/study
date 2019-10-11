package com.task.fourth.agrigation_auto;

public class Wheel {
    private boolean usefulRubber;
    private boolean changeSeason;
    private boolean hasAccident;

    public Wheel(boolean changeSeason, boolean hasAccident) {
        this.changeSeason = changeSeason;
        this.hasAccident = hasAccident;
    }

    public boolean getIsChangeSeason() {
        return changeSeason;
    }

    public boolean getHasAccident() {
        return hasAccident;
    }

    public void setUsefulRubber(boolean usefulRubber) {
        this.usefulRubber = usefulRubber;
    }
}

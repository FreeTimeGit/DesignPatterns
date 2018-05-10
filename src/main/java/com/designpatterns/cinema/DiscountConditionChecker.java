package com.designpatterns.cinema;

public class DiscountConditionChecker {

    private boolean popcornFlag = false;
    private boolean nachosFlag = false;
    private boolean colaFlag = false;
    private boolean avengersFlag = false;
    private boolean saw10Flag = false;
    private boolean xmenFlag = false;

    public void setPopcorn() {
        this.popcornFlag = true;
    }

    public void setNachos() {
        this.nachosFlag = true;
    }

    public void setCola() {
        this.colaFlag = true;
    }

    public void setAvengers() {
        this.avengersFlag = true;
    }

    public void setSaw10() {
        this.saw10Flag = true;
    }

    public void setXmen() {
        this.xmenFlag = true;
    }

    public boolean extrasDiscountTrue(){
        return popcornFlag && nachosFlag && colaFlag;
    }

    public boolean tickestsAmountDiscountTrue(){
        return avengersFlag && saw10Flag && xmenFlag;
    }
}

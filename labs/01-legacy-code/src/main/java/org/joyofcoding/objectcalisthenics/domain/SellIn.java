package org.joyofcoding.objectcalisthenics.domain;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class SellIn {
    private int sellIn;

    public SellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void reduceSellIn(){
        sellIn--;
    }

    public boolean isSellInGreaterThen(int sellIn){
        return this.sellIn > sellIn;
    }

    public boolean isSellInSmallerThen(int sellIn){
        return this.sellIn < sellIn;
    }

    public boolean isSellInGreaterOrEqualTo(int sellIn){
        return this.sellIn >= sellIn;
    }
}

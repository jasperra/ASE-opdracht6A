package org.joyofcoding.objectcalisthenics.domain;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class ItemValues {
    private SellIn sellIn;
    private Quality quality;

    public ItemValues(int sellIn, int quality) {
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    public void reduceQuality(){
        quality.reduceQuality();
    }

    public void increaseQuality(){
        quality.increaseQuality();
    }

    public void reduceSellIn(){
        sellIn.reduceSellIn();
    }

    public boolean isQualityGreaterThen(int quality){
        return this.quality.isQualityGreaterThen(quality);
    }

    public boolean isQualityLowerThen(int quality){
        return this.quality.isQualityLowerThen(quality);
    }

    public boolean isSellInLowerThen(int sellIn){
        return this.sellIn.isSellInSmallerThen(sellIn);
    }

    public boolean isSellInGreaterOrEqualTo(int sellIn){
        return this.sellIn.isSellInGreaterOrEqualTo(sellIn);
    }

    public void resetQuality(){
        this.quality.resetQuality();
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Quality getQuality() {
        return quality;
    }
}

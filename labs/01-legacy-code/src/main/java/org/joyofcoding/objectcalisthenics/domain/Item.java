package org.joyofcoding.objectcalisthenics.domain;

public abstract class Item {
    private Name name;
    private ItemValues itemValues;

    public Item(String name, int sellIn, int quality) {
        this.name = new Name(name);
        this.itemValues = new ItemValues(sellIn, quality);
    }

    public abstract void updateItem();

    public void reduceQuality(){
        itemValues.reduceQuality();
    }

    public void increaseQuality(){
        itemValues.increaseQuality();
    }

    public void reduceSellIn(){
        itemValues.reduceSellIn();
    }

    public boolean isQualityGreaterThen(int quality){
        return this.itemValues.isQualityGreaterThen(quality);
    }

    public boolean isQualityLowerThen(int quality){
        return this.itemValues.isQualityLowerThen(quality);
    }

    public boolean isSellInLowerThen(int sellIn){
        return this.itemValues.isSellInLowerThen(sellIn);
    }

    public boolean isSellInGreaterOrEqualTo(int sellIn){
        return this.itemValues.isSellInGreaterOrEqualTo(sellIn);
    }

    public void resetQuality(){
        this.itemValues.resetQuality();
    }

    public String getName() {
        return name.getName();
    }

    public int getSellIn() {
        return itemValues.getSellIn().getSellIn();
    }

    public int getQuality() {
        return itemValues.getQuality().getQuality();
    }
}

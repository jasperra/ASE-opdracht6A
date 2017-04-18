package org.joyofcoding.objectcalisthenics.items;

import org.joyofcoding.objectcalisthenics.Item;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class Default extends Item {

    public Default(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        reduceSellIn();
        ifQualityGreaterThenReduceQuality(0);

        if (isSellInLowerThen(0))
            ifQualityGreaterThenReduceQuality(0);
    }
    private void ifQualityGreaterThenReduceQuality(int quality) {
        if (isQualityGreaterThen(quality)) {
            reduceQuality();
        }
    }
}

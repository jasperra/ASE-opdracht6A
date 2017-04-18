package org.joyofcoding.objectcalisthenics.items;

import org.joyofcoding.objectcalisthenics.Item;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class Backstage extends Item {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (isQualityLowerThen(50)) {
            increaseQuality();

            raiseQualityBasedOnSellIn();
        }

        reduceSellIn();
        if (!isSellInLowerThen(0)) return;

        resetQuality();
    }

    private void raiseQualityBasedOnSellIn() {
        if (isSellInLowerThen(6)) {
            ifQualityLowerThenIncreaseQuality(50);
            ifQualityLowerThenIncreaseQuality(50);
        }
        else if (isSellInLowerThen(11)) {
            ifQualityLowerThenIncreaseQuality(50);
        }
    }

    private void ifQualityLowerThenIncreaseQuality(int quality) {
        if (isQualityLowerThen(quality)) {
            increaseQuality();
        }
    }
}

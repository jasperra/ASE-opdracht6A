package org.joyofcoding.objectcalisthenics.domain.items;

import org.joyofcoding.objectcalisthenics.domain.Item;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class AgedBrie extends Item {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (isQualityLowerThen(50))
            increaseQuality();

        reduceSellIn();

        if (isSellInGreaterOrEqualTo(0) || !isQualityLowerThen(50)) return;

        increaseQuality();
    }
}

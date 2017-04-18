package org.joyofcoding.objectcalisthenics.domain;

import org.joyofcoding.objectcalisthenics.domain.items.AgedBrie;
import org.joyofcoding.objectcalisthenics.domain.items.Backstage;
import org.joyofcoding.objectcalisthenics.domain.items.Default;
import org.joyofcoding.objectcalisthenics.domain.items.Sulfuras;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jasper on 18-Apr-17.
 */
public class ItemList {
    private List<Item> items;

    public ItemList() {
        items = makeItems();
    }

    public static List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Default("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrie("Aged Brie", 2, 0));
        items.add(new Default("Elixir of the Mongoose", 5, 7));
        items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Default("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateItem();
        }
    }

    public static void updateQuality(List<Item> items) {
        for (Item item : items) {
            item.updateItem();
        }
    }
}

package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.domain.Item;
import org.joyofcoding.objectcalisthenics.domain.ItemList;

import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        ItemList itemList = new ItemList();
        itemList.updateQuality();
    }

    public List<Item> makeItems() {
        return ItemList.makeItems();
    }

    public void updateQuality(List<Item> items) {
        ItemList.updateQuality(items);
    }
}

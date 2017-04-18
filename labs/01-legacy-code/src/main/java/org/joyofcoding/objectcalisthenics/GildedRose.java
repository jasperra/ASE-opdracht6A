package org.joyofcoding.objectcalisthenics;

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

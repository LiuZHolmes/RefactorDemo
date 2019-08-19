package gildedRose;

import java.util.Arrays;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        Arrays.stream(items).forEach(Item::updateQuality);
    }
}
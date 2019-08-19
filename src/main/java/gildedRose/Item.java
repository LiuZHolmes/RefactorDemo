package gildedRose;

public class Item {

    final int MAX_QUALITY = 50;

    String name;

    int sellIn;

    int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void increaseQuality() {
        quality = quality < MAX_QUALITY ? quality + 1 : quality;
    }
}

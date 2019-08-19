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

    void calQuality() {
        if (this.name.equals("Aged Brie")) {
            this.increaseQuality();
            this.sellIn = this.sellIn - 1;
            if (this.sellIn < 0) {
                this.increaseQuality();
            }
        } else if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            this.increaseQuality();
            if (this.sellIn < 11) this.increaseQuality();
            if (this.sellIn < 6) this.increaseQuality();
            this.sellIn = this.sellIn - 1;
            if (this.sellIn < 0) {
                this.quality = 0;
            }
        } else {
            if (this.quality > 0)
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) this.quality--;

            if (!this.name.equals("Sulfuras, Hand of Ragnaros")) this.sellIn = this.sellIn - 1;

            if (this.sellIn < 0) {
                if (this.quality > 0) {
                    if (!this.name.equals("Sulfuras, Hand of Ragnaros"))
                        this.quality--;
                }
            }
        }
    }
}

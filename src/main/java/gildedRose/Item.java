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
        if (!this.name.equals("Aged Brie")
                && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.quality > 0)
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) this.quality = this.quality - 1;
        } else {
            this.increaseQuality();
            if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (this.sellIn < 11) this.increaseQuality();
                if (this.sellIn < 6) this.increaseQuality();
            }
        }

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) this.sellIn = this.sellIn - 1;

        if (this.sellIn < 0) {
            if (!this.name.equals("Aged Brie")) {
                if (!this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.quality > 0) {
                        if (!this.name.equals("Sulfuras, Hand of Ragnaros"))
                            this.quality = this.quality - 1;
                    }
                } else this.quality = 0;
            } else this.increaseQuality();
        }
    }
}

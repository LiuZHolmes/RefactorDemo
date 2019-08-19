package gildedRose;

public class Item {

    private String name;

    int sellIn;

    int quality;

    private ItemQualityStrategy itemQualityStrategy;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if (this.name.equals("Aged Brie")) {
            this.itemQualityStrategy = new AgedBrieItemQualityStrategy();
        }
        else if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            this.itemQualityStrategy = new BackstagePassesItemQualityStrategy();
        }
        else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.itemQualityStrategy = new SulfurasItemQualityStrategy();
        }
        else this.itemQualityStrategy = new DefaultItemQualityStrategy();
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    void calQuality() {
        itemQualityStrategy.update(this);
    }
}

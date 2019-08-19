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
        switch (this.name) {
            case "Aged Brie":
                this.itemQualityStrategy = new AgedBrieItemQualityStrategy();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                this.itemQualityStrategy = new BackstagePassesItemQualityStrategy();
                break;
            case "Sulfuras, Hand of Ragnaros":
                this.itemQualityStrategy = new SulfurasItemQualityStrategy();
                break;
            default:
                this.itemQualityStrategy = new DefaultItemQualityStrategy();
                break;
        }
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
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

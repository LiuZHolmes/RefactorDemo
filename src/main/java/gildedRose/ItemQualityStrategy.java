package gildedRose;

public abstract class ItemQualityStrategy {

    final int MAX_QUALITY = 50;
    final int MIN_QUALITY = 0;
    abstract void update(Item item);
    int increaseQuality(int quality) {
        return quality < MAX_QUALITY ? quality + 1 : quality;
    }
    int decreaseQuality(int quality) {
         return quality > MIN_QUALITY ? quality - 1 : quality;
    }
}

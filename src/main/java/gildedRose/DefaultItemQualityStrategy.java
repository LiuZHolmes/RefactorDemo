package gildedRose;

public class DefaultItemQualityStrategy extends ItemQualityStrategy {
    @Override
    void update(Item item) {
        item.decreaseQuality();
        if (--item.sellIn < 0) item.decreaseQuality();
    }
}

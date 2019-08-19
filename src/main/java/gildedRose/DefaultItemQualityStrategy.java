package gildedRose;

public class DefaultItemQualityStrategy extends ItemQualityStrategy {
    @Override
    void update(Item item) {
        item.setQuality(decreaseQuality(item.getQuality()));
        if (--item.sellIn < 0)
            item.setQuality(decreaseQuality(item.getQuality()));
    }
}

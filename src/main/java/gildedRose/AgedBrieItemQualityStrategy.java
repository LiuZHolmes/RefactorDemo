package gildedRose;

public class AgedBrieItemQualityStrategy extends ItemQualityStrategy {
    @Override
    void update(Item item) {
        item.setQuality(increaseQuality(item.getQuality()));
        if (--item.sellIn < 0)
            item.setQuality(increaseQuality(item.getQuality()));
    }
}

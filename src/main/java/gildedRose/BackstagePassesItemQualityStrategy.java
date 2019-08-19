package gildedRose;

class BackstagePassesItemQualityStrategy extends ItemQualityStrategy {
    @Override
    void update(Item item) {
        item.setQuality(increaseQuality(item.getQuality()));
        if (item.sellIn < 11)
            item.setQuality(increaseQuality(item.getQuality()));
        if (item.sellIn < 6)
            item.setQuality(increaseQuality(item.getQuality()));
        if (--item.sellIn < 0) item.setQuality(0);
    }
}
